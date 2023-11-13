public abstract class Package {
    public Customer customer1;
    public Building building1;
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
}

