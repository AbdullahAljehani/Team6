import java.util.List;

public class Offical_paper extends Package  {

    public Offical_paper(Customer customer,  int packageId,List<Intersection > currentParts,int delay) {
        super(customer, packageId,currentParts,delay);

    }
    public Offical_paper(Offical_paper original, List<Intersection> newPath) {
        super(original, newPath);
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
        this.delay= delay-2;
    }
    private String getTypeOfPackage() {
        return "OfficalPaper";
    }
}
