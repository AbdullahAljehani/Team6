import java.util.Random;

public class CustomerWithContact extends Customer implements Reachable {
    private String customerNumber;

    public CustomerWithContact(int ID, Building building1) {
        super(ID, building1);
        this.customerNumber = "05" + (10000000 + new Random().nextInt(90000000));
    }

    // Copy constructor
    public CustomerWithContact(CustomerWithContact original) {
        super(original.getID(), original.getBuilding());
        this.customerNumber = original.customerNumber;
    }

    @Override
    public String getPhoneNumber() {
        return customerNumber;
    }
}