import java.util.ArrayList;

public class City {
    public ArrayList<Neighborhood> neighborhood1;

    public City() {
        this.neighborhood1 = new ArrayList<>();
    }

    public void addNeighborhood(Neighborhood neighborhood) {
        neighborhood1.add(neighborhood);
    }

}
