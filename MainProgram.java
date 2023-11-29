import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.application.Platform;

public class MainProgram {
  public static List<SubstreetPart> pathofpackage1;
  public static List<SubstreetPart> pathofpackage2;
  private static List<Package> packages;
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
    
    public static SubstreetPart FirstOfStreet1;
    public static SubstreetPart EndOfStreet1;
    
    public static SubstreetPart FirstOfStreet2;
    public static SubstreetPart EndOfStreet2;
    
    public static SubstreetPart FirstOfStreet3;
    public static SubstreetPart EndOfStreet3;
    
    public static SubstreetPart FirstOfStreet4;
    public static SubstreetPart EndOfStreet4;
    
    public static SubstreetPart FirstOfStreet5;
    public static SubstreetPart EndOfStreet5;
    

   public static SubstreetPart FirstOfStreet6;
   public static SubstreetPart EndOfStreet6;
    
   public static SubstreetPart FirstOfStreet7;
   public static SubstreetPart EndOfStreet7;
    
   public static SubstreetPart FirstOfStreet8;
   public static SubstreetPart EndOfStreet8;
    
   public static SubstreetPart FirstOfStreet9;
   public static SubstreetPart EndOfStreet9;

   public static SubstreetPart FirstOfStreetA;
   public static SubstreetPart EndOfStreetA;

   public static SubstreetPart FirstOfStreetB;
   public static SubstreetPart EndOfStreetB;

   public static SubstreetPart FirstOfStreetC;
   public static SubstreetPart EndOfStreetC;

    public static SubstreetPart intersection1_1;
    public static SubstreetPart intersection1_2;
    public static SubstreetPart intersection1_3;
    
    public static SubstreetPart intersection2_1;
    public static SubstreetPart intersection2_2;
    public static SubstreetPart intersection2_3;

    public static SubstreetPart intersection3_1;
    public static SubstreetPart intersection3_2;
    public static SubstreetPart intersection3_3;

    public static SubstreetPart intersection4_1;
    public static SubstreetPart intersection4_2;
    public static SubstreetPart intersection4_3;

    public static SubstreetPart intersection5_1;
    public static SubstreetPart intersection5_2;
    public static SubstreetPart intersection5_3;

    public static SubstreetPart intersection6_1;
    public static SubstreetPart intersection6_2;
    public static SubstreetPart intersection6_3;

    public static SubstreetPart intersection7_1;
    public static SubstreetPart intersection7_2;
    public static SubstreetPart intersection7_3;

    public static SubstreetPart intersection8_1;
    public static SubstreetPart intersection8_2;
    public static SubstreetPart intersection8_3;

    public static SubstreetPart intersection9_1;
    public static SubstreetPart intersection9_2;
    public static SubstreetPart intersection9_3;

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
    List<SubstreetPart> street1Parts = Arrays.asList(MainProgram.FirstOfStreet1,MainProgram.intersection1_1,MainProgram.FirstOfStreet1,MainProgram.intersection1_1,MainProgram.FirstOfStreetA,MainProgram.intersection1_1,MainProgram.intersection1_2,MainProgram.intersection1_3,MainProgram.intersection2_3,MainProgram.intersection3_3,MainProgram.intersection2_3,MainProgram.EndOfStreet2,MainProgram.intersection2_3,MainProgram.intersection3_3,MainProgram.intersection4_3,MainProgram.intersection5_3,MainProgram.intersection5_2,MainProgram.intersection6_2,MainProgram.intersection7_2,MainProgram.intersection8_2,MainProgram.intersection8_3,MainProgram.intersection9_3,MainProgram.EndOfStreetC);



