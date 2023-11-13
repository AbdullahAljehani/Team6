import java.util.ArrayList;

public class Substreet {
    public ArrayList<Building> buildingRight;
    public ArrayList<Building> buildingLeft;
    private char streetName;
    public double distance;
    private int speedLimit;
    public int delay;
    public Substreet firstEnd;
    public Substreet secondEnd;

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
    public char getStreetName(){
        return this.streetName;
    }
    public int getSpeedLimit(){
        return this.speedLimit;
    }

}
