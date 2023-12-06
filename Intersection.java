import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Intersection  {
    private int x;
    private int y;
    private List<Intersection > nextParts;


    public Intersection (int x, int y) {
        this.x = x;
        this.y = y;
        this.nextParts = new ArrayList<>();
      
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
    

  
    public double getDistanceTo(Intersection  nextPart) {
        double deltaX = Math.abs(this.getX() - nextPart.getX());
        double deltaY = Math.abs(this.getY() - nextPart.getY());
    
        double pixelToKmConversionFactor = 0.01; 
        double distanceInKm = (deltaX + deltaY)*pixelToKmConversionFactor;
    
        return distanceInKm;
    }
    
    public double calculateGasolineCost(Intersection  nextPart) {
        double costPerKilometer = 2.5; 
        return  getDistanceTo(nextPart) * costPerKilometer;
    }


    public List<Intersection > getNextParts() {
        return Collections.unmodifiableList(nextParts);
    }
}

