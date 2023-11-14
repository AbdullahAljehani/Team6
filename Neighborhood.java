import java.util.ArrayList;

public class Neighborhood {
    private char neighborhoodName;
    private ArrayList<Substreet> substreets;

    public Neighborhood(char neighborhoodName) {
        this.neighborhoodName = neighborhoodName;
        this.substreets = new ArrayList<>();
    }

    public void addSubstreet(Substreet substreet) {
        substreets.add(substreet);
    }

    public char getNeighborhoodName() {
        return neighborhoodName;
    }

    public ArrayList<Substreet> getSubstreets() {
        return new ArrayList<>(substreets); 
    }
}
