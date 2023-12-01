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
public void createPathForPackages(List<List<SubstreetPart>> packages) {
    if (packages == null || packages.isEmpty()) {
        return;
    }

    Distance = 0;
    this.path = new Path();

    for (List<SubstreetPart> packageParts : packages) {
        if (packageParts != null && !packageParts.isEmpty()) {
            SubstreetPart currentPart = packageParts.get(0);
            deliverPackage();

            this.path.getElements().add(new MoveTo(currentPart.getX(), currentPart.getY()));

            for (int i = 1; i < packageParts.size(); i++) {
                SubstreetPart expectedNextPart = packageParts.get(i);
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
    
                if ( !aPackage.isDelivered) {
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
    
                        System.out.println("Package delivered at building " + destinationBuilding.getBuildingNumber());
    
                        aPackage.isDelivered = true;
                        
    
                        moveToNextPackage();
    
                        return;
                    } else {
                        
                        moveToNextSubstreet();
                    }
                }
            }
    
            System.out.println("No more packages assigned to the driver at the current position.");
        } else {
            System.out.println("No route set for the driver.");
        }
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
    

   
    public void moveToNextPackage() {
        for (int i = 0; i < getPackages().size(); i++) {
            Package aPackage = getPackages().get(i);

            if ( !aPackage.isDelivered) {
                aPackage.isDelivered = true;
            

                int nextPackageIndex = i + 1;

                if (nextPackageIndex < getPackages().size()) {
                    Package nextPackage = getPackages().get(nextPackageIndex);

                    nextPackage.isDelivered = false;
                    

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

