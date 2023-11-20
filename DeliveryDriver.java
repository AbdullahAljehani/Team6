import java.util.ArrayList;

public class DeliveryDriver {
    private ArrayList<Package> packages;
    private DeliveryRoute currentRoute;
    private int currentX;
    private int currentY;
    private double currentDistanceOnRoute;
    private int currentSubstreetIndex; 
    private static final int MAX_X = 100;
    private static final int MIN_X = 0;
    private static final int MAX_Y = 100;
    private static final int MIN_Y = 0;
    private Substreet currentSubstreet;

    public enum Direction {
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
        this.currentSubstreet = null; // Initialize to null
    }

    public void addPackage(Package aPackage) {
        packages.add(aPackage);
    }

    public ArrayList<Package> getPackages() {
        return new ArrayList<>(packages);
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

    public void moveDriver(int distance, Direction direction) {
        if (currentRoute != null) {
            if (currentRoute.getSubstreets() != null && !currentRoute.getSubstreets().isEmpty()) {
                // Move the initialization here
                currentSubstreet = currentRoute.getSubstreets().get(currentSubstreetIndex);
                
                updateDistanceOnRoute(distance);

                double remainingDistanceOnSubstreet = currentSubstreet.getDistance() - currentDistanceOnRoute;

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

    public void updateDriverPosition(int distance, Direction direction) {
        System.out.println("Driver moved by " + distance + " units in direction: " + direction);
    
        switch (direction) {
            case FORWARD:
                currentY += distance;
                if (currentY > MAX_Y) {
                    System.out.println("Warning: Driver reached the maximum Y coordinate.");
                    currentY = MAX_Y; 
                }
                break;
            case BACKWARD:
                currentY -= distance;
                if (currentY < MIN_Y) {
                    System.out.println("Warning: Driver reached the minimum Y coordinate.");
                    currentY = MIN_Y; 
                }
                break;
            case LEFT:
                currentX -= distance;
                if (currentX < MIN_X) {
                    System.out.println("Warning: Driver reached the minimum X coordinate.");
                    currentX = MIN_X; 
                }
                break;
            case RIGHT:
                currentX += distance;
                if (currentX > MAX_X) {
                    System.out.println("Warning: Driver reached the maximum X coordinate.");
                    currentX = MAX_X; 
                }
                break;
            default:
                System.out.println("Invalid direction");
        }
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
                        
                        

                            // moveToSubstreet(destinationBuilding.getSubstreet());
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

        moveDriver((int) distanceToDestination, Direction.FORWARD);
    }

    public void moveToNextSubstreet() {
        if (currentRoute != null && currentRoute.getSubstreets() != null) {
            int tripDelay = calculateTripDelay();
            System.out.println("Introducing a delay of " + tripDelay + " minutes for the entire trip.");

            try {
                Thread.sleep(tripDelay * 1000 * 60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (currentSubstreetIndex < currentRoute.getSubstreets().size() - 1) {
                currentSubstreetIndex++;
                currentSubstreet = currentRoute.getSubstreets().get(currentSubstreetIndex);
                System.out.println("Driver moved to the next street. Next substreet: " + currentSubstreet.getStreetName());
            } else {
                System.out.println("No more substreets in the route.");
            }
        } else {
            System.out.println("No route or substreets set for the driver.");
        }
    }

    public double calculateDistanceToBuilding(double destinationX, double destinationY) {
        double deltaX = destinationX - currentX;
        double deltaY = destinationY - currentY;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    private void moveToNextPackage() {
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