    public static void main(String[] args) {
    initializeObjects();
    packages = createPackages();
        
    // Set the packages on the driver
    driver.setPackages(packages);
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
      
      FirstOfStreet1= new SubstreetPart( 35, 66);
      intersection1_1= new SubstreetPart( 330, 66);
      intersection1_2= new SubstreetPart( 600, 66);
      intersection1_3= new SubstreetPart(860, 66);
      EndOfStreet1= new SubstreetPart( 1050, 66);

      FirstOfStreet2= new SubstreetPart( 35, 130);
      intersection2_1= new SubstreetPart( 330, 130);
      intersection2_2= new SubstreetPart( 600, 130);
      intersection2_3= new SubstreetPart(860, 130);
      EndOfStreet2= new SubstreetPart( 1050, 130);

      FirstOfStreet3= new SubstreetPart( 35, 197);
      intersection3_1= new SubstreetPart( 330, 197);
      intersection3_2= new SubstreetPart( 600, 197);
      intersection3_3= new SubstreetPart(860, 197);
      EndOfStreet3= new SubstreetPart( 1050, 197);

      FirstOfStreet4= new SubstreetPart( 35, 265);
      intersection4_1= new SubstreetPart( 330, 265);
      intersection4_2= new SubstreetPart( 600, 265);
      intersection4_3= new SubstreetPart(860, 265);
      EndOfStreet4= new SubstreetPart( 1050, 265);

      FirstOfStreet5= new SubstreetPart( 35, 330);
      intersection5_1= new SubstreetPart( 330, 330);
      intersection5_2= new SubstreetPart( 600, 330);
      intersection5_3= new SubstreetPart(860, 330);
      EndOfStreet5= new SubstreetPart( 1050, 330);

      FirstOfStreet6= new SubstreetPart( 35, 395);
      intersection6_1= new SubstreetPart( 330, 395);
      intersection6_2= new SubstreetPart( 600, 395);
      intersection6_3= new SubstreetPart(860, 395);
      EndOfStreet6= new SubstreetPart( 1050, 395);
  
      FirstOfStreet7= new SubstreetPart( 35, 461);
      intersection7_1= new SubstreetPart( 330, 461);
      intersection7_2= new SubstreetPart( 600, 461);
      intersection7_3= new SubstreetPart(860, 461);
      EndOfStreet7= new SubstreetPart( 1050, 461);

      FirstOfStreet8= new SubstreetPart( 35, 527);
      intersection8_1= new SubstreetPart( 330, 527);
      intersection8_2= new SubstreetPart( 600, 527);
      intersection8_3= new SubstreetPart(860, 527);
      EndOfStreet8= new SubstreetPart( 1050, 527);
  
      FirstOfStreet9= new SubstreetPart( 35, 594);
      intersection9_1= new SubstreetPart( 330, 594);
      intersection9_2= new SubstreetPart( 600, 594);
      intersection9_3= new SubstreetPart(860, 594);
      EndOfStreet9= new SubstreetPart( 1050, 594);

      FirstOfStreetC= new SubstreetPart( 860, 0);
      EndOfStreetC= new SubstreetPart( 860, 670);

      FirstOfStreetB= new SubstreetPart( 600, 0);
      EndOfStreetB= new SubstreetPart( 600, 670);

      FirstOfStreetA= new SubstreetPart( 330, 0);
      EndOfStreetA= new SubstreetPart( 330, 670);
      
      street1.addPart(FirstOfStreet1);
      street1.addPart(EndOfStreet1);
      street1.addPart(intersection1_1);
      street1.addPart(intersection1_2);
      street1.addPart(intersection1_3);

     
      street2.addPart(FirstOfStreet2);
      street2.addPart(EndOfStreet2);
      street2.addPart(intersection2_1);
      street2.addPart(intersection2_2);
      street2.addPart(intersection2_3);
      
      street3.addPart(FirstOfStreet3);
      street3.addPart(EndOfStreet3);
      street3.addPart(intersection3_1);
      street3.addPart(intersection3_2);
      street3.addPart(intersection3_3);
      
      street4.addPart(FirstOfStreet4);
      street4.addPart(EndOfStreet4);
      street4.addPart(intersection4_1);
      street4.addPart(intersection4_2);
      street4.addPart(intersection4_3);
      
      street5.addPart(FirstOfStreet5);
      street5.addPart(EndOfStreet5);
      street5.addPart(intersection5_1);
      street5.addPart(intersection5_2);
      street5.addPart(intersection5_3);

      street6.addPart(FirstOfStreet6);
      street6.addPart(EndOfStreet6);
      street6.addPart(intersection6_1);
      street6.addPart(intersection6_2);
      street6.addPart(intersection6_3);

      street7.addPart(FirstOfStreet7);
      street7.addPart(EndOfStreet7);
      street7.addPart(intersection7_1);
      street7.addPart(intersection7_2);
      street7.addPart(intersection7_3);

      street8.addPart(FirstOfStreet8);
      street8.addPart(EndOfStreet8);
      street8.addPart(intersection8_1);
      street8.addPart(intersection8_2);
      street8.addPart(intersection8_3);

      street9.addPart(FirstOfStreet9);
      street9.addPart(EndOfStreet9);
      street9.addPart(intersection9_1);
      street9.addPart(intersection9_2);
      street9.addPart(intersection9_3);
     
      streetA.addPart(FirstOfStreetA);
      streetA.addPart(EndOfStreetA);
      
      streetB.addPart(FirstOfStreetB);
      streetB.addPart(EndOfStreetB);
      
      streetC.addPart(FirstOfStreetC);
      streetC.addPart(EndOfStreetC);

    //#Street1
    FirstOfStreet1.setNextPart(intersection1_1);
    intersection1_1.setNextPart(FirstOfStreet1);
    intersection1_1.setNextPart(FirstOfStreetA);
    FirstOfStreetA.setNextPart(intersection1_1);
    intersection1_1.setNextPart(intersection1_2);
    intersection1_2.setNextPart(intersection1_1);
    intersection1_1.setNextPart(intersection2_1);
    intersection2_1.setNextPart(intersection1_1);
    intersection1_2.setNextPart(FirstOfStreetB);
    FirstOfStreetB.setNextPart(intersection1_2);
    intersection1_2.setNextPart(intersection1_3);
    intersection1_3.setNextPart(intersection1_2);
    intersection1_2.setNextPart(intersection2_2);
    intersection2_2.setNextPart(intersection1_2);
    intersection1_3.setNextPart(FirstOfStreetC);
    FirstOfStreetC.setNextPart(intersection1_3);
    intersection1_3.setNextPart(EndOfStreet1);
    EndOfStreet1.setNextPart(intersection1_3);
    intersection1_3.setNextPart(intersection2_3);
    intersection2_3.setNextPart(intersection1_3);

  //#Street2
  FirstOfStreet2.setNextPart(intersection2_1);
  intersection2_1.setNextPart(FirstOfStreet2);
  intersection2_1.setNextPart(intersection2_2);
  intersection2_2.setNextPart(intersection2_1);
  intersection2_1.setNextPart(intersection3_1);
  intersection3_1.setNextPart(intersection2_1);
  intersection2_2.setNextPart(intersection2_3);
  intersection2_3.setNextPart(intersection2_2);
  intersection2_2.setNextPart(intersection3_2);
  intersection3_2.setNextPart(intersection2_2);
  intersection2_3.setNextPart(EndOfStreet2);
  EndOfStreet2.setNextPart(intersection2_3);
  intersection2_3.setNextPart(intersection3_3);
  intersection3_3.setNextPart(intersection2_3);

  //#Street3
  FirstOfStreet3.setNextPart(intersection3_1);
  intersection3_1.setNextPart(FirstOfStreet3);
  intersection3_1.setNextPart(intersection3_2);
  intersection3_2.setNextPart(intersection3_1);
  intersection3_1.setNextPart(intersection4_1);
  intersection4_1.setNextPart(intersection3_1);
  intersection3_2.setNextPart(intersection3_3);
  intersection3_3.setNextPart(intersection3_2);
  intersection3_2.setNextPart(intersection4_2);
  intersection4_2.setNextPart(intersection3_2);
  intersection3_3.setNextPart(EndOfStreet3);
  EndOfStreet3.setNextPart(intersection3_3);
  intersection3_3.setNextPart(intersection4_3);
  intersection4_3.setNextPart(intersection3_3);
 
  //#Street4
   FirstOfStreet4.setNextPart(intersection4_1);
   intersection4_1.setNextPart(FirstOfStreet4);
   intersection4_1.setNextPart(intersection4_2);
   intersection4_2.setNextPart(intersection4_1);
   intersection4_1.setNextPart(intersection5_1);
   intersection5_1.setNextPart(intersection4_1);
   intersection4_2.setNextPart(intersection4_3);
   intersection4_3.setNextPart(intersection4_2);
   intersection4_2.setNextPart(intersection5_2);
   intersection5_2.setNextPart(intersection4_2);
   intersection4_3.setNextPart(EndOfStreet4);
   EndOfStreet4.setNextPart(intersection4_3);
   intersection4_3.setNextPart(intersection5_3);
   intersection5_3.setNextPart(intersection4_3);
  
   //#Street5
  FirstOfStreet5.setNextPart(intersection5_1);
  intersection5_1.setNextPart(FirstOfStreet5);
  intersection5_1.setNextPart(intersection5_2);
  intersection5_2.setNextPart(intersection5_1);
  intersection6_1.setNextPart(intersection5_1);
  intersection5_1.setNextPart(intersection6_1);
  intersection5_2.setNextPart(intersection5_3);
  intersection5_3.setNextPart(intersection5_2);
  intersection5_2.setNextPart(intersection6_2);
  intersection6_2.setNextPart(intersection5_2);
  intersection5_3.setNextPart(EndOfStreet5);
  EndOfStreet5.setNextPart(intersection5_3);
  intersection5_3.setNextPart(intersection6_3);
  intersection6_3.setNextPart(intersection5_3); 
   
  //#Street6
   FirstOfStreet6.setNextPart(intersection6_1);
   intersection6_1.setNextPart(FirstOfStreet6);
   intersection6_1.setNextPart(intersection6_2);
   intersection6_2.setNextPart(intersection6_1);
   intersection6_1.setNextPart(intersection7_1);
   intersection7_1.setNextPart(intersection6_1);
   intersection6_2.setNextPart(intersection6_3);
   intersection6_3.setNextPart(intersection6_2);
   intersection6_2.setNextPart(intersection7_2);
   intersection7_2.setNextPart(intersection6_2);
   intersection6_3.setNextPart(EndOfStreet6);
   EndOfStreet6.setNextPart(intersection6_3);
   intersection6_3.setNextPart(intersection7_3);
   intersection7_3.setNextPart(intersection6_3);

   //#Street7
  FirstOfStreet7.setNextPart(intersection7_1);
  intersection7_1.setNextPart(FirstOfStreet7);
  intersection7_1.setNextPart(intersection7_2);
  intersection7_2.setNextPart(intersection7_1);
  intersection8_1.setNextPart(intersection7_1);
  intersection7_1.setNextPart(intersection8_1);
  intersection7_2.setNextPart(intersection7_3);
  intersection7_3.setNextPart(intersection7_2);
  intersection7_2.setNextPart(intersection8_2);
  intersection8_2.setNextPart(intersection7_2);
  intersection7_3.setNextPart(EndOfStreet7);
  EndOfStreet7.setNextPart(intersection7_3);
  intersection7_3.setNextPart(intersection8_3);
  intersection8_3.setNextPart(intersection7_3);
  //#Street8
  FirstOfStreet8.setNextPart(intersection8_1);
  intersection8_1.setNextPart(FirstOfStreet8);
  intersection8_1.setNextPart(intersection8_2);
  intersection8_2.setNextPart(intersection8_1);
  intersection9_1.setNextPart(intersection8_1);
  intersection8_1.setNextPart(intersection9_1);
  intersection8_2.setNextPart(intersection8_3);
  intersection8_3.setNextPart(intersection8_2);
  intersection8_2.setNextPart(intersection9_2);
  intersection9_2.setNextPart(intersection8_2);
  intersection8_3.setNextPart(EndOfStreet8);
  EndOfStreet8.setNextPart(intersection8_3);
  intersection8_3.setNextPart(intersection9_3);
  intersection9_3.setNextPart(intersection8_3);
    
  //#Street9
  FirstOfStreet9.setNextPart(intersection9_1);
  intersection9_1.setNextPart(FirstOfStreet9);
  intersection9_1.setNextPart(intersection9_2);
  intersection9_2.setNextPart(intersection9_1);
  intersection9_1.setNextPart(EndOfStreetA);
  EndOfStreetA.setNextPart(intersection9_1);
  intersection9_2.setNextPart(intersection9_3);
  intersection9_3.setNextPart(intersection9_2);
  intersection9_2.setNextPart(EndOfStreetB);
  EndOfStreetB.setNextPart(intersection9_2);
  intersection9_3.setNextPart(EndOfStreet9);
  EndOfStreet9.setNextPart(intersection9_3);
  intersection9_3.setNextPart(EndOfStreetC);
  EndOfStreetC.setNextPart(intersection9_3);


  
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

        customer1 = new Customer(1, building44);
        customer2 = new Customer(2, building11);
        customer3 = new Customer(3, building64);
        customer4 = new Customer(4, building70);
        customer5 = new Customer(5, building103);
        customer6 = new Customer(6, building127);


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
    }

