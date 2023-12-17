import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javafx.scene.shape.Rectangle;

public class MainProgram {
    
    public static DeliveryDriver driver;


    public static void initializeObjects() {
        List<Customer> randomCustomers = generateRandomCustomers();
    
        generateRandomPackages(randomCustomers);   

        driver = new DeliveryDriver();
  
    }
    public static List<Intersection> destinationBuildings() {
      List<Intersection> destinations = new ArrayList<>();

        // Destination Buildings with names
        Intersection destinationBuilding123 = new Intersection(568, 594, "123");
        Intersection destinationBuilding120 = new Intersection(368, 594, "120");
        Intersection destinationBuilding103 = new Intersection(900, 461, "103");
        Intersection destinationBuilding70 = new Intersection(390, 395, "70");
        Intersection destinationBuilding44 = new Intersection(400, 265, "44");
        Intersection destinationBuilding13 = new Intersection(68, 130, "13");
        Intersection destinationBuilding32 = new Intersection(508, 130, "32");
        Intersection destinationBuilding7 = new Intersection(568, 66, "7");
        Intersection destinationBuilding52 = new Intersection(1028, 197, "52");
        Intersection destinationBuilding12 = new Intersection(1010, 66, "12");
        Intersection destinationBuilding101 = new Intersection(768, 461, "101");
        Intersection destinationBuilding79 = new Intersection(1028, 395, "79");
        Intersection destinationBuilding74 = new Intersection(708, 395, "74");
        Intersection destinationBuilding46 = new Intersection(638, 265, "46");
        Intersection destinationBuilding42 = new Intersection(183, 265, "42");
        Intersection destinationBuilding97 = new Intersection(478, 461, "97");
        Intersection destinationBuilding67 = new Intersection(143, 395, "67");
        Intersection destinationBuilding80 = new Intersection(68, 395, "80");
        Intersection destinationBuilding116 = new Intersection(818, 527, "116");
        Intersection destinationBuilding129 = new Intersection(1028, 594, "129");
        Intersection warehouse = new Intersection(330, 650, "Warehouse");

      
       destinations.addAll(Arrays.asList(warehouse,
       destinationBuilding120, destinationBuilding123,
       destinationBuilding103, destinationBuilding70,
       destinationBuilding44, destinationBuilding13,
       destinationBuilding32, destinationBuilding7,
       destinationBuilding52, destinationBuilding12,
       destinationBuilding101, destinationBuilding79,
       destinationBuilding74, destinationBuilding46,
       destinationBuilding42, destinationBuilding97,
       destinationBuilding67, destinationBuilding80,
       destinationBuilding116, destinationBuilding129
));

  
      return destinations;
  }
  public static Map<Intersection, List<Intersection>> createGraph() {
    Map<Intersection, List<Intersection>> graph = new HashMap<>();
    List<Intersection> destinations = destinationBuildings();
          List<List<Intersection>> intersections = crcintersections();

    // #Relation for Street 9
    List<Intersection> neighborsOfEndA = Arrays.asList(intersections.get(8).get(1));
    List<Intersection> neighborsOf9_1 = Arrays.asList(destinations.get(1), destinations.get(2), intersections.get(8).get(2), intersections.get(8).get(0), intersections.get(7).get(1));
    List<Intersection> neighborsOf9_2 = Arrays.asList(destinations.get(1),destinations.get(2),intersections.get(8).get(3), intersections.get(8).get(1), intersections.get(7).get(2));
    List<Intersection> neighborsOf9_3 = Arrays.asList( intersections.get(8).get(4), intersections.get(8).get(2), intersections.get(7).get(3),destinations.get(20));
    List<Intersection> neighborsOfFirst9 = Arrays.asList(intersections.get(8).get(1));
    List<Intersection> neighborsOfEnd9 = Arrays.asList(intersections.get(8).get(3),destinations.get(20));
    List<Intersection> neighborsOfBuild120 = Arrays.asList(intersections.get(8).get(2),intersections.get(8).get(1),destinations.get(2));
    List<Intersection> neighborsOfBuild123 = Arrays.asList(intersections.get(8).get(2),intersections.get(8).get(1),destinations.get(1));
    List<Intersection> neighborsOfBuild129 = Arrays.asList(intersections.get(8).get(2),intersections.get(8).get(4));

   
    // #Relation for Street 8

    List<Intersection> neighborsOf8_1 = Arrays.asList( intersections.get(7).get(2), intersections.get(7).get(0), intersections.get(6).get(1),intersections.get(8).get(1));
    List<Intersection> neighborsOf8_2 = Arrays.asList(intersections.get(7).get(4), intersections.get(7).get(1), intersections.get(6).get(2),destinations.get(19),intersections.get(8).get(2));
    List<Intersection> neighborsOf8_3 = Arrays.asList( intersections.get(7).get(4), intersections.get(7).get(2), intersections.get(6).get(3),destinations.get(19),intersections.get(8).get(3));
    List<Intersection> neighborsOfFirst8 = Arrays.asList(intersections.get(7).get(1));
    List<Intersection> neighborsOfEnd8 = Arrays.asList(intersections.get(7).get(3));
    List<Intersection> neighborsOfBuild116 = Arrays.asList(intersections.get(7).get(2),intersections.get(7).get(3));

    // // #Relation for Street 7

    List<Intersection> neighborsOf7_1 = Arrays.asList( intersections.get(6).get(2), intersections.get(6).get(0), intersections.get(5).get(1),destinations.get(16),intersections.get(7).get(1));
    List<Intersection> neighborsOf7_2 = Arrays.asList(intersections.get(6).get(3), intersections.get(6).get(1), intersections.get(5).get(2),destinations.get(16),destinations.get(11),intersections.get(7).get(2));
    List<Intersection> neighborsOf7_3 = Arrays.asList( intersections.get(6).get(4), intersections.get(6).get(4), intersections.get(5).get(3),destinations.get(11),destinations.get(3),intersections.get(7).get(3));
    List<Intersection> neighborsOfFirst7 = Arrays.asList(intersections.get(6).get(1));
    List<Intersection> neighborsOfEnd7 = Arrays.asList(intersections.get(6).get(3));
    List<Intersection> neighborsOfBuild97 = Arrays.asList(intersections.get(6).get(2),intersections.get(6).get(1));
    List<Intersection> neighborsOfBuild101 = Arrays.asList(intersections.get(6).get(2),intersections.get(6).get(3));
    List<Intersection> neighborsOfBuild103 = Arrays.asList(intersections.get(6).get(4),intersections.get(6).get(3));

    // // #Relation for Street 6

    List<Intersection> neighborsOf6_1 = Arrays.asList( intersections.get(5).get(2), intersections.get(5).get(0), intersections.get(4).get(1),destinations.get(18),intersections.get(6).get(1),destinations.get(17),destinations.get(4));
    List<Intersection> neighborsOf6_2 = Arrays.asList(destinations.get(13),destinations.get(4),intersections.get(5).get(3), intersections.get(5).get(1), intersections.get(4).get(2),intersections.get(6).get(2));
    List<Intersection> neighborsOf6_3 = Arrays.asList( destinations.get(12),destinations.get(13),intersections.get(5).get(4), intersections.get(5).get(2), intersections.get(4).get(3),intersections.get(6).get(3));
    List<Intersection> neighborsOfFirst6 = Arrays.asList(intersections.get(5).get(1),destinations.get(18));
    List<Intersection> neighborsOfEnd6 = Arrays.asList(intersections.get(5).get(3));
    List<Intersection> neighborsOfBuild80 = Arrays.asList(intersections.get(5).get(0),intersections.get(5).get(1),destinations.get(17));
    List<Intersection> neighborsOfBuild67 = Arrays.asList(intersections.get(5).get(0),intersections.get(5).get(1),destinations.get(18));
    List<Intersection> neighborsOfBuild70 = Arrays.asList(intersections.get(5).get(1),intersections.get(5).get(2));
    List<Intersection> neighborsOfBuild74 = Arrays.asList(intersections.get(5).get(2),intersections.get(5).get(3));
    List<Intersection> neighborsOfBuild79 = Arrays.asList(intersections.get(5).get(4),intersections.get(5).get(3));

    // // #Relation for Street 5
    List<Intersection> neighborsOf5_1 = Arrays.asList( intersections.get(4).get(2), intersections.get(4).get(0), intersections.get(3).get(1),intersections.get(5).get(1));
    List<Intersection> neighborsOf5_2 = Arrays.asList(intersections.get(4).get(1), intersections.get(4).get(1), intersections.get(3).get(2),intersections.get(5).get(2));
    List<Intersection> neighborsOf5_3 = Arrays.asList( intersections.get(4).get(4), intersections.get(4).get(2), intersections.get(5).get(3),intersections.get(3).get(3));
    List<Intersection> neighborsOfFirst5 = Arrays.asList(intersections.get(4).get(1));
    List<Intersection> neighborsOfEnd5 = Arrays.asList(intersections.get(4).get(3));
     
    // // #Relation for Street 4

    List<Intersection> neighborsOf4_1 = Arrays.asList( intersections.get(3).get(2), intersections.get(3).get(0), intersections.get(2).get(1),intersections.get(4).get(1),destinations.get(15),destinations.get(5));
    List<Intersection> neighborsOf4_2 = Arrays.asList(intersections.get(3).get(3), intersections.get(3).get(1), intersections.get(2).get(2),intersections.get(4).get(2),destinations.get(5),destinations.get(14));
    List<Intersection> neighborsOf4_3 = Arrays.asList( intersections.get(3).get(4), intersections.get(3).get(2), intersections.get(4).get(3),intersections.get(2).get(3),destinations.get(14));
    List<Intersection> neighborsOfFirst4 = Arrays.asList(intersections.get(3).get(1));
    List<Intersection> neighborsOfEnd4 = Arrays.asList(intersections.get(3).get(3));
    List<Intersection> neighborsOfBuild42 = Arrays.asList(intersections.get(3).get(1),intersections.get(3).get(0));
    List<Intersection> neighborsOfBuild44 = Arrays.asList(intersections.get(3).get(1),intersections.get(3).get(2));
    List<Intersection> neighborsOfBuild46 = Arrays.asList(intersections.get(3).get(2),intersections.get(3).get(3));

  // // #Relation for Street 3

    List<Intersection> neighborsOf3_1 = Arrays.asList( intersections.get(2).get(2), intersections.get(2).get(0), intersections.get(1).get(1),intersections.get(3).get(1),destinations.get(7));
    List<Intersection> neighborsOf3_2 = Arrays.asList(intersections.get(2).get(3), intersections.get(2).get(1), intersections.get(1).get(2),intersections.get(3).get(2),destinations.get(7));
    List<Intersection> neighborsOf3_3 = Arrays.asList( intersections.get(2).get(4), intersections.get(2).get(2), intersections.get(3).get(3),intersections.get(1).get(3),destinations.get(9));
    List<Intersection> neighborsOfFirst3 = Arrays.asList(intersections.get(2).get(1));
    List<Intersection> neighborsOfEnd3 = Arrays.asList(intersections.get(2).get(3));
    List<Intersection> neighborsOfBuild32 = Arrays.asList(intersections.get(2).get(1),intersections.get(2).get(2));
    List<Intersection> neighborsOfBuild52 = Arrays.asList(intersections.get(2).get(3),intersections.get(2).get(4));
    
  // // #Relation for Street 2

    List<Intersection> neighborsOf2_1 = Arrays.asList( intersections.get(1).get(2), intersections.get(1).get(0), intersections.get(0).get(1),intersections.get(2).get(1),destinations.get(6));
    List<Intersection> neighborsOf2_2 = Arrays.asList(intersections.get(1).get(3), intersections.get(1).get(1), intersections.get(0).get(2),intersections.get(2).get(2));
    List<Intersection> neighborsOf2_3 = Arrays.asList( intersections.get(1).get(4), intersections.get(1).get(2), intersections.get(2).get(3),intersections.get(0).get(3));
    List<Intersection> neighborsOfFirst2 = Arrays.asList(intersections.get(1).get(1));
    List<Intersection> neighborsOfEnd2 = Arrays.asList(intersections.get(1).get(3));
    List<Intersection> neighborsOfBuild13 = Arrays.asList(intersections.get(1).get(0),intersections.get(1).get(1));
 
    // // #Relation for Street 1
    
    List<Intersection> neighborsOf1_1 = Arrays.asList( intersections.get(0).get(2), intersections.get(0).get(0),intersections.get(1).get(1),destinations.get(8));
    List<Intersection> neighborsOf1_2 = Arrays.asList(intersections.get(0).get(3), intersections.get(0).get(1),intersections.get(1).get(2),destinations.get(8));
    List<Intersection> neighborsOf1_3 = Arrays.asList( intersections.get(0).get(4), intersections.get(0).get(2), intersections.get(1).get(3),destinations.get(10));
    List<Intersection> neighborsOfFirst1 = Arrays.asList(intersections.get(1).get(1));
    List<Intersection> neighborsOfEnd1 = Arrays.asList(intersections.get(1).get(3),destinations.get(10));
    List<Intersection> neighborsOfBuild7 = Arrays.asList(intersections.get(0).get(1),intersections.get(0).get(2));
    List<Intersection> neighborsOfBuild12 = Arrays.asList(intersections.get(0).get(3),intersections.get(0).get(4));


    graph.put(destinations.get(0), neighborsOfEndA);
    graph.put(intersections.get(8).get(1), neighborsOf9_1);
    graph.put(intersections.get(8).get(2), neighborsOf9_2);
    graph.put(intersections.get(8).get(3), neighborsOf9_3);
    graph.put(intersections.get(8).get(1), neighborsOfFirst9);
    graph.put(intersections.get(8).get(4), neighborsOfEnd9);
    graph.put(destinations.get(1), neighborsOfBuild120);
    graph.put(destinations.get(2), neighborsOfBuild123);
    graph.put(destinations.get(20), neighborsOfBuild129);
 

    graph.put(intersections.get(7).get(1), neighborsOf8_1);
    graph.put(intersections.get(7).get(2), neighborsOf8_2);
    graph.put(intersections.get(7).get(3), neighborsOf8_3);
    graph.put(intersections.get(7).get(0), neighborsOfFirst8);
    graph.put(intersections.get(7).get(4), neighborsOfEnd8);
    graph.put(destinations.get(19), neighborsOfBuild116);

    graph.put(intersections.get(6).get(1), neighborsOf7_1);
    graph.put(intersections.get(6).get(2), neighborsOf7_2);
    graph.put(intersections.get(6).get(3), neighborsOf7_3);
    graph.put(intersections.get(6).get(0), neighborsOfFirst7);
    graph.put(intersections.get(6).get(4), neighborsOfEnd7);
    graph.put(destinations.get(16), neighborsOfBuild97);
    graph.put(destinations.get(11), neighborsOfBuild101);
    graph.put(destinations.get(3), neighborsOfBuild103);

    graph.put(intersections.get(5).get(1), neighborsOf6_1);
    graph.put(intersections.get(5).get(2), neighborsOf6_2);
    graph.put(intersections.get(5).get(3), neighborsOf6_3);
    graph.put(intersections.get(5).get(0), neighborsOfFirst6);
    graph.put(intersections.get(5).get(4), neighborsOfEnd6);
    graph.put(destinations.get(18), neighborsOfBuild80);
    graph.put(destinations.get(17), neighborsOfBuild67);
    graph.put(destinations.get(4), neighborsOfBuild70);
    graph.put(destinations.get(13), neighborsOfBuild74);
    graph.put(destinations.get(12), neighborsOfBuild79);

    graph.put(intersections.get(4).get(1), neighborsOf5_1);
    graph.put(intersections.get(4).get(2), neighborsOf5_2);
    graph.put(intersections.get(4).get(3), neighborsOf5_3);
    graph.put(intersections.get(4).get(0), neighborsOfFirst5);
    graph.put(intersections.get(4).get(4), neighborsOfEnd5);

    graph.put(intersections.get(3).get(1), neighborsOf4_1);
    graph.put(intersections.get(3).get(2), neighborsOf4_2);
    graph.put(intersections.get(3).get(3), neighborsOf4_3);
    graph.put(intersections.get(3).get(0), neighborsOfFirst4);
    graph.put(intersections.get(3).get(4), neighborsOfEnd4);
    graph.put(destinations.get(15), neighborsOfBuild42);
    graph.put(destinations.get(5), neighborsOfBuild44);
    graph.put(destinations.get(14), neighborsOfBuild46);
    

    graph.put(intersections.get(2).get(1), neighborsOf3_1);
    graph.put(intersections.get(2).get(2), neighborsOf3_2);
    graph.put(intersections.get(2).get(3), neighborsOf3_3);
    graph.put(intersections.get(2).get(1), neighborsOfFirst3);
    graph.put(intersections.get(2).get(4), neighborsOfEnd3);
    graph.put(destinations.get(9), neighborsOfBuild52);
    graph.put(destinations.get(7), neighborsOfBuild32);
    
    graph.put(intersections.get(1).get(1), neighborsOf2_1);
    graph.put(intersections.get(1).get(2), neighborsOf2_2);
    graph.put(intersections.get(1).get(3), neighborsOf2_3);
    graph.put(intersections.get(1).get(1), neighborsOfFirst2);
    graph.put(intersections.get(1).get(4), neighborsOfEnd2);
    graph.put(destinations.get(6), neighborsOfBuild13);

    graph.put(intersections.get(0).get(1), neighborsOf1_1);
    graph.put(intersections.get(0).get(2), neighborsOf1_2);
    graph.put(intersections.get(0).get(3), neighborsOf1_3);
    graph.put(intersections.get(0).get(1), neighborsOfFirst1);
    graph.put(intersections.get(0).get(4), neighborsOfEnd1);
    graph.put(destinations.get(8), neighborsOfBuild7);
    graph.put(destinations.get(10), neighborsOfBuild12);
    
    

    return graph;
}
 
public static  List<List<Intersection>> crcintersections(){
      List<List<Intersection>> intersections = new ArrayList<>();

      List<Intersection> intersection_1 = new ArrayList<>();
      List<Intersection> intersection_2 = new ArrayList<>();
      List<Intersection> intersection_3 = new ArrayList<>();
      List<Intersection> intersection_4 = new ArrayList<>();
      List<Intersection> intersection_5 = new ArrayList<>();
      List<Intersection> intersection_6 = new ArrayList<>();
      List<Intersection> intersection_7 = new ArrayList<>();
      List<Intersection> intersection_8 = new ArrayList<>();
      List<Intersection> intersection_9 = new ArrayList<>();


        // Street 1
        Intersection FirstOfStreet1 = new Intersection(35, 66, "F1");
        Intersection intersection1_1 = new Intersection(330, 66, "A1");
        Intersection intersection1_2 = new Intersection(600, 66, "B1");
        Intersection intersection1_3 = new Intersection(860, 66, "C1");
        Intersection EndOfStreet1 = new Intersection(1050, 66, "E1");

       intersection_1 = Arrays.asList(FirstOfStreet1,intersection1_1,intersection1_2,intersection1_3,EndOfStreet1);

        // Street 2
        Intersection FirstOfStreet2 = new Intersection(35, 130, "F2");
        Intersection intersection2_1 = new Intersection(330, 130, "A2");
        Intersection intersection2_2 = new Intersection(600, 130, "B2");
        Intersection intersection2_3 = new Intersection(860, 130, "C2");
        Intersection EndOfStreet2 = new Intersection(1050, 130, "E2");

      intersection_2 = Arrays.asList(FirstOfStreet2,intersection2_1,intersection2_2,intersection2_3,EndOfStreet2);

        // Street 3
        Intersection FirstOfStreet3 = new Intersection(35, 197, "F3");
        Intersection intersection3_1 = new Intersection(330, 197, "A3");
        Intersection intersection3_2 = new Intersection(600, 197, "B3");
        Intersection intersection3_3 = new Intersection(860, 197, "C3");
        Intersection EndOfStreet3 = new Intersection(1050, 197, "E3");

      intersection_3 = Arrays.asList(FirstOfStreet3,intersection3_1,intersection3_2,intersection3_3,EndOfStreet3);

        // Street 4
        Intersection FirstOfStreet4 = new Intersection(35, 265, "F4");
        Intersection intersection4_1 = new Intersection(330, 265, "A4");
        Intersection intersection4_2 = new Intersection(600, 265, "B4");
        Intersection intersection4_3 = new Intersection(860, 265, "C4");
        Intersection EndOfStreet4 = new Intersection(1050, 265, "E4");

        intersection_4 = Arrays.asList(FirstOfStreet4,intersection4_1,intersection4_2,intersection4_3,EndOfStreet4);

        // Street 5
        Intersection FirstOfStreet5 = new Intersection(35, 330, "F5");
        Intersection intersection5_1 = new Intersection(330, 330, "A5");
        Intersection intersection5_2 = new Intersection(600, 330, "B5");
        Intersection intersection5_3 = new Intersection(860, 330, "C5");
        Intersection EndOfStreet5 = new Intersection(1050, 330, "E5");


      intersection_5 = Arrays.asList(FirstOfStreet5,intersection5_1,intersection5_2,intersection5_3,EndOfStreet5);

        // Street 6
        Intersection FirstOfStreet6 = new Intersection(35, 395, "F6");
        Intersection intersection6_1 = new Intersection(330, 395, "A6");
        Intersection intersection6_2 = new Intersection(600, 395, "B6");
        Intersection intersection6_3 = new Intersection(860, 395, "C6");
        Intersection EndOfStreet6 = new Intersection(1050, 395, "E6");
      intersection_6 = Arrays.asList(FirstOfStreet6,intersection6_1,intersection6_2,intersection6_3,EndOfStreet6);

        // Street 7
        Intersection FirstOfStreet7 = new Intersection(35, 461, "F7");
        Intersection intersection7_1 = new Intersection(330, 461, "A7");
        Intersection intersection7_2 = new Intersection(600, 461, "B7");
        Intersection intersection7_3 = new Intersection(860, 461, "C7");
        Intersection EndOfStreet7 = new Intersection(1050, 461, "E7");
      intersection_7 = Arrays.asList(FirstOfStreet7,intersection7_1,intersection7_2,intersection7_3,EndOfStreet7);

        // Street 8
        Intersection FirstOfStreet8 = new Intersection(35, 527, "F8");
        Intersection intersection8_1 = new Intersection(330, 527, "A8");
        Intersection intersection8_2 = new Intersection(600, 527, "B8");
        Intersection intersection8_3 = new Intersection(860, 527, "C8");
        Intersection EndOfStreet8 = new Intersection(1050, 527, "E8");

        intersection_8 = Arrays.asList(FirstOfStreet8,intersection8_1,intersection8_2,intersection8_3,EndOfStreet8);

        // Street 9
        Intersection FirstOfStreet9 = new Intersection(35, 594, "F9");
        Intersection intersection9_1 = new Intersection(330, 594, "A9");
        Intersection intersection9_2 = new Intersection(600, 594, "B9");
        Intersection intersection9_3 = new Intersection(860, 594, "C9");
        Intersection EndOfStreet9 = new Intersection(1050, 594, "E9");

      intersection_9 = Arrays.asList(FirstOfStreet9,intersection9_1,intersection9_2,intersection9_3,EndOfStreet9);


      intersections= Arrays.asList(intersection_1,intersection_2,intersection_3,intersection_4,intersection_5,intersection_6,intersection_7,intersection_8,intersection_9);
      
      return intersections;
    }

