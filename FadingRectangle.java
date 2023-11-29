import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.scene.shape.StrokeType;
import javafx.scene.layout.Pane;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;




public class FadingRectangle extends Application {
 private static Label CounterTimeLabel;
  public static Label CounterDistanceLabel;
  public static Label CounterCostLabel;

 private static Timer timer;
 public static int secondsPassed = 0;
 public static  boolean isStartClicked=true;
 public static boolean isPaused = false;


List<SubstreetPart> street1Parts = Arrays.asList(MainProgram.FirstOfStreet1,MainProgram.intersection1_1,MainProgram.FirstOfStreet1,MainProgram.intersection1_1,MainProgram.FirstOfStreetA,MainProgram.intersection1_1,MainProgram.intersection1_2,MainProgram.intersection1_3,MainProgram.intersection2_3,MainProgram.intersection3_3,MainProgram.intersection2_3,MainProgram.EndOfStreet2,MainProgram.intersection2_3,MainProgram.intersection3_3,MainProgram.intersection4_3,MainProgram.intersection5_3,MainProgram.intersection5_2,MainProgram.intersection6_2,MainProgram.intersection7_2,MainProgram.intersection8_2,MainProgram.intersection8_3,MainProgram.intersection9_3,MainProgram.EndOfStreetC);

