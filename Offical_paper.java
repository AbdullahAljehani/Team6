public class Offical_paper extends Package  {

    public Offical_paper(Customer customer,  int packageId) {
        super(customer, packageId);

    }

    @Override
    public void typeOfPackage() {
        System.out.println("Deliver the package personally to the customer.");

    }
}
