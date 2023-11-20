public class Normal extends Package  {

    public Normal(Customer customer, int packageId) {
        super(customer,  packageId);

    }

    @Override
    public void typeOfPackage() {
        System.out.println("Place the package at the door of the building.");
    }
}
