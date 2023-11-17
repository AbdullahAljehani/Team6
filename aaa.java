import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class aaa extends Application {

    @Override
    public void start(Stage primaryStage) {
        // ------------ HOME ------------------------
        Rectangle rect1 = new Rectangle(75, 75, 50, 50);
        rect1.setArcHeight(25);
        rect1.setArcWidth(25);
        rect1.setFill(Color.GREY);
        
        Rectangle rect2 = new Rectangle(200, 75, 50, 50);
        rect2.setArcHeight(25);
        rect2.setArcWidth(25);
        rect2.setFill(Color.GREY);
        
         Rectangle rect3 = new Rectangle(400, 75, 50, 50);
        rect3.setArcHeight(25);
        rect3.setArcWidth(25);
        rect3.setFill(Color.GREY);
        
         Rectangle rect4 = new Rectangle(500, 75, 50, 50);
        rect4.setArcHeight(25);
        rect4.setArcWidth(25);
        rect4.setFill(Color.GREY);
        
        
        
        
        
        
        
        
        // ------------------STREET-----------------------
        
        Line line_stret1 = new Line(0, 0, 1000, 0);
        line_stret1.setStrokeWidth(12);
        line_stret1.setTranslateX(50);
        line_stret1.setTranslateY(66);
        
         Line line_stret2 = new Line(0, 0, 1000, 0);
        line_stret2.setStrokeWidth(12);
        line_stret2.setTranslateX(50);
        line_stret2.setTranslateY(132);
        
        
        Line line_stret3 = new Line(0, 0, 1000, 0);
        line_stret3.setStrokeWidth(12);
        line_stret3.setTranslateX(50);
        line_stret3.setTranslateY(198);
        
         Line line_stret4 = new Line(0, 0, 1000, 0);
        line_stret4.setStrokeWidth(12);
        line_stret4.setTranslateX(50);
        line_stret4.setTranslateY(264);
        
        
        
         Line line_stret5 = new Line(0, 0, 1000, 0);
        line_stret5.setStrokeWidth(12);
        line_stret5.setTranslateX(50);
        line_stret5.setTranslateY(330);
        
        
        Line line_stret6 = new Line(0, 0, 1000, 0);
        line_stret6.setStrokeWidth(12);
        line_stret6.setTranslateX(50);
        line_stret6.setTranslateY(396);
        
        
        Line line_stret7 = new Line(0, 0, 1000, 0);
        line_stret7.setStrokeWidth(12);
        line_stret7.setTranslateX(50);
        line_stret7.setTranslateY(462);
        
        
        Line line_stret8 = new Line(0, 0, 1000, 0);
        line_stret8.setStrokeWidth(12);
        line_stret8.setTranslateX(50);
        line_stret8.setTranslateY(528);
        
        
        Line line_stret9 = new Line(0, 0, 1000, 0);
        line_stret9.setStrokeWidth(12);
        line_stret9.setTranslateX(50);
        line_stret9.setTranslateY(594);
        
        
        
         Line line_stret_topDwon1 = new Line(0, 0, 0, 1000);
        line_stret_topDwon1.setStrokeWidth(12);
        line_stret_topDwon1.setTranslateX(330);
        line_stret_topDwon1.setTranslateY(0);
        
        
         Line line_stret_topDwon2 = new Line(0, 0, 0, 1000);
        line_stret_topDwon2.setStrokeWidth(12);
        line_stret_topDwon2.setTranslateX(600);
        line_stret_topDwon2.setTranslateY(0);
        
        
        
        Line line_stret_topDwon3 = new Line(0, 0, 0, 1000);
        line_stret_topDwon3.setStrokeWidth(12);
        line_stret_topDwon3.setTranslateX(860);
        line_stret_topDwon3.setTranslateY(0);
        
        
        
        
        
        
        
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
        pathTransition.setDuration(Duration.seconds(5));
        pathTransition.setNode(car);
        pathTransition.setPath(path);
        pathTransition.play();

        
        
        
        
        
        




        

       
       



        // Create a fade transition that fades in and out indefinitely
       

        // Add the rectangle to a group and create a scene
        Group root = new Group(rect1 ,rect2 , rect3 , rect4 ,  line_stret1 , line_stret2 , 
                 line_stret3 , line_stret4 , line_stret5,
                line_stret6,line_stret7,line_stret8,line_stret9,line_stret_topDwon1 , 
                line_stret_topDwon2,line_stret_topDwon3 , car );
        Scene scene = new Scene(root , 500, 500,Color.WHITE);

        // Set the stage title and show the scene
        primaryStage.setTitle("Fading Rectangle");
        primaryStage.setScene(scene );
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

