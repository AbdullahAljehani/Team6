import java.util.ArrayList;

public class Neighborhood {
    private String neighborhoodName;
    private ArrayList<Substreet> substreets;

    public Neighborhood(String neighborhoodName) {
        this.neighborhoodName = neighborhoodName;
        this.substreets = new ArrayList<>();
    }

    public void addSubstreet(Substreet substreet) {
        substreets.add(substreet);
    }

    public String getNeighborhoodName() {
        return neighborhoodName;
    }

    public ArrayList<Substreet> getSubstreets() {
        return new ArrayList<>(substreets); 
    }
}
