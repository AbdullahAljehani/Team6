import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class FadingRectangle extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a red rectangle with rounded corners
        Rectangle rect1 = new Rectangle(75, 75, 75, 75);
        rect1.setArcHeight(50);
        rect1.setArcWidth(50);
        rect1.setFill(Color.GREY);
        
        Rectangle rect2 = new Rectangle(200, 75, 75, 75);
        rect2.setArcHeight(50);
        rect2.setArcWidth(50);
        rect2.setFill(Color.GREY);
        
         Rectangle rect3 = new Rectangle(400, 75, 75, 75);
        rect3.setArcHeight(50);
        rect3.setArcWidth(50);
        rect3.setFill(Color.GREY);
        
         Rectangle rect4 = new Rectangle(500, 75, 75, 75);
        rect4.setArcHeight(50);
        rect4.setArcWidth(50);
        rect4.setFill(Color.GREY);
        
        
        
        
        Rectangle car = new Rectangle(75, 180, 55, 55);
        car.setArcHeight(50);
        car.setArcWidth(50);
        car.setFill(Color.BLUE);   
        
        //Instantiating the path class  
     
        
        Path path = new Path();
        MoveTo move = new MoveTo(150, 200);
        LineTo line1 = new LineTo(330, 200);
        MoveTo move2 = new MoveTo(330, 200);
        LineTo line2 = new LineTo(330, 100);
        path.getElements().addAll(move, line1 , move2 , line2);
        
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.seconds(10));
        pathTransition.setNode(car);
        pathTransition.setPath(path);
        pathTransition.play();





        

       
       



        // Create a fade transition that fades in and out indefinitely
       

        // Add the rectangle to a group and create a scene
        Group root = new Group(rect1 ,rect2 , rect3 , rect4 , car  );
        Scene scene = new Scene(root , 300, 300,Color.WHITE);

        // Set the stage title and show the scene
        primaryStage.setTitle("Fading Rectangle");
        primaryStage.setScene(scene );
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
