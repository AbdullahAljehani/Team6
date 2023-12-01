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

  

    public double getDistanceTo(SubstreetPart currentPart,SubstreetPart nextPart) {
        double deltaX = Math.abs(currentPart.getX() - nextPart.getX());
        double deltaY = Math.abs(currentPart.getY() - nextPart.getY());
    
    double scale = 0.01;
        double distanceInKm = (deltaX+deltaY)*scale;   
        return distanceInKm;
    }
    public double calculateGasolineCost(SubstreetPart currentPart,SubstreetPart nextPart) {
        double costPerKilometer = 2.5; 
        return getDistanceTo( currentPart, nextPart) * costPerKilometer;}

    public void setNextPart(SubstreetPart nextPart) {
        if (nextPart != null) {
            this.nextParts.add(nextPart);
        }

    }

    public List<SubstreetPart> getNextParts() {
        return Collections.unmodifiableList(nextParts);
    }
}