    public static List<Package> createPackages() {
        // Create packages and initialize them with relevant information
        List<Package> packages = new ArrayList<>();
        List<SubstreetPart> initialparts1 = Arrays.asList(MainProgram.EndOfStreetA,MainProgram.intersection9_1,MainProgram.intersection8_1,MainProgram.intersection7_1,MainProgram.intersection6_1,MainProgram.intersection5_1,MainProgram.intersection4_1,MainProgram.FirstOfStreet4);
        List<SubstreetPart> initialparts2 = Arrays.asList(MainProgram.FirstOfStreet4,MainProgram.intersection4_1,MainProgram.intersection3_1,MainProgram.intersection2_1,MainProgram.intersection1_1,MainProgram.EndOfStreet1);
        pathofpackage1 = createPackagePath(initialparts1);
        pathofpackage2 = createPackagePath(initialparts2);
        Package package1 = new Offical_paper(customer1, 1, pathofpackage1);

        Package package2 = new Normal(customer2, 2, pathofpackage2);
        
        // Add more packages as needed

        packages.add(package1);
        packages.add(package2);
        System.out.println("Path for Package 1: " + package1.getPath());
        // ... add more packages as needed ...

        // Set the initial current part for each package

        return packages;
      }

      public static List<SubstreetPart> createPackagePath(List<SubstreetPart> initialParts) {
        List<SubstreetPart> path = new ArrayList<>();
        
        // Add all initial parts to the path
        path.addAll(initialParts);
    
        return path;
    }

    


}
    
    
