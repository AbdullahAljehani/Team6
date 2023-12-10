import java.util.ArrayList;
import java.util.List;
import javafx.animation.PathTransition;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Path;
import javafx.scene.shape.PathElement;
import javafx.util.Duration;

public class DeliveryDriver {
    private List<Package> packages;
    private int currentX;
    private int currentY;
    public  PathTransition pathTransition;
    private Path path;
    private  double gasolineCost;
    public double incrementGasoline;
    public double incrementDistance;
    private  double distance;
    public double totalDourtion;
    public DeliveryDriver() {
        this.packages = new ArrayList<>(); 

            
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

public double calculateTotalDistance(List<List<Intersection>> packages) {
    double totalDistance = 0.0;

    for (List<Intersection> subStreetParts : packages) {
        if (!subStreetParts.isEmpty()) {
            Intersection currentPart = subStreetParts.get(0);

            for (int i = 1; i < subStreetParts.size(); i++) {
                Intersection nextPart = subStreetParts.get(i);
                totalDistance += currentPart.getDistanceTo(nextPart);
                currentPart = nextPart;
            }
        }
    }

    return totalDistance;
}

public double calculateTotalGasolineCost(List<List<Intersection>> packages) {
    double totalGasolineCost = 0.0;

    for (List<Intersection> subStreetParts : packages) {
        if (!subStreetParts.isEmpty()) {
            Intersection currentPart = subStreetParts.get(0);

            for (int i = 1; i < subStreetParts.size(); i++) {
                Intersection nextPart = subStreetParts.get(i);
                totalGasolineCost += currentPart.calculateGasolineCost(nextPart);
                currentPart = nextPart;
            }
        }
    }

    return totalGasolineCost;
}
public void moveCarTo(List<List<Intersection>> packages) {
    double firstX=0;
    double firstY=0;
    double lastX=0;
    double lastY=0;
    if (!packages.isEmpty()) {
        // First substreet part from the first package
        List<Intersection> firstPackage = packages.get(0);
        if (!firstPackage.isEmpty()) {
            Intersection firstPart = firstPackage.get(0);
             firstX = firstPart.getX();
             firstY = firstPart.getY();

            

        }

        // Last substreet part from the last package
        List<Intersection> lastPackage = packages.get(packages.size() - 1);
        if (!lastPackage.isEmpty()) {
            Intersection lastPart = lastPackage.get(lastPackage.size() - 1);
             lastX = lastPart.getX();
             lastY = lastPart.getY();

            
        }
    
            double finalPointX  = lastX-  firstX;
            double finalPointY  = lastY-  firstY;
            

            MainGUISimulation.car.setTranslateX(finalPointX);
            MainGUISimulation.car.setTranslateY(finalPointY);
        }
    }


public void createPathForPackages(List<List<Intersection>> packages) {
    if (packages == null || packages.isEmpty()) {
        return;
    }

    playPathTransitions(packages, 0);
}

private void playPathTransitions(List<List<Intersection>> packages, int index) {
    if (index >= packages.size()) {
        return;
    }

    Path path = generatePath(packages.get(index));
    moveDriver(path, () -> playPathTransitions(packages, index + 1));

}

public Path generatePath(List<Intersection> subStreetParts) {
    Path path = new Path();

    if (subStreetParts.isEmpty()) {
        return path;
    }

    Intersection currentPart = subStreetParts.get(0);
    path.getElements().add(new MoveTo(currentPart.getX(), currentPart.getY()));
    
    for (int i = 1; i < subStreetParts.size(); i++) {
        Intersection nextPart = subStreetParts.get(i);
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
public int culclateTotalTime(){
    int totalDelay=0;
    List<Package> packages = getPackages();
for (Package singlePackage : packages) {
    
    totalDelay+=singlePackage.delay*60;
}
     
    
    double totalDistance = calculateTotalDistance(MainProgram.PackagesPaths(MainProgram.initializePackages()));
    double totalDourtion=35.896;
    double totalTime = totalDelay + totalDistance*1000/totalDourtion;
    int totalTimrCast = (int) totalTime;
    return totalTimrCast;
}
public void moveDriver(Path path, Runnable onFinish) {
    if (!path.getElements().isEmpty() && MainGUISimulation.isStartClicked) {
        double totalDistance = calculateTotalDistance(path.getElements());
       
        double duration = totalDistance/ 250 ;    
        pathTransition = new PathTransition();
        pathTransition.setNode(MainGUISimulation.car);
        pathTransition.setCycleCount(1);
        pathTransition.setDuration(Duration.seconds(duration)); 
        pathTransition.setPath(path);
        pathTransition.setOnFinished(e -> {
            MainGUISimulation.CounterDistanceLabel.setText(MainGUISimulation.formatDistance(distance));
            MainGUISimulation.CounterCostLabel.setText(MainGUISimulation.formatGasolineCost(gasolineCost));
            deliverPackage(currentX, currentY);
            onFinish.run();
        });

        pathTransition.play();
    }
}

private double calculateTotalDistance(ObservableList<PathElement> elements) {
    double totalDistance = 0.0;

    if (elements.size() >= 2) {
        MoveTo moveTo = (MoveTo) elements.get(0);
        double startX = moveTo.getX();
        double startY = moveTo.getY();

        for (int i = 1; i < elements.size(); i++) {
            if (elements.get(i) instanceof LineTo) {
                LineTo lineTo = (LineTo) elements.get(i);
                double endX = lineTo.getX();
                double endY = lineTo.getY();

                double distance = Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
                totalDistance += distance;

                startX = endX;
                startY = endY;
            }
        }
    }

    return totalDistance;
    
}
    


public void deliverPackage(int currentX, int currentY) {
    boolean deliveredPackageFound = false;
    for (Package aPackage : getPackages()) {
        if (!aPackage.isDelivered) {
            Building destinationBuilding = aPackage.getCustomer().getBuilding();
            if (currentX == destinationBuilding.getLocation().getX() && currentY == destinationBuilding.getLocation().getY()) {
                aPackage.isDelivered = true;
                deliveredPackageFound = true;

                for (Rectangle chosenBuilding : MainGUISimulation.ChosenBuilding) {
                    if (chosenBuilding.equals(destinationBuilding.getGuiElement())) {
                        destinationBuilding.getGuiElement().setFill(Color.GREEN);
                    }
                }

                int packageDelay = aPackage.delay;
                System.out.println("Package " + aPackage.getPackageId() + " delivered at building " + destinationBuilding.getBuildingNumber());

                try {
                    Thread.sleep(packageDelay * 500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (hasNextPackage(aPackage) && aPackage.isDelivered) {
                    moveToNextPackage();
                }
            }
        }
    }

    if (!deliveredPackageFound) {
        System.out.println("No more packages assigned to the driver at the current position.");
    }
}

public void moveToNextPackage() {
    boolean nextPackageFound = false;
    for (int i = 0; i < getPackages().size(); i++) {
        Package currentPackage = getPackages().get(i);
        if (currentPackage.isDelivered) {
            for (int j = i + 1; j < getPackages().size(); j++) {
                Package nextPackage = getPackages().get(j);
                if (!nextPackage.isDelivered) {
                    nextPackageFound = true;
                    break;
                }
            }

            if (nextPackageFound) {
                break;
            }
        }
    }

    if (!nextPackageFound) {
        System.out.println("No more packages assigned to the driver at the current position.");
    }
}
    private boolean hasNextPackage(Package currentPackage) {
        int currentIndex = getPackages().indexOf(currentPackage);
        return currentIndex < getPackages().size() - 1;
    }
}