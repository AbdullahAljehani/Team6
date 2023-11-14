import java.util.ArrayList;

public class City {
    private ArrayList<Neighborhood> neighborhoods;

    public City() {
        this.neighborhoods = new ArrayList<>();
    }

    public void addNeighborhood(Neighborhood neighborhood) {
        neighborhoods.add(neighborhood);
    }
    public ArrayList<Neighborhood> getNeighborhoods() {
        return new ArrayList<>(neighborhoods);

}
}
