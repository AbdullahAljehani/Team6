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
    public int currentX;
    public int currentY;
    private double currentDistanceOnRoute;
    private int currentSubstreetIndex; 
    private Substreet currentSubstreet;
    private static Rectangle car;
    public static PathTransition pathTransition;
    private Path path;
    public static double Distance=0;
     public static double GasolineCost=0;
    public static boolean continueTransition = false;
    public SubstreetPart currentSubstreetPart;

private double distanceForCurrentPath = 0;

// Other class variables and methods...

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
        this.pathTransition.setDuration(Duration.seconds(59));


        
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

    
public static void updateGasolineCost(double increment) {
    GasolineCost += increment;
    System.out.println("GasolineCost "+GasolineCost);
}


public static void updateDistance(double increment) {
    Distance += increment;
    System.out.println("Total Distance: " + Distance);
}
public void updateDistanceForCurrentPath(double increment) {
    distanceForCurrentPath += increment;
    System.out.println("Distance for Current Path: " + distanceForCurrentPath);
}

public Path generatePath(List<SubstreetPart> packageParts) {
    Path path = new Path();

    if (packageParts.isEmpty()) {
        return path;
    }

    SubstreetPart currentPart = packageParts.get(0);
    path.getElements().add(new MoveTo(currentPart.getX(), currentPart.getY()));
    currentX = currentPart.getX();
    currentY = currentPart.getY();

    for (int i = 1; i < packageParts.size(); i++) {
        SubstreetPart nextPart = packageParts.get(i);
        path.getElements().add(new LineTo(nextPart.getX(), nextPart.getY()));

        double increment = currentPart.getDistanceTo(nextPart);
        distanceForCurrentPath += increment;
        updateDistanceForCurrentPath(increment);
        updateDistance(increment);

        currentPart = nextPart;
        currentX = currentPart.getX();
        currentY = currentPart.getY();

    }

    return path;
}

public void createPathForPackages(List<List<SubstreetPart>> packages) {
    if (packages == null || packages.isEmpty()) {
        return;
    }

    playPathTransitions(packages, 0);
}

private void playPathTransitions(List<List<SubstreetPart>> packages, int index) {
    if (index >= packages.size()) {
        return;
    }

    Path path = generatePath(packages.get(index));
    moveDriver(path, () -> playPathTransitions(packages, index + 1));
}



public void moveDriver(Path path, Runnable onFinish) {
    if (!path.getElements().isEmpty() && FadingRectangle.isStartClicked) {
        PathTransition pathTransition = new PathTransition();
        pathTransition.setNode(car);
        pathTransition.setDuration(Duration.seconds(20));

        pathTransition.setPath(path);
        pathTransition.setCycleCount(1);
        pathTransition.setOnFinished(e -> {
            handleTransitionCompletion();
            deliverPackage(currentX, currentY);
            onFinish.run();
        });
        
        pathTransition.play();
    }
}


    public void handleTransitionCompletion() {
        FadingRectangle.updateGasolineCostLabel();
        FadingRectangle.updateDistanceLabel();
        System.out.println("Transition finished");
        }
    



    public int calculateTripDelay() {
        if (currentSubstreet != null) {
            return currentSubstreetPart.getDelay();
        } else {
            return 0;
        }
    }

   public void deliverPackage(int currentX, int currentY) {
        for (Package aPackage : getPackages()) {
            if (!aPackage.isDelivered) {
                Building destinationBuilding = aPackage.getCustomer().getBuilding();
    
                System.out.println("Package " + aPackage.getPackageId() + " isDelivered: " + aPackage.isDelivered);
                 System.out.println("currentX " +currentX + " currenty " +currentY);       

                if (currentX == destinationBuilding.getLocation().getX() && currentY == destinationBuilding.getLocation().getY()) {
                    System.out.println("get x "+ destinationBuilding.getLocation().getX() + " get Y() "+destinationBuilding.getLocation().getY());
                    if (aPackage instanceof Offical_paper && currentSubstreetPart != null) {
                        int substreetDelay = currentSubstreetPart.getDelay();
                        System.out.println("Official package detected. Introducing a delay of " + substreetDelay + " minutes on Substreet " + currentSubstreet.getStreetName());
                        try {
                            Thread.sleep(substreetDelay * 1000 * 60);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
    
                    System.out.println("Package " + aPackage.getPackageId() + " delivered at building " + destinationBuilding.getBuildingNumber());
                    aPackage.isDelivered = true;
                    System.out.println("Package " + aPackage.getPackageId() + " isDelivered updated to: " + aPackage.isDelivered);
                    
                    if(hasNextPackage(aPackage)&&aPackage.isDelivered==true){
                    moveToNextPackage();
                    }
    
                    
                }
            }
        }
    
        System.out.println("No more packages assigned to the driver at the current position.");
    }
    
   
    public void moveToNextPackage() {
        for (int i = 0; i < getPackages().size(); i++) {
            Package aPackage = getPackages().get(i);
    
            if (aPackage.isDelivered) {
               
    
                int nextPackageIndex = i + 1;
    
                if (nextPackageIndex < getPackages().size()) {
                    Package nextPackage = getPackages().get(nextPackageIndex);
    
                    nextPackage.isDelivered = false;
    
                    System.out.println("Driver assigned to the next package with ID: " + nextPackage.getPackageId());
                    System.out.println("Package " + aPackage.getPackageId() + " marked as delivered");
                    System.out.println("Package " + nextPackage.getPackageId() + " marked as not delivered");
                } else {
                    System.out.println("No more packages assigned to the driver at the current position.");
                }
    
                return;
            }
        }
    
        System.out.println("No more packages assigned to the driver at the current position.");
    }
    private boolean hasNextPackage(Package currentPackage) {
        int currentIndex = getPackages().indexOf(currentPackage);
        return currentIndex < getPackages().size() - 1;
    }
}