import java.util.ArrayList;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Path;
import javafx.util.Duration;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;




public class DeliveryDriver {
    private ArrayList<Package> packages;
    private DeliveryRoute currentRoute;
    private int currentX;
    private int currentY;
    private double currentDistanceOnRoute;
    private int currentSubstreetIndex; 
    private Substreet currentSubstreet;
    private Rectangle car;
    private PathTransition pathTransition;
    private Path path;


   

    public DeliveryDriver() {
        this.packages = new ArrayList<>();
        this.currentX = 0;
        this.currentY = 0;
        this.currentDistanceOnRoute = 0;
        this.currentSubstreet = null; // Initialize to null
        this.path = new Path(new MoveTo(currentX, currentY)); // Initialize the path
        this.pathTransition = new PathTransition();
        this.car = new Rectangle(75, 180, 15, 15);
        this.car.setArcHeight(15);
        this.car.setArcWidth(15);
        this.car.setFill(Color.RED);
        this.pathTransition.setNode(car);
        this.pathTransition.setDuration(Duration.seconds(5));
        this.pathTransition.setPath(path);
        
        
    }
    public Rectangle getCar() {
        return car;
    }
    public void addPackage(Package aPackage) {
        packages.add(aPackage);
    }

    public ArrayList<Package> getPackages() {
        return new ArrayList<>(packages);
    }

    public void setCurrentRoute(DeliveryRoute route) {
        this.currentRoute = route;
        this.currentX = 45; 
        this.currentY = 600; 
        this.currentDistanceOnRoute = 0; 
        
        
    }

    public DeliveryRoute getCurrentRoute() {
        return this.currentRoute;
    }

    public int getCurrentX(){
        return currentX;
    }

    public int getCurrentY(){
        return currentY;
    }

    public boolean isPackageDelivered(Package aPackage) {
        return aPackage.isDelivered;
    }

    public void moveDriver(int distance) {
        if (currentRoute != null) {
            if (currentRoute.getSubstreets() != null && !currentRoute.getSubstreets().isEmpty()) {
                currentSubstreet = currentRoute.getSubstreets().get(currentSubstreetIndex);
    
                updateDistanceOnRoute(distance);
                updateDriverPosition(distance);
    
                double remainingDistanceOnSubstreet = currentSubstreet.getDistance() - currentDistanceOnRoute;
                if (remainingDistanceOnSubstreet <= 0) {
                    PauseTransition pause = new PauseTransition(Duration.seconds(1)); // Adjust the duration as needed
                    pause.setOnFinished(event -> moveToNextSubstreet());
                    pause.play();
                }
            } else {
                System.out.println("No substreets set for the driver's route.");
            }
        } else {
            System.out.println("No route set for the driver.");
        }
    }
    

    public void updateDriverPosition(int distance) {
        int destinationX = currentX + distance;
        int destinationY = currentY + distance;
        System.out.println("Updating position. DestinationX: " + destinationX + ", DestinationY: " + destinationY);
    
        // Update the path with the new destination
        path.getElements().add(new LineTo(destinationX, destinationY));
    
        // Stop the current path transition (if any) and play the updated one
        pathTransition.stop();
        pathTransition.play();
    
        // Introduce a pause transition for a short delay (adjust duration as needed)
        PauseTransition pause = new PauseTransition(Duration.seconds(1));
        pause.setOnFinished(e -> {
            this.currentX = destinationX;
            this.currentY = destinationY;
            System.out.println("After update. CurrentX: " + currentX + ", CurrentY: " + currentY);
            FadingRectangle.updateCarPositionInGUI();
        });
    
        // Start the pause transition
        pause.play();
    }
    




    public void updateDistanceOnRoute(int distance) {
        currentDistanceOnRoute += distance;
    }

    public int calculateTripDelay() {
        if (currentSubstreet != null) {
            return currentSubstreet.getDelay();
        } else {
            return 0;
        }
    }

    public void deliverPackage() {
        if (currentRoute != null) {
            for (int i = 0; i < getPackages().size(); i++) {
                Package aPackage = getPackages().get(i);
    
                if (aPackage.isAssignedToDriver && !aPackage.isDelivered) {
                    if (aPackage instanceof Offical_paper && currentSubstreet != null) {
                        int substreetDelay = currentSubstreet.getDelay();
                        System.out.println("Official package detected. Introducing a delay of " + substreetDelay + " minutes on Substreet " + currentSubstreet.getStreetName());
                        try {
                            Thread.sleep(substreetDelay * 1000 * 60);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
    
                    Building destinationBuilding = aPackage.getCustomer().getBuilding();
    
                    if (destinationBuilding.getSubstreet() == currentSubstreet) {
                        moveToBuilding(destinationBuilding);
    
                        System.out.println("Package delivered at building " + destinationBuilding.getBuildingNumber());
    
                        aPackage.isDelivered = true;
                        aPackage.isAssignedToDriver = false;
    
                        moveToNextPackage();
    
                        return;
                    } else {
                        // Adjust this part based on your logic
                        // For example, you might want to move to the substreet instead of the building directly
                        moveToNextSubstreet();
                    }
                }
            }
    
            System.out.println("No more packages assigned to the driver at the current position.");
        } else {
            System.out.println("No route set for the driver.");
        }
    }
    

    public void moveToBuilding(Building destinationBuilding) {
        double distanceToDestination = calculateDistanceToBuilding(destinationBuilding.getXCoordinate(), destinationBuilding.getYCoordinate());
    
        moveDriver((int) distanceToDestination);
    }
    

  
    
    public void moveToNextSubstreet() {
        if (currentRoute != null && currentRoute.getSubstreets() != null) {
            int tripDelay = calculateTripDelay();
            System.out.println("Introducing a delay of " + tripDelay + " minutes for the entire trip.");
    
            PauseTransition pause = new PauseTransition(Duration.minutes(tripDelay));
            pause.setOnFinished(event -> {
                if (currentSubstreetIndex < currentRoute.getSubstreets().size() - 1) {
                    currentSubstreetIndex++;
                    currentSubstreet = currentRoute.getSubstreets().get(currentSubstreetIndex);
                    System.out.println("Driver moved to the next street. Next substreet: " + currentSubstreet.getStreetName());
                } else {
                    System.out.println("No more substreets in the route.");
                }
            });
    
            pause.play();
        } else {
            System.out.println("No route or substreets set for the driver.");
        }
    }
    

    public double calculateDistanceToBuilding(double destinationX, double destinationY) {
        double deltaX = destinationX - currentX;
        double deltaY = destinationY - currentY;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public void moveToNextPackage() {
        for (int i = 0; i < getPackages().size(); i++) {
            Package aPackage = getPackages().get(i);

            if (aPackage.isAssignedToDriver && !aPackage.isDelivered) {
                aPackage.isDelivered = true;
                aPackage.isAssignedToDriver = false;

                int nextPackageIndex = i + 1;

                if (nextPackageIndex < getPackages().size()) {
                    Package nextPackage = getPackages().get(nextPackageIndex);

                    nextPackage.isDelivered = false;
                    nextPackage.isAssignedToDriver = true;

                    System.out.println("Driver assigned to the next package with ID: " + nextPackage.getPackageId());
                } else {
                    System.out.println("No more packages assigned to the driver at the current position.");
                }

                return;
            }
        }

        System.out.println("No more packages assigned to the driver at the current position.");
    }
}
