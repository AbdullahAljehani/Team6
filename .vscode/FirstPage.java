import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FirstPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Best Route Application");

        // Create label
        Label titleLabel = new Label("Best Route to deliver package");
        titleLabel.setStyle("-fx-font-size: 22px; -fx-text-fill: white;"); // Set text color to white
        titleLabel.setAlignment(Pos.CENTER);

        // Create buttons
        Button phase1Button = new Button("Phase 1");
        Button phase2Button = new Button("Phase 2");

        // Make buttons bigger
        phase1Button.setStyle("-fx-font-size: 20px;");
        phase2Button.setStyle("-fx-font-size: 20px;");

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

        // Set dark mode background color
        BackgroundFill backgroundFill = new BackgroundFill(Color.DARKSLATEGRAY, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY);
        Background background = new Background(backgroundFill);
        borderPane.setBackground(background);

        // Bind properties for dynamic resizing
        titleLabel.prefWidthProperty().bind(borderPane.widthProperty());
        titleLabel.prefHeightProperty().bind(borderPane.heightProperty().multiply(0.2)); // Example: 20% of the height
        gridPane.prefWidthProperty().bind(borderPane.widthProperty());
        gridPane.prefHeightProperty().bind(borderPane.heightProperty().multiply(0.8)); // Example: 80% of the height

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

    public static void main(String[] args) {
        launch(args);
    }
}
