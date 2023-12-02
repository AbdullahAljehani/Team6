public class Building {
    private int buildingNumber;
    private SubstreetPart location; 

    public Building(int buildingNumber, SubstreetPart location) {
        this.buildingNumber = buildingNumber;
        this.location = location;
    }

    public int getBuildingNumber() {
        return this.buildingNumber;
    }

    public SubstreetPart getLocation() {
        return location;
    }
}


