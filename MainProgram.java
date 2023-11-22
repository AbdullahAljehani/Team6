import javafx.application.Platform;

public class MainProgram {
    private static Substreet streetA;
    private static Substreet streetB;
    private static Substreet streetC;
    private static Substreet street1;
    private static Substreet street2;
    private static Substreet street3;
    private static Substreet street4;
    private static Substreet street5;
    private static Substreet street6;
    private static Substreet street7;
    private static Substreet street8;
    private static Substreet street9;

    private static Neighborhood neighborhood1;
    private static Neighborhood neighborhood2;
    private static Neighborhood neighborhood3;

    private static City city1;

    private static Building building127;
    private static Building building103;
    private static Building building70;
    private static Building building64;
    private static Building building44;
    private static Building building11;

    private static Customer customer1;
    private static Customer customer2;
    private static Customer customer3;
    private static Customer customer4;
    private static Customer customer5;
    private static Customer customer6;

    private static Offical_paper package1;
    private static Normal package2;
    private static Normal package3;
    private static Offical_paper package4;
    private static Normal package5;
    private static Offical_paper package6;

    public static DeliveryDriver driver;
    public static DeliveryRoute route;


    public static void main(String[] args) {
    initializeObjects();
    FadingRectangle.launch(FadingRectangle.class, args);
    Platform.runLater(() -> {
    FadingRectangle.updateCarPositionInGUI();
});
   
        
        
        
    }

    public static void initializeObjects() {
        streetA = new Substreet('A', 10.0, 80, 5, streetB, null);
        streetB = new Substreet('B', 10.0, 80, 5, streetC, null);
        streetC = new Substreet('C', 10.0, 80, 5, street1, null);
        street1 = new Substreet('1', 5.0, 60, 2, street2, null);
        street2 = new Substreet('2', 5.0, 60, 2, street3, null);
        street3 = new Substreet('3', 5.0, 60, 2, street4, null);
        street4 = new Substreet('4', 5.0, 60, 2, street5, null);
        street5 = new Substreet('5', 5.0, 60, 2, street6, null);
        street6 = new Substreet('6', 5.0, 60, 2, street7, null);
        street7 = new Substreet('7', 5.0, 60, 2, street8, null);
        street8 = new Substreet('8', 5.0, 60, 2, street9, null);
        street9 = new Substreet('9', 5.0, 60, 2, null, null);


        neighborhood1 = new Neighborhood("Alhamdaniyah");
        neighborhood2 = new Neighborhood("AlManar");
        neighborhood3 = new Neighborhood("AlRabwah");
        neighborhood1.addSubstreet(street1);
        neighborhood1.addSubstreet(street2);
        neighborhood1.addSubstreet(street3);
        neighborhood2.addSubstreet(street4);
        neighborhood2.addSubstreet(street5);
        neighborhood2.addSubstreet(street6);
        neighborhood3.addSubstreet(street7);
        neighborhood3.addSubstreet(street8);
        neighborhood3.addSubstreet(street9);

        city1 = new City();
        city1.addNeighborhood(neighborhood1);
        city1.addNeighborhood(neighborhood2);
        city1.addNeighborhood(neighborhood3);

        building127 = new Building(127, 550, 605, street9);
        building103 = new Building(103, 890, 475, street8);
        building70 = new Building(70, 370, 345, street6);
        building64 = new Building(64, 890, 280, street5);
        building44 = new Building(44, 360, 215, street3);
        building11 = new Building(11, 880, 20, street1);

        customer1 = new Customer(1, building11);
        customer2 = new Customer(2, building44);
        customer3 = new Customer(3, building64);
        customer4 = new Customer(4, building70);
        customer5 = new Customer(5, building103);
        customer6 = new Customer(6, building127);

        package1 = new Offical_paper(customer1, 1);
        package2 = new Normal(customer2, 2);
        package3 = new Normal(customer3, 3);
        package4 = new Offical_paper(customer4, 4);
        package5 = new Normal(customer5, 5);
        package6 = new Offical_paper(customer6, 6);

        driver = new DeliveryDriver();
        route = new DeliveryRoute(90);

        driver.addPackage(package1);
        driver.addPackage(package2);
        driver.addPackage(package3);
        driver.addPackage(package4);
        driver.addPackage(package5);
        driver.addPackage(package6);
        route.addSubstreet(street1);
        route.addSubstreet(street2);
        route.addSubstreet(street3);
        route.addSubstreet(street4);
        route.addSubstreet(street5);
        route.addSubstreet(street6);
        route.addSubstreet(street7);
        route.addSubstreet(street8);
        route.addSubstreet(street9);
        driver.setCurrentRoute(route);
        System.out.println(" " + driver.getCurrentRoute());
    }

   
    }
    


