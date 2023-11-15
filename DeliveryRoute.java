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

    /* next substreet()
    public Substreet getCurrentStreet() {
        if (substreets != null && !substreets.isEmpty()) {
            return substreets.get(0);
        } else {
            return null;
        }
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


    */
}