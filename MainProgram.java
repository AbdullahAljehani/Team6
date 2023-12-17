import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import javafx.scene.shape.Rectangle;

public class MainProgram {
    
    public static DeliveryDriver driver;
    public static List<Customer> customers= generateRandomCustomers();
    public static List<Package>  packages =  generateRandomPackages(customers);

    public static void initializeObjects() {
    
      driver = new DeliveryDriver();
     customers= generateRandomCustomers();
       generateRandomPackages(customers); 
      destinationBuildings();
      createGraph();
      crcintersections();
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
    List<List<Intersection>> intersections = crcintersections();

    // Connect adjacent intersections within each street
    for (int j = 0; j < intersections.size(); j++) {
        List<Intersection> street = intersections.get(j);
        List<Intersection> prevStreet = (j > 0) ? intersections.get(j - 1) : null;

        for (int i = 0; i < street.size(); i++) {
            Intersection currentIntersection = street.get(i);
            List<Intersection> neighbors = new ArrayList<>();

            // Connect with the previous intersection of the same street if it exists
            if (prevStreet != null && i < prevStreet.size()) {
                Intersection prevStreetIntersection = prevStreet.get(i);
                neighbors.add(prevStreetIntersection);
                System.out.println("Connecting " + currentIntersection.getName() + " with " + prevStreetIntersection.getName());
                
                // Connect bidirectionally
                graph.computeIfAbsent(prevStreetIntersection, k -> new ArrayList<>()).add(currentIntersection);
                System.out.println("Connecting " + prevStreetIntersection.getName() + " with " + currentIntersection.getName());
            }

            // Connect with the next intersection of the same street if it exists
            if (i < street.size() - 1) {
                Intersection nextIntersection = street.get(i + 1);
                neighbors.add(nextIntersection);
                System.out.println("Connecting " + currentIntersection.getName() + " with " + nextIntersection.getName());
                
                // Connect bidirectionally
                graph.computeIfAbsent(nextIntersection, k -> new ArrayList<>()).add(currentIntersection);
                System.out.println("Connecting " + nextIntersection.getName() + " with " + currentIntersection.getName());
            }

            // Add connections for the current intersection without duplicates
            graph.put(currentIntersection, neighbors.stream().distinct().collect(Collectors.toList()));
        }
    }

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

    Intersection intersection1_1 = new Intersection(330, 66, "A1");
    Intersection intersection1_2 = new Intersection(600, 66, "B1");
    Intersection intersection1_3 = new Intersection(860, 66, "C1");

   intersection_1 = Arrays.asList(intersection1_1,intersection1_2,intersection1_3);
  

    // Street 2
    Intersection intersection2_1 = new Intersection(330, 130, "A2");
    Intersection intersection2_2 = new Intersection(600, 130, "B2");
    Intersection intersection2_3 = new Intersection(860, 130, "C2");

  intersection_2 = Arrays.asList(intersection2_1,intersection2_2,intersection2_3);

    // Street 3
    Intersection intersection3_1 = new Intersection(330, 197, "A3");
    Intersection intersection3_2 = new Intersection(600, 197, "B3");
    Intersection intersection3_3 = new Intersection(860, 197, "C3");

  intersection_3 = Arrays.asList(intersection3_1,intersection3_2,intersection3_3);

    // Street 4
    Intersection intersection4_1 = new Intersection(330, 265, "A4");
    Intersection intersection4_2 = new Intersection(600, 265, "B4");
    Intersection intersection4_3 = new Intersection(860, 265, "C4");

    intersection_4 = Arrays.asList(intersection4_1,intersection4_2,intersection4_3);

    // Street 5
    Intersection intersection5_1 = new Intersection(330, 330, "A5");
    Intersection intersection5_2 = new Intersection(600, 330, "B5");
    Intersection intersection5_3 = new Intersection(860, 330, "C5");


  intersection_5 = Arrays.asList(intersection5_1,intersection5_2,intersection5_3);

    // Street 6
    Intersection intersection6_1 = new Intersection(330, 395, "A6");
    Intersection intersection6_2 = new Intersection(600, 395, "B6");
    Intersection intersection6_3 = new Intersection(860, 395, "C6");
  intersection_6 = Arrays.asList(intersection6_1,intersection6_2,intersection6_3);

    // Street 7
    Intersection intersection7_1 = new Intersection(330, 461, "A7");
    Intersection intersection7_2 = new Intersection(600, 461, "B7");
    Intersection intersection7_3 = new Intersection(860, 461, "C7");
  intersection_7 = Arrays.asList(intersection7_1,intersection7_2,intersection7_3);

    // Street 8
    Intersection intersection8_1 = new Intersection(330, 527, "A8");
    Intersection intersection8_2 = new Intersection(600, 527, "B8");
    Intersection intersection8_3 = new Intersection(860, 527, "C8");

    intersection_8 = Arrays.asList(intersection8_1,intersection8_2,intersection8_3);

    // Street 9
    Intersection intersection9_1 = new Intersection(330, 594, "A9");
    Intersection intersection9_2 = new Intersection(600, 594, "B9");
    Intersection intersection9_3 = new Intersection(860, 594, "C9");

  intersection_9 = Arrays.asList(intersection9_1,intersection9_2,intersection9_3);


  intersections= Arrays.asList(intersection_1,intersection_2,intersection_3,intersection_4,intersection_5,intersection_6,intersection_7,intersection_8,intersection_9);
  
  return intersections;
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

        } // copyPackagesWithPaths method
        else if (originalPackage instanceof Offical_paper) {
            Offical_paper originalOfficialPaper = (Offical_paper) originalPackage;
            Offical_paper copiedOfficialPaper = new Offical_paper(originalOfficialPaper);
            // Set the new delay directly
            copiedPackages.add(copiedOfficialPaper);
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
  List<Customer> randomCustomers = new ArrayList<>();
  List<Building> allBuildings = Allbuildings();

  // Keep track of assigned buildings
  List<Building> assignedBuildings = new ArrayList<>();

  Random random = new Random();
  int customerId = 1;

  // Generate 20 unique random customers
  while (randomCustomers.size() < 20) {
      int randomBuildingIndex = random.nextInt(allBuildings.size());
      Building randomBuilding = allBuildings.get(randomBuildingIndex);

      // Check if the building is not already assigned
      if (!assignedBuildings.contains(randomBuilding)) {
          Customer customer = new Customer(customerId, randomBuilding);
          randomCustomers.add(customer);
          assignedBuildings.add(randomBuilding);
          customerId++;
      }
  }

  return randomCustomers;
}



    public static List<Package>  generateRandomPackages(List<Customer> customers) {
      List<Package> randomPackages = new ArrayList<>();
      Random random = new Random();
  
      for (Customer customer : customers) {
          int packageType = random.nextInt(2); // 0 for Normal, 1 for Official Paper
          int delay = (packageType == 0) ? 2 : 5; // 2 for Normal, 5 for Official Paper
  
          int packageId;
          do {
              packageId = random.nextInt(20) + 1; // Random package ID from 1 to 20
          } while (isPackageIdUsed(randomPackages, packageId));
  
          Package newPackage = (packageType == 0)
                  ? new Normal(customer, packageId, delay)
                  : new Offical_paper(customer, packageId, delay);
  
          customer.addAssignedPackage(newPackage);
          randomPackages.add(newPackage);
      }

      return randomPackages;
  }
  
  private static boolean isPackageIdUsed(List<Package> packages, int packageId) {
      for (Package p : packages) {
          if (p.getPackageId() == packageId) {
              return true;
          }
      }
      return false;
  }
  
}

    


    
    
