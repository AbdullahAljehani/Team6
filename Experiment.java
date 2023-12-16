import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Experiment {
    
public static List<Intersection> intersections(){

  List<Intersection> intersections = new ArrayList<>();

      Intersection FirstOfStreet1= new Intersection ( 35, 66);
      Intersection intersection1_1= new Intersection ( 330, 66);
      Intersection intersection1_2= new Intersection ( 600, 66);
      Intersection intersection1_3= new Intersection (860, 66);
      Intersection EndOfStreet1= new Intersection ( 1050, 66);
      Intersection FirstOfStreet2= new Intersection ( 35, 130);
      Intersection intersection2_1= new Intersection ( 330, 130);
      Intersection intersection2_2= new Intersection ( 600, 130);
      Intersection intersection2_3= new Intersection (860, 130);
      Intersection EndOfStreet2= new Intersection ( 1050, 130);

      Intersection FirstOfStreet3= new Intersection ( 35, 197);
      Intersection intersection3_1= new Intersection ( 330, 197);
      Intersection intersection3_2= new Intersection ( 600, 197);
      Intersection intersection3_3= new Intersection (860, 197);
      Intersection EndOfStreet3= new Intersection ( 1050, 197);

      Intersection FirstOfStreet4= new Intersection ( 35, 265);
      Intersection intersection4_1= new Intersection ( 330, 265);
      Intersection intersection4_2= new Intersection ( 600, 265);
      Intersection intersection4_3= new Intersection (860, 265);
      Intersection EndOfStreet4= new Intersection ( 1050, 265);

      Intersection FirstOfStreet5= new Intersection ( 35, 330);
      Intersection intersection5_1= new Intersection ( 330, 330);
      Intersection intersection5_2= new Intersection ( 600, 330);
      Intersection intersection5_3= new Intersection (860, 330);
      Intersection EndOfStreet5= new Intersection ( 1050, 330);

      Intersection FirstOfStreet6= new Intersection ( 35, 395);
      Intersection intersection6_1= new Intersection ( 330, 395);
      Intersection intersection6_2= new Intersection ( 600, 395);
      Intersection intersection6_3= new Intersection (860, 395);
      Intersection EndOfStreet6= new Intersection ( 1050, 395);
  
      Intersection FirstOfStreet7= new Intersection ( 35, 461);
      Intersection intersection7_1= new Intersection ( 330, 461);
      Intersection intersection7_2= new Intersection ( 600, 461);
      Intersection intersection7_3= new Intersection (860, 461);
      Intersection EndOfStreet7= new Intersection ( 1050, 461);

      Intersection FirstOfStreet8= new Intersection ( 35, 527);
      Intersection intersection8_1= new Intersection ( 330, 527);
      Intersection intersection8_2= new Intersection ( 600, 527);
      Intersection intersection8_3= new Intersection (860, 527);
      Intersection EndOfStreet8= new Intersection ( 1050, 527);
  
      Intersection FirstOfStreet9= new Intersection ( 35, 594);
      Intersection intersection9_1= new Intersection ( 330, 594);
      Intersection intersection9_2= new Intersection ( 600, 594);
      Intersection intersection9_3= new Intersection (860, 594);
      Intersection EndOfStreet9= new Intersection ( 1050, 594);

      Intersection FirstOfStreetC= new Intersection ( 860, 0);
      Intersection EndOfStreetC= new Intersection ( 860, 650);

      Intersection FirstOfStreetB= new Intersection ( 600, 0);
      Intersection EndOfStreetB= new Intersection ( 600, 650);

      Intersection FirstOfStreetA= new Intersection ( 330, 0);
      Intersection EndOfStreetA= new Intersection ( 330, 650);

      Intersection destinationBuilding127= new Intersection (568,594);
      Intersection destinationBuilding103= new Intersection (900,461);
      Intersection destinationBuilding70= new Intersection (390,395);
      Intersection destinationBuilding44= new Intersection (400,265);
      
      Intersection destinationBuilding13=new Intersection (68,130);
      Intersection destinationBuilding32=new Intersection (508,130);
      Intersection destinationBuilding7=new Intersection (568,66);
      Intersection destinationBuilding52=new Intersection (1028,197);
      Intersection destinationBuilding12=new Intersection (1010,66);
      Intersection destinationBuilding101=new Intersection (768,461);
      Intersection destinationBuilding79=new Intersection (1028,395);
      Intersection destinationBuilding74=new Intersection (708,395);
      Intersection destinationBuilding46=new Intersection (638,265);
      Intersection destinationBuilding42=new Intersection (183,265);

      Intersection destinationBuilding97=new Intersection (478,461);
      Intersection destinationBuilding67=new Intersection (143,395);
      Intersection destinationBuilding80=new Intersection (68,395);
      Intersection destinationBuilding116=new Intersection (818,527);
      Intersection destinationBuilding124=new Intersection (368,594);
      Intersection destinationBuilding133=new Intersection (1028,594);

      intersections= Arrays.asList(destinationBuilding101,destinationBuilding103,destinationBuilding70,destinationBuilding116,destinationBuilding12
      ,destinationBuilding124,destinationBuilding127,destinationBuilding13,destinationBuilding133,destinationBuilding32,destinationBuilding42,destinationBuilding44,destinationBuilding46,destinationBuilding7,destinationBuilding52,destinationBuilding79,destinationBuilding74,destinationBuilding97,destinationBuilding67,destinationBuilding80,FirstOfStreet1,intersection1_1,intersection1_2,intersection1_3,intersection2_1,intersection2_2,intersection2_3,intersection3_1,intersection3_2,intersection3_3,intersection4_1,intersection4_2,intersection4_3,intersection5_1,intersection5_2,intersection5_3,FirstOfStreet6,intersection6_1,intersection6_2,intersection6_3,EndOfStreet6,FirstOfStreet7,intersection7_1,intersection7_2,intersection7_3,EndOfStreet7,FirstOfStreet8,intersection8_1,intersection8_2,intersection8_3,EndOfStreet8,FirstOfStreet9,intersection9_1,
      intersection9_2,intersection9_3,EndOfStreet9,FirstOfStreetC,EndOfStreetC,FirstOfStreetB,EndOfStreetB,FirstOfStreetA,EndOfStreetA,EndOfStreet1,FirstOfStreet2,EndOfStreet2,FirstOfStreet3,EndOfStreet3,FirstOfStreet4,EndOfStreet4,FirstOfStreet5,EndOfStreet5);
      return intersections;
    }


public static List<Building> Allbuildings() {
      List<Intersection> intersectionsList = intersections();
      List<Building> buildings = new ArrayList<>();
       buildings.add(new Building(127,intersectionsList.get(6),MainGUISimulation.Building127));
       buildings.add(new Building(103,intersectionsList.get(1),MainGUISimulation.Building103));
       buildings.add(new Building(70,intersectionsList.get(2),MainGUISimulation.Building70));
       buildings.add(new Building(44,intersectionsList.get(11),MainGUISimulation.Building44));
      
      buildings.add(new Building(13,intersectionsList.get(7),MainGUISimulation.Building13));
      buildings.add(new Building(32,intersectionsList.get(9),MainGUISimulation.Building32));
      buildings.add(new Building(7,intersectionsList.get(13),MainGUISimulation.Building7));
      buildings.add(new Building(52,intersectionsList.get(14),MainGUISimulation.Building52));
      buildings.add(new Building(12,intersectionsList.get(4),MainGUISimulation.Building12));
      buildings.add(new Building(101,intersectionsList.get(0),MainGUISimulation.Building101));
      buildings.add(new Building(79,intersectionsList.get(15),MainGUISimulation.Building79));
      buildings.add(new Building(74,intersectionsList.get(16),MainGUISimulation.Building74));
      buildings.add(new Building(46,intersectionsList.get(12),MainGUISimulation.Building46));
      buildings.add(new Building(42,intersectionsList.get(10),MainGUISimulation.Building42));     

      buildings.add(new Building(97, intersectionsList.get(17),MainGUISimulation.Building97));
      buildings.add(new Building(67, intersectionsList.get(18),MainGUISimulation.Building67));
      buildings.add(new Building(80, intersectionsList.get(19),MainGUISimulation.Building80));
      buildings.add(new Building(116, intersectionsList.get(3),MainGUISimulation.Building116));
      buildings.add(new Building(124, intersectionsList.get(5),MainGUISimulation.Building124));
      buildings.add(new Building(133, intersectionsList.get(8),MainGUISimulation.Building133));

      return buildings;
      }

public static List<CustomerWithContact> generateRandomCustomersWithContact() {
        List<CustomerWithContact> randomCustomersWithContact = new ArrayList<>();
        List<Building> allBuildings = Allbuildings();
    
        // Keep track of assigned buildings and phone numbers
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
    
            // Check if the building and phone number are not already assigned
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

    public static List<Package> generateRandomPackages(List<CustomerWithContact> randomCustomers) {
        List<Package> randomPackages = new ArrayList<>();
        Random random = new Random();
    
        for (CustomerWithContact randomCustomer : randomCustomers) {
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
    
    
    public static void main(String[] args) {
        // Generate random customers with contact
        List<CustomerWithContact> randomCustomers = generateRandomCustomersWithContact();
    
        // Generate random packages and assign them to customers
        generateRandomPackages(randomCustomers);
    
        // Print the details of each random customer and their assigned packages
        for (CustomerWithContact customer : randomCustomers) {
            System.out.println("Customer ID: " + customer.getID());
            System.out.println("Building ID: " + customer.getBuilding());
            System.out.println("Customer PhoneNumber: " + customer.getPhoneNumber());
    
            // Print the details of assigned packages
            List<Package> assignedPackages = customer.getAssignedPackages();
            if (!assignedPackages.isEmpty()) {
                System.out.println("\tAssigned Packages:");
                for (Package assignedPackage : assignedPackages) {
                    System.out.println("\t\tPackage ID: " + assignedPackage.getPackageId());
                    System.out.println("\t\tPackage Type: " + assignedPackage.getClass().getSimpleName());
                    System.out.println("\t\tDelay: " + assignedPackage.delay);
                    System.out.println();
                }
            } else {
                System.out.println("\tNo packages assigned.");
            }
    
            // Add a line to separate each customer's information
            System.out.println("----------------------------------------");
        }
    }
    
    
    
    
    
}