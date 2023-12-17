import java.util.List;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FirstPage extends Application {
    public static boolean isPhase1Selected = false;
    public static boolean isPhase2Selected = false;
   

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Best Route Application");
        

        // Create label
        Label titleLabel = new Label("Best Route to Deliver Packages");
        titleLabel.setStyle(
            "-fx-font-size: 22px; " +      // Font size
            "-fx-text-fill: #F0F2F0; " +   // Blue text color
            "-fx-font-weight: bold;"       // Bold font
        );
titleLabel.setAlignment(Pos.CENTER);

        // Create buttons
        Button phase1Button = new Button("Phase 1");     
        Button phase2Button = new Button("Phase 2");
        phase1Button.setOnAction(e -> {
            isPhase1Selected = true;
            openSimulationPage();
            primaryStage.close();

        });
        phase2Button.setOnAction(e -> {
            isPhase2Selected = true;  
            openSimulationPage();
            primaryStage.close();

        });
        // Make buttons bigger
        phase1Button.setStyle(
    "-fx-background-color: #000C40; " +
    "-fx-text-fill: white; " +
    "-fx-font-size: 20px; " + // Increase font size
    "-fx-background-radius: 100 100 100 100;" // Set larger background radii (top-left, top-right, bottom-right, bottom-left)
);

phase2Button.setStyle(
    "-fx-background-color: #000C40; " +
    "-fx-text-fill: white; " +
    "-fx-font-size: 20px; " + // Increase font size
    "-fx-background-radius: 100 100 100 100;"
);

        // Create GridPane for buttons
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(40); // Set horizontal gap between buttons (increased from 20)

        // Add buttons to GridPane
        gridPane.add(phase1Button, 0, 0);
        gridPane.add(phase2Button, 1, 0);

        // Create BorderPane for the main layout
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(titleLabel);
        BorderPane.setAlignment(titleLabel, Pos.CENTER);
        borderPane.setCenter(gridPane);

        borderPane.setStyle(
            "-fx-background: linear-gradient(to bottom, #000C40, #F0F2F0);" +
            "-fx-background-size: cover;"
        );

        // Bind properties for dynamic resizing
        DoubleProperty titleLabelWidth = titleLabel.prefWidthProperty();
        ReadOnlyDoubleProperty borderPaneWidthProp = borderPane.widthProperty();
        titleLabelWidth.bind(borderPaneWidthProp);

        DoubleProperty titleLabelHeight = titleLabel.prefHeightProperty();
        ReadOnlyDoubleProperty borderPaneHeightProp = borderPane.heightProperty();
        titleLabelHeight.bind(borderPaneHeightProp.multiply(0.2));

        DoubleProperty gridPaneWidth = gridPane.prefWidthProperty();
        gridPaneWidth.bind(borderPaneWidthProp);

        DoubleProperty gridPaneHeight = gridPane.prefHeightProperty();
        gridPaneHeight.bind(borderPaneHeightProp.multiply(0.8));
 

        // Set minimum width and height for the stage
        primaryStage.setMinWidth(400); 
        primaryStage.setMinHeight(300); 
        // Create Scene
        Scene scene = new Scene(borderPane, 400, 300); 

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }
    private void openSimulationPage() {
        MainGUISimulation  SimulationPage = new MainGUISimulation (); // Create an instance of FirstPage
        Stage stage = new Stage(); // Create a new stage
        SimulationPage.start(stage); // Call the start method of FirstPage, passing the new stage
    }

    public static void main(String[] args) {
        // // MainProgram.driver.setPackages(MainProgram.initializePackages());
        // List<Customer> randomCustomers = MainProgram.generateRandomCustomers();
    
        // // Generate random packages and assign them to customers
        // MainProgram.generateRandomPackages(randomCustomers);
    
        // // Print the details of each random customer and their assigned packages
        // for (Customer customer : randomCustomers) {
        //     System.out.println("Customer ID: " + customer.getID());
        //     System.out.println("Building ID: " + customer.getBuilding());
    
        //     // Print the details of assigned packages
        //     List<Package> assignedPackages = customer.getAssignedPackages();
        //     if (!assignedPackages.isEmpty()) {
        //         System.out.println("\tAssigned Packages:");
        //         for (Package assignedPackage : assignedPackages) {
        //             System.out.println("\t\tPackage ID: " + assignedPackage.getPackageId());
        //             System.out.println("\t\tPackage Type: " + assignedPackage.getClass().getSimpleName());
        //             System.out.println("\t\tDelay: " + assignedPackage.delay);
        //             System.out.println();
        //         }
        //     } else {
        //         System.out.println("\tNo packages assigned.");
        //     }
    
        //     // Add a line to separate each customer's information
        //     System.out.println("----------------------------------------");
        // }

        //     // Copy packages and print details of copied packages
        //     List<Package> originalPackages = MainProgram.generateRandomPackages(randomCustomers);
        //     List<Package> copiedPackages = MainProgram.copyPackagesWithPaths(originalPackages);

        //     // Print details of original packages
        //     for (Package originalPackage : originalPackages) {
        //         System.out.println("Original Package Details:");
        //         System.out.println(originalPackage.getPackageInformation());
        //         System.out.println("----------------------------------------");
        //     }

        //     // Print details of copied packages
        //     for (Package copiedPackage : copiedPackages) {
        //         System.out.println("Copied Package Details:");
        //         if (copiedPackage instanceof Offical_paper) {
        //             Offical_paper copiedOfficalPaper = (Offical_paper) copiedPackage;
        //             copiedOfficalPaper.printPackageDetails();
        //         } else {
        //             System.out.println(copiedPackage.getPackageInformation());
        //         }
        //         System.out.println("----------------------------------------");
        //     }

MainProgram.initializeObjects();
        launch(args);
    }
   
   
}
