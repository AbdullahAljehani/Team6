public class Building {
    private static int lastBuildingNumber = 0;
    private int buildingNumber;

    public Building() {
        lastBuildingNumber++;
        this.buildingNumber = lastBuildingNumber;
    }

    public int getBuildingNumber() {
        return this.buildingNumber;
    }
}
