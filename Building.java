public class Building {
    private static int lastBuildingNumber = 0;
    private int buildingNumber;
    private double xCoordinate;
    private double yCoordinate;
    private Substreet substreet;

    public Building(double xCoordinate, double yCoordinate, Substreet substreet) {
        lastBuildingNumber++;
        this.buildingNumber = lastBuildingNumber;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.substreet = substreet;
    }

    public int getBuildingNumber() {
        return this.buildingNumber;
    }

    public double getXCoordinate() {
        return this.xCoordinate;
    }

    public double getYCoordinate() {
        return this.yCoordinate;
    }

    public Substreet getSubstreet() {
        return this.substreet;
    }
}

