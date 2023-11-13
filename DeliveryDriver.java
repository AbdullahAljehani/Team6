import java.util.ArrayList;

public class DeliveryDriver {
    public ArrayList<Package> packages;

    public DeliveryDriver() {
        this.packages = new ArrayList<>();
    }

    public void addPackage(Package aPackage) {
        packages.add(aPackage);
    }

    /*public boolean isPackageDelivered() {
      
    }*/
}