    @Override
    public void start(Stage primaryStage) {
       
       
primaryStage.setOnCloseRequest(windowEvent -> {stopSimulation();Platform.exit();System.exit(0);});
    
    Text Neighbourhood_1 = new Text(1090, 230, "Alhamdaniya");
        Font font = new Font("Times New Roman",25);
        Neighbourhood_1.setFont(font);
        Neighbourhood_1.setFill(Color.GREY);
        Neighbourhood_1.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 1
        Rectangle Building1 = new Rectangle(50, 20, 35, 35);
        Building1.setArcHeight(20);
        Building1.setArcWidth(20);
        Building1.setFill(Color.GREY);
        
        Rectangle Building2 = new Rectangle(160, 20, 35, 35);
        Building2.setArcHeight(20);
        Building2.setArcWidth(20);
        Building2.setFill(Color.GREY);
        
        Rectangle Building3 = new Rectangle(270, 20, 35, 35);
        Building3.setArcHeight(20);
        Building3.setArcWidth(20);
        Building3.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 2
        Rectangle Building4 = new Rectangle(350, 20, 35, 35);
        Building4.setArcHeight(25);
        Building4.setArcWidth(25);
        Building4.setFill(Color.GREY);
        
        Rectangle Building5 = new Rectangle(425, 20, 35, 35);
        Building5.setArcHeight(25);
        Building5.setArcWidth(25);
        Building5.setFill(Color.GREY);
        
        Rectangle Building6 = new Rectangle(490, 20, 35, 35);
        Building6.setArcHeight(25);
        Building6.setArcWidth(25);
        Building6.setFill(Color.GREY);
        
        Rectangle Building7 = new Rectangle(550, 20, 35, 35);
        Building7.setArcHeight(25);
        Building7.setArcWidth(25);
        Building7.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 3
        Rectangle Building8 = new Rectangle(640, 20, 35, 35);
        Building8.setArcHeight(25);
        Building8.setArcWidth(25);
        Building8.setFill(Color.GREY);
        
        Rectangle Building9 = new Rectangle(710, 20, 35, 35);
        Building9.setArcHeight(25);
        Building9.setArcWidth(25);
        Building9.setFill(Color.GREY);
        
        Rectangle Building10 = new Rectangle(790, 20, 35, 35);
        Building10.setArcHeight(25);
        Building10.setArcWidth(25);
        Building10.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 4
        Rectangle Building11 = new Rectangle(880, 20, 35, 35);
        Building11.setArcHeight(25);
        Building11.setArcWidth(25);
        Building11.setHeight(35);
        Building11.setWidth(70);
        Building11.setFill(Color.GREY);
        
        Rectangle Building12 = new Rectangle(970, 20, 35, 35);
        Building12.setArcHeight(25);
        Building12.setArcWidth(25);
        Building12.setHeight(35);
        Building12.setWidth(70);
        Building12.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 5
        Rectangle Building13 = new Rectangle(50, 80, 35, 35);
        Building13.setArcHeight(25);
        Building13.setArcWidth(25);
        Building13.setFill(Color.GREY);
        
        Rectangle Building14 = new Rectangle(125, 80, 35, 35);
        Building14.setArcHeight(25);
        Building14.setArcWidth(25);
        Building14.setFill(Color.GREY);
        
        Rectangle Building15 = new Rectangle(200, 80, 35, 35);
        Building15.setArcHeight(25);
        Building15.setArcWidth(25);
        Building15.setFill(Color.GREY);
        
        Rectangle Building16 = new Rectangle(270, 80, 35, 35);
        Building16.setArcHeight(25);
        Building16.setArcWidth(25);
        Building16.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 6
        
        Rectangle Building17 = new Rectangle(350, 80, 35, 35);
        Building17.setArcHeight(25);
        Building17.setArcWidth(25);
        Building17.setFill(Color.GREY);
        
        Rectangle Building18 = new Rectangle(460, 80, 35, 35);
        Building18.setArcHeight(25);
        Building18.setArcWidth(25);
        Building18.setFill(Color.GREY);
        
        Rectangle Building19 = new Rectangle(550, 80, 35, 35);
        Building19.setArcHeight(25);
        Building19.setArcWidth(25);
        Building19.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 7
        Rectangle Building20 = new Rectangle(625, 80, 35, 35);
        Building20.setArcHeight(25);
        Building20.setArcWidth(25);
        Building20.setFill(Color.GREY);
        
        Rectangle Building21 = new Rectangle(680, 80, 35, 35);
        Building21.setArcHeight(25);
        Building21.setArcWidth(25);
        Building21.setFill(Color.GREY);
        
        Rectangle Building22 = new Rectangle(740, 80, 35, 35);
        Building22.setArcHeight(25);
        Building22.setArcWidth(25);
        Building22.setFill(Color.GREY);
        
        Rectangle Building23 = new Rectangle(800, 80, 35, 35);
        Building23.setArcHeight(25);
        Building23.setArcWidth(25);
        Building23.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 8
        Rectangle Building24 = new Rectangle(875, 80, 35, 35);
        Building24.setArcHeight(25);
        Building24.setArcWidth(25);
        Building24.setFill(Color.GREY);
        
        Rectangle Building25 = new Rectangle(950, 80, 35, 35);
        Building25.setArcHeight(25);
        Building25.setArcWidth(25);
        Building25.setFill(Color.GREY);
        
        Rectangle Building26 = new Rectangle(1020, 80, 35, 35);
        Building26.setArcHeight(25);
        Building26.setArcWidth(25);
        Building26.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 9
        Rectangle Building27 = new Rectangle(50, 150, 35, 35);
        Building27.setArcHeight(25);
        Building27.setArcWidth(25);
        Building27.setFill(Color.GREY);
        
        Rectangle Building28 = new Rectangle(160, 150, 35, 35);
        Building28.setArcHeight(25);
        Building28.setArcWidth(25);
        Building28.setFill(Color.GREY);
        
        Rectangle Building29 = new Rectangle(270, 150, 35, 35);
        Building29.setArcHeight(25);
        Building29.setArcWidth(25);
        Building29.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 10
        
        Rectangle Building30 = new Rectangle(350, 150, 35, 35);
        Building30.setArcHeight(25);
        Building30.setArcWidth(25);
        Building30.setFill(Color.GREY);
        
        Rectangle Building31 = new Rectangle(425, 150, 35, 35);
        Building31.setArcHeight(25);
        Building31.setArcWidth(25);
        Building31.setFill(Color.GREY);
        
        Rectangle Building32 = new Rectangle(490, 150, 35, 35);
        Building32.setArcHeight(25);
        Building32.setArcWidth(25);
        Building32.setFill(Color.GREY);
        
        Rectangle Building33 = new Rectangle(550, 150, 35, 35);
        Building33.setArcHeight(25);
        Building33.setArcWidth(25);
        Building33.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 11
        
        Rectangle Building34 = new Rectangle(630, 150, 35, 35);
        Building34.setArcHeight(25);
        Building34.setArcWidth(25);
        Building34.setFill(Color.GREY);
        
        Rectangle Building35 = new Rectangle(710, 150, 35, 35);
        Building35.setArcHeight(25);
        Building35.setArcWidth(25);
        Building35.setFill(Color.GREY);
        
        Rectangle Building36 = new Rectangle(790, 150, 35, 35);
        Building36.setArcHeight(25);
        Building36.setArcWidth(25);
        Building36.setFill(Color.GREY);
          
       // Neighbourhood_1 : BLOCK 12
       
        Rectangle Building37 = new Rectangle(870, 150, 35, 35);
        Building37.setArcHeight(25);
        Building37.setArcWidth(25);
        Building37.setFill(Color.GREY);
        
        Rectangle Building38 = new Rectangle(920, 150, 35, 35);
        Building38.setArcHeight(25);
        Building38.setArcWidth(25);
        Building38.setFill(Color.GREY);
        
        Rectangle Building39 = new Rectangle(970, 150, 35, 35);
        Building39.setArcHeight(25);
        Building39.setArcWidth(25);
        Building39.setFill(Color.GREY);
        
        Rectangle Building40 = new Rectangle(1020, 150, 35, 35);
        Building40.setArcHeight(25);
        Building40.setArcWidth(25);
        Building40.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 13 
        
        Rectangle Building41 = new Rectangle(50, 215, 35, 35);
        Building41.setArcHeight(25);
        Building41.setArcWidth(25);
        Building41.setFill(Color.GREY);
        
        Rectangle Building42 = new Rectangle(165, 215, 35, 35);
        Building42.setArcHeight(25);
        Building42.setArcWidth(25);
        Building42.setFill(Color.GREY);
        
        Rectangle Building43 = new Rectangle(270, 215, 35, 35);
        Building43.setArcHeight(25);
        Building43.setArcWidth(25);
        Building43.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 14 
        
        Rectangle Building44 = new Rectangle(360, 215, 35, 35);
        Building44.setArcHeight(25);
        Building44.setArcWidth(25);
        Building44.setHeight(35);
        Building44.setWidth(80);
        Building44.setFill(Color.GREY);
        
        Rectangle Building45 = new Rectangle(495, 215, 35, 35);
        Building45.setArcHeight(25);
        Building45.setArcWidth(25);
        Building45.setHeight(35);
        Building45.setWidth(80);
        Building45.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 15 
        Rectangle Building46 = new Rectangle(620, 215, 35, 35);
        Building46 .setArcHeight(25);
        Building46.setArcWidth(25);
        Building46.setFill(Color.GREY);
        
        Rectangle Building47 = new Rectangle(680, 215, 35, 35);
        Building47.setArcHeight(25);
        Building47.setArcWidth(25);
        Building47.setFill(Color.GREY);
        
        Rectangle Building48 = new Rectangle(740, 215, 35, 35);
        Building48.setArcHeight(25);
        Building48.setArcWidth(25);
        Building48.setFill(Color.GREY);
        
        Rectangle Building49 = new Rectangle(800, 215, 35, 35);
        Building49.setArcHeight(25);
        Building49.setArcWidth(25);
        Building49.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 16
        Rectangle Building50 = new Rectangle(880, 215, 35, 35);
        Building50.setArcHeight(25);
        Building50.setArcWidth(25);
        Building50.setFill(Color.GREY);
        
        Rectangle Building51 = new Rectangle(950, 215, 35, 35);
        Building51.setArcHeight(25);
        Building51.setArcWidth(25);
        Building51.setFill(Color.GREY);
        
        Rectangle Building52 = new Rectangle(1010, 215, 35, 35);
        Building52.setArcHeight(25);
        Building52.setArcWidth(25);
        Building52.setFill(Color.GREY);
        
        // Neighbourhood 2 ( from Building 53 to Building 91 ) with 12 blocks :
        
        Text Neighbourhood_2 = new Text(1120, 400, "Almanar");
        Neighbourhood_2.setFont(font);
        Neighbourhood_2.setFill(Color.BLUE);
        Neighbourhood_2.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 1
        Rectangle Building53 = new Rectangle(50, 280, 35, 35);
        Building53.setArcHeight(25);
        Building53.setArcWidth(25);
        Building53.setFill(Color.BLUE);
        
        Rectangle Building54 = new Rectangle(125, 280, 35, 35);
        Building54.setArcHeight(25);
        Building54.setArcWidth(25);
        Building54.setFill(Color.BLUE);
        
        Rectangle Building55 = new Rectangle(200, 280, 35, 35);
        Building55.setArcHeight(25);
        Building55.setArcWidth(25);
        Building55.setFill(Color.BLUE);
        
        Rectangle Building56 = new Rectangle(270, 280, 35, 35);
        Building56.setArcHeight(25);
        Building56.setArcWidth(25);
        Building56.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 2
        
        Rectangle Building57 = new Rectangle(370, 280, 35, 35);
        Building57.setArcHeight(25);
        Building57.setArcWidth(25);
        Building57.setFill(Color.BLUE);
        
        Rectangle Building58 = new Rectangle(460, 280, 35, 35);
        Building58.setArcHeight(25);
        Building58.setArcWidth(25);
        Building58.setFill(Color.BLUE);
        
        Rectangle Building59 = new Rectangle(540, 280, 35, 35);
        Building59.setArcHeight(25);
        Building59.setArcWidth(25);
        Building59.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 3 :
        
        Rectangle Building60 = new Rectangle(630, 280, 35, 35);
        Building60 .setArcHeight(25);
        Building60.setArcWidth(25);
        Building60.setFill(Color.BLUE);
        
        Rectangle Building61 = new Rectangle(690, 280, 35, 35);
        Building61.setArcHeight(25);
        Building61.setArcWidth(25);
        Building61.setFill(Color.BLUE);
        
        Rectangle Building62 = new Rectangle(750, 280, 35, 35);
        Building62.setArcHeight(25);
        Building62.setArcWidth(25);
        Building62.setFill(Color.BLUE);
        
        Rectangle Building63 = new Rectangle(810, 280, 35, 35);
        Building63.setArcHeight(25);
        Building63.setArcWidth(25);
        Building63.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 4
        
        Rectangle Building64 = new Rectangle(890, 280, 35, 35);
        Building64.setArcHeight(25);
        Building64.setArcWidth(25);
        Building64.setHeight(35);
        Building64.setWidth(70);
        Building64.setFill(Color.BLUE);
        
        Rectangle Building65 = new Rectangle(980, 280, 35, 35);
        Building65.setArcHeight(25);
        Building65.setArcWidth(25);
        Building65.setHeight(35);
        Building65.setWidth(70);
        Building65.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 5
        Rectangle Building66 = new Rectangle(50, 345, 35, 35);
        Building66.setArcHeight(25);
        Building66.setArcWidth(25);
        Building66.setFill(Color.BLUE);
        
        Rectangle Building67 = new Rectangle(125, 345, 35, 35);
        Building67.setArcHeight(25);
        Building67.setArcWidth(25);
        Building67.setFill(Color.BLUE);
        
        Rectangle Building68 = new Rectangle(200, 345, 35, 35);
        Building68.setArcHeight(25);
        Building68.setArcWidth(25);
        Building68.setFill(Color.BLUE);
        
        Rectangle Building69 = new Rectangle(270, 345, 35, 35);
        Building69.setArcHeight(25);
        Building69.setArcWidth(25);
        Building69.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 6
        
        Rectangle Building70 = new Rectangle(370, 345, 35, 35);
        Building70.setArcHeight(25);
        Building70.setArcWidth(25);
        Building70.setFill(Color.BLUE);
        
        Rectangle Building71 = new Rectangle(460, 345, 35, 35);
        Building71.setArcHeight(25);
        Building71.setArcWidth(25);
        Building71.setFill(Color.BLUE);
        
        Rectangle Building72 = new Rectangle(540, 345, 35, 35);
        Building72.setArcHeight(25);
        Building72.setArcWidth(25);
        Building72.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 7
        
        Rectangle Building73 = new Rectangle(630, 345, 35, 35);
        Building73.setArcHeight(25);
        Building73.setArcWidth(25);
        Building73.setFill(Color.BLUE);
        
        Rectangle Building74 = new Rectangle(690, 345, 35, 35);
        Building74.setArcHeight(25);
        Building74.setArcWidth(25);
        Building74.setFill(Color.BLUE);
        
        Rectangle Building75 = new Rectangle(750, 345, 35, 35);
        Building75.setArcHeight(25);
        Building75.setArcWidth(25);
        Building75.setFill(Color.BLUE);
        
        Rectangle Building76 = new Rectangle(810, 345, 35, 35);
        Building76.setArcHeight(25);
        Building76.setArcWidth(25);
        Building76.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 8
        
        Rectangle Building77 = new Rectangle(880, 345, 35, 35);
        Building77.setArcHeight(25);
        Building77.setArcWidth(25);
        Building77.setFill(Color.BLUE);
        
        Rectangle Building78 = new Rectangle(950, 345, 35, 35);
        Building78.setArcHeight(25);
        Building78.setArcWidth(25);
        Building78.setFill(Color.BLUE);
        
        Rectangle Building79 = new Rectangle(1010, 345, 35, 35);
        Building79.setArcHeight(25);
        Building79.setArcWidth(25);
        Building79.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 9
        Rectangle Building80 = new Rectangle(50, 410, 35, 35);
        Building80.setArcHeight(25);
        Building80.setArcWidth(25);
        Building80.setFill(Color.BLUE);
        
        Rectangle Building81 = new Rectangle(165, 410, 35, 35);
        Building81.setArcHeight(25);
        Building81.setArcWidth(25);
        Building81.setFill(Color.BLUE);
        
        Rectangle Building82 = new Rectangle(270, 410, 35, 35);
        Building82.setArcHeight(25);
        Building82.setArcWidth(25);
        Building82.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 10 
        Rectangle Building83 = new Rectangle(350, 410, 35, 35);
        Building83.setArcHeight(25);
        Building83.setArcWidth(25);
        Building83.setFill(Color.BLUE);
        
        Rectangle Building84 = new Rectangle(425, 410, 35, 35);
        Building84.setArcHeight(25);
        Building84.setArcWidth(25);
        Building84.setFill(Color.BLUE);
        
        Rectangle Building85 = new Rectangle(490, 410, 35, 35);
        Building85.setArcHeight(25);
        Building85.setArcWidth(25);
        Building85.setFill(Color.BLUE);
        
        Rectangle Building86 = new Rectangle(550, 410, 35, 35);
        Building86.setArcHeight(25);
        Building86.setArcWidth(25);
        Building86.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 11
        Rectangle Building87 = new Rectangle(640, 410, 35, 35);
        Building87.setArcHeight(25);
        Building87.setArcWidth(25);
        Building87.setHeight(35);
        Building87.setWidth(80);
        Building87.setFill(Color.BLUE);
        
        Rectangle Building88 = new Rectangle(760, 410, 35, 35);
        Building88.setArcHeight(25);
        Building88.setArcWidth(25);
        Building88.setHeight(35);
        Building88.setWidth(80);
        Building88.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 12 
        Rectangle Building89 = new Rectangle(880, 410, 35, 35);
        Building89.setArcHeight(25);
        Building89.setArcWidth(25);
        Building89.setFill(Color.BLUE);
        
        Rectangle Building90 = new Rectangle(950, 410, 35, 35);
        Building90.setArcHeight(25);
        Building90.setArcWidth(25);
        Building90.setFill(Color.BLUE);
        
        Rectangle Building91 = new Rectangle(1010, 410, 35, 35);
        Building91.setArcHeight(25);
        Building91.setArcWidth(25);
        Building91.setFill(Color.BLUE);
        
        // Neighbourhood 3 ( from Building 92 to Building 133  ) with 12 blocks include Warehouse :
        Text Neighbourhood_3 = new Text(1120, 550, "AlRabwah");
        Neighbourhood_3.setFont(font);
        Neighbourhood_3.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 1
        Rectangle Building92 = new Rectangle(50, 475, 35, 35);
        Building92.setArcHeight(25);
        Building92.setArcWidth(25);
        Building92.setFill(Color.SALMON);
        
        Rectangle Building93 = new Rectangle(125, 475, 35, 35);
        Building93.setArcHeight(25);
        Building93.setArcWidth(25);
        Building93.setFill(Color.SALMON);
        
        Rectangle Building94 = new Rectangle(200, 475, 35, 35);
        Building94.setArcHeight(25);
        Building94.setArcWidth(25);
        Building94.setFill(Color.SALMON);
        
        Rectangle Building95 = new Rectangle(270, 475, 35, 35);
        Building95.setArcHeight(25);
        Building95.setArcWidth(25);
        Building95.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 2
        Rectangle Building96 = new Rectangle(370, 475, 35, 35);
        Building96.setArcHeight(25);
        Building96.setArcWidth(25);
        Building96.setFill(Color.SALMON);
        
        Rectangle Building97 = new Rectangle(460, 475, 35, 35);
        Building97.setArcHeight(25);
        Building97.setArcWidth(25);
        Building97.setFill(Color.SALMON);
        
        Rectangle Building98 = new Rectangle(540, 475, 35, 35);
        Building98.setArcHeight(25);
        Building98.setArcWidth(25);
        Building98.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 3
        Rectangle Building99 = new Rectangle(630, 475, 35, 35);
        Building99.setArcHeight(25);
        Building99.setArcWidth(25);
        Building99.setFill(Color.SALMON);
        
        Rectangle Building100 = new Rectangle(690, 475, 35, 35);
        Building100.setArcHeight(25);
        Building100.setArcWidth(25);
        Building100.setFill(Color.SALMON);
        
        Rectangle Building101 = new Rectangle(750, 475, 35, 35);
        Building101.setArcHeight(25);
        Building101.setArcWidth(25);
        Building101.setFill(Color.SALMON);
        
        Rectangle Building102 = new Rectangle(810, 475, 35, 35);
        Building102.setArcHeight(25);
        Building102.setArcWidth(25);
        Building102.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 4
        Rectangle Building103 = new Rectangle(890, 475, 35, 35);
        Building103.setArcHeight(25);
        Building103.setArcWidth(25);
        Building103.setFill(Color.SALMON);
        
        Rectangle Building104 = new Rectangle(960, 475, 35, 35);
        Building104.setArcHeight(25);
        Building104.setArcWidth(25);
        Building104.setFill(Color.SALMON);
        
        Rectangle Building105 = new Rectangle(1020, 475, 35, 35);
        Building105.setArcHeight(25);
        Building105.setArcWidth(25);
        Building105.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 5
        Rectangle Building106 = new Rectangle(50, 540, 35, 35);
        Building106.setArcHeight(25);
        Building106.setArcWidth(25);
        Building106.setFill(Color.SALMON);
        
        Rectangle Building107 = new Rectangle(125, 540, 35, 35);
        Building107.setArcHeight(25);
        Building107.setArcWidth(25);
        Building107.setFill(Color.SALMON);
        
        Rectangle Building108 = new Rectangle(200, 540, 35, 35);
        Building108.setArcHeight(25);
        Building108.setArcWidth(25);
        Building108.setFill(Color.SALMON);
        
        Rectangle Building109 = new Rectangle(270, 540, 35, 35);
        Building109.setArcHeight(25);
        Building109.setArcWidth(25);
        Building109.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 6
        Rectangle Building110 = new Rectangle(355, 540, 35, 35);
        Building110.setArcHeight(25);
        Building110.setArcWidth(25);
        Building110.setFill(Color.SALMON);
        
        Rectangle Building111 = new Rectangle(425, 540, 35, 35);
        Building111.setArcHeight(25);
        Building111.setArcWidth(25);
        Building111.setFill(Color.SALMON);
        
        Rectangle Building112 = new Rectangle(490, 540, 35, 35);
        Building112.setArcHeight(25);
        Building112.setArcWidth(25);
        Building112.setFill(Color.SALMON);
        
        Rectangle Building113 = new Rectangle(550, 540, 35, 35);
        Building113.setArcHeight(25);
        Building113.setArcWidth(25);
        Building113.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 7
        
        Rectangle Building114 = new Rectangle(640, 540, 35, 35);
        Building114.setArcHeight(25);
        Building114.setArcWidth(25);
        Building114.setFill(Color.SALMON);
        
        Rectangle Building115 = new Rectangle(720, 540, 35, 35);
        Building115.setArcHeight(25);
        Building115.setArcWidth(25);
        Building115.setFill(Color.SALMON);
        
        Rectangle Building116 = new Rectangle(800, 540, 35, 35);
        Building116.setArcHeight(25);
        Building116.setArcWidth(25);
        Building116.setFill(Color.SALMON); 
        
        // Neighbourhood_3 : BLOCK 8
        
        Rectangle Building117 = new Rectangle(890, 540, 35, 35);
        Building117.setArcHeight(25);
        Building117.setArcWidth(25);
        Building117.setFill(Color.SALMON);
        
        Rectangle Building118 = new Rectangle(955, 540, 35, 35);
        Building118.setArcHeight(25);
        Building118.setArcWidth(25);
        Building118.setFill(Color.SALMON);
        
        Rectangle Building119 = new Rectangle(1015, 540, 35, 35);
        Building119.setArcHeight(25);
        Building119.setArcWidth(25);
        Building119.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 9 for "Warehouse , which take Building from 120 to 123 "
        Text Warehouse_label = new Text(100,645,"Warehouse");
        Warehouse_label.setFont(font);
        Warehouse_label.setFill(Color.BLACK);
        Rectangle Warehouse = new Rectangle(45, 600, 35, 35);
        Warehouse.setArcHeight(25);
        Warehouse.setArcWidth(25);
        Warehouse.setWidth(280);
        Warehouse.setHeight(110);
        Warehouse.setFill(Color.SILVER);
        
        // Neighbourhood_3 : BLOCK 10 
        
        Rectangle Building124 = new Rectangle(350, 605, 35, 35);
        Building124.setArcHeight(25);
        Building124.setArcWidth(25);
        Building124.setFill(Color.SALMON);
        
        Rectangle Building125 = new Rectangle(425, 605, 35, 35);
        Building125.setArcHeight(25);
        Building125.setArcWidth(25);
        Building125.setFill(Color.SALMON);
        
        Rectangle Building126 = new Rectangle(490, 605, 35, 35);
        Building126.setArcHeight(25);
        Building126.setArcWidth(25);
        Building126.setFill(Color.SALMON);
        
        Rectangle Building127 = new Rectangle(550, 605, 35, 35);
        Building127.setArcHeight(25);
        Building127.setArcWidth(25);
        Building127.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 11
        Rectangle Building128 = new Rectangle(635, 605, 35, 35);
        Building128.setArcHeight(25);
        Building128.setArcWidth(25);
        Building128.setFill(Color.SALMON);
        
        Rectangle Building129 = new Rectangle(710, 605, 35, 35);
        Building129.setArcHeight(25);
        Building129.setArcWidth(25);
        Building129.setFill(Color.SALMON);
        
        Rectangle Building130 = new Rectangle(785, 605, 35, 35);
        Building130.setArcHeight(25);
        Building130.setArcWidth(25);
        Building130.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 12
        Rectangle Building131 = new Rectangle(880, 605, 35, 35);
        Building131.setArcHeight(25);
        Building131.setArcWidth(25);
        Building131.setFill(Color.SALMON);
        
        Rectangle Building132 = new Rectangle(945, 605, 35, 35);
        Building132.setArcHeight(25);
        Building132.setArcWidth(25);
        Building132.setFill(Color.SALMON);
        
        Rectangle Building133 = new Rectangle(1010, 605, 35, 35);
        Building133.setArcHeight(25);
        Building133.setArcWidth(25);
        Building133.setFill(Color.SALMON);
        
        
        
        
        
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
        
         Line Street_A = new Line(0, 0, 0, 670);
        Street_A.setStrokeWidth(12);
        Street_A.setTranslateX(330);
        Street_A.setTranslateY(0);
        
        // White line inside street A

        Line line_street_white1 = new Line(0, 0, 0, 670);
        line_street_white1.setStrokeWidth(12);
        line_street_white1.setStroke(Color.BLUE);
        line_street_white1.setTranslateX(330);
        line_street_white1.setTranslateY(0); 
        
       
        // STREET B :
         Line Street_B = new Line(0, 0, 0, 670);
        Street_B.setStrokeWidth(12);
        Street_B.setTranslateX(600);
        Street_B.setTranslateY(0);
        
        
        // STREET C: 
        Line Street_C = new Line(0, 0, 0, 670);
        Street_C.setStrokeWidth(12);
        Street_C.setTranslateX(860);
        Street_C.setTranslateY(0);
        
        
        
        
        //-------------CAR ------------ 
        
        
       
        
 
        // For Time : 
        Rectangle timerRectangle = new Rectangle(1080,70,80, 40);
        timerRectangle.setStroke(javafx.scene.paint.Color.SKYBLUE);
        timerRectangle.setStrokeType(StrokeType.INSIDE);
        timerRectangle.setStrokeWidth(5);
        
        // For Distance : 
        Rectangle distanceRectangle = new Rectangle(1190,70,80, 40);
        distanceRectangle.setStroke(javafx.scene.paint.Color.SKYBLUE);
        distanceRectangle.setStrokeType(StrokeType.INSIDE);
        distanceRectangle.setStrokeWidth(5);
        
        // For Cost : 
        Rectangle costRectangle = new Rectangle(1080,140,80, 40);
        costRectangle.setStroke(javafx.scene.paint.Color.SKYBLUE);
        costRectangle.setStrokeType(StrokeType.INSIDE);
        costRectangle.setStrokeWidth(5);
        
        // For No.Simulations : 
        Rectangle No_SimulationRectangle = new Rectangle(1190,140,80, 40);
        No_SimulationRectangle.setStroke(javafx.scene.paint.Color.SKYBLUE);
        No_SimulationRectangle.setStrokeType(StrokeType.INSIDE);
        No_SimulationRectangle.setStrokeWidth(5);
        
        // Time,distance,cost and No.Simulations Labels :
        
        // For Time : 
        
        Font Labelfont = new Font(" Times New Roman",13);
        Label timeLabel = new Label("Time");
        timeLabel.setFont(Labelfont);
        timeLabel.setLayoutX(1100);
        timeLabel.setLayoutY(45);
        
        // For Distance :
        Label distanceLabel = new Label("Distance");
        distanceLabel.setFont(Labelfont);
        distanceLabel.setLayoutX(1200);
        distanceLabel.setLayoutY(45);
        
        // For Cost :
        Label costLabel = new Label("Cost of gasoline");
        costLabel.setFont(Labelfont);
        costLabel.setLayoutX(1075);
        costLabel.setLayoutY(120);
        
        // For No_Simulations :
        Label No_SimulationLabel = new Label("Number of Simulations");
        No_SimulationLabel.setFont(Labelfont);
        No_SimulationLabel.setLayoutX(1190);
        No_SimulationLabel.setLayoutY(120);
      

        
        // Time,distance and cost Counter Labels :
        
        // For Time : 
        
        Font CounterLabelfont = new Font(" Times New Roman",15);
        FadingRectangle.CounterTimeLabel = new Label("00:00:00");
        CounterTimeLabel.setFont(CounterLabelfont);
        CounterTimeLabel.setTextFill(Color.WHITE);
        CounterTimeLabel.setLayoutX(1090);
        CounterTimeLabel.setLayoutY(78);
        
        // For Distance :
        
        FadingRectangle.CounterDistanceLabel = new Label("00.00 Km");
        CounterDistanceLabel.setFont(CounterLabelfont);
        CounterDistanceLabel.setTextFill(Color.WHITE);
        CounterDistanceLabel.setLayoutX(1200);
        CounterDistanceLabel.setLayoutY(78);
        
        // For Cost :
        
        Label CounterCostLabel = new Label("$ 00,00");
        CounterCostLabel.setFont(CounterLabelfont);
        CounterCostLabel.setTextFill(Color.WHITE);
        CounterCostLabel.setLayoutX(1095);
        CounterCostLabel.setLayoutY(150);
        
        // For No_Simulations:
        
        Label CounterNo_SimulationLabel = new Label("0");
        CounterNo_SimulationLabel.setFont(CounterLabelfont);
        CounterNo_SimulationLabel.setTextFill(Color.WHITE);
        CounterNo_SimulationLabel.setLayoutX(1225);
        CounterNo_SimulationLabel.setLayoutY(150);


       // Create Object from Buttons : 
       
        Button Start_button = new Button("Start");
        Start_button.setPrefSize(60, 25);
        Start_button.setLayoutX(1060 );
        Start_button.setLayoutY(15);
        Start_button.setOnAction((event) -> {
            MainProgram.driver.createPath(MainProgram.pathofpackage1);
            MainProgram.driver.moveDriver();
            isStartClicked = true;
            secondsPassed = 0;
            startSimulation();
            
            MainProgram.driver.setOnDeliveryCompletion((Void) -> {
                // When the delivery of the first package is completed, start the second one
                MainProgram.driver.createPath(MainProgram.pathofpackage2);
                MainProgram.driver.moveDriver();
                secondsPassed = 0;
                startSimulation();
            });
        });
                
        Button Pause_button = new Button("Pause");
        Pause_button.setPrefSize(60, 25);
        Pause_button.setLayoutX(1130);
        Pause_button.setLayoutY(15);
        Pause_button.setOnAction(e -> {
            stopSimulation();
        });
        Button End_button = new Button("End ");
        End_button.setPrefSize(60, 25);
        End_button.setLayoutX(1200);
        End_button.setLayoutY(15);
        End_button.setOnAction(e -> {endSimulation();});
        Button Back_button = new Button("Back");
        Back_button.setPrefSize(70, 25);
        Back_button.setLayoutX(1270);
        Back_button.setLayoutY(15);
        Back_button.setOnAction(e -> {
            openFirstPage();
            primaryStage.close();
        });
        

      
      
            // Set the scene's root to the StackPane container

            StackPane root = new StackPane();
            
            // Create a group for Buttons : 
            
            Group buttonsGroup = new Group ();
            buttonsGroup.getChildren().addAll(Start_button,Pause_button,End_button,Back_button);

            // Create a group for neighborhoods
            Group neighborhoodsGroup = new Group();

            // Add homes to Neighborhood 1 group
            
            Group neighborhood1Group = new Group();
            neighborhood1Group.getChildren().addAll( Building1 ,Building2 , Building3 , Building4 ,Building5,Building6,Building7,Building8,Building9,Building10,Building11,Building12,Building13,Building14,Building15,Building16,Building17,Building18,Building19,Building20,Building21,Building22,Building23,Building24,Building25,Building26,Building27,Building28,Building29,Building30,Building31,Building32,Building33,Building34,Building35,Building36,Building37,Building38,Building39,Building40,Building41,Building42,Building43,Building44,Building45,Building46,Building47,Building48,Building49,Building50,Building51,Building52);
            
            // Add homes to Neighborhood 2 group
            Group neighborhood2Group = new Group();
            neighborhood2Group.getChildren().addAll(Building53,Building54,Building55,Building56,Building57,Building58,Building59,Building60,Building61,Building62,Building63,Building64,Building65,Building66,Building67,Building68,Building69,Building70,Building71,Building72,Building73,Building74,Building75,Building76,Building77,Building78,Building79,Building80,Building81,Building82,Building83,Building84,Building85,Building86,Building87,Building88,Building89,Building90,Building91);
            
            // Add homes to Neighborhood 3 group
            
            Group neighborhood3Group = new Group();
            neighborhood3Group.getChildren().addAll(Building92,Building93,Building94,Building95,Building96,Building97,Building98,Building99,Building100,Building101,Building102,Building103,Building104,Building105,Building106,Building107,Building108,Building109,Building110,Building111,Building112,Building113,Building114,Building115,Building116,Building117,Building118,Building119,Warehouse,Warehouse_label,Building124,Building125,Building126,Building127,Building128,Building129,Building130,Building131,Building132,Building133);
            // Add the neighborhood group to the neighborhoodsGroup
            
            neighborhoodsGroup.getChildren().add(neighborhood1Group);
            neighborhoodsGroup.getChildren().add(neighborhood2Group);
            neighborhoodsGroup.getChildren().add(neighborhood3Group);
            neighborhoodsGroup.getChildren().addAll(Neighbourhood_1, Neighbourhood_2, Neighbourhood_3);

            // Create a group for streets
            Group streetsGroup = new Group();
            streetsGroup.getChildren().addAll(Street_1, Street_2, Street_3, Street_4, Street_5,
                            Street_6,Street_7,line_street_white1,Street_8,Street_9,Street_A , 
                            Street_B,Street_C);

            // Create a group for warehouses
            Group warehousesGroup = new Group();
            warehousesGroup.getChildren().addAll(Warehouse, Warehouse_label);

            // Create a group for car routes
            Group carRoutesGroup = new Group();
            carRoutesGroup.getChildren().add(MainProgram.driver.getCar());
            
            Group labelsGroup = new Group();
            labelsGroup.getChildren().addAll(timeLabel, distanceLabel,costLabel,No_SimulationLabel,timerRectangle,distanceRectangle,costRectangle,No_SimulationRectangle);
            Group counterLabelsGroup = new Group();
                counterLabelsGroup.getChildren().addAll( CounterTimeLabel, CounterDistanceLabel,CounterCostLabel,CounterNo_SimulationLabel);

        
            Scene scene = new Scene(root , 1400, 700,Color.WHITE);
            Pane AllGroups = new Pane();
            AllGroups.getChildren().addAll(streetsGroup, neighborhoodsGroup,warehousesGroup,carRoutesGroup,labelsGroup,counterLabelsGroup,buttonsGroup);

            root.getChildren().add(AllGroups);
        // Set the stage title and show the scene
            primaryStage.setTitle("Fading Rectangle");
            primaryStage.setScene(scene );
            primaryStage.show();
    }


   


