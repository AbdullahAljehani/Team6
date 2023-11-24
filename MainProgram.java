
public class MainProgram {
    public static Substreet streetA;
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
    
    public static SubstreetPart street1_part1;
    public static SubstreetPart street1_part2;
    public static SubstreetPart street1_part3;
    public static SubstreetPart street1_part4;
    
    public static SubstreetPart street2_part1;
    public static SubstreetPart street2_part2;
    private static SubstreetPart street2_part3;
    private static SubstreetPart street2_part4;

    private static SubstreetPart street3_part1;
    private static SubstreetPart street3_part2;
    private static SubstreetPart street3_part3;
    private static SubstreetPart street3_part4;
    
    private static SubstreetPart street4_part1;
    private static SubstreetPart street4_part2;
    private static SubstreetPart street4_part3;
    private static SubstreetPart street4_part4;
    
    private static SubstreetPart street5_part1;
    private static SubstreetPart street5_part2;
    private static SubstreetPart street5_part3;
    private static SubstreetPart street5_part4;

    private static SubstreetPart street6_part1;
    private static SubstreetPart street6_part2;
    private static SubstreetPart street6_part3;
    private static SubstreetPart street6_part4;
    
    private static SubstreetPart street7_part1;
    private static SubstreetPart street7_part2;
    private static SubstreetPart street7_part3;
    private static SubstreetPart street7_part4;
    
    private static SubstreetPart street8_part1;
    private static SubstreetPart street8_part2;
    private static SubstreetPart street8_part3;
    private static SubstreetPart street8_part4;
    
    private static SubstreetPart street9_part1;
    private static SubstreetPart street9_part2;
    private static SubstreetPart street9_part3;
    private static SubstreetPart street9_part4;

    private static SubstreetPart streetA_part1;
    private static SubstreetPart streetA_part2;
    private static SubstreetPart streetA_part3;
    private static SubstreetPart streetA_part4;
    private static SubstreetPart streetA_part5;
    private static SubstreetPart streetA_part6;
    private static SubstreetPart streetA_part7;
    private static SubstreetPart streetA_part8;
    private static SubstreetPart streetA_part9;
    private static SubstreetPart streetA_part10;

    private static SubstreetPart streetB_part1;
    private static SubstreetPart streetB_part2;
    private static SubstreetPart streetB_part3;
    private static SubstreetPart streetB_part4;
    private static SubstreetPart streetB_part5;
    private static SubstreetPart streetB_part6;
    private static SubstreetPart streetB_part7;
    private static SubstreetPart streetB_part8;
    private static SubstreetPart streetB_part9;
    private static SubstreetPart streetB_part10;
    
    private static SubstreetPart streetC_part1;
    private static SubstreetPart streetC_part2;
    private static SubstreetPart streetC_part3;
    private static SubstreetPart streetC_part4;
    private static SubstreetPart streetC_part5;
    private static SubstreetPart streetC_part6;
    private static SubstreetPart streetC_part7;
    private static SubstreetPart streetC_part8;
    private static SubstreetPart streetC_part9;
    private static SubstreetPart streetC_part10;


    

    private static Neighborhood neighborhood1;
    private static Neighborhood neighborhood2;
    private static Neighborhood neighborhood3;

    private static City city1;

