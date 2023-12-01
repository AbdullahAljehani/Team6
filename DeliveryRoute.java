import java.util.ArrayList;

public class DeliveryRoute {
    private ArrayList<Substreet> substreets;
    private int estimatedArrivalTime; 

    public DeliveryRoute( int estimatedArrivalTime) {
        this.substreets = new ArrayList<>();
        this.estimatedArrivalTime = estimatedArrivalTime;
    }
    public void addSubstreet(Substreet substreet) {
        substreets.add(substreet);
    }
    public int getEstimatedArrivalTime() {
        return estimatedArrivalTime;
    }
    public ArrayList<Substreet> getSubstreets(){
        return new ArrayList<>(substreets);
    }


    
  


}