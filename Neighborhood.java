import java.util.ArrayList;

public class Neighborhood {
    private char neighborhoodName;
    public ArrayList<Substreet> substreet1;

    public Neighborhood(char neighborhoodName) {
        this.neighborhoodName = neighborhoodName;
        this.substreet1 = new ArrayList<>();
    }
    public void addSubstreet(Substreet substreet) {
        substreet1.add(substreet);
    }
    public char getNeighborhoodName() {
        return neighborhoodName;
    }

}


