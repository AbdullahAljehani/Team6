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
    
    public static Intersection  FirstOfStreet1;
    public static Intersection  EndOfStreet1;
    
    public static Intersection  FirstOfStreet2;
    public static Intersection  EndOfStreet2;
    
    public static Intersection  FirstOfStreet3;
    public static Intersection  EndOfStreet3;
    
    public static Intersection  FirstOfStreet4;
    public static Intersection  EndOfStreet4;
    
    public static Intersection  FirstOfStreet5;
    public static Intersection  EndOfStreet5;
    

   public static Intersection  FirstOfStreet6;
   public static Intersection  EndOfStreet6;
    
   public static Intersection  FirstOfStreet7;
   public static Intersection  EndOfStreet7;
    
   public static Intersection  FirstOfStreet8;
   public static Intersection  EndOfStreet8;
    
   public static Intersection  FirstOfStreet9;
   public static Intersection  EndOfStreet9;

   public static Intersection  FirstOfStreetA;
   public static Intersection  EndOfStreetA;

   public static Intersection  FirstOfStreetB;
   public static Intersection  EndOfStreetB;

   public static Intersection  FirstOfStreetC;
   public static Intersection  EndOfStreetC;

    public static Intersection  intersection1_1;
    public static Intersection  intersection1_2;
    public static Intersection  intersection1_3;
    
    public static Intersection  intersection2_1;
    public static Intersection  intersection2_2;
    public static Intersection  intersection2_3;

    public static Intersection  intersection3_1;
    public static Intersection  intersection3_2;
    public static Intersection  intersection3_3;

    public static Intersection  intersection4_1;
    public static Intersection  intersection4_2;
    public static Intersection  intersection4_3;

    public static Intersection  intersection5_1;
    public static Intersection  intersection5_2;
    public static Intersection  intersection5_3;

    public static Intersection  intersection6_1;
    public static Intersection  intersection6_2;
    public static Intersection  intersection6_3;

    public static Intersection  intersection7_1;
    public static Intersection  intersection7_2;
    public static Intersection  intersection7_3;

    public static Intersection  intersection8_1;
    public static Intersection  intersection8_2;
    public static Intersection  intersection8_3;

    public static Intersection  intersection9_1;
    public static Intersection  intersection9_2;
    public static Intersection  intersection9_3;
    
    public static Intersection  destinationBuilding127;
    public static Intersection  destinationBuilding103;
    public static Intersection  destinationBuilding70;
    public static Intersection  destinationBuilding44;

    public static Intersection  destinationBuilding13;
    public static Intersection  destinationBuilding32;
    public static Intersection  destinationBuilding7;
    public static Intersection  destinationBuilding52;
    public static Intersection  destinationBuilding12;
    public static Intersection  destinationBuilding101;
    public static Intersection  destinationBuilding79;
    public static Intersection  destinationBuilding74;
    public static Intersection  destinationBuilding46;
    public static Intersection  destinationBuilding42;

    public static Intersection  destinationBuilding97;
    public static Intersection  destinationBuilding67;
    public static Intersection  destinationBuilding80;
    public static Intersection  destinationBuilding116;
    public static Intersection  destinationBuilding124;
    public static Intersection  destinationBuilding133;




    private static Neighborhood neighborhood1;
    private static Neighborhood neighborhood2;
    private static Neighborhood neighborhood3;

    private static City city1;

    public static Building building127;
    public static Building building103;
    private static Building building70;
    private static Building building44;

    private static Building building13;
    private static Building building32;
    private static Building building7;
    private static Building building52;
    private static Building building12;
    private static Building building101;
    private static Building building79;
    private static Building building74;
    private static Building building46;
    private static Building building42;

    private static Building building97;
    private static Building building67;
    private static Building building80;
    private static Building building116;
    private static Building building124;
    private static Building building133;

    public static Customer customer1;
    public static Customer customer2;
    public static Customer customer3;
    private static Customer customer4;

    public static Customer customer5;
    private static Customer customer6;
    private static Customer customer7;
    private static Customer customer8;
    private static Customer customer9;
    private static Customer customer10;
    private static Customer customer11;
    private static Customer customer12;
    private static Customer customer13;
    private static Customer customer14;
    private static Customer customer15;
    private static Customer customer16;
    private static Customer customer17;
    private static Customer customer18;
    private static Customer customer19;
    private static Customer customer20;

    

        


    public static Offical_paper package1;
    public static Normal package2;
    public static Normal package3;
    public static Offical_paper package4;

    private static Normal package5;
    private static Offical_paper package6;
    private static Normal package7;
    private static Normal package8;
    private static Offical_paper package9;
    private static Normal package10;
    private static Offical_paper package11;
    private static Normal package12;
    private static Offical_paper package13;
    private static Normal package14;

    private static Normal package15;
    private static Offical_paper package16;
    private static Normal package17;
    private static Offical_paper package18;
    private static Normal package19;
    private static Offical_paper package20;

    public static DeliveryDriver driver;
    



  
    public static void main(String[] args) {
    initializeObjects();
    
    //packages=copyPackagesWithPaths(createPackages(), createPackagesPhase2());
    
    
    driver.setPackages(createpack()); 
    FirstPage.launch(FirstPage.class, args);
   
        
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
      
      FirstOfStreet1= new Intersection ( 35, 66);
      intersection1_1= new Intersection ( 330, 66);
      intersection1_2= new Intersection ( 600, 66);
      intersection1_3= new Intersection (860, 66);
      EndOfStreet1= new Intersection ( 1050, 66);
      FirstOfStreet2= new Intersection ( 35, 130);
      intersection2_1= new Intersection ( 330, 130);
      intersection2_2= new Intersection ( 600, 130);
      intersection2_3= new Intersection (860, 130);
      EndOfStreet2= new Intersection ( 1050, 130);

      FirstOfStreet3= new Intersection ( 35, 197);
      intersection3_1= new Intersection ( 330, 197);
      intersection3_2= new Intersection ( 600, 197);
      intersection3_3= new Intersection (860, 197);
      EndOfStreet3= new Intersection ( 1050, 197);

      FirstOfStreet4= new Intersection ( 35, 265);
      intersection4_1= new Intersection ( 330, 265);
      intersection4_2= new Intersection ( 600, 265);
      intersection4_3= new Intersection (860, 265);
      EndOfStreet4= new Intersection ( 1050, 265);

      FirstOfStreet5= new Intersection ( 35, 330);
      intersection5_1= new Intersection ( 330, 330);
      intersection5_2= new Intersection ( 600, 330);
      intersection5_3= new Intersection (860, 330);
      EndOfStreet5= new Intersection ( 1050, 330);

      FirstOfStreet6= new Intersection ( 35, 395);
      intersection6_1= new Intersection ( 330, 395);
      intersection6_2= new Intersection ( 600, 395);
      intersection6_3= new Intersection (860, 395);
      EndOfStreet6= new Intersection ( 1050, 395);
  
      FirstOfStreet7= new Intersection ( 35, 461);
      intersection7_1= new Intersection ( 330, 461);
      intersection7_2= new Intersection ( 600, 461);
      intersection7_3= new Intersection (860, 461);
      EndOfStreet7= new Intersection ( 1050, 461);

      FirstOfStreet8= new Intersection ( 35, 527);
      intersection8_1= new Intersection ( 330, 527);
      intersection8_2= new Intersection ( 600, 527);
      intersection8_3= new Intersection (860, 527);
      EndOfStreet8= new Intersection ( 1050, 527);
  
      FirstOfStreet9= new Intersection ( 35, 594);
      intersection9_1= new Intersection ( 330, 594);
      intersection9_2= new Intersection ( 600, 594);
      intersection9_3= new Intersection (860, 594);
      EndOfStreet9= new Intersection ( 1050, 594);

      FirstOfStreetC= new Intersection ( 860, 0);
      EndOfStreetC= new Intersection ( 860, 650);

      FirstOfStreetB= new Intersection ( 600, 0);
      EndOfStreetB= new Intersection ( 600, 650);

      FirstOfStreetA= new Intersection ( 330, 0);
      EndOfStreetA= new Intersection ( 330, 650);

      destinationBuilding127= new Intersection (568,594);
      destinationBuilding103= new Intersection (900,461);
      destinationBuilding70= new Intersection (390,395);
      destinationBuilding44= new Intersection (400,265);
      
      destinationBuilding13=new Intersection (68,130);
      destinationBuilding32=new Intersection (508,130);
      destinationBuilding7=new Intersection (568,66);
      destinationBuilding52=new Intersection (1028,197);
      destinationBuilding12=new Intersection (1010,66);
      destinationBuilding101=new Intersection (768,461);
      destinationBuilding79=new Intersection (1028,395);
      destinationBuilding74=new Intersection (708,395);
      destinationBuilding46=new Intersection (638,265);
      destinationBuilding42=new Intersection (183,265);

      destinationBuilding97=new Intersection (478,461);
      destinationBuilding67=new Intersection (143,395);
      destinationBuilding80=new Intersection (68,395);
      destinationBuilding116=new Intersection (818,527);
      destinationBuilding124=new Intersection (368,594);
      destinationBuilding133=new Intersection (1028,594);


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
      street4.addPart(destinationBuilding44);

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
      street6.addPart(destinationBuilding70);

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

         building127 = new Building(127,destinationBuilding127,MainGUISimulation.Building127);
         building103 = new Building(103,destinationBuilding103,MainGUISimulation.Building103);
         building70 = new Building(70,destinationBuilding70,MainGUISimulation.Building70);
         building44 = new Building(44,destinationBuilding44,MainGUISimulation.Building44);
        
         building13 = new Building(13,destinationBuilding13,MainGUISimulation.Building13);
        building32 = new Building(32,destinationBuilding32,MainGUISimulation.Building32);
        building7 = new Building(7,destinationBuilding7,MainGUISimulation.Building7);
        building52 = new Building(52,destinationBuilding52,MainGUISimulation.Building52);
        building12 = new Building(12,destinationBuilding12,MainGUISimulation.Building12);
        building101 = new Building(101,destinationBuilding101,MainGUISimulation.Building101);
        building79 = new Building(79,destinationBuilding79,MainGUISimulation.Building79);
        building74 = new Building(74,destinationBuilding74,MainGUISimulation.Building74);
        building46 = new Building(46,destinationBuilding46,MainGUISimulation.Building46);
        building42 = new Building(42,destinationBuilding42,MainGUISimulation.Building42);     

        building97 = new Building(97, destinationBuilding97,MainGUISimulation.Building97);
        building67 = new Building(97, destinationBuilding67,MainGUISimulation.Building67);
        building80 = new Building(97, destinationBuilding80,MainGUISimulation.Building80);
        building116 = new Building(97, destinationBuilding116,MainGUISimulation.Building116);
        building124 = new Building(97, destinationBuilding124,MainGUISimulation.Building124);
        building133 = new Building(97, destinationBuilding133,MainGUISimulation.Building133);


        customer1 = new Customer(1, building127);
        customer2 = new Customer(2, building103);
        customer3 = new Customer(3, building70);
        customer4 = new Customer(4, building44);

        customer5 = new Customer(5, building13);
        customer6 = new Customer(6, building32);
        customer7 = new Customer(7, building7);
        customer8 = new Customer(8, building52);
        customer9 = new Customer(9, building12);
        customer10 = new Customer(10, building101);
        customer11 = new Customer(11, building79);
        customer12 = new Customer(12, building74);
        customer13 = new Customer(13, building46);
        customer14 = new Customer(14, building42);

        customer15 =new Customer(15, building97);
        customer16 =new Customer(16, building67);
        customer17 =new Customer(17, building80);
        customer18 =new Customer(18, building116);
        customer19 =new Customer(19, building124);
        customer20 =new Customer(20, building133);


        driver = new DeliveryDriver();

       
  
      
    }

  public static List<Package> createPackages() {
      // Create packages and initialize them with relevant information
      List<Package> packages = new ArrayList<>();
      List<Intersection > initialparts1 = Arrays.asList(EndOfStreetA,intersection9_1,destinationBuilding127);
      List<Intersection > initialparts2 = Arrays.asList(destinationBuilding127,intersection9_2,intersection9_3,intersection8_3,intersection7_3,destinationBuilding103);
      List<Intersection > initialparts3 = Arrays.asList(destinationBuilding103,intersection7_3,intersection7_2,intersection7_1,intersection6_1,destinationBuilding70);
      List<Intersection > initialparts4 = Arrays.asList(destinationBuilding70,intersection6_1,intersection5_1,intersection4_1,destinationBuilding44);

      List<Intersection > initialparts5= Arrays.asList(destinationBuilding44,intersection4_1,intersection3_1,intersection2_1,destinationBuilding13);
      List<Intersection > initialparts6 = Arrays.asList(destinationBuilding13,intersection2_1,destinationBuilding32);
      List<Intersection > initialparts7 = Arrays.asList(destinationBuilding32,intersection2_2,intersection2_2 , intersection1_2,destinationBuilding7);
      List<Intersection > initialparts8 = Arrays.asList(destinationBuilding7,intersection1_2,intersection1_3 , intersection2_3,intersection3_3,destinationBuilding52);
      
      List<Intersection > initialparts9 = Arrays.asList(destinationBuilding52,intersection3_3,intersection2_3 , intersection1_3,destinationBuilding12);
      List<Intersection > initialparts10= Arrays.asList(destinationBuilding12,intersection1_3,intersection2_3 , intersection3_3,intersection4_3,intersection5_3,intersection6_3,intersection7_3,destinationBuilding101);
      List<Intersection > initialparts11= Arrays.asList(destinationBuilding101,intersection7_3,intersection6_3 , destinationBuilding79);
      List<Intersection > initialparts12= Arrays.asList(destinationBuilding79,intersection6_3,destinationBuilding74 );
      
      List<Intersection > initialparts13= Arrays.asList(destinationBuilding74,intersection6_2,intersection5_2 , intersection4_2,destinationBuilding46);
      List<Intersection > initialparts14= Arrays.asList(destinationBuilding46,intersection4_2,intersection4_1 , destinationBuilding42);
      List<Intersection > initialparts15= Arrays.asList(destinationBuilding42,intersection4_1,intersection5_1 , intersection6_1,intersection7_1,destinationBuilding97);
      List<Intersection > initialparts16= Arrays.asList(destinationBuilding97,intersection7_1,intersection6_1 , destinationBuilding67);
      
      List<Intersection > initialparts17= Arrays.asList(destinationBuilding67, destinationBuilding80);
      List<Intersection > initialparts18= Arrays.asList(destinationBuilding80,intersection6_1,intersection7_1,intersection8_1,intersection8_2 , destinationBuilding116);
      List<Intersection > initialparts19= Arrays.asList(destinationBuilding116,intersection8_3,intersection9_3 , intersection9_2,destinationBuilding124);
      List<Intersection > initialparts20= Arrays.asList(destinationBuilding124,intersection9_2,intersection9_3 , destinationBuilding133);


      package1 = new Offical_paper(customer1, 1, initialparts1,5);
      package2 = new Normal(customer2, 2, initialparts2,2);
      package3= new Normal(customer3, 3, initialparts3,2);
      package4 = new Offical_paper(customer4, 4, initialparts4,5);

      package5 = new Normal(customer5, 5, initialparts5,2);
      package6 = new Offical_paper(customer6, 6, initialparts6,5);
      package7 = new Normal(customer7, 7, initialparts7,2);
      package8 = new Normal(customer8, 8, initialparts8,2);
      package9 = new Offical_paper(customer9, 9, initialparts9,5);
      package10 = new Normal(customer10, 10, initialparts10,2);
      package11 = new Offical_paper(customer11, 11, initialparts11,5);
      package12 = new Normal(customer12, 12, initialparts12,2);
      package13 = new Offical_paper(customer13, 13, initialparts13,5);
      package14 = new Normal(customer14, 14, initialparts14,2);
      
      package15 = new Normal(customer15, 15, initialparts15,2);
      package16 = new Offical_paper(customer16, 16, initialparts16,5);
      package17 = new Normal(customer17, 17, initialparts17,2);
      package18 = new Offical_paper(customer18, 18, initialparts18,5);
      package19 = new Normal(customer19, 19, initialparts19,2);
      package20 = new Offical_paper(customer20, 20, initialparts20,5);



      packages.add(package1);
      packages.add(package2);
      packages.add(package3);
      packages.add(package4);

      packages.add(package5);
      packages.add(package6);
      packages.add(package7);
      packages.add(package8);
      packages.add(package9);
      packages.add(package10);
      packages.add(package11);
      packages.add(package12);
      packages.add(package13);
      packages.add(package14);
      
      packages.add(package15);
      packages.add(package16);
      packages.add(package17);
      packages.add(package18);
      packages.add(package19);
      packages.add(package20);



      return packages;
    }
    public static List<List<Intersection >>createPackagesPhase2() {
      List<Intersection > initialparts11 = Arrays.asList(EndOfStreetA,intersection9_1,destinationBuilding124);
      List<Intersection > initialparts21 = Arrays.asList(destinationBuilding124,destinationBuilding127);
      List<Intersection > initialparts31 = Arrays.asList(destinationBuilding127,intersection9_2,intersection8_2,intersection7_2,destinationBuilding97);
      List<Intersection > initialparts41 = Arrays.asList(destinationBuilding97,intersection7_2,destinationBuilding101);
      List<Intersection > initialparts51 = Arrays.asList(destinationBuilding101,intersection7_3,destinationBuilding103);
      List<Intersection > initialparts61 = Arrays.asList(destinationBuilding103,intersection7_3,intersection8_3,destinationBuilding116);
      List<Intersection > initialparts71 = Arrays.asList(destinationBuilding116,intersection8_3,intersection9_3,destinationBuilding133);

  List<Intersection > initialparts33 = Arrays.asList(destinationBuilding103,intersection7_3,intersection7_2,intersection7_1,intersection6_1,destinationBuilding70);
      List<Intersection > initialparts44 = Arrays.asList(destinationBuilding70,intersection6_1,intersection5_1,intersection4_1,destinationBuilding44);
 List<Intersection > initialparts66 = Arrays.asList(destinationBuilding13,intersection2_1,destinationBuilding32);
      List<Intersection > initialparts77 = Arrays.asList(destinationBuilding32,intersection2_2,intersection2_2 , intersection1_2,destinationBuilding7);
      List<Intersection > initialparts88 = Arrays.asList(destinationBuilding7,intersection1_2,intersection1_3 , intersection2_3,intersection3_3,destinationBuilding52);
      List<Intersection > initialparts99 = Arrays.asList(destinationBuilding52,intersection3_3,intersection2_3 , intersection1_3,destinationBuilding12);

 List<Intersection > initialparts111= Arrays.asList(destinationBuilding101,intersection7_3,intersection6_3 , destinationBuilding79);
      List<Intersection > initialparts122= Arrays.asList(destinationBuilding79,intersection6_3,destinationBuilding74 );
      
      List<Intersection > initialparts133= Arrays.asList(destinationBuilding74,intersection6_2,intersection5_2 , intersection4_2,destinationBuilding46);
      List<Intersection > initialparts144= Arrays.asList(destinationBuilding46,intersection4_2,intersection4_1 , destinationBuilding42);
      List<Intersection > initialparts166= Arrays.asList(destinationBuilding97,intersection7_1,intersection6_1 , destinationBuilding67);
      
      List<Intersection > initialparts177= Arrays.asList(destinationBuilding67, destinationBuilding80);
      List<Intersection > initialparts55= Arrays.asList(destinationBuilding44,intersection4_1,intersection3_1,intersection2_1,destinationBuilding13);
      List<List<Intersection>> newPaths = Arrays.asList(
    initialparts11, initialparts21, initialparts31, initialparts41,initialparts51,initialparts61,initialparts71,initialparts33,initialparts44,initialparts66,initialparts77,initialparts88,initialparts99,initialparts111,initialparts122,initialparts133,initialparts144,initialparts166,initialparts177,initialparts55);
      return newPaths;
    }
    public static List<List<Intersection>> PackagesPaths(List<Package> packages) {
      List<List<Intersection>> paths = new ArrayList<>();

      for (Package aPackage : packages) {
          paths.add(aPackage.getPath());
      }

      return paths;
  }
    public static List<Package> copyPackagesWithPaths(List<Package> originalPackages, List<List<Intersection>> newPaths) {
      List<Package> copiedPackages = new ArrayList<>();
  
      for (int i = 0; i < originalPackages.size(); i++) {
          Package originalPackage = originalPackages.get(i);
          List<Intersection> newPath = newPaths.get(i);
  
          if (originalPackage instanceof Normal) {
              // If it's a Normal package, use the copy constructor with the new path
              Normal originalNormal = (Normal) originalPackage;
              Normal copiedNormal = new Normal(originalNormal, newPath);
              copiedPackages.add(copiedNormal);
  
              // Print statements to check if the object is cloned correctly
              System.out.println("Original Normal Package: " + originalNormal);
              System.out.println("Copied Normal Package: " + copiedNormal);
  
              // Print the path and check if it's the same
              System.out.println("Original Path: " + originalNormal.getPath());
              System.out.println("Copied Path: " + copiedNormal.getPath());
          } else if (originalPackage instanceof Offical_paper) {
              // If it's an Offical_paper package, use the copy constructor with the new path
              Offical_paper originalOfficialPaper = (Offical_paper) originalPackage;
              Offical_paper copiedOfficialPaper = new Offical_paper(originalOfficialPaper, newPath);
              copiedPackages.add(copiedOfficialPaper);
  
              // Print statements to check if the object is cloned correctly
              System.out.println("Original Official Paper Package: " + originalOfficialPaper);
              System.out.println("Copied Official Paper Package: " + copiedOfficialPaper);
  
              // Print the path and check if it's the same
              System.out.println("Original Path: " + originalOfficialPaper.getPath());
              System.out.println("Copied Path: " + copiedOfficialPaper.getPath());
          }
      }
  
      return copiedPackages;
  }
  public static List<Package> createpack() {
    List<Package> packages;

    if (FirstPage.isPhase1Selected) {
        packages = createPackages();
    } else if (FirstPage.isPhase2Selected) {
        packages = copyPackagesWithPaths(createPackages(), createPackagesPhase2());
    } else {
        // Handle other cases or set default behavior
        packages = new ArrayList<>(); // Adjust as needed
    }

    // Set packages in the driver
    driver.setPackages(packages);

    return packages;
}
}

    


    
    
