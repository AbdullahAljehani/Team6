import javafx.scene.shape.Rectangle;

public class Building {
    private int buildingNumber;
    private SubstreetPart location; 
    private Rectangle guiElement;


    public Building(int buildingNumber, SubstreetPart location,Rectangle guiElement) {
        this.buildingNumber = buildingNumber;
        this.location = location;
        this.guiElement=guiElement;
    }

    public int getBuildingNumber() {
        return this.buildingNumber;
    }

    public SubstreetPart getLocation() {
        return location;
    }
    public Rectangle getGuiElement(){
        return this.guiElement;
    }
    

    
}


