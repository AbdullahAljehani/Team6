

public class Offical_paper extends Package  {

    public Offical_paper(Customer customer,  int packageId,int delay) {
        super(customer, packageId,delay);

    }
    public Offical_paper(Offical_paper original) {
        super(original);
        contactCustomer();
    }

    @Override
    public String getPackageInformation() {
        Customer customer = getCustomer();
        String phoneNumber = (customer instanceof CustomerWithContact) ?
                ((CustomerWithContact) customer).getPhoneNumber() : "N/A";

        return "Package Information:\n" +
                "Package ID: " + getPackageId() + "\n" +
                "Customer ID: " + customer.getID() + "\n" +
                "Type of Package: " + getTypeOfPackage() + "\n" +
                "Building Number: " + customer.getBuilding().getBuildingNumber() + "\n" +
                "Customer Phone Number: " + phoneNumber;
    }

    public void contactCustomer() {
        this.delay = 3;  // Set the new delay directly
    }

    // Offical_paper class
    public void setDelay(int newDelay) {
    this.delay = newDelay;
}

    private String getTypeOfPackage() {
        return "OfficalPaper";
    }

    public void printPackageDetails() {
        System.out.println(getPackageInformation());
        System.out.println("New Delay for Offical_paper: " + delay);
    }
}