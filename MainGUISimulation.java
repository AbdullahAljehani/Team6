import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.scene.layout.Pane;
import javafx.animation.Animation;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;




public class MainGUISimulation extends Application {
private static Label CounterTimeLabel;
public static Label CounterDistanceLabel;
public static Label CounterCostLabel;
public static Label CounterNo_SimulationLabel ;
public static Label percentLabelP2;
public static Pane AllGroups= new Pane();
private  Timer timer;
public  int secondsPassed = 0;
public static  boolean isStartClicked=true;
public static boolean isPaused = false;
public static int numOfSumuolation = 0;
public static Rectangle car ;
public StackPane root;
public static int totalTimeP1;
public static int totalTimeP2;
public static List<Rectangle> buildings ;


    public void start(Stage primaryStage) {
        MainProgram.initializeObjects();
        primaryStage.setOnCloseRequest(windowEvent -> {Platform.exit();System.exit(0);});
        

            root = new StackPane();
            root.setStyle(
            "-fx-background-color: linear-gradient(to bottom, #000C40, #F0F2F0);" +
            "-fx-background-size: cover;"
        );
        

            // Create a group for car routes
            Group carRoutesGroup = new Group();
            car = new Rectangle(323, 642, 15, 15);
            car.setArcHeight(15);
            car.setArcWidth(15);
            car.setFill(Color.RED);
            carRoutesGroup.getChildren().add(car);

            Scene scene = new Scene(root , 1400, 700);
            
            buildings(AllGroups);
            streets(AllGroups);
            Labels(AllGroups,FirstPage.isPhase2Selected);            
            Buttons(AllGroups,primaryStage); 
            AllGroups.getChildren().addAll(carRoutesGroup);

            root.getChildren().add(AllGroups);

            primaryStage.setTitle("GUI Simulation");
            primaryStage.setMinWidth(1350);
            primaryStage.setMinHeight(720); 
            primaryStage.setScene(scene );
            primaryStage.show();
    }




    public static void buildings(Pane AllGroups){
    
        Text Neighbourhood_1 = new Text(1090, 260, "Alhamdaniya");
        Font font = new Font("Times New Roman",25);
        Neighbourhood_1.setFont(font);
        Neighbourhood_1.setFill(Color.GREY);
        Neighbourhood_1.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 1
        Rectangle Building1 = new Rectangle(50, 20, 35, 35);
        Building1.setArcHeight(20);
        Building1.setArcWidth(20);
        Building1.setFill(Color.GREY);
        Tooltip tooltipBuilding1 = new Tooltip("Building Number: 1");
        Tooltip.install(Building1, tooltipBuilding1); 
        Building1.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building1.contains(event.getX(), event.getY())) {
                tooltipBuilding1.show(Building1, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building1.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding1.hide();
        }); 
         
        
       