    public static Building building127;
    public static Building building103;
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
 
   
        
        
        
    }

    public static void initializeObjects() {
      streetA = new Substreet('A', 10.0, 80, 2);
      streetB = new Substreet('B', 10.0, 80, 2);
      streetC = new Substreet('C', 10.0, 80, 2);
      street1 = new Substreet('1', 5.0, 60, 4);
      street2 = new Substreet('2', 5.0, 60, 4);
      street3 = new Substreet('3', 5.0, 60, 4);
      street4 = new Substreet('4', 5.0, 60, 4);
      street5 = new Substreet('5', 5.0, 60, 4);
      street6 = new Substreet('6', 5.0, 60, 4);
      street7 = new Substreet('7', 5.0, 60, 4);
      street8 = new Substreet('8', 5.0, 60, 4);
      street9 = new Substreet('9', 5.0, 60, 4);
      
      street1_part1= new SubstreetPart( 45, 66, null, streetA,null);
      street1_part2= new SubstreetPart( 290, 66, streetA, streetB,null);
      street1_part3= new SubstreetPart( 560, 66, streetB, streetC,null);
      street1_part4= new SubstreetPart( 1050, 66, streetC, null,null);

      street2_part1= new SubstreetPart( 0, 130, null, streetA,null);
      street2_part2= new SubstreetPart( 0,130, streetA, streetB,null);
      street2_part3= new SubstreetPart( 0,130, streetB, streetC,null);
      street2_part4= new SubstreetPart( 1045, 130, streetC, null,null);

      street3_part1= new SubstreetPart( 0, 197, null, streetA,null);
      street3_part2= new SubstreetPart( 0, 197, streetA, streetB,null);
      street3_part3= new SubstreetPart( 0, 197, streetB, streetC,null);
      street3_part4= new SubstreetPart( 1045, 197, streetC, null,null);

      street4_part1= new SubstreetPart( 0, 0, null, streetA,null);
      street4_part2= new SubstreetPart( 0, 0, streetA, streetB,null);
      street4_part3= new SubstreetPart( 0, 0, streetB, streetC,null);
      street4_part4= new SubstreetPart( 1045, 265, streetC, null,null);

      street5_part1= new SubstreetPart( 0, 0, null, streetA,null);
      street5_part2= new SubstreetPart( 0, 0, streetA, streetB,null);
      street5_part3= new SubstreetPart( 0, 0, streetB, streetC,null);
      street5_part4= new SubstreetPart( 1045, 330, streetC, null,null);

      street6_part1= new SubstreetPart( 0, 0, null, streetA,null);
      street6_part2= new SubstreetPart( 0, 0, streetA, streetB,null);
      street6_part3= new SubstreetPart( 0, 0, streetB, streetC,null);
      street6_part4= new SubstreetPart( 1045, 395, streetC, null,null);

      street7_part1= new SubstreetPart( 0, 0, null, streetA,null);
      street7_part2= new SubstreetPart( 0, 0, streetA, streetB,null);
      street7_part3= new SubstreetPart( 0, 0, streetB, streetC,null);
      street7_part4= new SubstreetPart( 1045, 461, streetC, null,null);

      street8_part1= new SubstreetPart( 0, 0, null, streetA,null);
      street8_part2= new SubstreetPart( 0, 0, streetA, streetB,null);
      street8_part3= new SubstreetPart( 0, 0, streetB, streetC,null);
      street8_part4= new SubstreetPart( 1045, 527, streetC, null,null);
      
      street9_part1= new SubstreetPart( 0, 0, null, streetA,null);
      street9_part2= new SubstreetPart( 0, 0, streetA, streetB,null);
      street9_part3= new SubstreetPart( 0, 0, streetB, streetC,null);
      street9_part4= new SubstreetPart( 1045, 594, streetC, null,null);

      streetA_part1= new SubstreetPart( 860, 66, null, street1,null);
      streetA_part2= new SubstreetPart( 860, 130, street1, street2,null);
      streetA_part3= new SubstreetPart( 860, 197, street2, street3,null);
      streetA_part4= new SubstreetPart( 860, 265, street3, street4,null);
      streetA_part5= new SubstreetPart( 860, 330, street4, street5,null);
      streetA_part6= new SubstreetPart( 860, 395, street5, street6,null);
      streetA_part7= new SubstreetPart( 860, 461, street6, street7,null);
      streetA_part8= new SubstreetPart( 860, 527, street7, street8,null);
      streetA_part9= new SubstreetPart( 860, 594, street8, street9,null);
      streetA_part10= new SubstreetPart( 860, 650, street9, null,null);

      streetB_part1= new SubstreetPart( 0, 0, null,street1,null);
      streetB_part2= new SubstreetPart( 0, 0, street1, street2,null);
      streetB_part3= new SubstreetPart( 0, 0, street2, street3,null);
      streetB_part4= new SubstreetPart( 0, 0, street3, street4,null);
      streetB_part5= new SubstreetPart( 0, 0, street4, street5,null);
      streetB_part6= new SubstreetPart( 0, 0, street5, street6,null);
      streetB_part7= new SubstreetPart( 0, 0, street6, street7,null);
      streetB_part8= new SubstreetPart( 0, 0, street7, street8,null);
      streetB_part9= new SubstreetPart( 0, 0, street8, street9,null);
      streetB_part10= new SubstreetPart( 0, 0, street9, null,null);

      streetC_part1= new SubstreetPart( 800, 66, null, street1,null);
      streetC_part2= new SubstreetPart( 545, 66, street1, street2,null);
      streetC_part3= new SubstreetPart( 284, 66, street2, street3,null);
      streetC_part4= new SubstreetPart( 0, 66, street3, street4,null);
      streetC_part5= new SubstreetPart( 0, 0, street4, street5,null);
      streetC_part6= new SubstreetPart( 0, 0, street5, street6,null);
      streetC_part7= new SubstreetPart( 0, 0, street6, street7,null);
      streetC_part8= new SubstreetPart( 0, 0, street7, street8,null);
      streetC_part9= new SubstreetPart( 0, 0, street8, street9,null);
      streetC_part10= new SubstreetPart( 0, 0, street9, null,null);
     
      street1.addPart(street1_part1);
      street1.addPart(street1_part2);
      street1.addPart(street1_part3);
      street1.addPart(street1_part4);
     
      street2.addPart(street2_part1);
      street2.addPart(street2_part2);
      street2.addPart(street2_part3);
      street2.addPart(street2_part4);
      
      street3.addPart(street3_part1);
      street3.addPart(street3_part2);
      street3.addPart(street3_part3);
      street3.addPart(street3_part4);
      
      street4.addPart(street4_part1);
      street4.addPart(street4_part2);
      street4.addPart(street4_part3);
      street4.addPart(street4_part4);

      street5.addPart(street5_part1);
      street5.addPart(street5_part2);
      street5.addPart(street5_part3);
      street5.addPart(street5_part4);

      street6.addPart(street6_part1);
      street6.addPart(street6_part2);
      street6.addPart(street6_part3);
      street6.addPart(street6_part4);

      street7.addPart(street7_part1);
      street7.addPart(street7_part2);
      street7.addPart(street7_part3);
      street7.addPart(street7_part4);

      street8.addPart(street8_part1);
      street8.addPart(street8_part2);
      street8.addPart(street8_part3);
      street8.addPart(street8_part4);

      street9.addPart(street9_part1);
      street9.addPart(street9_part2);
      street9.addPart(street9_part3);
      street9.addPart(street9_part4);
     
      streetA.addPart(streetA_part1);
      streetA.addPart(streetA_part2);
      streetA.addPart(streetA_part3);
      streetA.addPart(streetA_part4);
      streetA.addPart(streetA_part5);
      streetA.addPart(streetA_part6);
      streetA.addPart(streetA_part7);
      streetA.addPart(streetA_part8);
      streetA.addPart(streetA_part9);
      streetA.addPart(streetA_part10);
      
      streetB.addPart(streetB_part1);
      streetB.addPart(streetB_part2);
      streetB.addPart(streetB_part3);
      streetB.addPart(streetB_part4);
      streetB.addPart(streetB_part5);
      streetB.addPart(streetB_part6);
      streetB.addPart(streetB_part7);
      streetB.addPart(streetB_part8);
      streetB.addPart(streetB_part9);
      streetB.addPart(streetB_part10);
      
      streetC.addPart(streetC_part1);
      streetC.addPart(streetC_part2);
      streetC.addPart(streetC_part3);
      streetC.addPart(streetC_part4);
      streetC.addPart(streetC_part5);
      streetC.addPart(streetC_part6);
      streetC.addPart(streetC_part7);
      streetC.addPart(streetC_part8);
      streetC.addPart(streetC_part9);
      streetC.addPart(streetC_part10);
      
      street1_part1.setNextPart(street1_part2);
      street1_part2.setNextPart(street1_part3);
      street1_part3.setNextPart(street1_part4);
      street1_part4.setNextPart(null);

      street2_part1.setNextPart(street2_part2);
      street2_part2.setNextPart(street2_part3);
      street2_part3.setNextPart(street2_part4);
      street2_part4.setNextPart(null);

      street3_part1.setNextPart(street3_part2);
      street3_part2.setNextPart(street3_part3);
      street3_part3.setNextPart(street3_part4);
      street3_part4.setNextPart(null);

      street4_part1.setNextPart(street4_part2);
      street4_part2.setNextPart(street4_part3);
      street4_part3.setNextPart(street4_part4);
      street4_part4.setNextPart(null);

      street5_part1.setNextPart(street5_part2);
      street5_part2.setNextPart(street5_part3);
      street5_part3.setNextPart(street5_part4);
      street5_part4.setNextPart(null);

      street6_part1.setNextPart(street6_part2);
      street6_part2.setNextPart(street6_part3);
      street6_part3.setNextPart(street6_part4);
      street6_part4.setNextPart(null);

      street7_part1.setNextPart(street7_part2);
      street7_part2.setNextPart(street7_part3);
      street7_part3.setNextPart(street7_part4);
      street7_part4.setNextPart(null);

      street8_part1.setNextPart(street8_part2);
      street8_part2.setNextPart(street8_part3);
      street8_part3.setNextPart(street8_part4);
      street8_part4.setNextPart(null);
      
      street9_part1.setNextPart(street9_part2);
      street9_part2.setNextPart(street9_part3);
      street9_part3.setNextPart(street9_part4);
      street9_part4.setNextPart(null);

      

        
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
    


