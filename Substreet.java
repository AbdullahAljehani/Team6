import java.util.ArrayList;

public class Substreet {
    private ArrayList<Building> buildingRight;
    private ArrayList<Building> buildingLeft;
    private char streetName;
    private double distance;
    private int speedLimit;
    private int delay;
    private Substreet firstEnd;
    private Substreet secondEnd;

    public Substreet(char streetName, double distance, int speedLimit, int delay, Substreet firstEnd, Substreet secondEnd) {
        this.buildingRight = new ArrayList<>();
        this.buildingLeft = new ArrayList<>();
        this.streetName = streetName;
        this.distance = distance;
        this.speedLimit = speedLimit;
        this.delay = delay;
        this.firstEnd = firstEnd;
        this.secondEnd = secondEnd;
    }
    
    public void addBuildingRight(Building building) {
        buildingRight.add(building);
    }

    public void addBuildingLeft(Building building) {
        buildingLeft.add(building);
    }

    public char getStreetName() {
        return this.streetName;
    }

    public double getDistance() {
        return this.distance;
    }

    public int getSpeedLimit() {
        return this.speedLimit;
    }

    public int getDelay() {
        return this.delay;
    }

    public Substreet getFirstEnd() {
        return this.firstEnd;
    }

    public Substreet getSecondEnd() {
        return this.secondEnd;
    }

    public ArrayList<Building> getBuildingRight() {
        return new ArrayList<>(buildingRight);
    }

    public ArrayList<Building> getBuildingLeft() {
        return new ArrayList<>(buildingLeft);
    }
    public void setConnections(Substreet firstEnd, Substreet secondEnd) {
        this.firstEnd = firstEnd;
        this.secondEnd = secondEnd;
    }
}
