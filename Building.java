import javafx.scene.shape.Rectangle;

public class Building {
    private int buildingNumber;
    private Intersection  location; 
    private Rectangle guiElement;


    public Building(int buildingNumber, Intersection  location,Rectangle guiElement) {
        this.buildingNumber = buildingNumber;
        this.location = location;
        this.guiElement=guiElement;
    }

    public int getBuildingNumber() {
        return this.buildingNumber;
    }

    public Intersection  getLocation() {
        return location;
    }
    public Rectangle getGuiElement(){
        return this.guiElement;
    }
    

    
}


