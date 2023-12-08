import java.util.ArrayList;
import java.util.List;

public abstract class Package implements Cloneable {
    private Customer customer1;
    public boolean isDelivered;
    private int packageId;
    private List<Intersection > path;
    public int delay;

    public Package (Customer customer1,  int packageId,List<Intersection > path,int delay) {
        this.customer1 = customer1;
        this.isDelivered = false;
        this.packageId = packageId;
        this.path = path;
        this.delay=delay;
        
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Abstract method for creating a copy with a new path
    public abstract Package copyWithNewPath(List<Intersection> newPath);
    public abstract void typeOfPackage();

    public int getPackageId() {
        return packageId;
    }

    public Customer getCustomer() {
        return customer1;
    }

    public List<Intersection > getPath() {
        return path;
    }
   public void setPath(List<Intersection> path){
    this.path = path;
   }

    }


    
   

   
    

