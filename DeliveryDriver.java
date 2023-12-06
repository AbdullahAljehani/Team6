import java.util.ArrayList;
import java.util.List;
import javafx.animation.PathTransition;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Path;
import javafx.util.Duration;

public class DeliveryDriver {
    private List<Package> packages;
    private int currentX;
    private int currentY;
    public  Rectangle car;
    public  PathTransition pathTransition;
    private Path path;
    private  double gasolineCost;
    public double incrementGasoline;
    public double incrementDistance;
    private  double distance;
    public DeliveryDriver() {
        this.packages = new ArrayList<>(); 
        this.car = new Rectangle(322, 662, 15, 15);
        this.car.setArcHeight(15);
        this.car.setArcWidth(15);
        this.car.setFill(Color.RED);
            
    }
    public void setGasolineCost(double gasolineCost){
        this.gasolineCost=gasolineCost;
    }
   
    public  double getGasolineCost() {
        return gasolineCost;
    }

    public void setDistance(double distance){
        this.distance=distance;
    }
   
    public  double getDistance() {
        return distance;
    }
    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }
   
    
      public List<Package> getPackages() {
        return packages;
    }


    public int getCurrentX(){
        return currentX;
    }

    public int getCurrentY(){
        return currentY;
    }

    
    public void setPath(Path path) {
        this.path = path;
    }
    public Path getpath(){
        return path;
    }

    
public  void updateGasolineCost(double increment) {
    gasolineCost += increment;
}

public double calculateTotalDistance(List<List<SubstreetPart>> packages) {
    double totalDistance = 0.0;

    for (List<SubstreetPart> subStreetParts : packages) {
        if (!subStreetParts.isEmpty()) {
            SubstreetPart currentPart = subStreetParts.get(0);

            for (int i = 1; i < subStreetParts.size(); i++) {
                SubstreetPart nextPart = subStreetParts.get(i);
                totalDistance += currentPart.getDistanceTo(nextPart);
                currentPart = nextPart;
            }
        }
    }

    return totalDistance;
}

public double calculateTotalGasolineCost(List<List<SubstreetPart>> packages) {
    double totalGasolineCost = 0.0;

    for (List<SubstreetPart> subStreetParts : packages) {
        if (!subStreetParts.isEmpty()) {
            SubstreetPart currentPart = subStreetParts.get(0);

            for (int i = 1; i < subStreetParts.size(); i++) {
                SubstreetPart nextPart = subStreetParts.get(i);
                totalGasolineCost += currentPart.calculateGasolineCost(nextPart);
                currentPart = nextPart;
            }
        }
    }

    return totalGasolineCost;
}
public void moveCarTo(List<List<SubstreetPart>> packages) {
    double firstX=0;
    double firstY=0;
    double lastX=0;
    double lastY=0;
    if (!packages.isEmpty()) {
        // First substreet part from the first package
        List<SubstreetPart> firstPackage = packages.get(0);
        if (!firstPackage.isEmpty()) {
            SubstreetPart firstPart = firstPackage.get(0);
             firstX = firstPart.getX();
             firstY = firstPart.getY();

            

        }

        // Last substreet part from the last package
        List<SubstreetPart> lastPackage = packages.get(packages.size() - 1);
        if (!lastPackage.isEmpty()) {
            SubstreetPart lastPart = lastPackage.get(lastPackage.size() - 1);
             lastX = lastPart.getX();
             lastY = lastPart.getY();

            
        }
    
            double finalPointX  = lastX-  firstX;
            double finalPointY  = lastY-  firstY;
            

            car.setTranslateX(finalPointX);
            car.setTranslateY(finalPointY);
        }
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

public Path generatePath(List<SubstreetPart> subStreetParts) {
    Path path = new Path();

    if (subStreetParts.isEmpty()) {
        return path;
    }

    SubstreetPart currentPart = subStreetParts.get(0);
    path.getElements().add(new MoveTo(currentPart.getX(), currentPart.getY()));
    
    for (int i = 1; i < subStreetParts.size(); i++) {
        SubstreetPart nextPart = subStreetParts.get(i);
        path.getElements().add(new LineTo(nextPart.getX(), nextPart.getY()));

         incrementDistance = currentPart.getDistanceTo(nextPart);
         incrementGasoline = currentPart.calculateGasolineCost(nextPart);
         gasolineCost += incrementGasoline ;
         distance+=incrementDistance;
        currentPart = nextPart;
        currentX = currentPart.getX();
        currentY = currentPart.getY();
        

    }
   

    return path;
}



public void moveDriver(Path path, Runnable onFinish) {
    if (!path.getElements().isEmpty() && MainGUISimulation .isStartClicked) {
         pathTransition = new PathTransition();
        pathTransition.setNode(car);
        pathTransition.setDuration(Duration.seconds(2));
        pathTransition.setPath(path);
        pathTransition.setCycleCount(1);
        pathTransition.setOnFinished(e -> {
            MainGUISimulation .CounterDistanceLabel.setText(MainGUISimulation .formatDistance(distance));
            MainGUISimulation .CounterCostLabel.setText(MainGUISimulation .formatGasolineCost(gasolineCost));
            deliverPackage(currentX, currentY);
            onFinish.run();

        });
        
        pathTransition.play();
    }
}


    
  

public void deliverPackage(int currentX, int currentY) {
    for (Package aPackage : getPackages()) {
        if (!aPackage.isDelivered) {
            Building destinationBuilding = aPackage.getCustomer().getBuilding();
            
            
            if (currentX == destinationBuilding.getLocation().getX() && currentY == destinationBuilding.getLocation().getY()) {
                
                for (Rectangle chosenBuilding : MainGUISimulation.ChosenBuilding) {
                    if (chosenBuilding.equals(destinationBuilding.getGuiElement())) {
                        destinationBuilding.getGuiElement().setFill(Color.GREEN);
                    }
                }
              
                int packageDelay = aPackage.delay;
                System.out.println("Package " + aPackage.getPackageId() + " delivered at building " + destinationBuilding.getBuildingNumber());
                
                try {
                    Thread.sleep(packageDelay*500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                aPackage.isDelivered = true;
                System.out.println("Package " + aPackage.getPackageId() + " isDelivered updated to: " + aPackage.isDelivered);

                if (hasNextPackage(aPackage) && aPackage.isDelivered) {
                    moveToNextPackage();
                }
            } else {
                System.out.println("Package " + aPackage.getPackageId() + " is already delivered.");
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
    
                    if (!nextPackage.isDelivered) { 
                        System.out.println("Driver assigned to the next package with ID: " + nextPackage.getPackageId());
                        System.out.println("Package " + aPackage.getPackageId() + " marked as delivered");
                        System.out.println("Package " + nextPackage.getPackageId() + " marked as not delivered");
                    } else {
                        System.out.println("Package " + nextPackage.getPackageId() + " is already marked as delivered");
                    }
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