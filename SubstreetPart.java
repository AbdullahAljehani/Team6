import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubstreetPart {
    private int x;
    private int y;
    private double distance;

    private List<SubstreetPart> nextParts;

    public SubstreetPart(int x, int y,double distance) {
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

    public void setDistance(double distance) {
        this.distance = distance;
    }

   public double getDistance() {
    
        return this.distance;
    }


    public void setNextPart(SubstreetPart nextPart) {
        if (nextPart != null) {
            this.nextParts.add(nextPart);
        }
    }

    public List<SubstreetPart> getNextParts() {
        return Collections.unmodifiableList(nextParts);
    }
}