    public static List<List<Intersection>> PackagesPaths(List<Package> packages) {
      List<List<Intersection>> paths = new ArrayList<>();

      for (Package aPackage : packages) {
          paths.add(aPackage.getPath());
      }

      return paths;
  }
    public static List<Package> copyPackagesWithPaths(List<Package> originalPackages) {
       List<Package> copiedPackages = new ArrayList<>();
  
      for (int i = 0; i < originalPackages.size(); i++) {
          Package originalPackage = originalPackages.get(i);
  
          if (originalPackage instanceof Normal) {
              // If it's a Normal package, use the copy constructor with the new path
              Normal originalNormal = (Normal) originalPackage;
              Normal copiedNormal = new Normal(originalNormal);
              copiedPackages.add(copiedNormal);
  
          } else if (originalPackage instanceof Offical_paper) {
              Offical_paper originalOfficialPaper = (Offical_paper) originalPackage;
              Offical_paper copiedOfficialPaper = new Offical_paper(originalOfficialPaper);
              copiedPackages.add(copiedOfficialPaper);
              copiedOfficialPaper.contactCustomer();
  
          }
      }
  
      return copiedPackages;
  }
  

public static List<Building> Allbuildings() {
    List<Intersection> destination = destinationBuildings();
    List<Building> buildings = new ArrayList<>();
    MainGUISimulation.buildings(MainGUISimulation.AllGroups);

    for (int i = 1; i < destination.size(); i++) {
        
        // Get the building name from destination.get(12)
        String buildingName = destination.get(i).getName();

        // Convert buildingName to an integer
        int buildingIndex = Integer.parseInt(buildingName);

        // Get the MainGUISimulation.Building object using the buildingIndex
        Rectangle buildingInfo = MainGUISimulation.buildings.get(buildingIndex - 1);

        buildings.add(new Building(
                buildingIndex,
                destination.get(i),
                buildingInfo
        ));
    }
    return buildings;
}


public static List<Customer> generateRandomCustomers() {
        List<Customer> randomCustomersWithContact = new ArrayList<>();
        List<Building> allBuildings = Allbuildings();
    System.out.println(allBuildings);
        List<Building> assignedBuildings = new ArrayList<>();
        List<String> assignedPhoneNumbers = new ArrayList<>();
    
        Random random = new Random();
        int customerId = 1;
    
        // Generate 20 unique random customers
        while (randomCustomersWithContact.size() < 20) {
            int randomBuildingIndex = random.nextInt(allBuildings.size());
            Building randomBuilding = allBuildings.get(randomBuildingIndex);
    
            // Generate a random phone number
            String phoneNumber = generateRandomPhoneNumber();
    
            if (!assignedBuildings.contains(randomBuilding) && !assignedPhoneNumbers.contains(phoneNumber)) {
                CustomerWithContact customer = new CustomerWithContact(customerId, randomBuilding, phoneNumber);
                randomCustomersWithContact.add(customer);
                assignedBuildings.add(randomBuilding);
                assignedPhoneNumbers.add(phoneNumber);
                customerId++;
            }
        }
    
        return randomCustomersWithContact;
    }

private static String generateRandomPhoneNumber() {
        // Implement your logic to generate a random phone number
        // For example, you can concatenate random digits
        return "05" + (10000000 + new Random().nextInt(90000000));
    }

    public static List<Package> generateRandomPackages(List<Customer> randomCustomers) {
        List<Package> randomPackages = new ArrayList<>();
        Random random = new Random();
    
        for (Customer randomCustomer : randomCustomers) {
            int randomPackageType = random.nextInt(2); // 0 for Normal, 1 for Official Paper
            int delay;
    
            // Set constant delays based on package type
            if (randomPackageType == 0) {
                delay = 2; // Normal package delay
            } else {
                delay = 5; // Official Paper delay
            }
    
            int packageId = random.nextInt(20) + 1; // Random package ID between 1 and 20
    
            Package newPackage;
            if (randomPackageType == 0) {
                newPackage = new Normal(randomCustomer, packageId, delay);
            } else {
                newPackage = new Offical_paper(randomCustomer, packageId, delay);
            }
    
            randomCustomer.addAssignedPackage(newPackage); // Add the assigned package to the customer
            randomPackages.add(newPackage);
        }
    
        return randomPackages;
    }
 }

    


    
    
