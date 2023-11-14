import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StreetVisualization extends Application {
    private Substreet myStreet;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        myStreet = createSampleStreet();

        primaryStage.setTitle("Street Visualization");
        primaryStage.setScene(createScene());
        primaryStage.show();
    }

    private Substreet createSampleStreet() {
        Substreet street = new Substreet('a', 2.0, 70, 0.5,null,null);

        Building building1 = new Building();
        Building building2 = new Building();

        street.addBuildingRight(building1);
        street.addBuildingLeft(building2);

        return street;
    }

    private Scene createScene() {
        HBox streetLayout = new HBox(10); // Horizontal layout with spacing

        // Display buildings on the left side
        for (Building building : myStreet.buildingLeft) {
            streetLayout.getChildren().add(createBuildingRectangle(building));
        }

        // Add a separator (you can customize this based on your layout)
        Rectangle separator = new Rectangle(10, 100, Color.TRANSPARENT);
        streetLayout.getChildren().add(separator);

        // Display buildings on the right side
        for (Building building : myStreet.buildingLeft) {
            streetLayout.getChildren().add(createBuildingRectangle(building));
        }

        return new Scene(streetLayout, 400, 200);
    }

    private Rectangle createBuildingRectangle(Building building) {
        int buildingHeight = 100; // You can customize the height based on your requirements
        int buildingWidth = 30; // You can customize the width based on your requirements

        Rectangle buildingRectangle = new Rectangle(buildingWidth, buildingHeight, Color.BLUE);
        buildingRectangle.setStroke(Color.BLACK);
        buildingRectangle.setStrokeWidth(1);

        return buildingRectangle;
    }
}