    public static void startSimulation() {
        Timer timer = new Timer();
    
        TimerTask simulationTask = new TimerTask() {
            @Override
            public void run() {
                if (!isPaused) { // Check if simulation is not paused
                    secondsPassed++;
                    Platform.runLater(() -> {
                        FadingRectangle.CounterTimeLabel.setText(formatTime(secondsPassed));
                    });
    
                    if (allDelivered(MainProgram.driver)) {
                        System.out.println("All packages delivered. Simulation completed.");
                        timer.cancel();
                    }
                }
            }
        };
    
        timer.schedule(simulationTask, 0, 10);
    }
    
    
    
    public static void stopSimulation() {
        isPaused = !isPaused; // Toggle pause state
    
        if (MainProgram.driver.pathTransition != null) {
            if (isPaused) {
                MainProgram.driver.pathTransition.pause();
            } else {
                MainProgram.driver.pathTransition.play();}
        }
    }
    
    public static boolean allDelivered(DeliveryDriver driver) {
        List<Package> packages = driver.getPackages();
    
        boolean allDelivered = true; // Declare and initialize the variable
    
        for (Package aPackage : packages) {
            if (aPackage != null && !aPackage.isDelivered()) {
                allDelivered = false;
                break;  // If any package is not delivered, exit the loop and set allDelivered to false
            }
        }
    
        return allDelivered;  // Return the final result after checking all packages
    }
    