        Rectangle Building2 = new Rectangle(160, 20, 35, 35);
        Building2.setArcHeight(20);
        Building2.setArcWidth(20);
        Building2.setFill(Color.GREY);
        Tooltip tooltipBuilding2 = new Tooltip("Building Number: 2");
        Tooltip.install(Building2, tooltipBuilding2); 
        Building2.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building2.contains(event.getX(), event.getY())) {
                tooltipBuilding2.show(Building2, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building2.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding2.hide();
        }); 
        
        Rectangle Building3 = new Rectangle(270, 20, 35, 35);
        Building3.setArcHeight(20);
        Building3.setArcWidth(20);
        Building3.setFill(Color.GREY);
        Tooltip tooltipBuilding3 = new Tooltip("Building Number: 3");
        Tooltip.install(Building3, tooltipBuilding3); 
        Building3.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building3.contains(event.getX(), event.getY())) {
                tooltipBuilding3.show(Building3, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building3.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding3.hide();
        }); 
        
        // Neighbourhood_1 : BLOCK 2
        Rectangle Building4 = new Rectangle(350, 20, 35, 35);
        Building4.setArcHeight(25);
        Building4.setArcWidth(25);
        Building4.setFill(Color.GREY);
        Tooltip tooltipBuilding4 = new Tooltip("Building Number: 4");
        Tooltip.install(Building4, tooltipBuilding4); 
        Building4.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building4.contains(event.getX(), event.getY())) {
                tooltipBuilding4.show(Building4, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building4.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding4.hide();
        }); 
        
        Rectangle Building5 = new Rectangle(425, 20, 35, 35);
        Building5.setArcHeight(25);
        Building5.setArcWidth(25);
        Building5.setFill(Color.GREY);
         Tooltip tooltipBuilding5 = new Tooltip("Building Number: 5");
        Tooltip.install(Building5, tooltipBuilding5); 
        Building5.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building5.contains(event.getX(), event.getY())) {
                tooltipBuilding5.show(Building5, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building5.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding5.hide();
        }); 
        
        Rectangle Building6 = new Rectangle(490, 20, 35, 35);
        Building6.setArcHeight(25);
        Building6.setArcWidth(25);
        Building6.setFill(Color.GREY);
        Tooltip tooltipBuilding6 = new Tooltip("Building Number: 6");
        Tooltip.install(Building6, tooltipBuilding6); 
        Building6.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building6.contains(event.getX(), event.getY())) {
                tooltipBuilding6.show(Building6, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building6.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding6.hide();
        }); 
        
         Rectangle Building7 = new Rectangle(550, 20, 35, 35);
         Building7.setArcHeight(25);
         Building7.setArcWidth(25);
         Building7.setFill(Color.GREY);
        // // Tooltip tooltipBuilding7 = new Tooltip(MainProgram.package7.getPackageInformation());
        // Tooltip.install(Building7, tooltipBuilding7);
        
        // Building7.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building7.contains(event.getX(), event.getY())) {
        //         tooltipBuilding7.show(Building7, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building7.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding7.hide();
        // });
        
        // Neighbourhood_1 : BLOCK 3
        Rectangle Building8 = new Rectangle(640, 20, 35, 35);
        Building8.setArcHeight(25);
        Building8.setArcWidth(25);
        Building8.setFill(Color.GREY);
         Tooltip tooltipBuilding8 = new Tooltip("Building Number: 8");
        Tooltip.install(Building8, tooltipBuilding8); 
        Building8.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building8.contains(event.getX(), event.getY())) {
                tooltipBuilding8.show(Building8, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building8.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding8.hide();
        }); 
        
        Rectangle Building9 = new Rectangle(710, 20, 35, 35);
        Building9.setArcHeight(25);
        Building9.setArcWidth(25);
        Building9.setFill(Color.GREY);
        Tooltip tooltipBuilding9 = new Tooltip("Building Number: 9");
        Tooltip.install(Building9, tooltipBuilding9); 
        Building9.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building9.contains(event.getX(), event.getY())) {
                tooltipBuilding9.show(Building9, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building9.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding9.hide();
        });
        
        Rectangle Building10 = new Rectangle(790, 20, 35, 35);
        Building10.setArcHeight(25);
        Building10.setArcWidth(25);
        Building10.setFill(Color.GREY);
        Tooltip tooltipBuilding10 = new Tooltip("Building Number: 10");
        Tooltip.install(Building10, tooltipBuilding10); 
        Building10.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building10.contains(event.getX(), event.getY())) {
                tooltipBuilding10.show(Building10, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building10.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding10.hide();
        });
        
        // Neighbourhood_1 : BLOCK 4
        Rectangle Building11 = new Rectangle(880, 20, 35, 35);
        Building11.setArcHeight(25);
        Building11.setArcWidth(25);
        Building11.setHeight(35);
        Building11.setWidth(70);
        Building11.setFill(Color.GREY);
        Tooltip tooltipBuilding11 = new Tooltip("Building Number: 11");
        Tooltip.install(Building11, tooltipBuilding11); 
        Building11.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building11.contains(event.getX(), event.getY())) {
                tooltipBuilding11.show(Building11, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building11.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding11.hide();
        });
        
        Rectangle Building12 = new Rectangle(970, 20, 35, 35);
        Building12.setArcHeight(25);
        Building12.setArcWidth(25);
        Building12.setHeight(35);
        Building12.setWidth(70);
        Building12.setFill(Color.GREY);
        // Tooltip tooltipBuilding12 = new Tooltip(MainProgram.package9.getPackageInformation());
        // Tooltip.install(Building12, tooltipBuilding12);
        
        // Building12.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building12.contains(event.getX(), event.getY())) {
        //         tooltipBuilding12.show(Building12, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building12.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding12.hide();
        // });
        
        // Neighbourhood_1 : BLOCK 5
        Rectangle Building13 = new Rectangle(50, 80, 35, 35);
        Building13.setArcHeight(25);
        Building13.setArcWidth(25);
        Building13.setFill(Color.GREY);
        // Tooltip tooltipBuilding13 = new Tooltip(MainProgram.package5.getPackageInformation());
        // Tooltip.install(Building13, tooltipBuilding13);
        
        // Building13.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building13.contains(event.getX(), event.getY())) {
        //         tooltipBuilding13.show(Building13, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building13.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding13.hide();
        // });
        
        Rectangle Building14 = new Rectangle(125, 80, 35, 35);
        Building14.setArcHeight(25);
        Building14.setArcWidth(25);
        Building14.setFill(Color.GREY);
         Tooltip tooltipBuilding14 = new Tooltip("Building Number: 14");
        Tooltip.install(Building14, tooltipBuilding14); 
        Building14.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building14.contains(event.getX(), event.getY())) {
                tooltipBuilding14.show(Building14, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building14.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding14.hide();
        });
        
        Rectangle Building15 = new Rectangle(200, 80, 35, 35);
        Building15.setArcHeight(25);
        Building15.setArcWidth(25);
        Building15.setFill(Color.GREY);
        Tooltip tooltipBuilding15 = new Tooltip("Building Number: 15");
        Tooltip.install(Building15, tooltipBuilding15); 
        Building15.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building15.contains(event.getX(), event.getY())) {
                tooltipBuilding15.show(Building15, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building15.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding15.hide();
        });
        
        Rectangle Building16 = new Rectangle(270, 80, 35, 35);
        Building16.setArcHeight(25);
        Building16.setArcWidth(25);
        Building16.setFill(Color.GREY);
        Tooltip tooltipBuilding16 = new Tooltip("Building Number: 16");
        Tooltip.install(Building16, tooltipBuilding16); 
        Building16.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building16.contains(event.getX(), event.getY())) {
                tooltipBuilding16.show(Building16, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building16.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding16.hide();
        });
        
        // Neighbourhood_1 : BLOCK 6
        
        Rectangle Building17 = new Rectangle(350, 80, 35, 35);
        Building17.setArcHeight(25);
        Building17.setArcWidth(25);
        Building17.setFill(Color.GREY);
        Tooltip tooltipBuilding17 = new Tooltip("Building Number: 17");
        Tooltip.install(Building17, tooltipBuilding17); 
        Building17.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building17.contains(event.getX(), event.getY())) {
                tooltipBuilding17.show(Building17, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building17.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding17.hide();
        });
        
        Rectangle Building18 = new Rectangle(460, 80, 35, 35);
        Building18.setArcHeight(25);
        Building18.setArcWidth(25);
        Building18.setFill(Color.GREY);
        Tooltip tooltipBuilding18 = new Tooltip("Building Number: 18");
        Tooltip.install(Building18, tooltipBuilding18); 
        Building18.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building18.contains(event.getX(), event.getY())) {
                tooltipBuilding18.show(Building18, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building18.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding18.hide();
        });
        
        Rectangle Building19 = new Rectangle(550, 80, 35, 35);
        Building19.setArcHeight(25);
        Building19.setArcWidth(25);
        Building19.setFill(Color.GREY);
        Tooltip tooltipBuilding19 = new Tooltip("Building Number: 19");
        Tooltip.install(Building19, tooltipBuilding19); 
        Building19.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building19.contains(event.getX(), event.getY())) {
                tooltipBuilding19.show(Building19, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building19.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding19.hide();
        });
        
        // Neighbourhood_1 : BLOCK 7
        Rectangle Building20 = new Rectangle(625, 80, 35, 35);
        Building20.setArcHeight(25);
        Building20.setArcWidth(25);
        Building20.setFill(Color.GREY);
        Tooltip tooltipBuilding20 = new Tooltip("Building Number: 20");
        Tooltip.install(Building20, tooltipBuilding20); 
        Building20.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building20.contains(event.getX(), event.getY())) {
                tooltipBuilding20.show(Building20, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building20.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding20.hide();
        });
        
        Rectangle Building21 = new Rectangle(680, 80, 35, 35);
        Building21.setArcHeight(25);
        Building21.setArcWidth(25);
        Building21.setFill(Color.GREY);
         Tooltip tooltipBuilding21 = new Tooltip("Building Number: 21");
        Tooltip.install(Building21, tooltipBuilding21); 
        Building21.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building21.contains(event.getX(), event.getY())) {
                tooltipBuilding21.show(Building21, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building21.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding21.hide();
        });
        
        Rectangle Building22 = new Rectangle(740, 80, 35, 35);
        Building22.setArcHeight(25);
        Building22.setArcWidth(25);
        Building22.setFill(Color.GREY);
        Tooltip tooltipBuilding22 = new Tooltip("Building Number: 22");
        Tooltip.install(Building22, tooltipBuilding22); 
        Building22.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building22.contains(event.getX(), event.getY())) {
                tooltipBuilding22.show(Building22, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building22.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding22.hide();
        });
        
        Rectangle Building23 = new Rectangle(800, 80, 35, 35);
        Building23.setArcHeight(25);
        Building23.setArcWidth(25);
        Building23.setFill(Color.GREY);
        Tooltip tooltipBuilding23 = new Tooltip("Building Number: 23");
        Tooltip.install(Building23, tooltipBuilding23); 
        Building23.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building23.contains(event.getX(), event.getY())) {
                tooltipBuilding23.show(Building23, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building23.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding23.hide();
        });
        
        // Neighbourhood_1 : BLOCK 8
        Rectangle Building24 = new Rectangle(875, 80, 35, 35);
        Building24.setArcHeight(25);
        Building24.setArcWidth(25);
        Building24.setFill(Color.GREY);
        Tooltip tooltipBuilding24 = new Tooltip("Building Number: 24");
        Tooltip.install(Building24, tooltipBuilding24); 
        Building24.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building24.contains(event.getX(), event.getY())) {
                tooltipBuilding24.show(Building24, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building24.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding24.hide();
        });
        
        Rectangle Building25 = new Rectangle(950, 80, 35, 35);
        Building25.setArcHeight(25);
        Building25.setArcWidth(25);
        Building25.setFill(Color.GREY);
        Tooltip tooltipBuilding25 = new Tooltip("Building Number: 25");
        Tooltip.install(Building25, tooltipBuilding25); 
        Building25.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building25.contains(event.getX(), event.getY())) {
                tooltipBuilding25.show(Building25, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building25.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding25.hide();
        });
        
        Rectangle Building26 = new Rectangle(1020, 80, 35, 35);
        Building26.setArcHeight(25);
        Building26.setArcWidth(25);
        Building26.setFill(Color.GREY);
        Tooltip tooltipBuilding26 = new Tooltip("Building Number: 26");
        Tooltip.install(Building26, tooltipBuilding26); 
        Building26.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building26.contains(event.getX(), event.getY())) {
                tooltipBuilding26.show(Building26, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building26.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding26.hide();
        });
        
        // Neighbourhood_1 : BLOCK 9
        Rectangle Building27 = new Rectangle(50, 150, 35, 35);
        Building27.setArcHeight(25);
        Building27.setArcWidth(25);
        Building27.setFill(Color.GREY);
        Tooltip tooltipBuilding27 = new Tooltip("Building Number: 27");
        Tooltip.install(Building27, tooltipBuilding27); 
        Building27.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building27.contains(event.getX(), event.getY())) {
                tooltipBuilding27.show(Building27, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building27.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding27.hide();
        });
        
        Rectangle Building28 = new Rectangle(160, 150, 35, 35);
        Building28.setArcHeight(25);
        Building28.setArcWidth(25);
        Building28.setFill(Color.GREY);
        Tooltip tooltipBuilding28 = new Tooltip("Building Number: 28");
        Tooltip.install(Building28, tooltipBuilding28); 
        Building28.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building28.contains(event.getX(), event.getY())) {
                tooltipBuilding28.show(Building28, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building28.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding28.hide();
        });
        
        
        Rectangle Building29 = new Rectangle(270, 150, 35, 35);
        Building29.setArcHeight(25);
        Building29.setArcWidth(25);
        Building29.setFill(Color.GREY);
        Tooltip tooltipBuilding29 = new Tooltip("Building Number: 29");
        Tooltip.install(Building29, tooltipBuilding29); 
        Building29.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building29.contains(event.getX(), event.getY())) {
                tooltipBuilding29.show(Building29, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building29.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding29.hide();
        });
        
        
        // Neighbourhood_1 : BLOCK 10
        
        Rectangle Building30 = new Rectangle(350, 150, 35, 35);
        Building30.setArcHeight(25);
        Building30.setArcWidth(25);
        Building30.setFill(Color.GREY);
         Tooltip tooltipBuilding30 = new Tooltip("Building Number: 30");
        Tooltip.install(Building30, tooltipBuilding30); 
        Building30.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building30.contains(event.getX(), event.getY())) {
                tooltipBuilding30.show(Building30, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building30.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding30.hide();
        });
        
        Rectangle Building31 = new Rectangle(425, 150, 35, 35);
        Building31.setArcHeight(25);
        Building31.setArcWidth(25);
        Building31.setFill(Color.GREY);
        Tooltip tooltipBuilding31 = new Tooltip("Building Number: 31");
        Tooltip.install(Building31, tooltipBuilding31); 
        Building31.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building31.contains(event.getX(), event.getY())) {
                tooltipBuilding31.show(Building31, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building31.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding31.hide();
        });
        
        Rectangle Building32 = new Rectangle(490, 150, 35, 35);
        Building32.setArcHeight(25);
        Building32.setArcWidth(25);
        Building32.setFill(Color.GREY);
        // Tooltip tooltipBuilding32 = new Tooltip(MainProgram.package6.getPackageInformation());
        // Tooltip.install(Building32, tooltipBuilding32);
        
        
        // Building32.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building32.contains(event.getX(), event.getY())) {
        //         tooltipBuilding32.show(Building32, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building32.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding32.hide();
        // });
        
        Rectangle Building33 = new Rectangle(550, 150, 35, 35);
        Building33.setArcHeight(25);
        Building33.setArcWidth(25);
        Building33.setFill(Color.GREY);
         Tooltip tooltipBuilding33 = new Tooltip("Building Number: 33");
        Tooltip.install(Building33, tooltipBuilding33); 
        Building33.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building33.contains(event.getX(), event.getY())) {
                tooltipBuilding33.show(Building33, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building33.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding33.hide();
        });
        
        
        // Neighbourhood_1 : BLOCK 11
        
        Rectangle Building34 = new Rectangle(630, 150, 35, 35);
        Building34.setArcHeight(25);
        Building34.setArcWidth(25);
        Building34.setFill(Color.GREY);
         Tooltip tooltipBuilding34 = new Tooltip("Building Number: 34");
        Tooltip.install(Building34, tooltipBuilding34); 
        Building34.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building34.contains(event.getX(), event.getY())) {
                tooltipBuilding34.show(Building34, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building34.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding34.hide();
        });
        
        Rectangle Building35 = new Rectangle(710, 150, 35, 35);
        Building35.setArcHeight(25);
        Building35.setArcWidth(25);
        Building35.setFill(Color.GREY);
         Tooltip tooltipBuilding35 = new Tooltip("Building Number: 35");
        Tooltip.install(Building35, tooltipBuilding35); 
        Building35.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building35.contains(event.getX(), event.getY())) {
                tooltipBuilding35.show(Building35, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building35.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding35.hide();
        });
        
        Rectangle Building36 = new Rectangle(790, 150, 35, 35);
        Building36.setArcHeight(25);
        Building36.setArcWidth(25);
        Building36.setFill(Color.GREY);
        Tooltip tooltipBuilding36 = new Tooltip("Building Number: 36");
        Tooltip.install(Building36, tooltipBuilding36); 
        Building36.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building36.contains(event.getX(), event.getY())) {
                tooltipBuilding36.show(Building36, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building36.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding36.hide();
        });
          
       // Neighbourhood_1 : BLOCK 12
       
        Rectangle Building37 = new Rectangle(870, 150, 35, 35);
        Building37.setArcHeight(25);
        Building37.setArcWidth(25);
        Building37.setFill(Color.GREY);
        Tooltip tooltipBuilding37 = new Tooltip("Building Number: 37");
        Tooltip.install(Building37, tooltipBuilding37); 
        Building37.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building37.contains(event.getX(), event.getY())) {
                tooltipBuilding37.show(Building37, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building37.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding37.hide();
        });
        
        Rectangle Building38 = new Rectangle(920, 150, 35, 35);
        Building38.setArcHeight(25);
        Building38.setArcWidth(25);
        Building38.setFill(Color.GREY);
        Tooltip tooltipBuilding38 = new Tooltip("Building Number: 38");
        Tooltip.install(Building38, tooltipBuilding38); 
        Building38.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building38.contains(event.getX(), event.getY())) {
                tooltipBuilding38.show(Building38, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building38.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding38.hide();
        });
        
        Rectangle Building39 = new Rectangle(970, 150, 35, 35);
        Building39.setArcHeight(25);
        Building39.setArcWidth(25);
        Building39.setFill(Color.GREY);
         Tooltip tooltipBuilding39 = new Tooltip("Building Number: 39");
        Tooltip.install(Building39, tooltipBuilding39); 
        Building39.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building39.contains(event.getX(), event.getY())) {
                tooltipBuilding39.show(Building39, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building39.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding39.hide();
        });
        
        Rectangle Building40 = new Rectangle(1020, 150, 35, 35);
        Building40.setArcHeight(25);
        Building40.setArcWidth(25);
        Building40.setFill(Color.GREY);
         Tooltip tooltipBuilding40 = new Tooltip("Building Number: 40");
        Tooltip.install(Building40, tooltipBuilding40); 
        Building40.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building40.contains(event.getX(), event.getY())) {
                tooltipBuilding40.show(Building40, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building40.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding40.hide();
        });
        
        // Neighbourhood_1 : BLOCK 13 
        
        Rectangle Building41 = new Rectangle(50, 215, 35, 35);
        Building41.setArcHeight(25);
        Building41.setArcWidth(25);
        Building41.setFill(Color.GREY);
         Tooltip tooltipBuilding41 = new Tooltip("Building Number: 41");
        Tooltip.install(Building41, tooltipBuilding41); 
        Building41.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building41.contains(event.getX(), event.getY())) {
                tooltipBuilding41.show(Building41, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building41.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding41.hide();
        });
        
        Rectangle Building42 = new Rectangle(165, 215, 35, 35);
        Building42.setArcHeight(25);
        Building42.setArcWidth(25);
        Building42.setFill(Color.GREY);
        // Tooltip tooltipBuilding42 = new Tooltip(MainProgram.package14.getPackageInformation());
        // Tooltip.install(Building42, tooltipBuilding42);
        
        // Building42.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building42.contains(event.getX(), event.getY())) {
        //         tooltipBuilding42.show(Building42, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building42.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding42.hide();
        // });
        
        Rectangle Building43 = new Rectangle(270, 215, 35, 35);
        Building43.setArcHeight(25);
        Building43.setArcWidth(25);
        Building43.setFill(Color.GREY);
         Tooltip tooltipBuilding43 = new Tooltip("Building Number: 43");
        Tooltip.install(Building43, tooltipBuilding43); 
        Building43.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building43.contains(event.getX(), event.getY())) {
                tooltipBuilding43.show(Building43, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building43.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding43.hide();
        });
        
        // Neighbourhood_1 : BLOCK 14 
        
        Rectangle Building44 = new Rectangle(360, 215, 35, 35);
        Building44.setArcHeight(25);
        Building44.setArcWidth(25);
        Building44.setHeight(35);
        Building44.setWidth(80);
        Building44.setFill(Color.GREY);
        // Tooltip tooltipBuilding44 = new Tooltip(MainProgram.package4.getPackageInformation());
        // Tooltip.install(Building44, tooltipBuilding44);
        
        // Building44.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building44.contains(event.getX(), event.getY())) {
        //         tooltipBuilding44.show(Building44, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building44.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding44.hide();
        // });
        
        Rectangle Building45 = new Rectangle(495, 215, 35, 35);
        Building45.setArcHeight(25);
        Building45.setArcWidth(25);
        Building45.setHeight(35);
        Building45.setWidth(80);
        Building45.setFill(Color.GREY);
         Tooltip tooltipBuilding45 = new Tooltip("Building Number: 45");
        Tooltip.install(Building45, tooltipBuilding45); 
        Building45.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building45.contains(event.getX(), event.getY())) {
                tooltipBuilding45.show(Building45, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building45.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding45.hide();
        });
        
        // Neighbourhood_1 : BLOCK 15 
        Rectangle Building46 = new Rectangle(620, 215, 35, 35);
        Building46 .setArcHeight(25);
        Building46.setArcWidth(25);
        Building46.setFill(Color.GREY);
        //  Tooltip tooltipBuilding46 = new Tooltip(MainProgram.package13.getPackageInformation());
        // Tooltip.install(Building46, tooltipBuilding46);
        
        // Building46.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building46.contains(event.getX(), event.getY())) {
        //         tooltipBuilding46.show(Building46, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building46.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding46.hide();
        // });
        
        Rectangle Building47 = new Rectangle(680, 215, 35, 35);
        Building47.setArcHeight(25);
        Building47.setArcWidth(25);
        Building47.setFill(Color.GREY);
         Tooltip tooltipBuilding47 = new Tooltip("Building Number: 47");
        Tooltip.install(Building47, tooltipBuilding47); 
        Building47.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building47.contains(event.getX(), event.getY())) {
                tooltipBuilding47.show(Building47, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building47.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding47.hide();
        });
        
        
        Rectangle Building48 = new Rectangle(740, 215, 35, 35);
        Building48.setArcHeight(25);
        Building48.setArcWidth(25);
        Building48.setFill(Color.GREY);
        Tooltip tooltipBuilding48 = new Tooltip("Building Number: 48");
        Tooltip.install(Building48, tooltipBuilding48); 
        Building48.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building48.contains(event.getX(), event.getY())) {
                tooltipBuilding48.show(Building48, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building48.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding48.hide();
        });
        
        Rectangle Building49 = new Rectangle(800, 215, 35, 35);
        Building49.setArcHeight(25);
        Building49.setArcWidth(25);
        Building49.setFill(Color.GREY);
        Tooltip tooltipBuilding49 = new Tooltip("Building Number: 49");
        Tooltip.install(Building49, tooltipBuilding49); 
        Building49.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building49.contains(event.getX(), event.getY())) {
                tooltipBuilding49.show(Building49, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building49.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding49.hide();
        });
        
        // Neighbourhood_1 : BLOCK 16
        Rectangle Building50 = new Rectangle(880, 215, 35, 35);
        Building50.setArcHeight(25);
        Building50.setArcWidth(25);
        Building50.setFill(Color.GREY);
         Tooltip tooltipBuilding50 = new Tooltip("Building Number: 50");
        Tooltip.install(Building50, tooltipBuilding50); 
        Building50.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building50.contains(event.getX(), event.getY())) {
                tooltipBuilding50.show(Building50, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building50.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding50.hide();
        });
        
        Rectangle Building51 = new Rectangle(950, 215, 35, 35);
        Building51.setArcHeight(25);
        Building51.setArcWidth(25);
        Building51.setFill(Color.GREY);
         Tooltip tooltipBuilding51 = new Tooltip("Building Number: 51");
        Tooltip.install(Building51, tooltipBuilding51); 
        Building51.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building51.contains(event.getX(), event.getY())) {
                tooltipBuilding51.show(Building51, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building51.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding51.hide();
        });
        
        Rectangle Building52 = new Rectangle(1010, 215, 35, 35);
        Building52.setArcHeight(25);
        Building52.setArcWidth(25);
        Building52.setFill(Color.GREY);
        // Tooltip tooltipBuilding52 = new Tooltip(MainProgram.package8.getPackageInformation());
        // Tooltip.install(Building52, tooltipBuilding52);
        
        // Building52.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building52.contains(event.getX(), event.getY())) {
        //         tooltipBuilding52.show(Building52, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building52.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding52.hide();
        // });
        
        // Neighbourhood 2 ( from Building 53 to Building 91 ) with 12 blocks :
        
        Text Neighbourhood_2 = new Text(1090, 450, "Almanar");
        Neighbourhood_2.setFont(font);
        Neighbourhood_2.setFill(Color.BLUE);
        Neighbourhood_2.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 1
        Rectangle Building53 = new Rectangle(50, 280, 35, 35);
        Building53.setArcHeight(25);
        Building53.setArcWidth(25);
        Building53.setFill(Color.BLUE);
        Tooltip tooltipBuilding53 = new Tooltip("Building Number: 53");
        Tooltip.install(Building53, tooltipBuilding53); 
        Building53.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building53.contains(event.getX(), event.getY())) {
                tooltipBuilding53.show(Building53, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building53.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding53.hide();
        });
        
        Rectangle Building54 = new Rectangle(125, 280, 35, 35);
        Building54.setArcHeight(25);
        Building54.setArcWidth(25);
        Building54.setFill(Color.BLUE);
        Tooltip tooltipBuilding54 = new Tooltip("Building Number: 54");
        Tooltip.install(Building54, tooltipBuilding54); 
        Building54.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building54.contains(event.getX(), event.getY())) {
                tooltipBuilding54.show(Building54, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building54.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding54.hide();
        });
        
        Rectangle Building55 = new Rectangle(200, 280, 35, 35);
        Building55.setArcHeight(25);
        Building55.setArcWidth(25);
        Building55.setFill(Color.BLUE);
        Tooltip tooltipBuilding55 = new Tooltip("Building Number: 55");
        Tooltip.install(Building55, tooltipBuilding55); 
        Building55.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building55.contains(event.getX(), event.getY())) {
                tooltipBuilding55.show(Building55, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building55.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding55.hide();
        });
        
        Rectangle Building56 = new Rectangle(270, 280, 35, 35);
        Building56.setArcHeight(25);
        Building56.setArcWidth(25);
        Building56.setFill(Color.BLUE);
        Tooltip tooltipBuilding56 = new Tooltip("Building Number: 56");
        Tooltip.install(Building56, tooltipBuilding56); 
        Building56.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building56.contains(event.getX(), event.getY())) {
                tooltipBuilding56.show(Building56, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building56.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding56.hide();
        });
        
        // Neighbourhood_2 : BLOCK 2
        
        Rectangle Building57 = new Rectangle(370, 280, 35, 35);
        Building57.setArcHeight(25);
        Building57.setArcWidth(25);
        Building57.setFill(Color.BLUE);
        Tooltip tooltipBuilding57 = new Tooltip("Building Number: 57");
        Tooltip.install(Building57, tooltipBuilding57); 
        Building57.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building57.contains(event.getX(), event.getY())) {
                tooltipBuilding57.show(Building57, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building57.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding57.hide();
        });
        
        Rectangle Building58 = new Rectangle(460, 280, 35, 35);
        Building58.setArcHeight(25);
        Building58.setArcWidth(25);
        Building58.setFill(Color.BLUE);
        Tooltip tooltipBuilding58 = new Tooltip("Building Number: 58");
        Tooltip.install(Building58, tooltipBuilding58); 
        Building58.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building58.contains(event.getX(), event.getY())) {
                tooltipBuilding58.show(Building58, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building58.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding58.hide();
        });
        
        Rectangle Building59 = new Rectangle(540, 280, 35, 35);
        Building59.setArcHeight(25);
        Building59.setArcWidth(25);
        Building59.setFill(Color.BLUE);
        Tooltip tooltipBuilding59 = new Tooltip("Building Number: 59");
        Tooltip.install(Building59, tooltipBuilding59); 
        Building59.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building59.contains(event.getX(), event.getY())) {
                tooltipBuilding59.show(Building59, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building59.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding59.hide();
        });
        
        // Neighbourhood_2 : BLOCK 3 :
        
        Rectangle Building60 = new Rectangle(630, 280, 35, 35);
        Building60 .setArcHeight(25);
        Building60.setArcWidth(25);
        Building60.setFill(Color.BLUE);
        Tooltip tooltipBuilding60 = new Tooltip("Building Number: 60");
        Tooltip.install(Building60, tooltipBuilding60); 
        Building60.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building60.contains(event.getX(), event.getY())) {
                tooltipBuilding60.show(Building60, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building60.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding60.hide();
        });
        
        
        Rectangle Building61 = new Rectangle(690, 280, 35, 35);
        Building61.setArcHeight(25);
        Building61.setArcWidth(25);
        Building61.setFill(Color.BLUE);
        Tooltip tooltipBuilding61 = new Tooltip("Building Number: 61");
        Tooltip.install(Building61, tooltipBuilding61); 
        Building61.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building61.contains(event.getX(), event.getY())) {
                tooltipBuilding61.show(Building61, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building61.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding61.hide();
        });
        
        Rectangle Building62 = new Rectangle(750, 280, 35, 35);
        Building62.setArcHeight(25);
        Building62.setArcWidth(25);
        Building62.setFill(Color.BLUE);
        Tooltip tooltipBuilding62 = new Tooltip("Building Number: 62");
        Tooltip.install(Building62, tooltipBuilding62); 
        Building62.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building62.contains(event.getX(), event.getY())) {
                tooltipBuilding62.show(Building62, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building62.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding62.hide();
        });
        
        Rectangle Building63 = new Rectangle(810, 280, 35, 35);
        Building63.setArcHeight(25);
        Building63.setArcWidth(25);
        Building63.setFill(Color.BLUE);
          Tooltip tooltipBuilding63 = new Tooltip("Building Number: 63");
        Tooltip.install(Building63, tooltipBuilding63); 
        Building63.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building63.contains(event.getX(), event.getY())) {
                tooltipBuilding63.show(Building63, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building63.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding63.hide();
        });
        
        // Neighbourhood_2 : BLOCK 4
        
        Rectangle Building64 = new Rectangle(890, 280, 35, 35);
        Building64.setArcHeight(25);
        Building64.setArcWidth(25);
        Building64.setHeight(35);
        Building64.setWidth(70);
        Building64.setFill(Color.BLUE);
          Tooltip tooltipBuilding64 = new Tooltip("Building Number: 64");
        Tooltip.install(Building64, tooltipBuilding64); 
        Building64.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building64.contains(event.getX(), event.getY())) {
                tooltipBuilding64.show(Building64, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building64.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding64.hide();
        });
        
        
        Rectangle Building65 = new Rectangle(980, 280, 35, 35);
        Building65.setArcHeight(25);
        Building65.setArcWidth(25);
        Building65.setHeight(35);
        Building65.setWidth(70);
        Building65.setFill(Color.BLUE);
        Tooltip tooltipBuilding65 = new Tooltip("Building Number: 65");
        Tooltip.install(Building65, tooltipBuilding65); 
        Building65.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building65.contains(event.getX(), event.getY())) {
                tooltipBuilding65.show(Building65, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building65.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding65.hide();
        });
        
        // Neighbourhood_2 : BLOCK 5
        Rectangle Building66 = new Rectangle(50, 345, 35, 35);
        Building66.setArcHeight(25);
        Building66.setArcWidth(25);
        Building66.setFill(Color.BLUE);
        Tooltip tooltipBuilding66 = new Tooltip("Building Number: 66");
        Tooltip.install(Building66, tooltipBuilding66); 
        Building66.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building66.contains(event.getX(), event.getY())) {
                tooltipBuilding66.show(Building66, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building66.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding66.hide();
        });
        
        Rectangle Building67 = new Rectangle(125, 345, 35, 35);
        Building67.setArcHeight(25);
        Building67.setArcWidth(25);
        Building67.setFill(Color.BLUE);
        // Tooltip tooltipBuilding67 = new Tooltip(MainProgram.package16.getPackageInformation());
        // Tooltip.install(Building67, tooltipBuilding67);
        
        // Building67.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building67.contains(event.getX(), event.getY())) {
        //         tooltipBuilding67.show(Building67, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building67.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding67.hide();
        // });
        
        Rectangle Building68 = new Rectangle(200, 345, 35, 35);
        Building68.setArcHeight(25);
        Building68.setArcWidth(25);
        Building68.setFill(Color.BLUE);
        Tooltip tooltipBuilding68 = new Tooltip("Building Number: 68");
        Tooltip.install(Building68, tooltipBuilding68); 
        Building68.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building68.contains(event.getX(), event.getY())) {
                tooltipBuilding68.show(Building68, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building68.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding68.hide();
        });
        
        Rectangle Building69 = new Rectangle(270, 345, 35, 35);
        Building69.setArcHeight(25);
        Building69.setArcWidth(25);
        Building69.setFill(Color.BLUE);
        Tooltip tooltipBuilding69 = new Tooltip("Building Number: 69");
        Tooltip.install(Building69, tooltipBuilding69); 
        Building69.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building69.contains(event.getX(), event.getY())) {
                tooltipBuilding69.show(Building69, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building69.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding69.hide();
        });
        
        // Neighbourhood_2 : BLOCK 6
        
        Rectangle Building70 = new Rectangle(370, 345, 35, 35);
        Building70.setArcHeight(25);
        Building70.setArcWidth(25);
        Building70.setFill(Color.BLUE);
        
        // Tooltip tooltipBuilding70 = new Tooltip(MainProgram.package3.getPackageInformation());
        // Tooltip.install(Building70, tooltipBuilding70);
        
        // Building70.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building70.contains(event.getX(), event.getY())) {
        //         tooltipBuilding70.show(Building70, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building70.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding70.hide();
        // });
        
        Rectangle Building71 = new Rectangle(460, 345, 35, 35);
        Building71.setArcHeight(25);
        Building71.setArcWidth(25);
        Building71.setFill(Color.BLUE);
        Tooltip tooltipBuilding71 = new Tooltip("Building Number: 71");
        Tooltip.install(Building71, tooltipBuilding71); 
        Building71.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building71.contains(event.getX(), event.getY())) {
                tooltipBuilding71.show(Building71, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building71.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding71.hide();
        });
        
        Rectangle Building72 = new Rectangle(540, 345, 35, 35);
        Building72.setArcHeight(25);
        Building72.setArcWidth(25);
        Building72.setFill(Color.BLUE);
         Tooltip tooltipBuilding72 = new Tooltip("Building Number: 72");
        Tooltip.install(Building72, tooltipBuilding72); 
        Building72.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building72.contains(event.getX(), event.getY())) {
                tooltipBuilding72.show(Building72, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building72.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding72.hide();
        });
        
        // Neighbourhood_2 : BLOCK 7
        
        Rectangle Building73 = new Rectangle(630, 345, 35, 35);
        Building73.setArcHeight(25);
        Building73.setArcWidth(25);
        Building73.setFill(Color.BLUE);
         Tooltip tooltipBuilding73 = new Tooltip("Building Number: 73");
        Tooltip.install(Building73, tooltipBuilding73); 
        Building73.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building73.contains(event.getX(), event.getY())) {
                tooltipBuilding73.show(Building73, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building73.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding73.hide();
        });
        
        
        Rectangle Building74 = new Rectangle(690, 345, 35, 35);
        Building74.setArcHeight(25);
        Building74.setArcWidth(25);
        Building74.setFill(Color.BLUE);
        // Tooltip tooltipBuilding74 = new Tooltip(MainProgram.package12.getPackageInformation());
        // Tooltip.install(Building74, tooltipBuilding74);
        
        // Building74.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building74.contains(event.getX(), event.getY())) {
        //         tooltipBuilding74.show(Building74, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building74.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding74.hide();
        // });
        
        Rectangle Building75 = new Rectangle(750, 345, 35, 35);
        Building75.setArcHeight(25);
        Building75.setArcWidth(25);
        Building75.setFill(Color.BLUE);
        Tooltip tooltipBuilding75 = new Tooltip("Building Number: 75");
        Tooltip.install(Building75, tooltipBuilding75); 
        Building75.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building75.contains(event.getX(), event.getY())) {
                tooltipBuilding75.show(Building75, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building75.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding75.hide();
        });
        
        Rectangle Building76 = new Rectangle(810, 345, 35, 35);
        Building76.setArcHeight(25);
        Building76.setArcWidth(25);
        Building76.setFill(Color.BLUE);
        Tooltip tooltipBuilding76 = new Tooltip("Building Number: 76");
        Tooltip.install(Building76, tooltipBuilding76); 
        Building76.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building76.contains(event.getX(), event.getY())) {
                tooltipBuilding76.show(Building76, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building76.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding76.hide();
        });
        
        // Neighbourhood_2 : BLOCK 8
        
        Rectangle Building77 = new Rectangle(880, 345, 35, 35);
        Building77.setArcHeight(25);
        Building77.setArcWidth(25);
        Building77.setFill(Color.BLUE);
        Tooltip tooltipBuilding77 = new Tooltip("Building Number: 77");
        Tooltip.install(Building77, tooltipBuilding77); 
        Building77.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building77.contains(event.getX(), event.getY())) {
                tooltipBuilding77.show(Building77, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building77.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding77.hide();
        });
        
        Rectangle Building78 = new Rectangle(950, 345, 35, 35);
        Building78.setArcHeight(25);
        Building78.setArcWidth(25);
        Building78.setFill(Color.BLUE);
        Tooltip tooltipBuilding78 = new Tooltip("Building Number: 78");
        Tooltip.install(Building78, tooltipBuilding78); 
        Building78.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building78.contains(event.getX(), event.getY())) {
                tooltipBuilding78.show(Building78, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building78.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding78.hide();
        });
        
        Rectangle Building79 = new Rectangle(1010, 345, 35, 35);
        Building79.setArcHeight(25);
        Building79.setArcWidth(25);
        Building79.setFill(Color.BLUE);
        // Tooltip tooltipBuilding79 = new Tooltip(MainProgram.package11.getPackageInformation());
        // Tooltip.install(Building79, tooltipBuilding79);
        
        // Building79.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building79.contains(event.getX(), event.getY())) {
        //         tooltipBuilding79.show(Building79, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building79.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding79.hide();
        // });
        
        // Neighbourhood_2 : BLOCK 9
        Rectangle Building80 = new Rectangle(50, 410, 35, 35);
        Building80.setArcHeight(25);
        Building80.setArcWidth(25);
        Building80.setFill(Color.BLUE);
        //  Tooltip tooltipBuilding80 = new Tooltip(MainProgram.package17.getPackageInformation());
        // Tooltip.install(Building80, tooltipBuilding80);
        
        // Building80.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building80.contains(event.getX(), event.getY())) {
        //         tooltipBuilding80.show(Building80, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building80.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding80.hide();
        // });
        
        Rectangle Building81 = new Rectangle(165, 410, 35, 35);
        Building81.setArcHeight(25);
        Building81.setArcWidth(25);
        Building81.setFill(Color.BLUE);
        Tooltip tooltipBuilding81 = new Tooltip("Building Number: 81");
        Tooltip.install(Building81, tooltipBuilding81); 
        Building81.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building81.contains(event.getX(), event.getY())) {
                tooltipBuilding81.show(Building81, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building81.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding81.hide();
        });
        
        
        
        Rectangle Building82 = new Rectangle(270, 410, 35, 35);
        Building82.setArcHeight(25);
        Building82.setArcWidth(25);
        Building82.setFill(Color.BLUE);
        Tooltip tooltipBuilding82 = new Tooltip("Building Number: 82");
        Tooltip.install(Building82, tooltipBuilding82); 
        Building82.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building82.contains(event.getX(), event.getY())) {
                tooltipBuilding82.show(Building82, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building82.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding82.hide();
        });
        
        // Neighbourhood_2 : BLOCK 10 
        Rectangle Building83 = new Rectangle(350, 410, 35, 35);
        Building83.setArcHeight(25);
        Building83.setArcWidth(25);
        Building83.setFill(Color.BLUE);
        Tooltip tooltipBuilding83 = new Tooltip("Building Number: 83");
        Tooltip.install(Building83, tooltipBuilding83); 
        Building83.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building83.contains(event.getX(), event.getY())) {
                tooltipBuilding83.show(Building83, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building83.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding83.hide();
        });
        
        Rectangle Building84 = new Rectangle(425, 410, 35, 35);
        Building84.setArcHeight(25);
        Building84.setArcWidth(25);
        Building84.setFill(Color.BLUE);
        Tooltip tooltipBuilding84 = new Tooltip("Building Number: 84");
        Tooltip.install(Building84, tooltipBuilding84); 
        Building84.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building84.contains(event.getX(), event.getY())) {
                tooltipBuilding84.show(Building84, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building84.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding84.hide();
        });
        
        Rectangle Building85 = new Rectangle(490, 410, 35, 35);
        Building85.setArcHeight(25);
        Building85.setArcWidth(25);
        Building85.setFill(Color.BLUE);
        Tooltip tooltipBuilding85 = new Tooltip("Building Number: 85");
        Tooltip.install(Building85, tooltipBuilding85); 
        Building85.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building85.contains(event.getX(), event.getY())) {
                tooltipBuilding85.show(Building85, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building85.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding85.hide();
        });
        
        
        Rectangle Building86 = new Rectangle(550, 410, 35, 35);
        Building86.setArcHeight(25);
        Building86.setArcWidth(25);
        Building86.setFill(Color.BLUE);
        Tooltip tooltipBuilding86 = new Tooltip("Building Number: 86");
        Tooltip.install(Building86, tooltipBuilding86); 
        Building86.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building86.contains(event.getX(), event.getY())) {
                tooltipBuilding86.show(Building86, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building86.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding86.hide();
        });
        
        // Neighbourhood_2 : BLOCK 11
        Rectangle Building87 = new Rectangle(640, 410, 35, 35);
        Building87.setArcHeight(25);
        Building87.setArcWidth(25);
        Building87.setHeight(35);
        Building87.setWidth(80);
        Building87.setFill(Color.BLUE);
        Tooltip tooltipBuilding87 = new Tooltip("Building Number: 87");
        Tooltip.install(Building87, tooltipBuilding87); 
        Building87.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building87.contains(event.getX(), event.getY())) {
                tooltipBuilding87.show(Building87, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building87.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding87.hide();
        });
        
        Rectangle Building88 = new Rectangle(760, 410, 35, 35);
        Building88.setArcHeight(25);
        Building88.setArcWidth(25);
        Building88.setHeight(35);
        Building88.setWidth(80);
        Building88.setFill(Color.BLUE);
        Tooltip tooltipBuilding88 = new Tooltip("Building Number: 88");
        Tooltip.install(Building88, tooltipBuilding88); 
        Building88.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building88.contains(event.getX(), event.getY())) {
                tooltipBuilding88.show(Building88, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building88.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding88.hide();
        });
        
        
        // Neighbourhood_2 : BLOCK 12 
        Rectangle Building89 = new Rectangle(880, 410, 35, 35);
        Building89.setArcHeight(25);
        Building89.setArcWidth(25);
        Building89.setFill(Color.BLUE);
        Tooltip tooltipBuilding89 = new Tooltip("Building Number: 89");
        Tooltip.install(Building89, tooltipBuilding89); 
        Building89.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building89.contains(event.getX(), event.getY())) {
                tooltipBuilding89.show(Building89, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building89.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding89.hide();
        });
        
        
        Rectangle Building90 = new Rectangle(950, 410, 35, 35);
        Building90.setArcHeight(25);
        Building90.setArcWidth(25);
        Building90.setFill(Color.BLUE);
        Tooltip tooltipBuilding90 = new Tooltip("Building Number: 90");
        Tooltip.install(Building90, tooltipBuilding90); 
        Building90.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building90.contains(event.getX(), event.getY())) {
                tooltipBuilding90.show(Building90, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building90.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding90.hide();
        });
        
        Rectangle Building91 = new Rectangle(1010, 410, 35, 35);
        Building91.setArcHeight(25);
        Building91.setArcWidth(25);
        Building91.setFill(Color.BLUE);
         Tooltip tooltipBuilding91 = new Tooltip("Building Number: 91");
        Tooltip.install(Building91, tooltipBuilding91); 
        Building91.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building91.contains(event.getX(), event.getY())) {
                tooltipBuilding91.show(Building91, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building91.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding91.hide();
        });
        
        // Neighbourhood 3 ( from Building 92 to Building 133  ) with 12 blocks include Warehouse :
        Text Neighbourhood_3 = new Text(1090, 630, "AlRabwah");
        Neighbourhood_3.setFont(font);
        Neighbourhood_3.setFill(Color.web("#C0392B"));
        
        // Neighbourhood_3 : BLOCK 1
        Rectangle Building92 = new Rectangle(50, 475, 35, 35);
        Building92.setArcHeight(25);
        Building92.setArcWidth(25);
        Building92.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding92 = new Tooltip("Building Number: 92");
        Tooltip.install(Building92, tooltipBuilding92); 
        Building92.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building92.contains(event.getX(), event.getY())) {
                tooltipBuilding92.show(Building92, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building92.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding92.hide();
        });
        
        Rectangle Building93 = new Rectangle(125, 475, 35, 35);
        Building93.setArcHeight(25);
        Building93.setArcWidth(25);
        Building93.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding93 = new Tooltip("Building Number: 93");
        Tooltip.install(Building93, tooltipBuilding93); 
        Building93.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building93.contains(event.getX(), event.getY())) {
                tooltipBuilding93.show(Building93, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building93.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding93.hide();
        });
        
        Rectangle Building94 = new Rectangle(200, 475, 35, 35);
        Building94.setArcHeight(25);
        Building94.setArcWidth(25);
        Building94.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding94 = new Tooltip("Building Number: 94");
        Tooltip.install(Building94, tooltipBuilding94); 
        Building94.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building94.contains(event.getX(), event.getY())) {
                tooltipBuilding94.show(Building94, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building94.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding94.hide();
        });

        
        Rectangle Building95 = new Rectangle(270, 475, 35, 35);
        Building95.setArcHeight(25);
        Building95.setArcWidth(25);
        Building95.setFill(Color.web("#C0392B"));
          Tooltip tooltipBuilding95 = new Tooltip("Building Number: 95");
        Tooltip.install(Building95, tooltipBuilding95); 
        Building95.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building95.contains(event.getX(), event.getY())) {
                tooltipBuilding95.show(Building95, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building95.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding95.hide();
        });
        
        // Neighbourhood_3 : BLOCK 2
        Rectangle Building96 = new Rectangle(370, 475, 35, 35);
        Building96.setArcHeight(25);
        Building96.setArcWidth(25);
        Building96.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding96 = new Tooltip("Building Number: 96");
        Tooltip.install(Building96, tooltipBuilding96); 
        Building96.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building96.contains(event.getX(), event.getY())) {
                tooltipBuilding96.show(Building96, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building96.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding96.hide();
        });
        
        Rectangle Building97 = new Rectangle(460, 475, 35, 35);
        Building97.setArcHeight(25);
        Building97.setArcWidth(25);
        Building97.setFill(Color.web("#C0392B"));
        // Tooltip tooltipBuilding97 = new Tooltip(MainProgram.package15.getPackageInformation());
        // Tooltip.install(Building97, tooltipBuilding97);
        
        
        // Building97.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building97.contains(event.getX(), event.getY())) {
        //         tooltipBuilding97.show(Building97, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building97.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding97.hide();
        // });
        
        
        Rectangle Building98 = new Rectangle(540, 475, 35, 35);
        Building98.setArcHeight(25);
        Building98.setArcWidth(25);
        Building98.setFill(Color.web("#C0392B"));
         Tooltip tooltipBuilding98 = new Tooltip("Building Number: 98");
        Tooltip.install(Building98, tooltipBuilding98); 
        Building98.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building98.contains(event.getX(), event.getY())) {
                tooltipBuilding98.show(Building98, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building98.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding98.hide();
        });
        
        
        // Neighbourhood_3 : BLOCK 3
        Rectangle Building99 = new Rectangle(630, 475, 35, 35);
        Building99.setArcHeight(25);
        Building99.setArcWidth(25);
        Building99.setFill(Color.web("#C0392B"));
         Tooltip tooltipBuilding99 = new Tooltip("Building Number: 99");
        Tooltip.install(Building99, tooltipBuilding99); 
        Building99.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building99.contains(event.getX(), event.getY())) {
                tooltipBuilding99.show(Building99, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building99.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding99.hide();
        });
        
        Rectangle Building100 = new Rectangle(690, 475, 35, 35);
        Building100.setArcHeight(25);
        Building100.setArcWidth(25);
        Building100.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding100 = new Tooltip("Building Number: 100");
        Tooltip.install(Building100, tooltipBuilding100); 
        Building100.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building100.contains(event.getX(), event.getY())) {
                tooltipBuilding100.show(Building100, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building100.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding100.hide();
        });
        
        Rectangle Building101 = new Rectangle(750, 475, 35, 35);
        Building101.setArcHeight(25);
        Building101.setArcWidth(25);
        Building101.setFill(Color.web("#C0392B"));
        // Tooltip tooltipBuilding101 = new Tooltip(MainProgram.package10.getPackageInformation());
        // Tooltip.install(Building101, tooltipBuilding101);
        
        // Building101.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building101.contains(event.getX(), event.getY())) {
        //         tooltipBuilding101.show(Building101, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building101.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding101.hide();
        // });
        
        Rectangle Building102 = new Rectangle(810, 475, 35, 35);
        Building102.setArcHeight(25);
        Building102.setArcWidth(25);
        Building102.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding102 = new Tooltip("Building Number: 102");
        Tooltip.install(Building102, tooltipBuilding102); 
        Building102.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building102.contains(event.getX(), event.getY())) {
                tooltipBuilding102.show(Building102, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building102.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding102.hide();
        });
        
        // Neighbourhood_3 : BLOCK 4
        Rectangle Building103 = new Rectangle(890, 475, 35, 35);
        Building103.setArcHeight(25);
        Building103.setArcWidth(25);
        Building103.setFill(Color.web("#C0392B"));
        // Tooltip tooltipBuilding103 = new Tooltip(MainProgram.package2.getPackageInformation());
        // Tooltip.install(Building103, tooltipBuilding103);
        
        // Building103.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building103.contains(event.getX(), event.getY())) {
        //         tooltipBuilding103.show(Building103, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building103.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding103.hide();
        // });
        
        Rectangle Building104 = new Rectangle(960, 475, 35, 35);
        Building104.setArcHeight(25);
        Building104.setArcWidth(25);
        Building104.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding104 = new Tooltip("Building Number: 104");
        Tooltip.install(Building104, tooltipBuilding104); 
        Building104.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building104.contains(event.getX(), event.getY())) {
                tooltipBuilding104.show(Building104, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building104.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding104.hide();
        });
        
        Rectangle Building105 = new Rectangle(1020, 475, 35, 35);
        Building105.setArcHeight(25);
        Building105.setArcWidth(25);
        Building105.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding105 = new Tooltip("Building Number: 105");
        Tooltip.install(Building105, tooltipBuilding105); 
        Building105.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building105.contains(event.getX(), event.getY())) {
                tooltipBuilding105.show(Building105, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building105.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding105.hide();
        });
        
        // Neighbourhood_3 : BLOCK 5
        Rectangle Building106 = new Rectangle(50, 540, 35, 35);
        Building106.setArcHeight(25);
        Building106.setArcWidth(25);
        Building106.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding106 = new Tooltip("Building Number: 106");
        Tooltip.install(Building106, tooltipBuilding106); 
        Building106.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building106.contains(event.getX(), event.getY())) {
                tooltipBuilding106.show(Building106, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building106.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding106.hide();
        });
        
        Rectangle Building107 = new Rectangle(125, 540, 35, 35);
        Building107.setArcHeight(25);
        Building107.setArcWidth(25);
        Building107.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding107 = new Tooltip("Building Number: 107");
        Tooltip.install(Building107, tooltipBuilding107); 
        Building107.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building107.contains(event.getX(), event.getY())) {
                tooltipBuilding107.show(Building107, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building107.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding107.hide();
        });
        
        
        Rectangle Building108 = new Rectangle(200, 540, 35, 35);
        Building108.setArcHeight(25);
        Building108.setArcWidth(25);
        Building108.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding108 = new Tooltip("Building Number: 108");
        Tooltip.install(Building108, tooltipBuilding108); 
        Building108.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building108.contains(event.getX(), event.getY())) {
                tooltipBuilding108.show(Building108, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building108.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding108.hide();
        });
        
        Rectangle Building109 = new Rectangle(270, 540, 35, 35);
        Building109.setArcHeight(25);
        Building109.setArcWidth(25);
        Building109.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding109 = new Tooltip("Building Number: 109");
        Tooltip.install(Building109, tooltipBuilding109); 
        Building109.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building109.contains(event.getX(), event.getY())) {
                tooltipBuilding109.show(Building109, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building109.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding109.hide();
        });
        
        // Neighbourhood_3 : BLOCK 6
        Rectangle Building110 = new Rectangle(355, 540, 35, 35);
        Building110.setArcHeight(25);
        Building110.setArcWidth(25);
        Building110.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding110 = new Tooltip("Building Number: 110");
        Tooltip.install(Building110, tooltipBuilding110); 
        Building110.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building110.contains(event.getX(), event.getY())) {
                tooltipBuilding110.show(Building110, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building110.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding110.hide();
        });
        
        Rectangle Building111 = new Rectangle(425, 540, 35, 35);
        Building111.setArcHeight(25);
        Building111.setArcWidth(25);
        Building111.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding111 = new Tooltip("Building Number: 111");
        Tooltip.install(Building111, tooltipBuilding111); 
        Building111.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building111.contains(event.getX(), event.getY())) {
                tooltipBuilding111.show(Building111, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building111.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding111.hide();
        });
        
        Rectangle Building112 = new Rectangle(490, 540, 35, 35);
        Building112.setArcHeight(25);
        Building112.setArcWidth(25);
        Building112.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding112 = new Tooltip("Building Number: 112");
        Tooltip.install(Building112, tooltipBuilding112); 
        Building112.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building112.contains(event.getX(), event.getY())) {
                tooltipBuilding112.show(Building112, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building112.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding112.hide();
        });
        
        Rectangle Building113 = new Rectangle(550, 540, 35, 35);
        Building113.setArcHeight(25);
        Building113.setArcWidth(25);
        Building113.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding113 = new Tooltip("Building Number: 113");
        Tooltip.install(Building113, tooltipBuilding113); 
        Building113.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building113.contains(event.getX(), event.getY())) {
                tooltipBuilding113.show(Building113, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building113.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding113.hide();
        });
        
        // Neighbourhood_3 : BLOCK 7
        
        Rectangle Building114 = new Rectangle(640, 540, 35, 35);
        Building114.setArcHeight(25);
        Building114.setArcWidth(25);
        Building114.setFill(Color.web("#C0392B"));
         Tooltip tooltipBuilding114 = new Tooltip("Building Number: 114");
        Tooltip.install(Building114, tooltipBuilding114); 
        Building114.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building114.contains(event.getX(), event.getY())) {
                tooltipBuilding114.show(Building114, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building114.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding114.hide();
        });
        
        
        Rectangle Building115 = new Rectangle(720, 540, 35, 35);
        Building115.setArcHeight(25);
        Building115.setArcWidth(25);
        Building115.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding115 = new Tooltip("Building Number: 115");
        Tooltip.install(Building115, tooltipBuilding115); 
        Building115.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building115.contains(event.getX(), event.getY())) {
                tooltipBuilding115.show(Building115, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building115.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding115.hide();
        });
        Rectangle Building116 = new Rectangle(800, 540, 35, 35);
        Building116.setArcHeight(25);
        Building116.setArcWidth(25);
        Building116.setFill(Color.web("#C0392B"));
        // Tooltip tooltipBuilding116 = new Tooltip(MainProgram.package18.getPackageInformation());
        // Tooltip.install(Building116, tooltipBuilding116);
        
        // Building116.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building116.contains(event.getX(), event.getY())) {
        //         tooltipBuilding116.show(Building116, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building116.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding116.hide();
        // }); 
        
        // Neighbourhood_3 : BLOCK 8
        
        Rectangle Building117 = new Rectangle(890, 540, 35, 35);
        Building117.setArcHeight(25);
        Building117.setArcWidth(25);
        Building117.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding117 = new Tooltip("Building Number: 117");
        Tooltip.install(Building117, tooltipBuilding117); 
        Building117.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building117.contains(event.getX(), event.getY())) {
                tooltipBuilding117.show(Building117, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building117.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding117.hide();
        });
        
        Rectangle Building118 = new Rectangle(955, 540, 35, 35);
        Building118.setArcHeight(25);
        Building118.setArcWidth(25);
        Building118.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding118 = new Tooltip("Building Number: 118");
        Tooltip.install(Building118, tooltipBuilding118); 
        Building118.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building118.contains(event.getX(), event.getY())) {
                tooltipBuilding118.show(Building118, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building118.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding118.hide();
        });
        
        Rectangle Building119 = new Rectangle(1015, 540, 35, 35);
        Building119.setArcHeight(25);
        Building119.setArcWidth(25);
        Building119.setFill(Color.web("#C0392B"));
         Tooltip tooltipBuilding119 = new Tooltip("Building Number: 119");
        Tooltip.install(Building119, tooltipBuilding119); 
        Building119.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building119.contains(event.getX(), event.getY())) {
                tooltipBuilding119.show(Building119, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building119.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding119.hide();
        });
        
        // Neighbourhood_3 : BLOCK 9 for "Warehouse , which take Building from 120 to 123 "
        Text Warehouse_label = new Text(100,645,"Warehouse");
        Warehouse_label.setFont(font);
        Warehouse_label.setFill(Color.BLACK);
        Rectangle Warehouse = new Rectangle(45, 600, 35, 35);
        Warehouse.setArcHeight(25);
        Warehouse.setArcWidth(25);
        Warehouse.setWidth(280);
        Warehouse.setHeight(75);
        Warehouse.setFill(Color.SILVER);
         Tooltip tooltipWareHouseBuilding = new Tooltip("Initial Position: Warehouse");
        Tooltip.install(Warehouse, tooltipWareHouseBuilding); 
        Warehouse.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Warehouse.contains(event.getX(), event.getY())) {
                tooltipWareHouseBuilding.show(Warehouse, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Warehouse.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipWareHouseBuilding.hide();
        });
        
        // Neighbourhood_3 : BLOCK 10 
        Rectangle Building120 = new Rectangle(350, 605, 35, 35);
        Building120.setArcHeight(25);
        Building120.setArcWidth(25);
        Building120.setFill(Color.web("#C0392B"));
        // Tooltip tooltipBuilding120 = new Tooltip(MainProgram.package19.getPackageInformation());
        // Tooltip.install(Building120, tooltipBuilding120);
        
        // Building120.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building120.contains(event.getX(), event.getY())) {
        //         tooltipBuilding120.show(Building120, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building120.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding120.hide();
        // }); 
        
        
        Rectangle Building121 = new Rectangle(425, 605, 35, 35);
        Building121.setArcHeight(25);
        Building121.setArcWidth(25);
        Building121.setFill(Color.web("#C0392B"));
         Tooltip tooltipBuilding121 = new Tooltip("Building Number: 125");
        Tooltip.install(Building121, tooltipBuilding121); 
        Building121.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building121.contains(event.getX(), event.getY())) {
                tooltipBuilding121.show(Building121, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building121.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding121.hide();
        });
        
        Rectangle Building122 = new Rectangle(490, 605, 35, 35);
        Building122.setArcHeight(25);
        Building122.setArcWidth(25);
        Building122.setFill(Color.web("#C0392B"));
        // Tooltip tooltipBuilding122 = new Tooltip("Building Number: 126");
        // Tooltip.install(Building122, tooltipBuilding122); 
        // Building122.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building122.contains(event.getX(), event.getY())) {
        //         tooltipBuilding122.show(Building122, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building122.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding122.hide();
        // });
        Rectangle Building123 = new Rectangle(550, 605, 35, 35);
         Building123.setArcHeight(25);
         Building123.setArcWidth(25);
         Building123.setFill(Color.web("#C0392B"));
        // Tooltip tooltipBuilding123 = new Tooltip(MainProgram.package1.getPackageInformation());
        // Tooltip.install(Building123, tooltipBuilding123);
        
        // Building123.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building123.contains(event.getX(), event.getY())) {
        //         tooltipBuilding123.show(Building123, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building123.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding123.hide();
        // });
      
        
        
        // Neighbourhood_3 : BLOCK 11
        Rectangle Building124 = new Rectangle(635, 605, 35, 35);
        Building124.setArcHeight(25);
        Building124.setArcWidth(25);
        Building124.setFill(Color.web("#C0392B"));
         Tooltip tooltipBuilding124 = new Tooltip("Building Number: 128");
        Tooltip.install(Building124, tooltipBuilding124); 
        Building124.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building124.contains(event.getX(), event.getY())) {
                tooltipBuilding124.show(Building124, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building124.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding124.hide();
        });
        
        Rectangle Building125 = new Rectangle(710, 605, 35, 35);
        Building125.setArcHeight(25);
        Building125.setArcWidth(25);
        Building125.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding125 = new Tooltip("Building Number: 129");
        Tooltip.install(Building125, tooltipBuilding125); 
        Building125.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building125.contains(event.getX(), event.getY())) {
                tooltipBuilding125.show(Building125, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building125.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding125.hide();
        });
        
        Rectangle Building126 = new Rectangle(785, 605, 35, 35);
        Building126.setArcHeight(25);
        Building126.setArcWidth(25);
        Building126.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding126 = new Tooltip("Building Number: 130");
        Tooltip.install(Building126, tooltipBuilding126); 
        Building126.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building126.contains(event.getX(), event.getY())) {
                tooltipBuilding126.show(Building126, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building126.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding126.hide();
        });
        
        // Neighbourhood_3 : BLOCK 12
        Rectangle Building127 = new Rectangle(880, 605, 35, 35);
        Building127.setArcHeight(25);
        Building127.setArcWidth(25);
        Building127.setFill(Color.web("#C0392B"));
         Tooltip tooltipBuilding127 = new Tooltip("Building Number: 131");
        Tooltip.install(Building127, tooltipBuilding127); 
        Building127.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building127.contains(event.getX(), event.getY())) {
                tooltipBuilding127.show(Building127, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building127.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding127.hide();
        });
        
        Rectangle Building128 = new Rectangle(945, 605, 35, 35);
        Building128.setArcHeight(25);
        Building128.setArcWidth(25);
        Building128.setFill(Color.web("#C0392B"));
        Tooltip tooltipBuilding128 = new Tooltip("Building Number: 132");
        Tooltip.install(Building128, tooltipBuilding128); 
        Building128.setOnMouseEntered(event -> {
            // Show the tooltip only if the mouse is within the building bounds
            if (Building128.contains(event.getX(), event.getY())) {
                tooltipBuilding128.show(Building128, event.getScreenX(), event.getScreenY() + 20);
            }
        });
        
        Building128.setOnMouseExited(event -> {
            // Hide the tooltip
            tooltipBuilding128.hide();
        });
        
        Rectangle Building129 = new Rectangle(1010, 605, 35, 35);
         Building129.setArcHeight(25);
         Building129.setArcWidth(25);
         Building129.setFill(Color.web("#C0392B"));
        // Tooltip tooltipBuilding129 = new Tooltip(MainProgram.package20.getPackageInformation());
        // Tooltip.install(Building129, tooltipBuilding129);
        
        // Building129.setOnMouseEntered(event -> {
        //     // Show the tooltip only if the mouse is within the building bounds
        //     if (Building129.contains(event.getX(), event.getY())) {
        //         tooltipBuilding129.show(Building129, event.getScreenX(), event.getScreenY() + 20);
        //     }
        // });
        
        // Building129.setOnMouseExited(event -> {
        //     // Hide the tooltip
        //     tooltipBuilding129.hide();
        // }); 
        

        Text Street_1Lable = new Text(25, 73, "1");
        Street_1Lable.setFont(font);
        Street_1Lable.setFill(Color.BLACK);
 
        Text Street_2Lable = new Text(25, 137, "2");
        Street_2Lable.setFont(font);
        Street_2Lable.setFill(Color.BLACK); 
        
        Text Street_3Lable = new Text(25, 204, "3");
        Street_3Lable.setFont(font);
        Street_3Lable.setFill(Color.BLACK);
        
        Text Street_4Lable = new Text(25, 272, "4");
        Street_4Lable.setFont(font);
        Street_4Lable.setFill(Color.BLACK);
        
        Text Street_5Lable = new Text(25, 337, "5");
        Street_5Lable.setFont(font);
        Street_5Lable.setFill(Color.BLACK);
        
        Text Street_6Lable = new Text(25, 402, "6");
        Street_6Lable.setFont(font);    
        Street_6Lable.setFill(Color.BLACK);
        
        Text Street_7Lable = new Text(25, 468, "7");
        Street_7Lable.setFont(font);
        Street_7Lable.setFill(Color.BLACK);
        
        Text Street_8Lable = new Text(25, 534, "8");
        Street_8Lable.setFont(font);    
        Street_8Lable.setFill(Color.BLACK);
        
        Text Street_9Lable = new Text(25,601, "9");
        Street_9Lable.setFont(font);
        Street_9Lable.setFill(Color.BLACK);
        
        

        Text Street_ALable = new Text(322, 678, "A");
        Street_ALable.setFont(font );
        Street_ALable.setFill(Color.BLACK);

        Text Street_BLable = new Text(592, 678, "B");
        Street_BLable.setFont(font );
        Street_BLable.setFill(Color.BLACK);

        Text Street_CLable = new Text(851, 678, "C");
        Street_CLable.setFont(font );
        Street_CLable.setFill(Color.BLACK);
            Group neighborhoodsGroup = new Group();
            // Add homes to Neighborhood 1 group
            
            Group neighborhood1Group = new Group();
            neighborhood1Group.getChildren().addAll( Building1 ,Building2 , Building3 , Building4 ,Building5,Building6,Building7,Building8,Building9,Building10,Building11,Building12,Building13,Building14,Building15,Building16,Building17,Building18,Building19,Building20,Building21,Building22,Building23,Building24,Building25,Building26,Building27,Building28,Building29,Building30,Building31,Building32,Building33,Building34,Building35,Building36,Building37,Building38,Building39,Building40,Building41,Building42,Building43,Building44,Building45,Building46,Building47,Building48,Building49,Building50,Building51,Building52);
            
            // Add homes to Neighborhood 2 group
            Group neighborhood2Group = new Group();
            neighborhood2Group.getChildren().addAll(Building53,Building54,Building55,Building56,Building57,Building58,Building59,Building60,Building61,Building62,Building63,Building64,Building65,Building66,Building67,Building68,Building69,Building70,Building71,Building72,Building73,Building74,Building75,Building76,Building77,Building78,Building79,Building80,Building81,Building82,Building83,Building84,Building85,Building86,Building87,Building88,Building89,Building90,Building91);
            
            // Add homes to Neighborhood 3 group
            
            Group neighborhood3Group = new Group();
            neighborhood3Group.getChildren().addAll(Building92,Building93,Building94,Building95,Building96,Building97,Building98,Building99,Building100,Building101,Building102,Building103,Building104,Building105,Building106,Building107,Building108,Building109,Building110,Building111,Building112,Building113,Building114,Building115,Building116,Building117,Building118,Building119,Warehouse,Warehouse_label,Building120,Building121,Building122,Building123,Building124,Building125,Building126,Building127,Building128,Building129);
  
            Group warehousesGroup = new Group();
            warehousesGroup.getChildren().addAll(Warehouse, Warehouse_label);
    buildings= Arrays.asList(Building1 ,Building2 , Building3 , Building4 ,Building5,Building6,Building7,Building8,Building9,Building10,Building11,Building12,Building13,Building14,Building15,Building16,Building17,Building18,Building19,Building20,Building21,Building22,Building23,Building24,Building25,Building26,Building27,Building28,Building29,Building30,Building31,Building32,Building33,Building34,Building35,Building36,Building37,Building38,Building39,Building40,Building41,Building42,Building43,Building44,Building45,Building46,Building47,Building48,Building49,Building50,Building51,Building52,Building53,Building54,Building55,Building56,Building57,Building58,Building59,Building60,Building61,Building62,Building63,Building64,Building65,Building66,Building67,Building68,Building69,Building70,Building71,Building72,Building73,Building74,Building75,Building76,Building77,Building78,Building79,Building80,Building81,Building82,Building83,Building84,Building85,Building86,Building87,Building88,Building89,Building90,Building91,Building92,Building93,Building94,Building95,Building96,Building97,Building98,Building99,Building100,Building101,Building102,Building103,Building104,Building105,Building106,Building107,Building108,Building109,Building110,Building111,Building112,Building113,Building114,Building115,Building116,Building117,Building118,Building119,Building120,Building121,Building122,Building123,Building124,Building125,Building126,Building127,Building128,Building129);
            neighborhoodsGroup.getChildren().addAll(Street_CLable,Street_BLable,Street_ALable,Street_1Lable,Street_2Lable,Street_3Lable,Street_4Lable,Street_5Lable,Street_6Lable,Street_7Lable,Street_8Lable,Street_9Lable,Neighbourhood_1,neighborhood1Group,Neighbourhood_2,neighborhood2Group,Neighbourhood_3,neighborhood3Group,warehousesGroup);
            AllGroups.getChildren().add(neighborhoodsGroup);
    }

    public void streets(Pane AllGroups) {
    
        // ------------------STREETS-----------------------
            
            
            // Streets for Alhamdaniyah Neighourhood: 
            
            Line Street_1 = new Line(0, 0, 1000, 0);
            Street_1.setStrokeWidth(12);
            Street_1.setTranslateX(50);
            Street_1.setTranslateY(66);
            
             Line Street_2 = new Line(0, 0, 1000, 0);
            Street_2.setStrokeWidth(12);
            Street_2.setTranslateX(50);
            Street_2.setTranslateY(132);
            
            
            Line Street_3 = new Line(0, 0, 1000, 0);
            Street_3.setStrokeWidth(12);
            Street_3.setTranslateX(50);
            Street_3.setTranslateY(198);
            
            //Streets for AlManar Neighourhood:
            
             Line Street_4 = new Line(0, 0, 1000, 0);
            Street_4.setStrokeWidth(12);
            Street_4.setTranslateX(50);
            Street_4.setTranslateY(264);
            
            
            
             Line Street_5 = new Line(0, 0, 1000, 0);
            Street_5.setStrokeWidth(12);
            Street_5.setTranslateX(50);
            Street_5.setTranslateY(330);
            
            
            Line Street_6 = new Line(0, 0, 1000, 0);
            Street_6.setStrokeWidth(12);
            Street_6.setTranslateX(50);
            Street_6.setTranslateY(396);
            
            //Streets for AlRabwah Neighourhood: 
            
            Line Street_7 = new Line(0, 0, 1000, 0);
            Street_7.setStrokeWidth(12);
            Street_7.setTranslateX(50);
            Street_7.setTranslateY(462);
            
            
            Line Street_8 = new Line(0, 0, 1000, 0);
            Street_8.setStrokeWidth(12);
            Street_8.setTranslateX(50);
            Street_8.setTranslateY(528);
            
            
            Line Street_9 = new Line(0, 0, 1000, 0);
            Street_9.setStrokeWidth(12);
            Street_9.setTranslateX(50);
            Street_9.setTranslateY(594);
            
            
            //STREET A: 
            
             Line Street_A = new Line(0, 0, 0, 650);
            Street_A.setStrokeWidth(12);
            Street_A.setTranslateX(330);
            Street_A.setTranslateY(0);
            
            // White line inside street A
    
            Line line_street_white1 = new Line(0, 0, 0, 650);
            line_street_white1.setStrokeWidth(12);
            line_street_white1.setStroke(Color.BLUE);
            line_street_white1.setTranslateX(330);
            line_street_white1.setTranslateY(0); 
            
           
            // STREET B :
             Line Street_B = new Line(0, 0, 0, 650);
            Street_B.setStrokeWidth(12);
            Street_B.setTranslateX(600);
            Street_B.setTranslateY(0);
            
            
            // STREET C: 
            Line Street_C = new Line(0, 0, 0, 650);
            Street_C.setStrokeWidth(12);
            Street_C.setTranslateX(860);
            Street_C.setTranslateY(0);
            
            
               // Create a group for streets
                Group streetsGroup = new Group();
                streetsGroup.getChildren().addAll(Street_1, Street_2, Street_3, Street_4, Street_5,
                                Street_6,Street_7,line_street_white1,Street_8,Street_9,Street_A , 
                                Street_B,Street_C);
                
                AllGroups.getChildren().add(streetsGroup);
        
        
        }

    public void Labels (Pane AllGroups, Boolean isPhase1Selected) {
        // For Time : 
        Rectangle timerRectangle = new Rectangle(1080,65,80, 40);
        timerRectangle.setStroke(Color.web("#000C40"));
        timerRectangle.setStrokeWidth(5);
        timerRectangle.setFill(Color.web("#F0F2F0"));
        
        // For Distance : 
        Rectangle distanceRectangle = new Rectangle(1190,65,80, 40);
        distanceRectangle.setStroke(Color.web("#000C40"));
        distanceRectangle.setStrokeWidth(5);
        distanceRectangle.setFill(Color.web("#F0F2F0"));
        
        // For Cost : 
        Rectangle costRectangle = new Rectangle(1080,130,75, 40);
        costRectangle.setStroke(Color.web("#000C40"));
        costRectangle.setStrokeWidth(5);
        costRectangle.setFill(Color.web("#F0F2F0"));
        
        
        // For No.Simulations : 
        Rectangle No_SimulationRectangle = new Rectangle(1190,130,80, 40);
        No_SimulationRectangle.setStroke(Color.web("#000C40"));
        No_SimulationRectangle.setStrokeWidth(5);
        No_SimulationRectangle.setFill(Color.web("#F0F2F0"));
        
        Rectangle xx = new Rectangle(1140,195,80, 40);
        xx.setStroke(Color.web("#000C40"));
        xx.setStrokeWidth(5);
        xx.setFill(Color.web("#F0F2F0"));
        // Time,distance,cost and No.Simulations Labels :
        
        // For Time : 
        
        Font Labelfont = new Font(" Times New Roman",13);
        Label timeLabel = new Label("Time");
        timeLabel.setFont(Labelfont);
        timeLabel.setLayoutX(1100);
        timeLabel.setLayoutY(45);
        timeLabel.setStyle("-fx-text-fill: #F0F2F0;");
        
        // For Distance :
        Label distanceLabel = new Label("Distance");
        distanceLabel.setFont(Labelfont);
        distanceLabel.setLayoutX(1200);
        distanceLabel.setLayoutY(45);
        distanceLabel.setStyle("-fx-text-fill: #F0F2F0;");
        
        // For Cost :
        Label costLabel = new Label("Cost of gasoline");
        costLabel.setFont(Labelfont);
        costLabel.setLayoutX(1075);
        costLabel.setLayoutY(110);
        costLabel.setStyle("-fx-text-fill: #F0F2F0;");

        
        
        // For No_Simulations :
        Label No_SimulationLabel = new Label("Number of Simulations");
        No_SimulationLabel.setFont(Labelfont);
        No_SimulationLabel.setLayoutX(1190);
        No_SimulationLabel.setLayoutY(110);
        No_SimulationLabel.setStyle("-fx-text-fill: #F0F2F0;");
        
        // Time,distance and cost Counter Labels :
        
        // For Time : 
        
        Font CounterLabelfont = new Font(" Times New Roman",15);
        MainGUISimulation .CounterTimeLabel = new Label("00:00:00");
        CounterTimeLabel.setFont(CounterLabelfont);
        CounterTimeLabel.setTextFill(Color.web("#000C40"));
        CounterTimeLabel.setLayoutX(1090);
        CounterTimeLabel.setLayoutY(75);
        
        // For Distance :
        
        MainGUISimulation.CounterDistanceLabel = new Label("00.00 Km");
        CounterDistanceLabel.setFont(CounterLabelfont);
        CounterDistanceLabel.setTextFill(Color.web("#000C40"));        
        CounterDistanceLabel.setLayoutX(1200);
        CounterDistanceLabel.setLayoutY(75);
        
        // For Cost :
        
        MainGUISimulation.CounterCostLabel = new Label("$ 00,00");
        CounterCostLabel.setFont(CounterLabelfont);
        CounterCostLabel.setTextFill(Color.web("#000C40"));
        CounterCostLabel.setLayoutX(1095);
        CounterCostLabel.setLayoutY(140);
        
        // For No_Simulations:
        
        MainGUISimulation .CounterNo_SimulationLabel = new Label("0");
        CounterNo_SimulationLabel.setFont(CounterLabelfont);
        CounterNo_SimulationLabel.setTextFill(Color.web("#000C40"));
        CounterNo_SimulationLabel.setLayoutX(1225);
        CounterNo_SimulationLabel.setLayoutY(140);

        percentLabelP2 = new Label("00.00%");
        percentLabelP2.setFont(CounterLabelfont);
        percentLabelP2.setTextFill(Color.web("#000C40"));
        percentLabelP2.setLayoutX(1160);
        percentLabelP2.setLayoutY(205);

        Rectangle percentRectangle = new Rectangle(1075,195,80, 40);
        percentRectangle.setStroke(Color.web("#000C40"));
        percentRectangle.setStrokeWidth(5);
        percentRectangle.setFill(Color.web("#F0F2F0"));

        Label percent_LabelP2 = new Label("Percent Improvement");
        percent_LabelP2.setFont(Labelfont);
        percent_LabelP2.setLayoutX(1075);
        percent_LabelP2.setLayoutY(175);
        percent_LabelP2.setStyle("-fx-text-fill: #F0F2F0;");

        
        
        Rectangle Ideal_rectangle = new Rectangle(1190, 150, 150, 35);
        Ideal_rectangle.setFill(Color.BLACK);
        Ideal_rectangle.setStroke(Color.BLUE);

        Text Ideal_text = new Text("Ideal time: 1:00:00");
        Ideal_text.setFill(Color.WHITE);
        Ideal_text.setFont(Font.font("Arial", 13)); 
        Ideal_text.setTextAlignment(TextAlignment.CENTER);
        Ideal_text.setX(Ideal_rectangle.getX() + Ideal_rectangle.getWidth() / 1.25 - Ideal_text.getLayoutBounds().getWidth() / 1.25);
        Ideal_text.setY(Ideal_rectangle.getY() + Ideal_rectangle.getHeight() / 1.25 - Ideal_text.getLayoutBounds().getHeight() / 1.25);
        Group Ideal_group = new Group();
        Ideal_group.getChildren().addAll(Ideal_text , Ideal_rectangle);
         Group labelsGroup = new Group();
            labelsGroup.getChildren().addAll(timeLabel, distanceLabel,costLabel,No_SimulationLabel,timerRectangle,distanceRectangle,costRectangle,No_SimulationRectangle);
            Group counterLabelsGroup = new Group();
                counterLabelsGroup.getChildren().addAll( CounterTimeLabel, CounterDistanceLabel,CounterCostLabel,CounterNo_SimulationLabel);
            Group   percentLabelsGroup = new Group();
                percentLabelsGroup.getChildren().addAll(percent_LabelP2,percentRectangle,percentLabelP2);

                if (!FirstPage.isPhase2Selected) {
                                AllGroups.getChildren().addAll(labelsGroup,counterLabelsGroup , Ideal_text);
                }else{
                            AllGroups.getChildren().addAll(labelsGroup,counterLabelsGroup,percentLabelsGroup);

                }
    }

    public void Buttons (Pane AllGroups,Stage primaryStage) {
        Button Start_button = new Button();
Start_button.setPrefSize(60, 20);
Start_button.setLayoutX(1050);
Start_button.setLayoutY(15);


Image Starticon = new Image(getClass().getResourceAsStream("StartButton.png"));
ImageView iconView = new ImageView(Starticon);
iconView.setFitWidth(30);
iconView.setFitHeight(15);

Start_button.setGraphic(iconView);
Start_button.setStyle( "-fx-background-color: #F0F2F0; " );
Start_button.setContentDisplay(ContentDisplay.CENTER);
        
        Start_button.setOnAction((event) -> {
            if (!MainProgram.driver.isTransitionPaused) {
            //  resetChosenBuildingColors();
            MainProgram.initializeForStart();
            stopCurrentSimulation();
            isStartClicked = true;

            MainProgram.driver.setGasolineCost(0);
            MainProgram.driver.setDistance(0);
            CounterCostLabel.setText("$ 00,00");
            CounterDistanceLabel.setText("00.00 Km");
            percentLabelP2.setText("00.00%");
            MainProgram.driver.createPathForPackages(MainProgram.driver.calculateShortestPathsBetweenDestinations(MainProgram.choosenBulding));            
            secondsPassed = 0;
            CounterTimeLabel.setText(formatTime(secondsPassed));
             startSimulation();
            isPaused = false;
            }  
        });
                
        Button Pause_button = new Button();
        Pause_button.setPrefSize(60, 20);
        Pause_button.setLayoutX(1125);
        Pause_button.setLayoutY(15);
        Image Pauseicon = new Image(getClass().getResourceAsStream("PauseButton.png"));
        ImageView iconView2 = new ImageView(Pauseicon);
        iconView2.setFitWidth(30);  
        iconView2.setFitHeight(15);
        Pause_button.setGraphic(iconView2);
        Pause_button.setStyle( "-fx-background-color: #F0F2F0; " );

        Pause_button.setContentDisplay(ContentDisplay.CENTER);
                
        Pause_button.setOnAction(e -> {
        if (!MainProgram.driver.isTransitionPaused) {
            if (isPaused) {
                resumeSimulation();
            } else {
                pauseSimulation();
            }
        }
        });
        
        Button End_button = new Button();
        End_button.setPrefSize(60, 20);
        End_button.setLayoutX(1200);
        End_button.setLayoutY(15);
        Image Endicon = new Image(getClass().getResourceAsStream("EndButton.png"));
        ImageView iconView3 = new ImageView(Endicon);
        iconView3.setFitWidth(30);  
        iconView3.setFitHeight(15); 
        End_button.setGraphic(iconView3);
        End_button.setStyle( "-fx-background-color: #F0F2F0; " );
        End_button.setContentDisplay(ContentDisplay.CENTER);
        
        End_button.setOnAction(e -> {
         if (!MainProgram.driver.isTransitionPaused) {
            
                endSimulation();
            }
        });
        
        Button Back_button = new Button();
        Back_button.setPrefSize(60, 20);
        Back_button.setLayoutX(1275);
        Back_button.setLayoutY(15);
          Image Backicon = new Image(getClass().getResourceAsStream("BackButton.png"));
        ImageView iconView4 = new ImageView(Backicon);
        iconView4.setFitWidth(30);  
        iconView4.setFitHeight(15); 
        Back_button.setGraphic(iconView4);
        Back_button.setStyle( "-fx-background-color: #F0F2F0; " );
        Back_button.setContentDisplay(ContentDisplay.CENTER);
        
        Back_button.setOnAction(e -> {
                if (!MainProgram.driver.isTransitionPaused){
                numOfSumuolation = 0;
                FirstPage.isPhase1Selected = false;
                FirstPage.isPhase2Selected = false;
        
                openFirstPage();
                restSumaltion();
                primaryStage.close();
            }
        });

        Group buttonsGroup = new Group ();
        buttonsGroup.getChildren().addAll(Start_button,Pause_button,End_button,Back_button);

        AllGroups.getChildren().add(buttonsGroup);
    }
    

    public double calculatePercentImprovement() {
        

        double percentImprovement = 0.0;

        // Ensure totalTimeP1 isn't zero to avoid division by zero
        if (totalTimeP1 != 0) {
            percentImprovement = (((double) totalTimeP1 - totalTimeP2) / totalTimeP1) * 100;
        } else {
            
        
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Start phase 2 befor 1 ERROR");
            alert.setHeaderText("There are error, read dwon!!!");
            alert.setContentText("Error: Cannot calculate percent improvement before starting Phase 1");
            alert.showAndWait();
        
        }
            
        return percentImprovement;
    }

    public void calculateTotalTimeForAllPhases(){
        if (FirstPage.isPhase1Selected) {

                    totalTimeP1 = MainProgram.driver.calculateTotalTime(); // Calculate total time separately
                   
                } else if (FirstPage.isPhase2Selected) {
                    // Similarly, calculate total time separately for phase 2
                    totalTimeP2 = MainProgram.driver.calculateTotalTime(); // Calculate total time separately
                   
                } }

                public void startSimulation() {
                    // Cancel the existing timer if it's not null
                    if (timer != null) {
                        timer.cancel();
                    }
            
                    // Reset the delivery status of packages
                    resetPackageDeliveryStatus();
            
                    // Create a new timer
                    timer = new Timer();
            
                    TimerTask simulationTask = new TimerTask() {
                        @Override
                        public void run() {
                            if (!isPaused) {
                                secondsPassed += 10;
                                Platform.runLater(() -> {
                                    CounterTimeLabel.setText(formatTime(secondsPassed));
                                });
                                if (allDelivered(MainProgram.driver)) {
                                    Platform.runLater(() -> {
                                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                        alert.setTitle("FINISH");
                                        alert.setHeaderText("THE SIMULATION IS DONE");
                                        alert.setContentText("Have a nice day!");
                                        alert.showAndWait();
                                        MainProgram.driver.isTransitionPaused = false;
            
                                        calculateTotalTimeForAllPhases();
                                        isStartClicked = false;
                                        CounterNo_SimulationLabel.setText(formatCounterNo_Simulation(++numOfSumuolation));
                                        percentLabelP2.setText(formatPercent(calculatePercentImprovement()));
                                    });
            
                                    timer.cancel();
                                }
                            }
                        }
                    };
            
                    timer.schedule(simulationTask, 0, 103);
                }
    
    private static void resetPackageDeliveryStatus() {
                List<Package> Packages = MainProgram.packages;

        for (Package aPackage : Packages) {
            aPackage.isDelivered = false;
        }
    }
    
    private void stopCurrentSimulation() {
        if (MainProgram.driver.pathTransition != null) {
            MainProgram.driver.pathTransition.stop() ; // Stop the PathTransition animation
        }}
    public static void pauseSimulation() {
        isPaused = !isPaused; // Toggle pause state

        if (MainProgram.driver.pathTransition != null) {
            if (isPaused && MainProgram.driver.pathTransition.getStatus() == Animation.Status.RUNNING) {
                MainProgram.driver.pathTransition.pause();
            }
        }
    }

    public static void resumeSimulation() {
        isPaused = false; // Resume the simulation

        if (MainProgram.driver.pathTransition != null) {
            if (MainProgram.driver.pathTransition.getStatus() == Animation.Status.PAUSED) {
                MainProgram.driver.pathTransition.play();
            }
        }
    }

    public static boolean allDelivered(DeliveryDriver driver) {
        List<Package> Packages = MainProgram.packages;
        
        for (Package aPackage : Packages) {
            if (aPackage != null) {
                if (!aPackage.isDelivered) {
                    return false;
                }
            }
        }
        
        System.out.println("All packages delivered.");  // Add this line for debugging
        return true;
    }
    

    private static String formatTime(int seconds) {
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        long remainingSeconds = seconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
    }
    
    public static String formatDistance(double distance) {
        return String.format("%.2f %s", distance,"Km");
    }
    
    
    public static String formatCounterNo_Simulation(int num) {
        return String.format("%d",  num ); // Replace "Currency" with your desired currency symbol or abbreviation
    } 
    
    public static String formatGasolineCost(double cost) {
        return String.format("%s%.2f", "$" , cost ); // Replace "Currency" with your desired currency symbol or abbreviation
    }
    public static String formatPercent(double percent) {
        return String.format("%.2f%%", percent); // Formats the double as a percentage with two decimal places
    }
    
    private void openFirstPage() {
        FirstPage firstPage = new FirstPage(); 
        Stage stage = new Stage(); 
        firstPage.start(stage); 
    }
    
    public void endSimulation() {
        if (!isStartClicked) {
            
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("End simulation");
            alert.setHeaderText("Cannot end simulation before starting.");
            alert.setContentText("--------------");

            alert.showAndWait();

            return;
        }
    
        if (timer != null) {
            timer.cancel();
        }
    
        if (MainProgram.driver.pathTransition != null) {
            Platform.runLater(() -> {
                MainProgram.driver.pathTransition.stop();
                MainProgram.driver.pathTransition.setPath(null);
                MainProgram.driver.pathTransition.setCycleCount(1);
                 double totalDistance = MainProgram.driver.calculateTotalDistance(MainProgram.driver.calculateShortestPathsBetweenDestinations(MainProgram.choosenBulding));
                 CounterDistanceLabel.setText(formatDistance(totalDistance));
    
                 double totalGasolineCost = MainProgram.driver.calculateTotalGasolineCost(MainProgram.driver.calculateShortestPathsBetweenDestinations(MainProgram.choosenBulding));
                 CounterCostLabel.setText(formatGasolineCost(totalGasolineCost));
                 MainProgram.driver.moveCarTo(MainProgram.driver.calculateShortestPathsBetweenDestinations(MainProgram.choosenBulding));
                 CounterTimeLabel.setText(formatTime(MainProgram.driver.calculateTotalTime()));
                 calculateTotalTimeForAllPhases(); 
                percentLabelP2.setText(formatPercent(calculatePercentImprovement()));
                highlightBuildingsWithPackages();
                CounterNo_SimulationLabel.setText(formatCounterNo_Simulation(++numOfSumuolation));
                isStartClicked = false;
                MainProgram.driver.isTransitionPaused = false; 
                Platform.runLater(() -> {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("FINISH");
                    alert.setHeaderText("THE SIMULATION IS DONE");
                    alert.setContentText("Have a nice day!");
                    alert.showAndWait();
                });
                
               
                
                
            });
        }
    }
    
    public  void restSumaltion(){
     if (timer != null) {
        timer.cancel();
    }

    

    if (MainProgram.driver.pathTransition != null) {
        Platform.runLater(() -> {
            MainProgram.driver.pathTransition.stop();
            MainProgram.driver.pathTransition.setPath(null);
            MainProgram.driver.pathTransition.setCycleCount(1);
            CounterDistanceLabel.setText("00.00 Km");
            CounterCostLabel.setText("$ 00,00");
             MainProgram.driver.moveCarTo(MainProgram.driver.calculateShortestPathsBetweenDestinations(MainProgram.destetionBuilding));
           

             });
    
}

} 

public static void openPhase2() {
    Stage newStage = new Stage();
    MainGUISimulation phase2 = new MainGUISimulation();
    phase2.start(newStage);

    
}
public void highlightBuildingsWithPackages()  {
    List<Package> packages = MainProgram.packages;

    for (Package aPackage : packages) {
        Customer customer = aPackage.getCustomer();
        Building destinationBuilding = customer.getBuilding();
        String buildingName = destinationBuilding.getLocation().getName();

        int buildingIndex = Integer.parseInt(buildingName);
        MainGUISimulation.buildings.get(buildingIndex - 1).setFill(Color.GREEN);
        
    }
}



}
    
    



