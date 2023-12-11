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
        return "Package Information:\n" +
                "Customer ID: " + getCustomer().getID() + "\n" +
                "Type of Package: " + getTypeOfPackage() + "\n" +
                "Building Number: " + getCustomer().getBuilding().getBuildingNumber() + "\n" +
                "Is Delivered: " + isDelivered;
    }
    public void contactCustomer() {
            CustomerWithContact customerWithContact = (CustomerWithContact) getCustomer();
            String customerPhoneNumber = customerWithContact.getPhoneNumber();
            System.out.println("Contacting customer with phone number: " + customerPhoneNumber);
        
            this.delay= delay-2;
    }
    private String getTypeOfPackage() {
        return "OfficalPaper";
    }
}
