import java.util.ArrayList;

public class DeliveryDriver {
    private ArrayList<Package> packages;
    private DeliveryRoute currentRoute;

    public DeliveryDriver() {
        this.packages = new ArrayList<>();
    }

    public void addPackage(Package aPackage) {
        packages.add(aPackage);
    }
    public ArrayList<Package> getPackages(){
        return new ArrayList<>(packages);
    }
    public void setCurrentRoute(DeliveryRoute route) {
        this.currentRoute = route;
    }
    
    public DeliveryRoute getCurrenRoute(){
        return this.currentRoute;

    }

    public boolean isPackageDelivered(Package aPackage) {
        return aPackage.isDelivered;
    }
}