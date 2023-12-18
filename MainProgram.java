import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javafx.scene.shape.Rectangle;

public class MainProgram {
    
    public static DeliveryDriver driver;
    public static List<Customer> customers;
    public static List<Package>  packages  ;
    public static List<Intersection> destetionBuilding;
    public static List<List<Intersection>> intersections;
    public static Map<Intersection, List<Intersection>> graph;

    public static void initializeObjects() {

      driver = new DeliveryDriver();
      destetionBuilding = destinationBuildings()  ;
      intersections = createIntersectionsLayout();
      customers= generateRandomCustomers();
      packages=generateRandomPackages(customers); 
      graph = createGraph();
      
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
        Intersection destinationBuilding2 = new Intersection(180, 66, "2"); //
        Intersection destinationBuilding10 = new Intersection(480, 130, "10");//
        Intersection destinationBuilding18 = new Intersection(900, 461, "18");//
        Intersection destinationBuilding21 = new Intersection(700, 130, "21");//
        Intersection destinationBuilding26 = new Intersection(1040, 130, "26");//
        Intersection destinationBuilding28 = new Intersection(180, 197, "28");//
        Intersection destinationBuilding35 = new Intersection(728, 197, "35");//
        Intersection destinationBuilding39 = new Intersection(990, 197, "39");//
        Intersection destinationBuilding56 = new Intersection(290, 330, "56");//
        Intersection destinationBuilding58 = new Intersection(480, 330, "58");//
        Intersection destinationBuilding63 = new Intersection(830, 330, "63");//
        Intersection destinationBuilding65 = new Intersection(1000, 330, "65");//
        Intersection destinationBuilding83 = new Intersection(370, 461, "83");//
        Intersection destinationBuilding88 = new Intersection(790, 461, "88");//
        Intersection destinationBuilding90 = new Intersection(970, 461, "90");//
        Intersection destinationBuilding92 = new Intersection(68, 527, "92");//
        Intersection destinationBuilding106 = new Intersection(68, 594, "106");//
        Intersection destinationBuilding110 = new Intersection(373, 594, "110");//
        Intersection destinationBuilding118 = new Intersection(973, 594, "118");//
        Intersection destinationBuilding127 = new Intersection(900, 594, "127");//
        Intersection warehouse = new Intersection(330, 650, "Warehouse");

      
       destinations.addAll(Arrays.asList(warehouse,
       destinationBuilding120,destinationBuilding123,
       destinationBuilding103,destinationBuilding70,
       destinationBuilding44,destinationBuilding13,
       destinationBuilding32,destinationBuilding7,
       destinationBuilding52,destinationBuilding12,
       destinationBuilding101,destinationBuilding79,
       destinationBuilding74,destinationBuilding46,
       destinationBuilding42,destinationBuilding97,
       destinationBuilding67,destinationBuilding80,
       destinationBuilding116,destinationBuilding129,
       destinationBuilding2,destinationBuilding10,
       destinationBuilding18,destinationBuilding21,
       destinationBuilding26,destinationBuilding28,
       destinationBuilding35,destinationBuilding39,
       destinationBuilding56,destinationBuilding58,
       destinationBuilding63,destinationBuilding65,
       destinationBuilding83,destinationBuilding88,
       destinationBuilding90,destinationBuilding92,
       destinationBuilding106,destinationBuilding110,
       destinationBuilding118,destinationBuilding127
));   

  
      return destinations;
  }
 



