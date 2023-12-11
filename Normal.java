import java.util.List;

public class Normal extends Package  {

    public Normal(Customer customer, int packageId,List<Intersection > currentParts,int delay) {
        super(customer,  packageId,currentParts,delay);

    }
    public Normal(Normal original, List<Intersection> newPath) {
        super(original, newPath);
    }
   
    public String getPackageInformation() {
        return "Package Information:\n" +
                "Customer ID: " + getCustomer().getID() + "\n" +
                "Type of Package: " + getTypeOfPackage() + "\n" +
                "Building Number: " + getCustomer().getBuilding().getBuildingNumber() + "\n" +
                "Is Delivered: " + isDelivered;
    }
    
    private String getTypeOfPackage() {
        return "Normal";
    }
}
