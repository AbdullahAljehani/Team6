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
    public void typeOfPackage() {   
        System.out.println("Deliver the package personally to the customer.");

    }
    public String getPhoneNumber() {
        return getCustomer().getPhoneNumber();
    }
    public void contactCustomer() {
        String customerPhoneNumber = getPhoneNumber();
        System.out.println("Contacting customer with phone number: " + customerPhoneNumber);
        
        this.delay= delay-2;
    }

}