  public static Map<Intersection, List<Intersection>> createGraph() {
    Map<Intersection, List<Intersection>> graph = new HashMap<>();
    
    Set<String> connections = new HashSet<>();  // Set to track unique connections

    // Connect adjacent intersections within each street
    for (int j = 0; j < intersections.size(); j++) {
        List<Intersection> street = intersections.get(j);
        List<Intersection> prevStreet = (j > 0) ? intersections.get(j - 1) : Collections.emptyList();

        for (int i = 0; i < street.size(); i++) {
            Intersection currentIntersection = street.get(i);
            List<Intersection> neighbors = new ArrayList<>();

            // Connect with the previous intersection of the same street
            if (i > 0) {
                Intersection prevIntersection = street.get(i - 1);
                String connectionKey = getOrderedConnectionKey(currentIntersection, prevIntersection);
                if (!connections.contains(connectionKey)) {
                    neighbors.add(prevIntersection);
                    System.out.println("Connecting " + currentIntersection.getName() + " with " + prevIntersection.getName());
                    
                    // Connect in the reverse direction as well
                    graph.computeIfAbsent(prevIntersection, k -> new ArrayList<>()).add(currentIntersection);
                    System.out.println("Connecting " + prevIntersection.getName() + " with " + currentIntersection.getName());
                    connections.add(connectionKey);
                }
            }

            // Connect with the next intersection of the same street if it exists
            if (i < street.size() - 1) {
                Intersection nextIntersection = street.get(i + 1);
                String connectionKey = getOrderedConnectionKey(currentIntersection, nextIntersection);
                if (!connections.contains(connectionKey)) {
                    neighbors.add(nextIntersection);
                    System.out.println("Connecting " + currentIntersection.getName() + " with " + nextIntersection.getName());
                    
                    // Connect in the reverse direction as well
                    graph.computeIfAbsent(nextIntersection, k -> new ArrayList<>()).add(currentIntersection);
                    System.out.println("Connecting " + nextIntersection.getName() + " with " + currentIntersection.getName());
                    connections.add(connectionKey);
                }
            }

            // Connect with the intersection in the previous street if it exists
            if (i < prevStreet.size()) {
                Intersection prevStreetIntersection = prevStreet.get(i);
                String connectionKey = getOrderedConnectionKey(currentIntersection, prevStreetIntersection);
                if (!connections.contains(connectionKey)) {
                    neighbors.add(prevStreetIntersection);
                    System.out.println("Connecting " + currentIntersection.getName() + " with " + prevStreetIntersection.getName());
                    
                    // Connect in the reverse direction as well
                    graph.computeIfAbsent(prevStreetIntersection, k -> new ArrayList<>()).add(currentIntersection);
                    System.out.println("Connecting " + prevStreetIntersection.getName() + " with " + currentIntersection.getName());
                    connections.add(connectionKey);
                }
            }

            // Connect with An+1 if it exists within the same street
            if (i == street.size() - 1 && j < intersections.size() - 1) {
                Intersection nextStreetIntersection = intersections.get(j + 1).get(i);
                String connectionKey = getOrderedConnectionKey(currentIntersection, nextStreetIntersection);
                if (!connections.contains(connectionKey)) {
                    neighbors.add(nextStreetIntersection);
                    System.out.println("Connecting " + currentIntersection.getName() + " with " + nextStreetIntersection.getName());
                    
                    // Connect in the reverse direction as well
                    graph.computeIfAbsent(nextStreetIntersection, k -> new ArrayList<>()).add(currentIntersection);
                    System.out.println("Connecting " + nextStreetIntersection.getName() + " with " + currentIntersection.getName());
                    connections.add(connectionKey);
                }
            }

            // Add connections for the current intersection without duplicates
            Stream<Intersection> neighborStream = neighbors.stream();
           // Remove duplicates from the stream
            Stream<Intersection> distinctNeighbors = neighborStream.distinct();

            // Collect the distinct neighbors into a list
            List<Intersection> uniqueNeighbors = distinctNeighbors.collect(Collectors.toList());

            // Associate the current intersection with its list of unique neighbors in the graph
            graph.put(currentIntersection, uniqueNeighbors);
        }
    }

    // Flatten the list of lists into a single list of intersections
    Stream<Intersection> intersectionStream = intersections.stream().flatMap(List::stream);

    // Collect the intersections into a list
    List<Intersection> allIntersections = intersectionStream.collect(Collectors.toList());

    // Now you can use allIntersections as needed
    connectDestinationBuildings(graph, allIntersections, destetionBuilding);

    return graph;
}

private static String getOrderedConnectionKey(Intersection intersection1, Intersection intersection2) {
    String name1 = intersection1.getName();
    String name2 = intersection2.getName();
    return (name1.compareTo(name2) < 0) ? name1 + "-" + name2 : name2 + "-" + name1;
}

public static  List<List<Intersection>> createIntersectionsLayout(){
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

    List<Building> buildings = new ArrayList<>();
    MainGUISimulation.buildings(MainGUISimulation.AllGroups);

    for (int i = 1; i < destetionBuilding.size(); i++) {
        
        // Get the building name from destination.get(12)
        String buildingName = destetionBuilding.get(i).getName();

        // Convert buildingName to an integer
        int buildingIndex = Integer.parseInt(buildingName);

        // Get the MainGUISimulation.Building object using the buildingIndex
        Rectangle buildingInfo = MainGUISimulation.buildings.get(buildingIndex - 1);

        buildings.add(new Building(
                buildingIndex,
                destetionBuilding.get(i),
                buildingInfo
        ));
    }
    return buildings;
}

public static List<Customer> generateRandomCustomers() {

    List<Customer> sequentialCustomers = new ArrayList<>();
    List<Building> allBuildings = Allbuildings();

    int customerId = 1;

    // Iterate through destination buildings and assign each building to a customer
    for (int i = 1; i < destetionBuilding.size(); i++) {
        Building building = allBuildings.get(i - 1);
        Customer customer = new Customer(customerId, building);
        sequentialCustomers.add(customer);

        customerId++;
    }

    return sequentialCustomers;
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
  private static void connectDestinationBuildings(Map<Intersection, List<Intersection>> graph, List<Intersection> intersections, List<Intersection> destinationBuildings) {
    for (int i = 0; i < destinationBuildings.size(); i++) {
        Intersection destination = destinationBuildings.get(i);

        // Find the closest left and right intersections
        Intersection closestLeftIntersection = findClosestLeftIntersection(destination, intersections);
        Intersection closestRightIntersection = findClosestRightIntersection(destination, intersections);

        // Connect the destination building to the closest left and right intersections
        if (i == 0) {
            // Special case for the first building (Warehouse)
            Intersection a9Intersection = intersections.get(24);
            graph.putIfAbsent(a9Intersection, new ArrayList<>());
            graph.get(a9Intersection).add(destination);

            // Connect the A9 intersection to the Warehouse in reverse
            graph.computeIfAbsent(destination, k -> new ArrayList<>()).add(a9Intersection);

            System.out.println("Connecting " + a9Intersection.getName() + " with " + destination.getName());
            System.out.println("Connecting " + destination.getName() + " with " + a9Intersection.getName());
        } else {
            if (closestLeftIntersection != null) {
                graph.putIfAbsent(closestLeftIntersection, new ArrayList<>());
                graph.get(closestLeftIntersection).add(destination);

                // Connect the left intersection to the destination building in reverse
                graph.computeIfAbsent(destination, k -> new ArrayList<>()).add(closestLeftIntersection);

                System.out.println("Connecting " + closestLeftIntersection.getName() + " with " + destination.getName());
                System.out.println("Connecting " + destination.getName() + " with " + closestLeftIntersection.getName());
            }

            if (closestRightIntersection != null) {
                graph.putIfAbsent(closestRightIntersection, new ArrayList<>());
                graph.get(closestRightIntersection).add(destination);

                // Connect the right intersection to the destination building in reverse
                graph.computeIfAbsent(destination, k -> new ArrayList<>()).add(closestRightIntersection);

                System.out.println("Connecting " + closestRightIntersection.getName() + " with " + destination.getName());
                System.out.println("Connecting " + destination.getName() + " with " + closestRightIntersection.getName());
            }
        }
    }
}

private static Intersection findClosestLeftIntersection(Intersection destination, List<Intersection> intersections) {
    double centerX = destination.getX();

    return intersections.stream()
            .filter(intersection -> intersection.getX() < centerX)
            .min(Comparator.comparingDouble(intersection -> intersection.getDistanceTo(destination)))
            .orElse(null);
}

private static Intersection findClosestRightIntersection(Intersection destination, List<Intersection> intersections) {
    double centerX = destination.getX();

    return intersections.stream()
            .filter(intersection -> intersection.getX() > centerX)
            .min(Comparator.comparingDouble(intersection -> intersection.getDistanceTo(destination)))
            .orElse(null);
}



}



    


    
    
