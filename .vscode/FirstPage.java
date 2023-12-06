import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FirstPage extends Application {
    
   

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Best Route Application");
        

        // Create label
        Label titleLabel = new Label("Best Route to Deliver Packages");
titleLabel.setStyle(
    "-fx-font-size: 22px; " +      // Font size
    "-fx-text-fill: #B3C9D2; " +   // Blue text color
    "-fx-font-weight: bold;"       // Bold font
);
titleLabel.setAlignment(Pos.CENTER);

        // Create buttons
        Button phase1Button = new Button("Phase 1");     
        Button phase2Button = new Button("Phase 2");
        phase1Button.setOnAction(e -> {
            openSimulationPage();
            primaryStage.close();
        });
        // Make buttons bigger
        phase1Button.setStyle(
            "-fx-background-color: #0A8E22; " + // Green background color
            "-fx-text-fill: white; " +          // White text color
            "-fx-font-size: 16px;"              // Font size
        );
        
        phase2Button.setStyle(
            "-fx-background-color: #01119B; " + // Blue background color
            "-fx-text-fill: white; " +          // White text color
            "-fx-font-size: 16px;"              // Font size
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

        borderPane.setStyle("-fx-background-image: url('BackgroundImage.jpg'); " +
                            "-fx-background-size: cover; " +
                            "-fx-background-repeat: no-repeat;");

        // Bind properties for dynamic resizing
        titleLabel.prefWidthProperty().bind(borderPane.widthProperty());
        titleLabel.prefHeightProperty().bind(borderPane.heightProperty().multiply(0.2)); 
        gridPane.prefWidthProperty().bind(borderPane.widthProperty());
        gridPane.prefHeightProperty().bind(borderPane.heightProperty().multiply(0.8)); 

        // Set minimum width and height for the stage
        primaryStage.setMinWidth(400); // Set your desired minimum width (increased from 300)
        primaryStage.setMinHeight(300); // Set your desired minimum height

        // Create Scene
        Scene scene = new Scene(borderPane, 400, 300); // Adjusted the initial size

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
   
}
