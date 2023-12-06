import java.util.List;

public class Offical_paper extends Package  {

    public Offical_paper(Customer customer,  int packageId,List<Intersection > currentParts,int delay) {
        super(customer, packageId,currentParts,delay);

    }

    @Override
    public void typeOfPackage() {
        System.out.println("Deliver the package personally to the customer.");

    }
}