    private static String formatTime(int seconds) {
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        long remainingSeconds = seconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
    }
    public static String formatDistance(double distance) {
        return String.format("%.2f", distance);
    }
    
        
    
    
    private void openFirstPage() {
        FirstPage firstPage = new FirstPage(); // Create an instance of FirstPage
        Stage stage = new Stage(); // Create a new stage
        firstPage.start(stage); // Call the start method of FirstPage, passing the new stage
    }
    public  static void updateDistanceLabel() {
        Platform.runLater(() -> {
            double currentDistance = DeliveryDriver.getDistance();
            FadingRectangle.CounterDistanceLabel.setText(FadingRectangle.formatDistance(currentDistance));
            });
    }
    public static void updateGasolineCostLabel() {
        Platform.runLater(() -> {
            double costOfGasoline = DeliveryDriver.getGasolineCost();
            FadingRectangle.CounterCostLabel.setText(formatGasolineCost(costOfGasoline));
        });
    }
    public static String formatGasolineCost(double cost) {
        return String.format("%s %.2f", "$" , cost ); // Replace "Currency" with your desired currency symbol or abbreviation
    }

    public static void endSimulation() {
        secondsPassed = 0;
        MainProgram.driver.continueTransition = false;
        MainProgram.driver.handleTransitionCompletion();


    }

    }
    
    



