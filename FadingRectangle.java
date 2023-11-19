import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.text.*;
import javafx.scene.shape.StrokeType;
import javafx.scene.layout.Pane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class FadingRectangle extends Application {

    @Override
    public void start(Stage primaryStage) {
        // ------------ Neighbourhoods ------------------------
        
        // Neighbourhood 1 : from ( rect 1 to rect 52 ) , with 16 blocks
        Text Neighbourhood_1 = new Text(1090, 230, "Alhamdaniya");
        Font font = new Font("Times New Roman",25);
        Neighbourhood_1.setFont(font);
        Neighbourhood_1.setFill(Color.GREY);
        Neighbourhood_1.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 1
        Rectangle rect1 = new Rectangle(50, 20, 35, 35);
        rect1.setArcHeight(20);
        rect1.setArcWidth(20);
        rect1.setFill(Color.GREY);
        
        Rectangle rect2 = new Rectangle(160, 20, 35, 35);
        rect2.setArcHeight(20);
        rect2.setArcWidth(20);
        rect2.setFill(Color.GREY);
        
        Rectangle rect3 = new Rectangle(270, 20, 35, 35);
        rect3.setArcHeight(20);
        rect3.setArcWidth(20);
        rect3.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 2
        Rectangle rect4 = new Rectangle(350, 20, 35, 35);
        rect4.setArcHeight(25);
        rect4.setArcWidth(25);
        rect4.setFill(Color.GREY);
        
        Rectangle rect5 = new Rectangle(425, 20, 35, 35);
        rect5.setArcHeight(25);
        rect5.setArcWidth(25);
        rect5.setFill(Color.GREY);
        
        Rectangle rect6 = new Rectangle(490, 20, 35, 35);
        rect6.setArcHeight(25);
        rect6.setArcWidth(25);
        rect6.setFill(Color.GREY);
        
        Rectangle rect7 = new Rectangle(550, 20, 35, 35);
        rect7.setArcHeight(25);
        rect7.setArcWidth(25);
        rect7.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 3
        Rectangle rect8 = new Rectangle(640, 20, 35, 35);
        rect8.setArcHeight(25);
        rect8.setArcWidth(25);
        rect8.setFill(Color.GREY);
        
        Rectangle rect9 = new Rectangle(710, 20, 35, 35);
        rect9.setArcHeight(25);
        rect9.setArcWidth(25);
        rect9.setFill(Color.GREY);
        
        Rectangle rect10 = new Rectangle(790, 20, 35, 35);
        rect10.setArcHeight(25);
        rect10.setArcWidth(25);
        rect10.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 4
        Rectangle rect11 = new Rectangle(880, 20, 35, 35);
        rect11.setArcHeight(25);
        rect11.setArcWidth(25);
        rect11.setHeight(35);
        rect11.setWidth(70);
        rect11.setFill(Color.GREY);
        
        Rectangle rect12 = new Rectangle(970, 20, 35, 35);
        rect12.setArcHeight(25);
        rect12.setArcWidth(25);
        rect12.setHeight(35);
        rect12.setWidth(70);
        rect12.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 5
        Rectangle rect13 = new Rectangle(50, 80, 35, 35);
        rect13.setArcHeight(25);
        rect13.setArcWidth(25);
        rect13.setFill(Color.GREY);
        
        Rectangle rect14 = new Rectangle(125, 80, 35, 35);
        rect14.setArcHeight(25);
        rect14.setArcWidth(25);
        rect14.setFill(Color.GREY);
        
        Rectangle rect15 = new Rectangle(200, 80, 35, 35);
        rect15.setArcHeight(25);
        rect15.setArcWidth(25);
        rect15.setFill(Color.GREY);
        
        Rectangle rect16 = new Rectangle(270, 80, 35, 35);
        rect16.setArcHeight(25);
        rect16.setArcWidth(25);
        rect16.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 6
        
        Rectangle rect17 = new Rectangle(350, 80, 35, 35);
        rect17.setArcHeight(25);
        rect17.setArcWidth(25);
        rect17.setFill(Color.GREY);
        
        Rectangle rect18 = new Rectangle(460, 80, 35, 35);
        rect18.setArcHeight(25);
        rect18.setArcWidth(25);
        rect18.setFill(Color.GREY);
        
        Rectangle rect19 = new Rectangle(550, 80, 35, 35);
        rect19.setArcHeight(25);
        rect19.setArcWidth(25);
        rect19.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 7
        Rectangle rect20 = new Rectangle(625, 80, 35, 35);
        rect20.setArcHeight(25);
        rect20.setArcWidth(25);
        rect20.setFill(Color.GREY);
        
        Rectangle rect21 = new Rectangle(680, 80, 35, 35);
        rect21.setArcHeight(25);
        rect21.setArcWidth(25);
        rect21.setFill(Color.GREY);
        
        Rectangle rect22 = new Rectangle(740, 80, 35, 35);
        rect22.setArcHeight(25);
        rect22.setArcWidth(25);
        rect22.setFill(Color.GREY);
        
        Rectangle rect23 = new Rectangle(800, 80, 35, 35);
        rect23.setArcHeight(25);
        rect23.setArcWidth(25);
        rect23.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 8
        Rectangle rect24 = new Rectangle(875, 80, 35, 35);
        rect24.setArcHeight(25);
        rect24.setArcWidth(25);
        rect24.setFill(Color.GREY);
        
        Rectangle rect25 = new Rectangle(950, 80, 35, 35);
        rect25.setArcHeight(25);
        rect25.setArcWidth(25);
        rect25.setFill(Color.GREY);
        
        Rectangle rect26 = new Rectangle(1020, 80, 35, 35);
        rect26.setArcHeight(25);
        rect26.setArcWidth(25);
        rect26.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 9
        Rectangle rect27 = new Rectangle(50, 150, 35, 35);
        rect27.setArcHeight(25);
        rect27.setArcWidth(25);
        rect27.setFill(Color.GREY);
        
        Rectangle rect28 = new Rectangle(160, 150, 35, 35);
        rect28.setArcHeight(25);
        rect28.setArcWidth(25);
        rect28.setFill(Color.GREY);
        
        Rectangle rect29 = new Rectangle(270, 150, 35, 35);
        rect29.setArcHeight(25);
        rect29.setArcWidth(25);
        rect29.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 10
        
        Rectangle rect30 = new Rectangle(350, 150, 35, 35);
        rect30.setArcHeight(25);
        rect30.setArcWidth(25);
        rect30.setFill(Color.GREY);
        
        Rectangle rect31 = new Rectangle(425, 150, 35, 35);
        rect31.setArcHeight(25);
        rect31.setArcWidth(25);
        rect31.setFill(Color.GREY);
        
        Rectangle rect32 = new Rectangle(490, 150, 35, 35);
        rect32.setArcHeight(25);
        rect32.setArcWidth(25);
        rect32.setFill(Color.GREY);
        
        Rectangle rect33 = new Rectangle(550, 150, 35, 35);
        rect33.setArcHeight(25);
        rect33.setArcWidth(25);
        rect33.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 11
        
        Rectangle rect34 = new Rectangle(630, 150, 35, 35);
        rect34.setArcHeight(25);
        rect34.setArcWidth(25);
        rect34.setFill(Color.GREY);
        
        Rectangle rect35 = new Rectangle(710, 150, 35, 35);
        rect35.setArcHeight(25);
        rect35.setArcWidth(25);
        rect35.setFill(Color.GREY);
        
        Rectangle rect36 = new Rectangle(790, 150, 35, 35);
        rect36.setArcHeight(25);
        rect36.setArcWidth(25);
        rect36.setFill(Color.GREY);
          
       // Neighbourhood_1 : BLOCK 12
       
        Rectangle rect37 = new Rectangle(870, 150, 35, 35);
        rect37.setArcHeight(25);
        rect37.setArcWidth(25);
        rect37.setFill(Color.GREY);
        
        Rectangle rect38 = new Rectangle(920, 150, 35, 35);
        rect38.setArcHeight(25);
        rect38.setArcWidth(25);
        rect38.setFill(Color.GREY);
        
        Rectangle rect39 = new Rectangle(970, 150, 35, 35);
        rect39.setArcHeight(25);
        rect39.setArcWidth(25);
        rect39.setFill(Color.GREY);
        
        Rectangle rect40 = new Rectangle(1020, 150, 35, 35);
        rect40.setArcHeight(25);
        rect40.setArcWidth(25);
        rect40.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 13 
        
        Rectangle rect41 = new Rectangle(50, 215, 35, 35);
        rect41.setArcHeight(25);
        rect41.setArcWidth(25);
        rect41.setFill(Color.GREY);
        
        Rectangle rect42 = new Rectangle(165, 215, 35, 35);
        rect42.setArcHeight(25);
        rect42.setArcWidth(25);
        rect42.setFill(Color.GREY);
        
        Rectangle rect43 = new Rectangle(270, 215, 35, 35);
        rect43.setArcHeight(25);
        rect43.setArcWidth(25);
        rect43.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 14 
        
        Rectangle rect44 = new Rectangle(360, 215, 35, 35);
        rect44.setArcHeight(25);
        rect44.setArcWidth(25);
        rect44.setHeight(35);
        rect44.setWidth(80);
        rect44.setFill(Color.GREY);
        
        Rectangle rect45 = new Rectangle(495, 215, 35, 35);
        rect45.setArcHeight(25);
        rect45.setArcWidth(25);
        rect45.setHeight(35);
        rect45.setWidth(80);
        rect45.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 15 
        Rectangle rect46 = new Rectangle(620, 215, 35, 35);
        rect46 .setArcHeight(25);
        rect46.setArcWidth(25);
        rect46.setFill(Color.GREY);
        
        Rectangle rect47 = new Rectangle(680, 215, 35, 35);
        rect47.setArcHeight(25);
        rect47.setArcWidth(25);
        rect47.setFill(Color.GREY);
        
        Rectangle rect48 = new Rectangle(740, 215, 35, 35);
        rect48.setArcHeight(25);
        rect48.setArcWidth(25);
        rect48.setFill(Color.GREY);
        
        Rectangle rect49 = new Rectangle(800, 215, 35, 35);
        rect49.setArcHeight(25);
        rect49.setArcWidth(25);
        rect49.setFill(Color.GREY);
        
        // Neighbourhood_1 : BLOCK 16
        Rectangle rect50 = new Rectangle(880, 215, 35, 35);
        rect50.setArcHeight(25);
        rect50.setArcWidth(25);
        rect50.setFill(Color.GREY);
        
        Rectangle rect51 = new Rectangle(950, 215, 35, 35);
        rect51.setArcHeight(25);
        rect51.setArcWidth(25);
        rect51.setFill(Color.GREY);
        
        Rectangle rect52 = new Rectangle(1010, 215, 35, 35);
        rect52.setArcHeight(25);
        rect52.setArcWidth(25);
        rect52.setFill(Color.GREY);
        
        // Neighbourhood 2 ( from rect 53 to rect 91 ) with 12 blocks :
        
        Text Neighbourhood_2 = new Text(1120, 400, "Almanar");
        Neighbourhood_2.setFont(font);
        Neighbourhood_2.setFill(Color.BLUE);
        Neighbourhood_2.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 1
        Rectangle rect53 = new Rectangle(50, 280, 35, 35);
        rect53.setArcHeight(25);
        rect53.setArcWidth(25);
        rect53.setFill(Color.BLUE);
        
        Rectangle rect54 = new Rectangle(125, 280, 35, 35);
        rect54.setArcHeight(25);
        rect54.setArcWidth(25);
        rect54.setFill(Color.BLUE);
        
        Rectangle rect55 = new Rectangle(200, 280, 35, 35);
        rect55.setArcHeight(25);
        rect55.setArcWidth(25);
        rect55.setFill(Color.BLUE);
        
        Rectangle rect56 = new Rectangle(270, 280, 35, 35);
        rect56.setArcHeight(25);
        rect56.setArcWidth(25);
        rect56.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 2
        
        Rectangle rect57 = new Rectangle(370, 280, 35, 35);
        rect57.setArcHeight(25);
        rect57.setArcWidth(25);
        rect57.setFill(Color.BLUE);
        
        Rectangle rect58 = new Rectangle(460, 280, 35, 35);
        rect58.setArcHeight(25);
        rect58.setArcWidth(25);
        rect58.setFill(Color.BLUE);
        
        Rectangle rect59 = new Rectangle(540, 280, 35, 35);
        rect59.setArcHeight(25);
        rect59.setArcWidth(25);
        rect59.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 3 :
        
        Rectangle rect60 = new Rectangle(630, 280, 35, 35);
        rect60 .setArcHeight(25);
        rect60.setArcWidth(25);
        rect60.setFill(Color.BLUE);
        
        Rectangle rect61 = new Rectangle(690, 280, 35, 35);
        rect61.setArcHeight(25);
        rect61.setArcWidth(25);
        rect61.setFill(Color.BLUE);
        
        Rectangle rect62 = new Rectangle(750, 280, 35, 35);
        rect62.setArcHeight(25);
        rect62.setArcWidth(25);
        rect62.setFill(Color.BLUE);
        
        Rectangle rect63 = new Rectangle(810, 280, 35, 35);
        rect63.setArcHeight(25);
        rect63.setArcWidth(25);
        rect63.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 4
        
        Rectangle rect64 = new Rectangle(890, 280, 35, 35);
        rect64.setArcHeight(25);
        rect64.setArcWidth(25);
        rect64.setHeight(35);
        rect64.setWidth(70);
        rect64.setFill(Color.BLUE);
        
        Rectangle rect65 = new Rectangle(980, 280, 35, 35);
        rect65.setArcHeight(25);
        rect65.setArcWidth(25);
        rect65.setHeight(35);
        rect65.setWidth(70);
        rect65.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 5
        Rectangle rect66 = new Rectangle(50, 345, 35, 35);
        rect66.setArcHeight(25);
        rect66.setArcWidth(25);
        rect66.setFill(Color.BLUE);
        
        Rectangle rect67 = new Rectangle(125, 345, 35, 35);
        rect67.setArcHeight(25);
        rect67.setArcWidth(25);
        rect67.setFill(Color.BLUE);
        
        Rectangle rect68 = new Rectangle(200, 345, 35, 35);
        rect68.setArcHeight(25);
        rect68.setArcWidth(25);
        rect68.setFill(Color.BLUE);
        
        Rectangle rect69 = new Rectangle(270, 345, 35, 35);
        rect69.setArcHeight(25);
        rect69.setArcWidth(25);
        rect69.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 6
        
        Rectangle rect70 = new Rectangle(370, 345, 35, 35);
        rect70.setArcHeight(25);
        rect70.setArcWidth(25);
        rect70.setFill(Color.BLUE);
        
        Rectangle rect71 = new Rectangle(460, 345, 35, 35);
        rect71.setArcHeight(25);
        rect71.setArcWidth(25);
        rect71.setFill(Color.BLUE);
        
        Rectangle rect72 = new Rectangle(540, 345, 35, 35);
        rect72.setArcHeight(25);
        rect72.setArcWidth(25);
        rect72.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 7
        
        Rectangle rect73 = new Rectangle(630, 345, 35, 35);
        rect73.setArcHeight(25);
        rect73.setArcWidth(25);
        rect73.setFill(Color.BLUE);
        
        Rectangle rect74 = new Rectangle(690, 345, 35, 35);
        rect74.setArcHeight(25);
        rect74.setArcWidth(25);
        rect74.setFill(Color.BLUE);
        
        Rectangle rect75 = new Rectangle(750, 345, 35, 35);
        rect75.setArcHeight(25);
        rect75.setArcWidth(25);
        rect75.setFill(Color.BLUE);
        
        Rectangle rect76 = new Rectangle(810, 345, 35, 35);
        rect76.setArcHeight(25);
        rect76.setArcWidth(25);
        rect76.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 8
        
        Rectangle rect77 = new Rectangle(880, 345, 35, 35);
        rect77.setArcHeight(25);
        rect77.setArcWidth(25);
        rect77.setFill(Color.BLUE);
        
        Rectangle rect78 = new Rectangle(950, 345, 35, 35);
        rect78.setArcHeight(25);
        rect78.setArcWidth(25);
        rect78.setFill(Color.BLUE);
        
        Rectangle rect79 = new Rectangle(1010, 345, 35, 35);
        rect79.setArcHeight(25);
        rect79.setArcWidth(25);
        rect79.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 9
        Rectangle rect80 = new Rectangle(50, 410, 35, 35);
        rect80.setArcHeight(25);
        rect80.setArcWidth(25);
        rect80.setFill(Color.BLUE);
        
        Rectangle rect81 = new Rectangle(165, 410, 35, 35);
        rect81.setArcHeight(25);
        rect81.setArcWidth(25);
        rect81.setFill(Color.BLUE);
        
        Rectangle rect82 = new Rectangle(270, 410, 35, 35);
        rect82.setArcHeight(25);
        rect82.setArcWidth(25);
        rect82.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 10 
        Rectangle rect83 = new Rectangle(350, 410, 35, 35);
        rect83.setArcHeight(25);
        rect83.setArcWidth(25);
        rect83.setFill(Color.BLUE);
        
        Rectangle rect84 = new Rectangle(425, 410, 35, 35);
        rect84.setArcHeight(25);
        rect84.setArcWidth(25);
        rect84.setFill(Color.BLUE);
        
        Rectangle rect85 = new Rectangle(490, 410, 35, 35);
        rect85.setArcHeight(25);
        rect85.setArcWidth(25);
        rect85.setFill(Color.BLUE);
        
        Rectangle rect86 = new Rectangle(550, 410, 35, 35);
        rect86.setArcHeight(25);
        rect86.setArcWidth(25);
        rect86.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 11
        Rectangle rect87 = new Rectangle(640, 410, 35, 35);
        rect87.setArcHeight(25);
        rect87.setArcWidth(25);
        rect87.setHeight(35);
        rect87.setWidth(80);
        rect87.setFill(Color.BLUE);
        
        Rectangle rect88 = new Rectangle(760, 410, 35, 35);
        rect88.setArcHeight(25);
        rect88.setArcWidth(25);
        rect88.setHeight(35);
        rect88.setWidth(80);
        rect88.setFill(Color.BLUE);
        
        // Neighbourhood_2 : BLOCK 12 
        Rectangle rect89 = new Rectangle(880, 410, 35, 35);
        rect89.setArcHeight(25);
        rect89.setArcWidth(25);
        rect89.setFill(Color.BLUE);
        
        Rectangle rect90 = new Rectangle(950, 410, 35, 35);
        rect90.setArcHeight(25);
        rect90.setArcWidth(25);
        rect90.setFill(Color.BLUE);
        
        Rectangle rect91 = new Rectangle(1010, 410, 35, 35);
        rect91.setArcHeight(25);
        rect91.setArcWidth(25);
        rect91.setFill(Color.BLUE);
        
        // Neighbourhood 3 ( from rect 92 to rect 133  ) with 12 blocks include Warehouse :
        Text Neighbourhood_3 = new Text(1120, 550, "AlRabwah");
        Neighbourhood_3.setFont(font);
        Neighbourhood_3.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 1
        Rectangle rect92 = new Rectangle(50, 475, 35, 35);
        rect92.setArcHeight(25);
        rect92.setArcWidth(25);
        rect92.setFill(Color.SALMON);
        
        Rectangle rect93 = new Rectangle(125, 475, 35, 35);
        rect93.setArcHeight(25);
        rect93.setArcWidth(25);
        rect93.setFill(Color.SALMON);
        
        Rectangle rect94 = new Rectangle(200, 475, 35, 35);
        rect94.setArcHeight(25);
        rect94.setArcWidth(25);
        rect94.setFill(Color.SALMON);
        
        Rectangle rect95 = new Rectangle(270, 475, 35, 35);
        rect95.setArcHeight(25);
        rect95.setArcWidth(25);
        rect95.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 2
        Rectangle rect96 = new Rectangle(370, 475, 35, 35);
        rect96.setArcHeight(25);
        rect96.setArcWidth(25);
        rect96.setFill(Color.SALMON);
        
        Rectangle rect97 = new Rectangle(460, 475, 35, 35);
        rect97.setArcHeight(25);
        rect97.setArcWidth(25);
        rect97.setFill(Color.SALMON);
        
        Rectangle rect98 = new Rectangle(540, 475, 35, 35);
        rect98.setArcHeight(25);
        rect98.setArcWidth(25);
        rect98.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 3
        Rectangle rect99 = new Rectangle(630, 475, 35, 35);
        rect99.setArcHeight(25);
        rect99.setArcWidth(25);
        rect99.setFill(Color.SALMON);
        
        Rectangle rect100 = new Rectangle(690, 475, 35, 35);
        rect100.setArcHeight(25);
        rect100.setArcWidth(25);
        rect100.setFill(Color.SALMON);
        
        Rectangle rect101 = new Rectangle(750, 475, 35, 35);
        rect101.setArcHeight(25);
        rect101.setArcWidth(25);
        rect101.setFill(Color.SALMON);
        
        Rectangle rect102 = new Rectangle(810, 475, 35, 35);
        rect102.setArcHeight(25);
        rect102.setArcWidth(25);
        rect102.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 4
        Rectangle rect103 = new Rectangle(890, 475, 35, 35);
        rect103.setArcHeight(25);
        rect103.setArcWidth(25);
        rect103.setFill(Color.SALMON);
        
        Rectangle rect104 = new Rectangle(960, 475, 35, 35);
        rect104.setArcHeight(25);
        rect104.setArcWidth(25);
        rect104.setFill(Color.SALMON);
        
        Rectangle rect105 = new Rectangle(1020, 475, 35, 35);
        rect105.setArcHeight(25);
        rect105.setArcWidth(25);
        rect105.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 5
        Rectangle rect106 = new Rectangle(50, 540, 35, 35);
        rect106.setArcHeight(25);
        rect106.setArcWidth(25);
        rect106.setFill(Color.SALMON);
        
        Rectangle rect107 = new Rectangle(125, 540, 35, 35);
        rect107.setArcHeight(25);
        rect107.setArcWidth(25);
        rect107.setFill(Color.SALMON);
        
        Rectangle rect108 = new Rectangle(200, 540, 35, 35);
        rect108.setArcHeight(25);
        rect108.setArcWidth(25);
        rect108.setFill(Color.SALMON);
        
        Rectangle rect109 = new Rectangle(270, 540, 35, 35);
        rect109.setArcHeight(25);
        rect109.setArcWidth(25);
        rect109.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 6
        Rectangle rect110 = new Rectangle(355, 540, 35, 35);
        rect110.setArcHeight(25);
        rect110.setArcWidth(25);
        rect110.setFill(Color.SALMON);
        
        Rectangle rect111 = new Rectangle(425, 540, 35, 35);
        rect111.setArcHeight(25);
        rect111.setArcWidth(25);
        rect111.setFill(Color.SALMON);
        
        Rectangle rect112 = new Rectangle(490, 540, 35, 35);
        rect112.setArcHeight(25);
        rect112.setArcWidth(25);
        rect112.setFill(Color.SALMON);
        
        Rectangle rect113 = new Rectangle(550, 540, 35, 35);
        rect113.setArcHeight(25);
        rect113.setArcWidth(25);
        rect113.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 7
        
        Rectangle rect114 = new Rectangle(640, 540, 35, 35);
        rect114.setArcHeight(25);
        rect114.setArcWidth(25);
        rect114.setFill(Color.SALMON);
        
        Rectangle rect115 = new Rectangle(720, 540, 35, 35);
        rect115.setArcHeight(25);
        rect115.setArcWidth(25);
        rect115.setFill(Color.SALMON);
        
        Rectangle rect116 = new Rectangle(800, 540, 35, 35);
        rect116.setArcHeight(25);
        rect116.setArcWidth(25);
        rect116.setFill(Color.SALMON); 
        
        // Neighbourhood_3 : BLOCK 8
        
        Rectangle rect117 = new Rectangle(890, 540, 35, 35);
        rect117.setArcHeight(25);
        rect117.setArcWidth(25);
        rect117.setFill(Color.SALMON);
        
        Rectangle rect118 = new Rectangle(955, 540, 35, 35);
        rect118.setArcHeight(25);
        rect118.setArcWidth(25);
        rect118.setFill(Color.SALMON);
        
        Rectangle rect119 = new Rectangle(1015, 540, 35, 35);
        rect119.setArcHeight(25);
        rect119.setArcWidth(25);
        rect119.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 9 for "Warehouse , which take rect from 120 to 123 "
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
        
        Rectangle rect124 = new Rectangle(350, 605, 35, 35);
        rect124.setArcHeight(25);
        rect124.setArcWidth(25);
        rect124.setFill(Color.SALMON);
        
        Rectangle rect125 = new Rectangle(425, 605, 35, 35);
        rect125.setArcHeight(25);
        rect125.setArcWidth(25);
        rect125.setFill(Color.SALMON);
        
        Rectangle rect126 = new Rectangle(490, 605, 35, 35);
        rect126.setArcHeight(25);
        rect126.setArcWidth(25);
        rect126.setFill(Color.SALMON);
        
        Rectangle rect127 = new Rectangle(550, 605, 35, 35);
        rect127.setArcHeight(25);
        rect127.setArcWidth(25);
        rect127.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 11
        Rectangle rect128 = new Rectangle(635, 605, 35, 35);
        rect128.setArcHeight(25);
        rect128.setArcWidth(25);
        rect128.setFill(Color.SALMON);
        
        Rectangle rect129 = new Rectangle(710, 605, 35, 35);
        rect129.setArcHeight(25);
        rect129.setArcWidth(25);
        rect129.setFill(Color.SALMON);
        
        Rectangle rect130 = new Rectangle(785, 605, 35, 35);
        rect130.setArcHeight(25);
        rect130.setArcWidth(25);
        rect130.setFill(Color.SALMON);
        
        // Neighbourhood_3 : BLOCK 12
        Rectangle rect131 = new Rectangle(880, 605, 35, 35);
        rect131.setArcHeight(25);
        rect131.setArcWidth(25);
        rect131.setFill(Color.SALMON);
        
        Rectangle rect132 = new Rectangle(945, 605, 35, 35);
        rect132.setArcHeight(25);
        rect132.setArcWidth(25);
        rect132.setFill(Color.SALMON);
        
        Rectangle rect133 = new Rectangle(1010, 605, 35, 35);
        rect133.setArcHeight(25);
        rect133.setArcWidth(25);
        rect133.setFill(Color.SALMON);
        
        
        
        
        
        // ------------------STREETS-----------------------
        
        
        // Streets for Alhamdaniyah Neighourhood: 
        
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
        
        //Streets for AlManar Neighourhood:
        
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
        
        //Streets for AlRabwah Neighourhood: 
        
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
        
        
        //STREET A: 
        
         Line line_stret_topDwon1 = new Line(0, 0, 0, 670);
        line_stret_topDwon1.setStrokeWidth(12);
        line_stret_topDwon1.setTranslateX(330);
        line_stret_topDwon1.setTranslateY(0);
        
        // White line inside street A

        Line line_street_white1 = new Line(0, 0, 0, 670);
        line_street_white1.setStrokeWidth(12);
        line_street_white1.setStroke(Color.BLUE);
        line_street_white1.setTranslateX(330);
        line_street_white1.setTranslateY(0); 
        
       
        // STREET B :
         Line line_stret_topDwon2 = new Line(0, 0, 0, 670);
        line_stret_topDwon2.setStrokeWidth(12);
        line_stret_topDwon2.setTranslateX(600);
        line_stret_topDwon2.setTranslateY(0);
        
        
        // STREET C: 
        Line line_stret_topDwon3 = new Line(0, 0, 0, 670);
        line_stret_topDwon3.setStrokeWidth(12);
        line_stret_topDwon3.setTranslateX(860);
        line_stret_topDwon3.setTranslateY(0);
        
        
        
        
        //-------------CAR ------------ 
        
        
        Rectangle car = new Rectangle(75, 180, 15, 15);
        car.setArcHeight(15);
        car.setArcWidth(15);
        car.setFill(Color.RED);   
        
        //Instantiating the path class  
     
        
        Path path = new Path();
        MoveTo move = new MoveTo(300, 645);
        LineTo line1 = new LineTo(330, 645);
        MoveTo move2 = new MoveTo(330, 645);
        LineTo line2 = new LineTo(330, 100);
        path.getElements().addAll(move, line1 , move2 , line2);
        
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.seconds(15));
        pathTransition.setNode(car);
        pathTransition.setPath(path);
        pathTransition.play();

       // Time,distance and cost Counter Shapes :
       
        // StackPane roo = new StackPane();
        Rectangle timerRectangle = new Rectangle(1080,70,80, 40);
        timerRectangle.setStroke(javafx.scene.paint.Color.SKYBLUE);
        timerRectangle.setStrokeType(StrokeType.INSIDE);
        timerRectangle.setStrokeWidth(5);
        Rectangle distanceRectangle = new Rectangle(1190,70,80, 40);
        distanceRectangle.setStroke(javafx.scene.paint.Color.SKYBLUE);
        distanceRectangle.setStrokeType(StrokeType.INSIDE);
        distanceRectangle.setStrokeWidth(5);
        Rectangle costRectangle = new Rectangle(1130,130,80, 40);
        costRectangle.setStroke(javafx.scene.paint.Color.SKYBLUE);
        costRectangle.setStrokeType(StrokeType.INSIDE);
        costRectangle.setStrokeWidth(5);
        
        // Time,distance and cost Labels :
        
        Font Labelfont = new Font(" Times New Roman",15);
        Label timeLabel = new Label("Time");
        Label distanceLabel = new Label("Distance");
        Label costLabel = new Label("Cost of gasoline");
        timeLabel.setFont(Labelfont);
        distanceLabel.setFont(Labelfont);
        costLabel.setFont(Labelfont);
        timeLabel.setLayoutX(1100);
        timeLabel.setLayoutY(45);
        distanceLabel.setLayoutX(1200);
        distanceLabel.setLayoutY(45);
        costLabel.setLayoutX(1122);
        costLabel.setLayoutY(110);
        // MeneButton---------------------------------------------
      

        
        // Time,distance and cost Counter Labels :
        
        Font CounterLabelfont = new Font(" Times New Roman",15);
        Label CounterTimeLabel = new Label("00:00:00");
        Label CounterDistanceLabel = new Label("00.00 Km");
        Label CounterCostLabel = new Label("$ 00,00");
        CounterTimeLabel.setFont(CounterLabelfont);
        CounterTimeLabel.setTextFill(Color.WHITE);
        CounterDistanceLabel.setFont(CounterLabelfont);
        CounterDistanceLabel.setTextFill(Color.WHITE);
        CounterCostLabel.setFont(CounterLabelfont);
        CounterCostLabel.setTextFill(Color.WHITE);
        CounterTimeLabel.setLayoutX(1090);
        CounterTimeLabel.setLayoutY(78);
        CounterDistanceLabel.setLayoutX(1200);
        CounterDistanceLabel.setLayoutY(78);
        CounterCostLabel.setLayoutX(1145);
        CounterCostLabel.setLayoutY(140);



       Button button1 = new Button("Start");
        button1.setPrefSize(60, 25);
        button1.setLayoutX(1060 );
        button1.setLayoutY(15);

        Button button2 = new Button("Pause");
        button2.setPrefSize(60, 25);
        button2.setLayoutX(1130);
        button2.setLayoutY(15);

        Button button3 = new Button("End ");
        button3.setPrefSize(60, 25);
        button3.setLayoutX(1200);
        button3.setLayoutY(15);

        Button button4 = new Button("Rise speed");
        button4.setPrefSize(70, 25);
        button4.setLayoutX(1270);
        button4.setLayoutY(15);
        

      
      
            // Set the scene's root to the StackPane container

            StackPane root = new StackPane();

            // Create a group for neighborhoods
            Group neighborhoodsGroup = new Group();

            // Add homes to Neighborhood 1 group
            
            Group neighborhood1Group = new Group();
            neighborhood1Group.getChildren().addAll(button1, button2, button3, button4 , rect1 ,rect2 , rect3 , rect4 ,rect5,rect6,rect7,rect8,rect9,rect10,rect11,rect12,rect13,rect14,rect15,rect16,rect17,rect18,rect19,rect20,rect21,rect22,rect23,rect24,rect25,rect26,rect27,rect28,rect29,rect30,rect31,rect32,rect33,rect34,rect35,rect36,rect37,rect38,rect39,rect40,rect41,rect42,rect43,rect44,rect45,rect46,rect47,rect48,rect49,rect50,rect51,rect52);
            
            // Add homes to Neighborhood 2 group
            Group neighborhood2Group = new Group();
            neighborhood2Group.getChildren().addAll(rect53,rect54,rect55,rect56,rect57,rect58,rect59,rect60,rect61,rect62,rect63,rect64,rect65,rect66,rect67,rect68,rect69,rect70,rect71,rect72,rect73,rect74,rect75,rect76,rect77,rect78,rect79,rect80,rect81,rect82,rect83,rect84,rect85,rect86,rect87,rect88,rect89,rect90,rect91);
            
            // Add homes to Neighborhood 3 group
            
            Group neighborhood3Group = new Group();
            neighborhood3Group.getChildren().addAll(rect92,rect93,rect94,rect95,rect96,rect97,rect98,rect99,rect100,rect101,rect102,rect103,rect104,rect105,rect106,rect107,rect108,rect109,rect110,rect111,rect112,rect113,rect114,rect115,rect116,rect117,rect118,rect119,Warehouse,Warehouse_label,rect124,rect125,rect126,rect127,rect128,rect129,rect130,rect131,rect132,rect133);
            // Add the neighborhood group to the neighborhoodsGroup
            
            neighborhoodsGroup.getChildren().add(neighborhood1Group);
            neighborhoodsGroup.getChildren().add(neighborhood2Group);
            neighborhoodsGroup.getChildren().add(neighborhood3Group);
            neighborhoodsGroup.getChildren().addAll(Neighbourhood_1, Neighbourhood_2, Neighbourhood_3);

            // Create a group for streets
            Group streetsGroup = new Group();
            streetsGroup.getChildren().addAll(line_stret1, line_stret2, line_stret3, line_stret4, line_stret5,
                            line_stret6,line_stret7,line_street_white1,line_stret8,line_stret9,line_stret_topDwon1 , 
                            line_stret_topDwon2,line_stret_topDwon3);

            // Create a group for warehouses
            Group warehousesGroup = new Group();
            warehousesGroup.getChildren().addAll(Warehouse, Warehouse_label);

            // Create a group for car routes
            Group carRoutesGroup = new Group();
            carRoutesGroup.getChildren().add(car);
            
            Group labelsGroup = new Group();
            labelsGroup.getChildren().addAll(timeLabel, distanceLabel,costLabel,timerRectangle,distanceRectangle,costRectangle);
            Group counterLabelsGroup = new Group();
                counterLabelsGroup.getChildren().addAll( CounterTimeLabel, CounterDistanceLabel,CounterCostLabel);

        
            Scene scene = new Scene(root , 1500, 700,Color.WHITE);
            Pane AllGroups = new Pane();
            AllGroups.getChildren().addAll(streetsGroup, neighborhoodsGroup,warehousesGroup,carRoutesGroup,labelsGroup,counterLabelsGroup);

            root.getChildren().add(AllGroups);
        // Set the stage title and show the scene
            primaryStage.setTitle("Fading Rectangle");
            primaryStage.setScene(scene );
            primaryStage.show();
    }

}
