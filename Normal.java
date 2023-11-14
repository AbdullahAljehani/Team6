public class Normal extends Package {

    public Normal(Customer customer, Building building, int packageId) {
        super(customer, building, packageId);

    }

    @Override
    public void typeOfPackage() {
        System.out.println("Place the package at the door of the building.");
    }
}
