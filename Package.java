import java.util.List;

public abstract class Package  {
    private Customer customer1;
    public boolean isAssignedToDriver;
    public boolean isDelivered;
    private int packageId;
    private List<SubstreetPart> path;
    private int currentPartIndex;

    public Package (Customer customer1,  int packageId,List<SubstreetPart> path) {
        this.customer1 = customer1;
        this.isAssignedToDriver = false;
        this.isDelivered = false;
        this.packageId = packageId;
        this.path = path;
        this.currentPartIndex = 0;
    }

    public abstract void typeOfPackage();

    public int getPackageId() {
        return packageId;
    }

    public Customer getCustomer() {
        return customer1;
    }

    public List<SubstreetPart> getPath() {
        return path;
    }


    
    public boolean isDelivered() {
        return isDelivered;
    }

    public void markAsDelivered() {
        this.isDelivered = true;
        System.out.println("Package " + this.getPackageId() + " is delivered.");
    }
    
}
