public class CustomerWithContact extends Customer implements Reachable {
    private  String customerNumber;

    public CustomerWithContact(int ID, Building building1,String customerNumber) {
        super(ID, building1); 
        this. customerNumber= customerNumber;
        
    }

   
    
    @Override
    public String getPhoneNumber() {

        return customerNumber;
    }

    
}
