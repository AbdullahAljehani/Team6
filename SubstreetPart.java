import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubstreetPart {
    private int x;
    private int y;
    private Substreet firstEnd;
    private Substreet secondEnd;
    private List<SubstreetPart> nextParts;

    public SubstreetPart(int x, int y, Substreet firstEnd, Substreet secondEnd) {
        this.x = x;
        this.y = y;
        this.firstEnd = firstEnd;
        this.secondEnd = secondEnd;
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

    public Substreet getFirstEnd() {
        return this.firstEnd;
    }

    public Substreet getSecondEnd() {
        return this.secondEnd;
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

