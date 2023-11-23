import java.util.ArrayList;

public class SubstreetPart {
    private double x;
    private double y;
    private Substreet firstEnd;
    private Substreet secondEnd;


    public SubstreetPart(Substreet parentSubstreet, double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setX(double x){
        this.x=x;
    }
    public double getX(){
        return this.x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getY(){
        return this.y;
    }
public void setConnections(ArrayList<SubstreetPart> parts,Substreet firstEnd, Substreet secondEnd) {
        this.firstEnd = firstEnd;
        this.secondEnd = secondEnd;
    }
}