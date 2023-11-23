import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;


public class SubstreetPart {
    private int x;
    private int y;
    private Substreet firstEnd;
    private Substreet secondEnd;
    private SubstreetPart nextPart;


    public SubstreetPart( int x, int y,Substreet firstEnd,Substreet secondEnd,SubstreetPart nextPart) {
        this.x = x;
        this.y = y;
        this.firstEnd= firstEnd;
        this.secondEnd= secondEnd;
        this.nextPart = nextPart;
        
    }
    public void setX(int x){
        
        this.x=x;
    }
    public int getX(){
        return this.x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return this.y;
    }

    public Substreet getFirstEnd(){
        return this.firstEnd;
    }
   
    public Substreet getSecondEnd(){
        return this.secondEnd;
    }
    public Path createPath() {
        Path path = new Path();
        path.getElements().add(new MoveTo(x, y));
        
        if (nextPart != null) {
            // Add a LineTo element to connect with the next part
            path.getElements().add(new LineTo(nextPart.getX(), nextPart.getY()));
        }
        
        return path;
    }
}