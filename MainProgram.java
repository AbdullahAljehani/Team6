import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MainProgram {
    
    public static DeliveryDriver driver;

    
    public static void initializeObjects() {
        List<CustomerWithContact> randomCustomers = generateRandomCustomersWithContact();
    
        generateRandomPackages(randomCustomers);   
        
        driver = new DeliveryDriver();
  
    }
    public static List<Intersection> destinationBuildings() {
      List<Intersection> destinations = new ArrayList<>();

        // Destination Buildings with names
        Intersection destinationBuilding127 = new Intersection(568, 594, "127");
        Intersection destinationBuilding124 = new Intersection(368, 594, "124");
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
        Intersection destinationBuilding133 = new Intersection(1028, 594, "133");
        Intersection warehouse = new Intersection(330, 650, "Warehouse");

      
       destinations.addAll(Arrays.asList(warehouse,
       destinationBuilding124, destinationBuilding127,
       destinationBuilding103, destinationBuilding70,
       destinationBuilding44, destinationBuilding13,
       destinationBuilding32, destinationBuilding7,
       destinationBuilding52, destinationBuilding12,
       destinationBuilding101, destinationBuilding79,
       destinationBuilding74, destinationBuilding46,
       destinationBuilding42, destinationBuilding97,
       destinationBuilding67, destinationBuilding80,
       destinationBuilding116, destinationBuilding133
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
    List<Intersection> neighborsOf9_3 = Arrays.asList( intersections.get(8).get(4), intersections.get(8).get(2), intersections.get(7).get(3));
    List<Intersection> neighborsOfFirst9 = Arrays.asList(intersections.get(8).get(1));
    List<Intersection> neighborsOfEnd9 = Arrays.asList(intersections.get(8).get(3));
    List<Intersection> neighborsOfBuild124 = Arrays.asList(intersections.get(8).get(2),intersections.get(8).get(1),destinations.get(2));
    List<Intersection> neighborsOfBuild127 = Arrays.asList(intersections.get(8).get(2),intersections.get(8).get(1),destinations.get(1));
   
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






    graph.put(destinations.get(2), neighborsOfEndA);
    graph.put(intersections.get(8).get(1), neighborsOf9_1);
    graph.put(intersections.get(8).get(2), neighborsOf9_2);
    graph.put(intersections.get(8).get(3), neighborsOf9_3);
    graph.put(intersections.get(8).get(1), neighborsOfFirst9);
    graph.put(intersections.get(8).get(4), neighborsOfEnd9);
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
  //   public static List<Package> copyPackagesWithPaths(List<Package> originalPackages, List<List<Intersection>> newPaths) {
  //     List<Package> copiedPackages = new ArrayList<>();
  
  //     for (int i = 0; i < originalPackages.size(); i++) {
  //         Package originalPackage = originalPackages.get(i);
  //         List<Intersection> newPath = newPaths.get(i);
  
  //         if (originalPackage instanceof Normal) {
  //             // If it's a Normal package, use the copy constructor with the new path
  //             Normal originalNormal = (Normal) originalPackage;
  //             Normal copiedNormal = new Normal(originalNormal, newPath);
  //             copiedPackages.add(copiedNormal);
  
  //         } else if (originalPackage instanceof Offical_paper) {
  //             Offical_paper originalOfficialPaper = (Offical_paper) originalPackage;
  //             Offical_paper copiedOfficialPaper = new Offical_paper(originalOfficialPaper, newPath);
  //             copiedPackages.add(copiedOfficialPaper);
  //             copiedOfficialPaper.contactCustomer();
  
  //         }
  //     }
  
  //     return copiedPackages;
  // }
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







public static List<Building> Allbuildings() {
  List<Intersection> destination = destinationBuildings();
  List<Building> buildings = new ArrayList<>();

   buildings.add(new Building(127,destination.get(2),MainGUISimulation.Building127));
   buildings.add(new Building(103,destination.get(1),MainGUISimulation.Building103));
   buildings.add(new Building(70,destination.get(20),MainGUISimulation.Building70));
   buildings.add(new Building(44,destination.get(11),MainGUISimulation.Building44));
  
  buildings.add(new Building(13,destination.get(7),MainGUISimulation.Building13));
  buildings.add(new Building(32,destination.get(9),MainGUISimulation.Building32));
  buildings.add(new Building(7,destination.get(13),MainGUISimulation.Building7));
  buildings.add(new Building(52,destination.get(14),MainGUISimulation.Building52));
  buildings.add(new Building(12,destination.get(4),MainGUISimulation.Building12));
  buildings.add(new Building(101,destination.get(6),MainGUISimulation.Building101));
  buildings.add(new Building(79,destination.get(15),MainGUISimulation.Building79));
  buildings.add(new Building(74,destination.get(16),MainGUISimulation.Building74));
  buildings.add(new Building(46,destination.get(12),MainGUISimulation.Building46));
  buildings.add(new Building(42,destination.get(10),MainGUISimulation.Building42));     

  buildings.add(new Building(97, destination.get(17),MainGUISimulation.Building97));
  buildings.add(new Building(67, destination.get(18),MainGUISimulation.Building67));
  buildings.add(new Building(80, destination.get(19),MainGUISimulation.Building80));
  buildings.add(new Building(116, destination.get(3),MainGUISimulation.Building116));
  buildings.add(new Building(124, destination.get(1),MainGUISimulation.Building124));
  buildings.add(new Building(133, destination.get(8),MainGUISimulation.Building133));

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
 }

    


    
    
