import java.util.List;

public class Normal extends Package  {

    public Normal(Customer customer, int packageId,List<Intersection > path,int delay) {
        super(customer,  packageId,path,delay);

    }
    public Normal(Normal original, List<Intersection> newPath) {
        super(original, newPath);
    }
   
    public String getPackageInformation() {
        return "Package Information:\n" +
                "Customer ID: " + getCustomer().getID() + "\n" +
                "Type of Package: " + getTypeOfPackage() + "\n" +
                "Building Number: " + getCustomer().getBuilding().getBuildingNumber() ; 
              }
    
    private String getTypeOfPackage() {
        return "Normal";
    }
}
