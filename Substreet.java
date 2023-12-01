import java.util.ArrayList;

public class Substreet {
    private ArrayList<Building> buildingRight;
    private ArrayList<Building> buildingLeft;
    private char streetName;
    private double distance;
    private int speedLimit;
    private ArrayList<SubstreetPart> parts;

    

    public Substreet(char streetName, double distance, int speedLimit) {
        this.buildingRight = new ArrayList<>();
        this.buildingLeft = new ArrayList<>();
        this.parts = new ArrayList<>();
        this.streetName = streetName;
        this.distance = distance;
        this.speedLimit = speedLimit;
        
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

   


    public ArrayList<Building> getBuildingRight() {
        return new ArrayList<>(buildingRight);
    }

    public ArrayList<Building> getBuildingLeft() {
        return new ArrayList<>(buildingLeft);
    }
    public void addPart(SubstreetPart part) {
        parts.add(part);
    }
    public ArrayList<SubstreetPart> getParts() {
        return new ArrayList<>(parts);
    }
    
}
