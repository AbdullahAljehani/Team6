import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import javafx.animation.PathTransition;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Path;
import javafx.util.Duration;
import javafx.animation.PauseTransition;
import javafx.application.Platform;

public class DeliveryDriver {
    private List<Package> packages;
    private DeliveryRoute currentRoute;
    private int currentX;
    private int currentY;
    private double currentDistanceOnRoute;
    private int currentSubstreetIndex; 
    private Substreet currentSubstreet;
    private static Rectangle car;
    public static PathTransition pathTransition;
    private Path path;
    public static double Distance=0;
     private static double GasolineCost=0;
    public static boolean continueTransition = false;
   
    


    public DeliveryDriver() {
        this.packages = new ArrayList<>();
        this.currentDistanceOnRoute = 0;
        this.currentSubstreet = null; // Initialize to null
        this.path = new Path();
        this.pathTransition = new PathTransition();
        this.car = new Rectangle(322, 662, 15, 15);
        this.car.setArcHeight(15);
        this.car.setArcWidth(15);
        this.car.setFill(Color.RED);
        this.pathTransition.setNode(car);
        this.pathTransition.setDuration(Duration.seconds(20));


        
    }
    public Rectangle getCar() {
        return car;
    }
    public void addPackage(Package aPackage) {
        packages.add(aPackage);
    }
   
    public static double getGasolineCost() {
        return GasolineCost;
    }
    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }


      public List<Package> getPackages() {
        return packages;
    }

    public void setCurrentRoute(DeliveryRoute route) {
        this.currentRoute = route;
        this.currentX = 0; 
        this.currentY = 0; 
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
    public void setPath(Path path) {
        this.path = path;
    }
    public Path getpath(){
        return path;
    }
   public static void updateDistance(double increment) {
    Distance += increment;
    System.out.println("Distance "+Distance);
    
}
public static void updateGasolineCost(double increment) {
    GasolineCost += increment;
    System.out.println("GasolineCost "+GasolineCost);
}
public void createPathForPackages(List<List<SubstreetPart>> Packages) {
    if (Packages == null || Packages.isEmpty()) {
        return;
    }
    
    Distance = 0;
    this.path = new Path();

    for (List<SubstreetPart> parts : Packages) {
        if (parts != null && !parts.isEmpty()) {
            SubstreetPart currentPart = parts.get(0);

            this.path.getElements().add(new MoveTo(currentPart.getX(), currentPart.getY()));

            for (int i = 1; i < parts.size(); i++) {
                SubstreetPart expectedNextPart = parts.get(i);
                List<SubstreetPart> nextParts = currentPart.getNextParts();
                boolean found = false;
                for (SubstreetPart nextPart : nextParts) {
                    if (nextPart != null && nextPart.equals(expectedNextPart)) {
                        path.getElements().add(new LineTo(nextPart.getX(), nextPart.getY()));
                        double increment = currentPart.getDistanceTo(currentPart, nextPart);
                        updateDistance(increment);
                        double gasolineCostIncrement = currentPart.calculateGasolineCost(currentPart, nextPart);
                        updateGasolineCost(gasolineCostIncrement);
                        currentPart = nextPart;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    break;
                }
            }
        }
    }

    setPath(path);
}




public void moveDriver() {
        System.out.println("Simulating the delivery process...");
    if (!path.getElements().isEmpty() && FadingRectangle.isStartClicked) {
        System.out.println("Path elements: " + path.getElements());
         FadingRectangle.CounterDistanceLabel.setText("00.00 Km");
        Platform.runLater(() -> {
        if (!FadingRectangle.isPaused && continueTransition) {
            pathTransition.stop();
            pathTransition.setPath(path);
            pathTransition.setCycleCount(1);
            pathTransition.setOnFinished(e -> {
            handleTransitionCompletion();
});
          

            pathTransition.play();
        } else {
            pathTransition.stop();
            pathTransition.setPath(path);
            pathTransition.setCycleCount(1);
            pathTransition.setOnFinished(e -> handleTransitionCompletion());

            pathTransition.play();
        }
    });
    }
}
 
public void handleTransitionCompletion() {
    Platform.runLater(() -> {
        FadingRectangle.updateGasolineCostLabel();
        FadingRectangle.updateDistanceLabel();
        System.out.println("Transition finished");
    });
}



    
    
    /*public void moveDriver(int destinationX, int destinationY) {
        if (currentRoute != null) {
            if (currentRoute.getSubstreets() != null && !currentRoute.getSubstreets().isEmpty()) {
                currentSubstreet = currentRoute.getSubstreets().get(currentSubstreetIndex);

                // Update the driver position immediately without animation
                this.currentX = destinationX;
                this.currentY = destinationY;
                path.getElements().add(new LineTo(destinationX, destinationY));
                pathTransition.stop();
                pathTransition.play();
                updateDriverPosition(MainProgram.street1_part1.getX(),MainProgram.street1_part1.getY());
                updateDriverPosition(MainProgram.street1_part2.getX(),MainProgram.street1_part2.getY());
                updateDriverPosition(MainProgram.street1_part3.getX(),MainProgram.street1_part3.getY());
                updateDriverPosition(MainProgram.street1_part4.getX(),MainProgram.street1_part4.getY());*/

                /*moveToBuilding(MainProgram.building127);
                moveToBuilding(MainProgram.building103);*/
                // Optional: If you want to update the GUI immediately
               /* FadingRectangle.updateCarPositionInGUI();

                // Move to the next substreet or perform any other logic as needed
                double remainingDistanceOnSubstreet = currentSubstreet.getDistance() - currentDistanceOnRoute;
                if (remainingDistanceOnSubstreet <= 0) {
                    moveToNextSubstreet();
                }
            } else {
                System.out.println("No substreets set for the driver's route.");
            }
        } else {
            System.out.println("No route set for the driver.");
        }
    }

    // ... other code ...

    public void updateDriverPosition(int destinationX, int destinationY) {
        System.out.println("Updating position. DestinationX: " + destinationX + ", DestinationY: " + destinationY);
        
        this.currentX = destinationX;
        this.currentY = destinationY;
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
    } */
    
    




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
                       // moveToBuilding(destinationBuilding);
    
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
            path.getElements().add(new LineTo(destinationBuilding.getXCoordinate(), destinationBuilding.getYCoordinate()));
            pathTransition.stop();
            pathTransition.play();
       
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

        // Setter method for the callback
      
}

