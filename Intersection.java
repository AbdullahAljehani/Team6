



public class Intersection  {
    private int x;
    private int y;
    
    public Intersection (int x, int y) {
        this.x = x;
        this.y = y;
        
      
    }

    

    public int getX() {
        return this.x;
    }


    public int getY() {
        return this.y;
    }
    

  
    public double getDistanceTo(Intersection nextIntersection) {
        double deltaX = Math.abs(this.getX() - nextIntersection.getX());
        double deltaY = Math.abs(this.getY() - nextIntersection.getY());
    
        double pixelToKmConversionFactor = 0.01; 
        double distanceInKm = (deltaX + deltaY)*pixelToKmConversionFactor;
    
        return distanceInKm;
    }
    
    public double calculateGasolineCost(Intersection nextIntersection) {
        double costPerKilometer = 2.5; 
        return  getDistanceTo(nextIntersection) * costPerKilometer;
    }


    
}

