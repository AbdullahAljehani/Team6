import java.util.List;

public class Normal extends Package  {

    public Normal(Customer customer, int packageId,List<Intersection > currentParts,int delay) {
        super(customer,  packageId,currentParts,delay);

    }
    public Package copyWithNewPath(List<Intersection> newPath) {
        return new Normal(this.getCustomer(), this.getPackageId(), newPath, this.delay);
    }
    @Override
    public void typeOfPackage() {
        System.out.println("Place the package at the door of the building.");
    }
}
