import java.util.ArrayList;

public class DeliveryRoute {
    private ArrayList<Substreet> substreets;
    private int estimatedArrivalTime; 

    public DeliveryRoute(ArrayList<Substreet> substreets, int estimatedArrivalTime) {
        this.substreets = substreets;
        this.estimatedArrivalTime = estimatedArrivalTime;
    }

    public int getEstimatedArrivalTime() {
        return estimatedArrivalTime;
    }
    public ArrayList<Substreet> getSubstreets(){
        return new ArrayList<>(substreets);
    }


    public double getTotalDistanceTrip() {
           double totalDistance = 0.0;
        if (substreets != null) {
            for (Substreet substreet : substreets) {
                totalDistance += substreet.getDistance();
            }
        }
        return totalDistance;
    }
    public double calculateFailureCost(double costPerDistanceUnit, double costPerDelay) {
        double totalDistance = getTotalDistanceTrip();
        int totalDelay = getTotalDelay();

        double distanceCost = costPerDistanceUnit * totalDistance;
        double delayCost = costPerDelay * totalDelay;

        return distanceCost + delayCost;
    }

    private int getTotalDelay() {
        int totalDelay = 0;
        if (substreets != null) {
            for (Substreet substreet : substreets) {
                totalDelay += substreet.getDelay();
            }
        }
        return totalDelay;
    }



}