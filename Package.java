public abstract class Package {
    private Customer customer1;
    private Building building1;
    public boolean isAssignedToDriver;
    public boolean isDelivered;
    private int packageId;

    public Package(Customer customer1, Building building1, int packageId) {
        this.customer1 = customer1;
        this.building1 = building1;
        this.isAssignedToDriver = false;
        this.isDelivered = false;
        this.packageId = packageId;
    }

    public abstract void typeOfPackage();

    public int getPackageId() {
        return packageId;
    }

    public Customer getCustomer() {
        return customer1;
    }

    public Building getBuilding() {
        return building1;
    }

    
}
