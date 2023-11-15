import java.util.ArrayList;

public class DeliveryDriver {
    private ArrayList<Package> packages;
    private DeliveryRoute currentRoute;
    private int currentX;
    private int currentY;
    private double currentDistanceOnRoute;
    private int currentSubstreetIndex; 

    private enum Direction {
        FORWARD,
        BACKWARD,
        LEFT,
        RIGHT
    }

    public DeliveryDriver() {
        this.packages = new ArrayList<>();
        this.currentX = 0;
        this.currentY = 0;
        this.currentDistanceOnRoute = 0;
    }

    public void addPackage(Package aPackage) {
        packages.add(aPackage);
    }

    public ArrayList<Package> getPackages() {
        return new ArrayList<>(packages);
    }

    public void setCurrentRoute(DeliveryRoute route) {
        this.currentRoute = route;
        this.currentX = 0; // Reset X-coordinate when a new route is set
        this.currentY = 0; // Reset Y-coordinate when a new route is set
        this.currentDistanceOnRoute = 0; // Reset distance on the current route
    }

    public DeliveryRoute getCurrentRoute() {
        return this.currentRoute;
    }

    public boolean isPackageDelivered(Package aPackage) {
        return aPackage.isDelivered;
    }

    public void moveDriver(int distance, Direction direction) {
        if (currentRoute != null) {
            if (currentRoute.getSubstreets() != null && !currentRoute.getSubstreets().isEmpty()) {
                updateDistanceOnRoute(distance);
                
                double remainingDistanceOnSubstreet = currentRoute.getSubstreets().get(currentSubstreetIndex).getDistance() - currentDistanceOnRoute;
    
                if (remainingDistanceOnSubstreet <= 0) {
                    moveToNextSubstreet();
                    updateDistanceOnRoute(distance);
                } else {
                    updateDriverPosition(distance, direction);
                }
            } else {
                System.out.println("No substreets set for the driver's route.");
            }
        } else {
            System.out.println("No route set for the driver.");
        }
    }
    

    private void updateDriverPosition(int distance, Direction direction) {
        // Add logic to update the driver's position based on the distance and direction.
        // You might want to consider the direction of the driver.
        System.out.println("Driver moved by " + distance + " units in direction: " + direction);
        switch (direction) {
            case FORWARD:
                currentY += distance;
                break;
            case BACKWARD:
                currentY -= distance;
                break;
            case LEFT:
                currentX -= distance;
                break;
            case RIGHT:
                currentX += distance;
                break;
            default:
                System.out.println("Invalid direction");
        }
    }

    public void updateDistanceOnRoute(int distance) {
        currentDistanceOnRoute += distance;
    }

    public void deliverPackage() {
        if (currentRoute != null) {
            for (int i = 0; i < getPackages().size(); i++) {
               
                Package aPackage = getPackages().get(i);
    
                if (aPackage.isAssignedToDriver && !aPackage.isDelivered) {
                    System.out.println("Package delivered along the route.");
    
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
        } else {
            System.out.println("No route set for the driver.");
        }
    }
    public void moveToNextSubstreet() {
        if (currentRoute != null && currentRoute.getSubstreets() != null) {
            if (currentSubstreetIndex < currentRoute.getSubstreets().size() - 1) {
                currentSubstreetIndex++;
                Substreet nextSubstreet = currentRoute.getSubstreets().get(currentSubstreetIndex);
                System.out.println("Driver moved to the next street. Next substreet: " + nextSubstreet.getStreetName());
            } else {
                System.out.println("No more substreets in the route.");
            }
        } else {
            System.out.println("No route or substreets set for the driver.");
        }
    }
    
    }

