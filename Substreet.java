import java.util.ArrayList;

public class Substreet { 
    private char streetName;
    private double distance;
    private int speedLimit;
    private ArrayList<Intersection > parts;

    

    public Substreet(char streetName, double distance, int speedLimit) {
       
        this.parts = new ArrayList<>();
        this.streetName = streetName;
        this.distance = distance;
        this.speedLimit = speedLimit;
        
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

    public void addPart(Intersection  part) {
        parts.add(part);
    }
    public ArrayList<Intersection > getParts() {
        return new ArrayList<>(parts);
    }
    
}
