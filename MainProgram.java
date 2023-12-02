import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    
    public static SubstreetPart destinationBuilding127;
    public static SubstreetPart destinationBuilding103;
    public static SubstreetPart destinationBuilding70;
    public static SubstreetPart destinationBuilding64;
    public static SubstreetPart destinationBuilding44;
    public static SubstreetPart destinationBuilding11;




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

    public static Customer customer1;
    public static Customer customer2;
    private static Customer customer3;
    private static Customer customer4;
    private static Customer customer5;
    private static Customer customer6;

    public static Offical_paper package1;
    public static Normal package2;
    private static Normal package3;
    private static Offical_paper package4;
    private static Normal package5;
    private static Offical_paper package6;

    public static DeliveryDriver driver;


  
    public static void main(String[] args) {
    initializeObjects();
    driver.setPackages(createPackages()); 
    FadingRectangle.launch(FadingRectangle.class, args);
   
        
    }


    public static void initializeObjects() {
        streetA = new Substreet('A', 10.0, 80);
        streetB = new Substreet('B', 10.0, 80);
        streetC = new Substreet('C', 10.0, 80);
        street1 = new Substreet('1', 5.0, 60);
        street2 = new Substreet('2', 5.0, 60);
        street3 = new Substreet('3', 5.0, 60);
        street4 = new Substreet('4', 5.0, 60);
        street5 = new Substreet('5', 5.0, 60);
        street6 = new Substreet('6', 5.0, 60);
        street7 = new Substreet('7', 5.0, 60);
        street8 = new Substreet('8', 5.0, 60);
        street9 = new Substreet('9', 5.0, 60);
      
      FirstOfStreet1= new SubstreetPart( 35, 66,4);
      intersection1_1= new SubstreetPart( 330, 66,4);
      intersection1_2= new SubstreetPart( 600, 66,4);
      intersection1_3= new SubstreetPart(860, 66,4);
      EndOfStreet1= new SubstreetPart( 1050, 66,4);
      FirstOfStreet2= new SubstreetPart( 35, 130,4);
      intersection2_1= new SubstreetPart( 330, 130,4);
      intersection2_2= new SubstreetPart( 600, 130,4);
      intersection2_3= new SubstreetPart(860, 130,4);
      EndOfStreet2= new SubstreetPart( 1050, 130,4);

      FirstOfStreet3= new SubstreetPart( 35, 197,4);
      intersection3_1= new SubstreetPart( 330, 197,4);
      intersection3_2= new SubstreetPart( 600, 197,4);
      intersection3_3= new SubstreetPart(860, 197,4);
      EndOfStreet3= new SubstreetPart( 1050, 197,4);

      FirstOfStreet4= new SubstreetPart( 35, 265,4);
      intersection4_1= new SubstreetPart( 330, 265,4);
      intersection4_2= new SubstreetPart( 600, 265,4);
      intersection4_3= new SubstreetPart(860, 265,4);
      EndOfStreet4= new SubstreetPart( 1050, 265,4);

      FirstOfStreet5= new SubstreetPart( 35, 330,4);
      intersection5_1= new SubstreetPart( 330, 330,4);
      intersection5_2= new SubstreetPart( 600, 330,4);
      intersection5_3= new SubstreetPart(860, 330,4);
      EndOfStreet5= new SubstreetPart( 1050, 330,4);

      FirstOfStreet6= new SubstreetPart( 35, 395,4);
      intersection6_1= new SubstreetPart( 330, 395,4);
      intersection6_2= new SubstreetPart( 600, 395,4);
      intersection6_3= new SubstreetPart(860, 395,4);
      EndOfStreet6= new SubstreetPart( 1050, 395,4);
  
      FirstOfStreet7= new SubstreetPart( 35, 461,4);
      intersection7_1= new SubstreetPart( 330, 461,4);
      intersection7_2= new SubstreetPart( 600, 461,4);
      intersection7_3= new SubstreetPart(860, 461,4);
      EndOfStreet7= new SubstreetPart( 1050, 461,4);

      FirstOfStreet8= new SubstreetPart( 35, 527,4);
      intersection8_1= new SubstreetPart( 330, 527,4);
      intersection8_2= new SubstreetPart( 600, 527,4);
      intersection8_3= new SubstreetPart(860, 527,4);
      EndOfStreet8= new SubstreetPart( 1050, 527,4);
  
      FirstOfStreet9= new SubstreetPart( 35, 594,4);
      intersection9_1= new SubstreetPart( 330, 594,4);
      intersection9_2= new SubstreetPart( 600, 594,4);
      intersection9_3= new SubstreetPart(860, 594,4);
      EndOfStreet9= new SubstreetPart( 1050, 594,4);

      FirstOfStreetC= new SubstreetPart( 860, 0,4);
      EndOfStreetC= new SubstreetPart( 860, 670,4);

      FirstOfStreetB= new SubstreetPart( 600, 0,4);
      EndOfStreetB= new SubstreetPart( 600, 670,4);

      FirstOfStreetA= new SubstreetPart( 330, 0,4);
      EndOfStreetA= new SubstreetPart( 330, 670,4);

      destinationBuilding127= new SubstreetPart(550,594,2);
      destinationBuilding103= new SubstreetPart(890,461,2);
      destinationBuilding70= new SubstreetPart(370,395,2);
      destinationBuilding64= new SubstreetPart(890,330,2);
      destinationBuilding44= new SubstreetPart(360,265,2);
      destinationBuilding11= new SubstreetPart(880,66,2);
      
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
      street7.addPart(destinationBuilding103);



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
      street9.addPart(destinationBuilding127);
     
      streetA.addPart(FirstOfStreetA);
      streetA.addPart(EndOfStreetA);
      
      streetB.addPart(FirstOfStreetB);
      streetB.addPart(EndOfStreetB);
      
      streetC.addPart(FirstOfStreetC);
      streetC.addPart(EndOfStreetC);

    




  




  
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

         building127 = new Building(127,destinationBuilding127);
         building103 = new Building(103,destinationBuilding103);
         building70 = new Building(70,destinationBuilding70);
         building64 = new Building(64,destinationBuilding64);
         building44 = new Building(44,destinationBuilding44);
         building11 = new Building(11,destinationBuilding11);


        customer1 = new Customer(1, building127);
        customer2 = new Customer(2, building103);
        customer3 = new Customer(3, building70);
        customer4 = new Customer(4, building64);
        customer5 = new Customer(5, building44);
        customer6 = new Customer(6, building11);

        driver = new DeliveryDriver();

        driver.addPackage(package1);
        driver.addPackage(package2);
        driver.addPackage(package3);
        driver.addPackage(package4);
        driver.addPackage(package5);
        driver.addPackage(package6);
 
  
      
    }

  public static List<Package> createPackages() {
      // Create packages and initialize them with relevant information
      List<Package> packages = new ArrayList<>();
      List<SubstreetPart> initialparts1 = Arrays.asList(MainProgram.EndOfStreetA,MainProgram.intersection9_1,MainProgram.destinationBuilding127);
      List<SubstreetPart> initialparts2 = Arrays.asList(MainProgram.destinationBuilding127,MainProgram.intersection9_2,MainProgram.intersection9_3,MainProgram.intersection8_3,MainProgram.intersection7_3,MainProgram.destinationBuilding103);
      package1 = new Offical_paper(customer1, 1, initialparts1);
      package2 = new Normal(customer2, 2, initialparts2);
      


      packages.add(package1);
      packages.add(package2);
      System.out.println("Path for Package 1: " + package1.getPath());
      System.out.println("Path for Package 2: " + package2.getPath());


      return packages;
    }

    public static List<List<SubstreetPart>> PackagesPaths () {
        List<List<SubstreetPart>> Packages = new ArrayList<>();
        Packages.add(package1.getPath());
        Packages.add(package2.getPath());

        return Packages;

    }
}
    


    
    
