public class Customer {
    private int ID;
    private Building building;
    private String phoneNumber;

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
    public void setPhoneNumber(String phoneNumber){
      this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
