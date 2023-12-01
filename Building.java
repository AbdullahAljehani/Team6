public class Building {
    private int buildingNumber;
    private int xCoordinate;
    private int yCoordinate;
    private Substreet substreet;

    public Building(int  buildingNumber,int xCoordinate, int yCoordinate, Substreet substreet) {
        this.buildingNumber = buildingNumber;
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

