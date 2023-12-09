import java.util.List;

public class Normal extends Package  {

    public Normal(Customer customer, int packageId,List<Intersection > currentParts,int delay) {
        super(customer,  packageId,currentParts,delay);

    }
    public Normal(Normal original, List<Intersection> newPath) {
        super(original, newPath);
    }
   
    @Override
    public void typeOfPackage() {
        System.out.println("Place the package at the door of the building.");
    }
}
