import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainProgram {

    
    private static Intersection  FirstOfStreet1;
    private static Intersection  EndOfStreet1;
    
    private static Intersection  FirstOfStreet2;
    private static Intersection  EndOfStreet2;
    
    private static Intersection  FirstOfStreet3;
    private static Intersection  EndOfStreet3;
    
    private static Intersection  FirstOfStreet4;
    private static Intersection  EndOfStreet4;
    
    private static Intersection  FirstOfStreet5;
    private static Intersection  EndOfStreet5;
    
   private static Intersection  FirstOfStreet6;
   private static Intersection  EndOfStreet6;
    
   private static Intersection  FirstOfStreet7;
   private static Intersection  EndOfStreet7;
    
   private static Intersection  FirstOfStreet8;
   private static Intersection  EndOfStreet8;
    
   private static Intersection  FirstOfStreet9;
   private static Intersection  EndOfStreet9;

   private static Intersection  FirstOfStreetA;
   public static Intersection  EndOfStreetA;

   private static Intersection  FirstOfStreetB;
   private static Intersection  EndOfStreetB;

   private static Intersection  FirstOfStreetC;
   private static Intersection  EndOfStreetC;

    private static Intersection  intersection1_1;
    private static Intersection  intersection1_2;
    private static Intersection  intersection1_3;
    
    private static Intersection  intersection2_1;
    private static Intersection  intersection2_2;
    private static Intersection  intersection2_3;

    private static Intersection  intersection3_1;
    private static Intersection  intersection3_2;
    private static Intersection  intersection3_3;

    private static Intersection  intersection4_1;
    private static Intersection  intersection4_2;
    private static Intersection  intersection4_3;

    private static Intersection  intersection5_1;
    private static Intersection  intersection5_2;
    private static Intersection  intersection5_3;

    private static Intersection  intersection6_1;
    private static Intersection  intersection6_2;
    private static Intersection  intersection6_3;

    private static Intersection  intersection7_1;
    private static Intersection  intersection7_2;
    private static Intersection  intersection7_3;

    private static Intersection  intersection8_1;
    private static Intersection  intersection8_2;
    private static Intersection  intersection8_3;

    public static Intersection  intersection9_1;
    public static Intersection  intersection9_2;
    private static Intersection  intersection9_3;
    
 



    private static Building building127;
    private static Building building103;
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

    private static Customer customer1;
    private static Customer customer2;
    private static Customer customer3;
    private static Customer customer4;

    private static Customer customer5;
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
    
    private static CustomerWithContact cutomer1Withcontact;
    private static CustomerWithContact cutomer4Withcontact;
    private static CustomerWithContact cutomer6Withcontact;
    private static CustomerWithContact cutomer9Withcontact;
    private static CustomerWithContact cutomer11Withcontact;
    private static CustomerWithContact cutomer13Withcontact;
    private static CustomerWithContact cutomer16Withcontact;
    private static CustomerWithContact cutomer18Withcontact;
    private static CustomerWithContact cutomer20Withcontact;

    public static Package package1;
    public static Package package2;
    public static Package package3;
    public static Package package4;

    public static Package package5;
    public static Package package6;
    public static Package package7;
    public static Package package8;
    public static Package package9;
    public static Package package10;
    public static Package package11;
    public static Package package12;
    public static Package package13;
    public static Package package14;

    public static Package package15;
    public static Package package16;
    public static Package package17;
    public static Package package18;
    public static Package package19;
    public static Package package20;
    
    public static DeliveryDriver driver;

    
    public static void initializeObjects() {
    
   
        //  building127 = new Building(127,destinationBuilding127,MainGUISimulation.Building127);
        //  building103 = new Building(103,destinationBuilding103,MainGUISimulation.Building103);
        //  building70 = new Building(70,destinationBuilding70,MainGUISimulation.Building70);
        //  building44 = new Building(44,destinationBuilding44,MainGUISimulation.Building44);
        
        //  building13 = new Building(13,destinationBuilding13,MainGUISimulation.Building13);
        // building32 = new Building(32,destinationBuilding32,MainGUISimulation.Building32);
        // building7 = new Building(7,destinationBuilding7,MainGUISimulation.Building7);
        // building52 = new Building(52,destinationBuilding52,MainGUISimulation.Building52);
        // building12 = new Building(12,destinationBuilding12,MainGUISimulation.Building12);
        // building101 = new Building(101,destinationBuilding101,MainGUISimulation.Building101);
        // building79 = new Building(79,destinationBuilding79,MainGUISimulation.Building79);
        // building74 = new Building(74,destinationBuilding74,MainGUISimulation.Building74);
        // building46 = new Building(46,destinationBuilding46,MainGUISimulation.Building46);
        // building42 = new Building(42,destinationBuilding42,MainGUISimulation.Building42);     

        // building97 = new Building(97, destinationBuilding97,MainGUISimulation.Building97);
        // building67 = new Building(67, destinationBuilding67,MainGUISimulation.Building67);
        // building80 = new Building(80, destinationBuilding80,MainGUISimulation.Building80);
        // building116 = new Building(116, destinationBuilding116,MainGUISimulation.Building116);
        // building124 = new Building(124, destinationBuilding124,MainGUISimulation.Building124);
        // building133 = new Building(133, destinationBuilding133,MainGUISimulation.Building133);


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
        
        cutomer1Withcontact= new CustomerWithContact(1, building127, "0547284921");
        cutomer4Withcontact= new CustomerWithContact(4, building44, "0582344568");
        cutomer6Withcontact= new CustomerWithContact(6, building32, "0562230675");
        cutomer9Withcontact= new CustomerWithContact(9, building12, "0582249571");
        cutomer11Withcontact= new CustomerWithContact(11, building79, "0529345669");
        cutomer13Withcontact= new CustomerWithContact(13, building46, "0552395539");
        cutomer16Withcontact= new CustomerWithContact(16, building67, "0561148290");
        cutomer18Withcontact= new CustomerWithContact(18, building116, "0592307883");
        cutomer20Withcontact= new CustomerWithContact(20, building133, "0528405467");
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
      
        driver = new DeliveryDriver();
  
    }
    public static List<Intersection> destinationBuildings() {
      List<Intersection> destinations = new ArrayList<>();

        Intersection destinationBuilding127 = new Intersection(568, 594);
        Intersection destinationBuilding124 = new Intersection(368, 594);
         Intersection destinationBuilding103 = new Intersection(900, 461);
        Intersection destinationBuilding70 = new Intersection(390, 395);
       Intersection destinationBuilding44 = new Intersection(400, 265);
       Intersection destinationBuilding13 = new Intersection(68, 130);
       Intersection destinationBuilding32 = new Intersection(508, 130);
       Intersection destinationBuilding7 = new Intersection(568, 66);
       Intersection destinationBuilding52 = new Intersection(1028, 197);
      Intersection destinationBuilding12 = new Intersection(1010, 66);
       Intersection destinationBuilding101 = new Intersection(768, 461);
       Intersection destinationBuilding79 = new Intersection(1028, 395);
       Intersection destinationBuilding74 = new Intersection(708, 395);
      Intersection  destinationBuilding46 = new Intersection(638, 265);
       Intersection destinationBuilding42 = new Intersection(183, 265);
       Intersection destinationBuilding97 = new Intersection(478, 461);
       Intersection destinationBuilding67 = new Intersection(143, 395);
       Intersection destinationBuilding80 = new Intersection(68, 395);
       Intersection destinationBuilding116 = new Intersection(818, 527);
       Intersection destinationBuilding133 = new Intersection(1028, 594); 
       EndOfStreetA= new Intersection ( 330, 650);
       intersection9_2= new Intersection ( 600, 594);
       EndOfStreet9= new Intersection ( 1050, 594);

      destinations.addAll(Arrays.asList(EndOfStreetA
             ,destinationBuilding124, destinationBuilding127
      ));
  
      return destinations;
  }
  public static Map<Intersection, List<Intersection>> createGraph() {
    Map<Intersection, List<Intersection>> graph = new HashMap<>();
    List<Intersection> destinations = destinationBuildings();
    // #Relation for Street 9
    List<Intersection> neighborsOfEndA = Arrays.asList(intersection9_1);
    List<Intersection> neighborsOf9_1 = Arrays.asList(destinations.get(1), destinations.get(2), intersection9_2, FirstOfStreet9, intersection8_1);
    List<Intersection> neighborsOf9_2 = Arrays.asList(destinations.get(1),destinations.get(2),intersection9_3, intersection9_1, intersection8_2);
    List<Intersection> neighborsOf9_3 = Arrays.asList( EndOfStreet9, intersection9_2, intersection8_3);
    List<Intersection> neighborsOfFirst9 = Arrays.asList(intersection9_1);
    List<Intersection> neighborsOfEnd9 = Arrays.asList(intersection9_3);
    List<Intersection> neighborsOfBuild124 = Arrays.asList(intersection9_2,intersection9_1,destinations.get(2));
    List<Intersection> neighborsOfBuild127 = Arrays.asList(intersection9_2,intersection9_1,destinations.get(1));
   
    // #Relation for Street 8

    // List<Intersection> neighborsOf8_1 = Arrays.asList( intersection8_2, FirstOfStreet8, intersection7_1,intersection9_1);
    // List<Intersection> neighborsOf8_2 = Arrays.asList(intersection8_3, intersection8_1, intersection7_2,destinationBuilding116,intersection9_2);
    // List<Intersection> neighborsOf8_3 = Arrays.asList( EndOfStreet8, intersection8_2, intersection7_3,destinationBuilding116,intersection9_3);
    // List<Intersection> neighborsOfFirst8 = Arrays.asList(intersection8_1);
    // List<Intersection> neighborsOfEnd8 = Arrays.asList(intersection8_3);
    // List<Intersection> neighborsOfBuild116 = Arrays.asList(intersection8_2,intersection8_3);

    // // #Relation for Street 7

    // List<Intersection> neighborsOf7_1 = Arrays.asList( intersection7_2, FirstOfStreet7, intersection6_1,destinationBuilding97,intersection8_1);
    // List<Intersection> neighborsOf7_2 = Arrays.asList(intersection7_3, intersection7_1, intersection6_2,destinationBuilding97,destinationBuilding101,intersection8_2);
    // List<Intersection> neighborsOf7_3 = Arrays.asList( EndOfStreet7, intersection7_2, intersection6_3,destinationBuilding101,destinationBuilding103,intersection8_3);
    // List<Intersection> neighborsOfFirst7 = Arrays.asList(intersection7_1);
    // List<Intersection> neighborsOfEnd7 = Arrays.asList(intersection7_3);
    // List<Intersection> neighborsOfBuild97 = Arrays.asList(intersection7_2,intersection7_1);
    // List<Intersection> neighborsOfBuild101 = Arrays.asList(intersection7_2,intersection7_3);
    // List<Intersection> neighborsOfBuild103 = Arrays.asList(EndOfStreet7,intersection7_3);

    // // #Relation for Street 6

    // List<Intersection> neighborsOf6_1 = Arrays.asList( intersection6_2, FirstOfStreet6, intersection5_1,destinationBuilding80,intersection7_1,destinationBuilding67,destinationBuilding70);
    // List<Intersection> neighborsOf6_2 = Arrays.asList(destinationBuilding74,destinationBuilding70,intersection6_3, intersection6_1, intersection5_2,intersection7_2);
    // List<Intersection> neighborsOf6_3 = Arrays.asList( destinationBuilding79,destinationBuilding74,EndOfStreet6, intersection6_2, intersection5_3,intersection7_3);
    // List<Intersection> neighborsOfFirst6 = Arrays.asList(intersection6_1,destinationBuilding80);
    // List<Intersection> neighborsOfEnd6 = Arrays.asList(intersection6_3);
    // List<Intersection> neighborsOfBuild80 = Arrays.asList(FirstOfStreet6,intersection6_1,destinationBuilding67);
    // List<Intersection> neighborsOfBuild67 = Arrays.asList(FirstOfStreet6,intersection6_1,destinationBuilding80);
    // List<Intersection> neighborsOfBuild70 = Arrays.asList(intersection6_1,intersection6_2);
    // List<Intersection> neighborsOfBuild74 = Arrays.asList(intersection6_2,intersection6_3);
    // List<Intersection> neighborsOfBuild79 = Arrays.asList(EndOfStreet6,intersection6_3);

    // // #Relation for Street 5
    // List<Intersection> neighborsOf5_1 = Arrays.asList( intersection5_2, FirstOfStreet5, intersection4_1,intersection6_1);
    // List<Intersection> neighborsOf5_2 = Arrays.asList(intersection5_3, intersection5_1, intersection4_2,intersection6_2);
    // List<Intersection> neighborsOf5_3 = Arrays.asList( EndOfStreet5, intersection5_2, intersection6_3,intersection4_3);
    // List<Intersection> neighborsOfFirst5 = Arrays.asList(intersection5_1);
    // List<Intersection> neighborsOfEnd5 = Arrays.asList(intersection5_3);
     
    // // #Relation for Street 4

    // List<Intersection> neighborsOf4_1 = Arrays.asList( intersection4_2, FirstOfStreet4, intersection3_1,intersection5_1,destinationBuilding42,destinationBuilding44);
    // List<Intersection> neighborsOf4_2 = Arrays.asList(intersection4_3, intersection4_1, intersection3_2,intersection5_2,destinationBuilding44,destinationBuilding46);
    // List<Intersection> neighborsOf4_3 = Arrays.asList( EndOfStreet4, intersection4_2, intersection5_3,intersection3_3,destinationBuilding46,destinationBuilding52);
    // List<Intersection> neighborsOfFirst4 = Arrays.asList(intersection4_1);
    // List<Intersection> neighborsOfEnd4 = Arrays.asList(intersection4_3);
    // List<Intersection> neighborsOfBuild42 = Arrays.asList(intersection4_1,FirstOfStreet4);
    // List<Intersection> neighborsOfBuild44 = Arrays.asList(intersection4_1,intersection4_2);
    // List<Intersection> neighborsOfBuild46 = Arrays.asList(intersection4_2,intersection4_3);
    // List<Intersection> neighborsOfBuild52 = Arrays.asList(intersection4_3,EndOfStreet4);






    graph.put(EndOfStreetA, neighborsOfEndA);
    graph.put(intersection9_1, neighborsOf9_1);
    graph.put(intersection9_2, neighborsOf9_2);
    graph.put(intersection9_3, neighborsOf9_3);
    graph.put(FirstOfStreet9, neighborsOfFirst9);
    graph.put(EndOfStreet9, neighborsOfEnd9);
    graph.put(destinations.get(1), neighborsOfBuild124);
    graph.put(destinations.get(2), neighborsOfBuild127);

    // graph.put(intersection8_1, neighborsOf8_1);
    // graph.put(intersection8_2, neighborsOf8_2);
    // graph.put(intersection8_3, neighborsOf8_3);
    // graph.put(FirstOfStreet8, neighborsOfFirst8);
    // graph.put(EndOfStreet8, neighborsOfEnd8);
    // graph.put(destinationBuilding116, neighborsOfBuild116);

    // graph.put(intersection7_1, neighborsOf7_1);
    // graph.put(intersection7_2, neighborsOf7_2);
    // graph.put(intersection7_3, neighborsOf7_3);
    // graph.put(FirstOfStreet7, neighborsOfFirst7);
    // graph.put(EndOfStreet7, neighborsOfEnd7);
    // graph.put(destinationBuilding97, neighborsOfBuild97);
    // graph.put(destinationBuilding101, neighborsOfBuild101);
    // graph.put(destinationBuilding103, neighborsOfBuild103);

    // graph.put(intersection6_1, neighborsOf6_1);
    // graph.put(intersection6_2, neighborsOf6_2);
    // graph.put(intersection6_3, neighborsOf6_3);
    // graph.put(FirstOfStreet6, neighborsOfFirst6);
    // graph.put(EndOfStreet6, neighborsOfEnd6);
    // graph.put(destinationBuilding80, neighborsOfBuild80);
    // graph.put(destinationBuilding67, neighborsOfBuild67);
    // graph.put(destinationBuilding70, neighborsOfBuild70);
    // graph.put(destinationBuilding74, neighborsOfBuild74);
    // graph.put(destinationBuilding79, neighborsOfBuild79);

    // graph.put(intersection5_1, neighborsOf5_1);
    // graph.put(intersection5_2, neighborsOf5_2);
    // graph.put(intersection5_3, neighborsOf5_3);
    // graph.put(FirstOfStreet5, neighborsOfFirst5);
    // graph.put(EndOfStreet5, neighborsOfEnd5);

    // graph.put(intersection4_1, neighborsOf4_1);
    // graph.put(intersection4_2, neighborsOf4_2);
    // graph.put(intersection4_3, neighborsOf4_3);
    // graph.put(FirstOfStreet4, neighborsOfFirst4);
    // graph.put(EndOfStreet4, neighborsOfEnd4);
    // graph.put(destinationBuilding42, neighborsOfBuild42);
    // graph.put(destinationBuilding44, neighborsOfBuild44);
    // graph.put(destinationBuilding46, neighborsOfBuild46);
    // graph.put(destinationBuilding52, neighborsOfBuild52);
    
    

    return graph;
}
 
public static List<Intersection> crcintersections(){

  List<Intersection> intersections = new ArrayList<>();

      // FirstOfStreet1= new Intersection ( 35, 66);
      // intersection1_1= new Intersection ( 330, 66);
      // intersection1_2= new Intersection ( 600, 66);
      // intersection1_3= new Intersection (860, 66);
      // EndOfStreet1= new Intersection ( 1050, 66);
      // FirstOfStreet2= new Intersection ( 35, 130);
      // intersection2_1= new Intersection ( 330, 130);
      // intersection2_2= new Intersection ( 600, 130);
      // intersection2_3= new Intersection (860, 130);
      // EndOfStreet2= new Intersection ( 1050, 130);

      // FirstOfStreet3= new Intersection ( 35, 197);
      // intersection3_1= new Intersection ( 330, 197);
      // intersection3_2= new Intersection ( 600, 197);
      // intersection3_3= new Intersection (860, 197);
      // EndOfStreet3= new Intersection ( 1050, 197);

      // FirstOfStreet4= new Intersection ( 35, 265);
      // intersection4_1= new Intersection ( 330, 265);
      // intersection4_2= new Intersection ( 600, 265);
      // intersection4_3= new Intersection (860, 265);
      // EndOfStreet4= new Intersection ( 1050, 265);

      // FirstOfStreet5= new Intersection ( 35, 330);
      // intersection5_1= new Intersection ( 330, 330);
      // intersection5_2= new Intersection ( 600, 330);
      // intersection5_3= new Intersection (860, 330);
      // EndOfStreet5= new Intersection ( 1050, 330);

      // FirstOfStreet6= new Intersection ( 35, 395);
      // intersection6_1= new Intersection ( 330, 395);
      // intersection6_2= new Intersection ( 600, 395);
      // intersection6_3= new Intersection (860, 395);
      // EndOfStreet6= new Intersection ( 1050, 395);
  
      // FirstOfStreet7= new Intersection ( 35, 461);
      // intersection7_1= new Intersection ( 330, 461);
      // intersection7_2= new Intersection ( 600, 461);
      // intersection7_3= new Intersection (860, 461);
      // EndOfStreet7= new Intersection ( 1050, 461);

      // FirstOfStreet8= new Intersection ( 35, 527);
      // intersection8_1= new Intersection ( 330, 527);
      // intersection8_2= new Intersection ( 600, 527);
      // intersection8_3= new Intersection (860, 527);
      // EndOfStreet8= new Intersection ( 1050, 527);
  
       FirstOfStreet9= new Intersection ( 35, 594);
      intersection9_1= new Intersection ( 330, 594);
      // intersection9_3= new Intersection (860, 594);
      // EndOfStreet9= new Intersection ( 1050, 594);

      // FirstOfStreetC= new Intersection ( 860, 0);
      // EndOfStreetC= new Intersection ( 860, 650);

      // FirstOfStreetB= new Intersection ( 600, 0);
      // EndOfStreetB= new Intersection ( 600, 650);

      FirstOfStreetA= new Intersection ( 330, 0);
      EndOfStreetA= new Intersection ( 330, 650);
      intersections= Arrays.asList(EndOfStreetA,FirstOfStreet1,intersection1_1,intersection1_2,intersection1_3,intersection2_1,intersection2_2,intersection2_3,intersection3_1,intersection3_2,intersection3_3,intersection4_1,intersection4_2,intersection4_3,intersection5_1,intersection5_2,intersection5_3,FirstOfStreet6,intersection6_1,intersection6_2,intersection6_3,EndOfStreet6,FirstOfStreet7,intersection7_1,intersection7_2,intersection7_3,EndOfStreet7,FirstOfStreet8,intersection8_1,intersection8_2,intersection8_3,EndOfStreet8,FirstOfStreet9,intersection9_1,intersection9_3,EndOfStreet9,FirstOfStreetC,EndOfStreetC,FirstOfStreetB,EndOfStreetB,FirstOfStreetA);
      return intersections;
    }
//   public static List<Package> createPackages() {
      
//       List<Package> packages = new ArrayList<>();
//       List<Intersection > path1P1 = Arrays.asList(EndOfStreetA,intersection9_1,destinationBuilding127);
//       List<Intersection > path2P1 = Arrays.asList(destinationBuilding127,intersection9_2,intersection9_3,intersection8_3,intersection7_3,destinationBuilding103);
//       List<Intersection > path3P1 = Arrays.asList(destinationBuilding103,intersection7_3,intersection7_2,intersection7_1,intersection6_1,destinationBuilding70);
//       List<Intersection > path4P1 = Arrays.asList(destinationBuilding70,intersection6_1,intersection5_1,intersection4_1,destinationBuilding44);

//       List<Intersection > path5P1= Arrays.asList(destinationBuilding44,intersection4_1,intersection3_1,intersection2_1,destinationBuilding13);
//       List<Intersection > path6P1 = Arrays.asList(destinationBuilding13,intersection2_1,destinationBuilding32);
//       List<Intersection > path7P1 = Arrays.asList(destinationBuilding32,intersection2_2,intersection2_2 , intersection1_2,destinationBuilding7);
//       List<Intersection > path8P1 = Arrays.asList(destinationBuilding7,intersection1_2,intersection1_3 , intersection2_3,intersection3_3,destinationBuilding52);
      
//       List<Intersection > path9P1 = Arrays.asList(destinationBuilding52,intersection3_3,intersection2_3 , intersection1_3,destinationBuilding12);
//       List<Intersection > path10P1= Arrays.asList(destinationBuilding12,intersection1_3,intersection2_3 , intersection3_3,intersection4_3,intersection5_3,intersection6_3,intersection7_3,destinationBuilding101);
//       List<Intersection > path11P1= Arrays.asList(destinationBuilding101,intersection7_3,intersection6_3 , destinationBuilding79);
//       List<Intersection > path12P1= Arrays.asList(destinationBuilding79,intersection6_3,destinationBuilding74 );
      
//       List<Intersection > path13P1= Arrays.asList(destinationBuilding74,intersection6_2,intersection5_2 , intersection4_2,destinationBuilding46);
//       List<Intersection > path14P1= Arrays.asList(destinationBuilding46,intersection4_2,intersection4_1 , destinationBuilding42);
//       List<Intersection > path15P1= Arrays.asList(destinationBuilding42,intersection4_1,intersection5_1 , intersection6_1,intersection7_1,destinationBuilding97);
//       List<Intersection > path16P1= Arrays.asList(destinationBuilding97,intersection7_1,intersection6_1 , destinationBuilding67);
      
//       List<Intersection > path17P1= Arrays.asList(destinationBuilding67, destinationBuilding80);
//       List<Intersection > path18P1= Arrays.asList(destinationBuilding80,intersection6_1,intersection7_1,intersection8_1,intersection8_2 , destinationBuilding116);
//       List<Intersection > path19P1= Arrays.asList(destinationBuilding116,intersection8_3,intersection9_3 , intersection9_2,destinationBuilding124);
//       List<Intersection > path20P1= Arrays.asList(destinationBuilding124,intersection9_2,intersection9_3 , destinationBuilding133);
      
//       package2 = new Normal(customer2, 2, path2P1,2);
//       package3= new Normal(customer3, 3, path3P1,2);
//       package5 = new Normal(customer5, 5, path5P1,2);
//       package7 = new Normal(customer7, 7, path7P1,2);
//       package7 = new Normal(customer7, 7, path7P1,2);
//       package8 = new Normal(customer8, 8, path8P1,2);
//       package10 = new Normal(customer10, 10, path10P1,2);
//       package12 = new Normal(customer12, 12, path12P1,2);
//       package14 = new Normal(customer14, 14, path14P1,2);
//       package15 = new Normal(customer15, 15, path15P1,2);
//       package17 = new Normal(customer17, 17, path17P1,2);
//       package19 = new Normal(customer19, 19, path19P1,2);

//       if(FirstPage.isPhase1Selected){
      
//       package1 = new Offical_paper(customer1, 1, path1P1,5);
//       package4 = new Offical_paper(customer4, 4, path4P1,5);
//       package6 = new Offical_paper(customer6, 6, path6P1,5);
//       package9 = new Offical_paper(customer9, 9, path9P1,5);
//       package11 = new Offical_paper(customer11, 11, path11P1,5);
//       package13 = new Offical_paper(customer13, 13, path13P1,5);
//       package16 = new Offical_paper(customer16, 16, path16P1,5);
//       package18 = new Offical_paper(customer18, 18, path18P1,5);
//       package20 = new Offical_paper(customer20, 20, path20P1,5);
      
// }
//      else if(FirstPage.isPhase2Selected){
//       package1 = new Offical_paper(cutomer1Withcontact, 1, path1P1,5);
//       package4 = new Offical_paper(cutomer4Withcontact, 4, path4P1,5);
//       package6 = new Offical_paper(cutomer6Withcontact, 6, path6P1,5);
//       package9 = new Offical_paper(cutomer9Withcontact, 9, path9P1,5);
//       package11 = new Offical_paper(cutomer11Withcontact, 11, path11P1,5);
//       package13 = new Offical_paper(cutomer13Withcontact, 13, path13P1,5);
//       package16 = new Offical_paper(cutomer16Withcontact, 16, path16P1,5);
//       package18 = new Offical_paper(cutomer18Withcontact, 18, path18P1,5);
//       package20 = new Offical_paper(cutomer20Withcontact, 20, path20P1,5);
// }
//       packages.add(package1);
//       packages.add(package2);
//       packages.add(package3);
//       packages.add(package4);

//       packages.add(package5);
//       packages.add(package6);
//       packages.add(package7);
//       packages.add(package8);
//       packages.add(package9);
//       packages.add(package10);
//       packages.add(package11);
//       packages.add(package12);
//       packages.add(package13);
//       packages.add(package14);
      
//       packages.add(package15);
//       packages.add(package16);
//       packages.add(package17);
//       packages.add(package18);
//       packages.add(package19);
//       packages.add(package20);



//       return packages;
//     }
//     public static List<List<Intersection >>createPathPhase2() {
//       List<Intersection > path1P2 = Arrays.asList(EndOfStreetA,intersection9_1,destinationBuilding124);
//       List<Intersection > path2P2 = Arrays.asList(destinationBuilding124,destinationBuilding127);
//       List<Intersection > path3P2 = Arrays.asList(destinationBuilding127,intersection9_2,intersection8_2,intersection7_2,destinationBuilding97);
//       List<Intersection > path4P2 = Arrays.asList(destinationBuilding97,intersection7_2,destinationBuilding101);
//       List<Intersection > path5P2 = Arrays.asList(destinationBuilding101,intersection7_3,destinationBuilding103);
//       List<Intersection > path6P2= Arrays.asList(destinationBuilding103,intersection7_3,intersection8_3,destinationBuilding116);
//       List<Intersection > path7P2= Arrays.asList(destinationBuilding116,intersection8_3,intersection9_3,destinationBuilding133);

//     List<Intersection > path8P2 = Arrays.asList(destinationBuilding133,intersection9_3,intersection8_3,intersection7_3,intersection6_3,destinationBuilding79);
//       List<Intersection > path9P2 = Arrays.asList(destinationBuilding79,intersection6_3,destinationBuilding74);
//     List<Intersection > path10P2 = Arrays.asList(destinationBuilding74,intersection6_2,destinationBuilding70);
//       List<Intersection > path11P2 = Arrays.asList(destinationBuilding70,intersection6_1 ,destinationBuilding67 );
//       List<Intersection > path12P2 = Arrays.asList(destinationBuilding67, destinationBuilding80);

//       List<Intersection > path13P2 = Arrays.asList(destinationBuilding80,intersection6_1,intersection5_1 , intersection4_1,destinationBuilding44);
//     List<Intersection > path14P2= Arrays.asList(destinationBuilding44,intersection4_1, destinationBuilding42);
//       List<Intersection > path15P2= Arrays.asList(destinationBuilding42,intersection4_1,intersection3_1,intersection2_1,destinationBuilding32 );
//       List<Intersection > path16P2= Arrays.asList(destinationBuilding32,intersection2_2,intersection3_2,intersection4_2,destinationBuilding46);
//       List<Intersection > path17P2= Arrays.asList(destinationBuilding46,intersection4_3,intersection3_3, destinationBuilding52);
//       List<Intersection > path18P2= Arrays.asList(destinationBuilding52,intersection3_3, intersection2_3,intersection1_3,destinationBuilding12);
//       List<Intersection > path19P2= Arrays.asList(destinationBuilding12, intersection1_3 ,intersection1_2,destinationBuilding7);
//       List<Intersection > path20P2= Arrays.asList(destinationBuilding7,intersection1_1,intersection2_1,destinationBuilding13);

//       List<List<Intersection>> newPaths = Arrays.asList(path1P2, path2P2, path3P2, path4P2, path5P2, path6P2, path7P2, path8P2,path9P2, path10P2, path11P2, path12P2, path13P2, path14P2, path15P2,path16P2, path17P2, path18P2, path19P2, path20P2);
// return newPaths;
// }
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
  
          } else if (originalPackage instanceof Offical_paper) {
              Offical_paper originalOfficialPaper = (Offical_paper) originalPackage;
              Offical_paper copiedOfficialPaper = new Offical_paper(originalOfficialPaper, newPath);
              copiedPackages.add(copiedOfficialPaper);
              copiedOfficialPaper.contactCustomer();
  
          }
      }
  
      return copiedPackages;
  }
//   public static List<Package> initializePackages() {
//     List<Package> packages;

//     if (FirstPage.isPhase1Selected) {
//         packages = createPackages();
//     } else if (FirstPage.isPhase2Selected) {
//         packages = copyPackagesWithPaths(createPackages(), createPathPhase2());
//     } else {
    
//         packages = new ArrayList<>();
//     }

    
//     driver.setPackages(packages);

//     return packages;
// }

 }

    


    
    
