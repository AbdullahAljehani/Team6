import java.util.Timer;
import java.util.TimerTask;
import java.util.List;  

public class MainProgram {
    private static DeliveryDriver deliveryDriver;  
    private static int secondsPassed = 0;

    public static void main(String[] args) {

        Substreet streetA = new Substreet('A', 10.0, 80, 5, null, null);
        Substreet streetB = new Substreet('B', 10.0, 80, 5, null, null);
        Substreet streetC = new Substreet('C', 10.0, 80, 5, null, null);
        Substreet street1 = new Substreet('1', 5.0, 60, 2, null, null);
        Substreet street2 = new Substreet('2', 5.0, 60, 2, null, null);
        Substreet street3 = new Substreet('3', 5.0, 60, 2, null, null);
        Substreet street4 = new Substreet('4', 5.0, 60, 2, null, null);
        Substreet street5 = new Substreet('5', 5.0, 60, 2, null, null);
        Substreet street6 = new Substreet('6', 5.0, 60, 2, null, null);
        Substreet street7 = new Substreet('7', 5.0, 60, 2, null, null);
        Substreet street8 = new Substreet('8', 5.0, 60, 2, null, null);
        Substreet street9 = new Substreet('9', 5.0, 60, 2, null, null);

        Neighborhood  neighborhood1= new Neighborhood("Alhamdaniyah");
        Neighborhood  neighborhood2= new Neighborhood("AlManar");
        Neighborhood  neighborhood3= new Neighborhood("AlRabwah");
        neighborhood1.addSubstreet(street1);
        neighborhood1.addSubstreet(street2);
        neighborhood1.addSubstreet(street3);
        neighborhood2.addSubstreet(street4);
        neighborhood2.addSubstreet(street5);
        neighborhood2.addSubstreet(street6);
        neighborhood3.addSubstreet(street7);
        neighborhood3.addSubstreet(street8);
        neighborhood3.addSubstreet(street9);
        City city1= new City();
        city1.addNeighborhood(neighborhood1);
        city1.addNeighborhood(neighborhood2);
        city1.addNeighborhood(neighborhood3);
        
       
        FadingRectangle.launch(FadingRectangle.class, args);


        
        Building Building127= new Building(127,550,605,street9);
        Building Building103= new Building(103,890,475,street8);
        Building Building70= new Building(70,370,345,street6);
        Building Building64= new Building(64,890,280,street5);
        Building Building44= new Building(44,360,215,street3);
        Building Building11= new Building(11,880,20,street1);
        
        Customer customer1= new Customer(1,Building11);
        Customer customer2= new Customer(2,Building44);
        Customer customer3= new Customer(3,Building64);
        Customer customer4= new Customer(4,Building70);
        Customer customer5= new Customer(5,Building103);
        Customer customer6= new Customer(6,Building127);
        
        Offical_paper package1= new Offical_paper (customer1,1);
        Normal package2=new Normal(customer2, 2);
        Normal package3=new Normal(customer3, 3);
        Offical_paper package4= new Offical_paper (customer4,4);
        Normal package5=new Normal(customer5, 5);
        Offical_paper package6= new Offical_paper (customer6,6);
        DeliveryDriver driver= new DeliveryDriver();
        DeliveryRoute route= new DeliveryRoute(90);
        driver.addPackage(package1);
        driver.addPackage(package2);
        driver.addPackage(package3);
        driver.addPackage(package4);
        driver.addPackage(package5);
        driver.addPackage(package6);
        driver.setCurrentRoute(route);
        route.addSubstreet(street9);

       



         Timer timer = new Timer();
         FadingRectangle.launch(FadingRectangle.class, args);    
         
        TimerTask simulationTask = new TimerTask() {
            @Override
            public void run() {
                secondsPassed++;

             System.out.println("Timer " + formatTime(secondsPassed));

               
                if (allDelivered()) {
                    System.out.println("All packages delivered. Simulation completed.");
                    timer.cancel();
                }
            }
        };

        
        timer.schedule(simulationTask, 0, 10); 
    }

    private static boolean allDelivered() {
        List<Package> packages = deliveryDriver.getPackages();

        for (Package aPackage : packages) {
            if (!aPackage.isDelivered) {
                return false; 
            }
        }
        return true; 
    }

    private static String formatTime(int seconds) {
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        long remainingSeconds = seconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
    }
    public static void moveDriverAndRefreshGUI() {
        // Move the driver based on your logic
        deliveryDriver.moveDriver(1, DeliveryDriver.Direction.FORWARD);
        

        
    }
    
    

}
