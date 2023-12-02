import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SubstreetPart {
    private int x;
    private int y;
    private List<SubstreetPart> nextParts;
private int delay;

    public SubstreetPart(int x, int y,int delay) {
        this.x = x;
        this.y = y;
        this.nextParts = new ArrayList<>();
        this.delay=delay;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }
    public int getDelay(){
        return this.delay;
    }

  
    public double getDistanceTo(SubstreetPart nextPart) {
        double deltaX = Math.abs(this.getX() - nextPart.getX());
        double deltaY = Math.abs(this.getY() - nextPart.getY());
    
        double pixelToKmConversionFactor = 0.01; 
        double distanceInKm = (deltaX + deltaY)*pixelToKmConversionFactor;
    
        return distanceInKm;
    }
    
    public double calculateGasolineCost(SubstreetPart nextPart) {
        double costPerKilometer = 2.5; 
        return  getDistanceTo(nextPart) * costPerKilometer;
    }


    public List<SubstreetPart> getNextParts() {
        return Collections.unmodifiableList(nextParts);
    }
}

