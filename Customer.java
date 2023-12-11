public class Customer {
    private int ID;
    private Building building;
    

    public Customer(int ID, Building building) {
        this.ID = ID;
        this.building = building;
        
    }
    public Building getBuilding(){
        return building;
    }

    public int getID() {
        return ID;
    }
   
}
