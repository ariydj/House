  /*
        - I tried doing the stairs but i kept messing up the for loop, I was wondering if you can teach me it in a office hour. I really want to know hoew to do it. 
        - I also didnt know if you wanted the rectangles in the door
  */

package houseapplication;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class HouseApplication extends Application{

    public static void main(String[] args) {
        
        launch (args);
    }
   
    @Override
    public void start(Stage stage) throws Exception 
    {    
        /*
        int size = 10, stp = 25;
        Line[] arrln = new Line[size];
        */
// House
        
        Polygon Roof = new Polygon(79,153,701,153,388,0);
        Roof.setFill(Color.WHITE);
        Roof.setStrokeWidth(1);
        Roof.setStroke(Color.BLACK);          
        
        Rectangle frontWallTop = new Rectangle(50,157, 700, 31);
        frontWallTop.setFill(Color.WHITE);
        frontWallTop.setStrokeWidth(1);
        frontWallTop.setStroke(Color.BLACK);

        Rectangle frontWall = new Rectangle(120,185,547,439);
        frontWall.setFill(Color.BROWN);
        frontWall.setStrokeWidth(1);
        frontWall.setStroke(Color.BLACK);
        

// Doors+Windows  
 
        Rectangle leftDoor = new Rectangle (196,306,84,155);
        leftDoor.setFill(Color.WHITE);
        leftDoor.setStrokeWidth(1);
        leftDoor.setStroke(Color.BLACK);
        
        Rectangle middleDoor = new Rectangle (352,306,84,155);
        middleDoor.setFill(Color.WHITE);
        middleDoor.setStrokeWidth(1);
        middleDoor.setStroke(Color.BLACK);    
        
        Rectangle rightDoor = new Rectangle (507,306,84,155);
        rightDoor.setFill(Color.WHITE);
        rightDoor.setStrokeWidth(1);
        rightDoor.setStroke(Color.BLACK);
        
        Rectangle topWindow = new Rectangle (352,217,79,46);
        topWindow.setFill(Color.GREY);
        topWindow.setStrokeWidth(1);
        topWindow.setStroke(Color.BLACK);   


// Pillars        
        
        Rectangle pillar1 = new Rectangle (132,185,47,285);
        pillar1.setFill(Color.WHITE);
        pillar1.setStrokeWidth(1);
        pillar1.setStroke(Color.BLACK);
        
        Rectangle pillar2 = new Rectangle (288,185,47,285);
        pillar2.setFill(Color.WHITE);
        pillar2.setStrokeWidth(1);
        pillar2.setStroke(Color.BLACK);
        
        Rectangle pillar3 = new Rectangle (450,185,47,285);
        pillar3.setFill(Color.WHITE);
        pillar3.setStrokeWidth(1);
        pillar3.setStroke(Color.BLACK);
       
        Rectangle pillar4 = new Rectangle (602,185,47,285);
        pillar4.setFill(Color.WHITE);
        pillar4.setStrokeWidth(1);
        pillar4.setStroke(Color.BLACK);            
        
   
        
   // Balls
   
        Circle pillarBall1 = new Circle (130,187,25);
        pillarBall1.setFill(Color.WHITE);
        pillarBall1.setStroke(Color.BLACK);
        pillarBall1.setStrokeWidth(1);
        
        Circle pillarBall2 = new Circle (180,187,25);
        pillarBall2.setFill(Color.WHITE);
        pillarBall2.setStroke(Color.BLACK);
        pillarBall2.setStrokeWidth(1);
        
        Circle pillarBall3 = new Circle (290,187,25);
        pillarBall3.setFill(Color.WHITE);
        pillarBall3.setStroke(Color.BLACK);
        pillarBall3.setStrokeWidth(1);
        
        Circle pillarBall4 = new Circle (340,187,25);
        pillarBall4.setFill(Color.WHITE);
        pillarBall4.setStroke(Color.BLACK);
        pillarBall4.setStrokeWidth(1);        
        
        Circle pillarBall5 = new Circle (450,187,25);
        pillarBall5.setFill(Color.WHITE);
        pillarBall5.setStroke(Color.BLACK);
        pillarBall5.setStrokeWidth(1);
        
        Circle pillarBall6 = new Circle (500,187,25);
        pillarBall6.setFill(Color.WHITE);
        pillarBall6.setStroke(Color.BLACK);
        pillarBall6.setStrokeWidth(1);        
        
        Circle pillarBall7 = new Circle (600,187,25);
        pillarBall7.setFill(Color.WHITE);
        pillarBall7.setStrokeWidth(1);
        pillarBall7.setStroke(Color.BLACK);        
        
        
        Circle pillarBall8 = new Circle (650,187,25);
        pillarBall8.setFill(Color.WHITE);
        pillarBall8.setStrokeWidth(1);
        pillarBall8.setStroke(Color.BLACK);
        
        
    // Pillar Bases
        
        Rectangle pillarBase1 = new Rectangle (125,469,65,16);
        pillarBase1.setFill(Color.WHITE);   
        pillarBase1.setStrokeWidth(1);
        pillarBase1.setStroke(Color.BLACK);
        
        Rectangle pillar1Step1 = new Rectangle (118,490,72,8);
        pillar1Step1.setFill(Color.GREY);
        pillar1Step1.setStrokeWidth(1);
        pillar1Step1.setStroke(Color.BLACK);
             
        Rectangle pillarBase2 = new Rectangle (282,469,65,16);
        pillarBase2.setFill(Color.WHITE);   
        pillarBase2.setStrokeWidth(1);
        pillarBase2.setStroke(Color.BLACK);
        
        Rectangle pillarBase3 = new Rectangle (550,469,65,16);
        pillarBase3.setFill(Color.WHITE);   
        pillarBase3.setStrokeWidth(1);
        pillarBase3.setStroke(Color.BLACK); 
        
        Rectangle pillarBase4 = new Rectangle (596,469,65,16);
        pillarBase4.setFill(Color.WHITE);   
        pillarBase4.setStrokeWidth(1);
        pillarBase4.setStroke(Color.BLACK);
        
        Rectangle pillar4Step2 = new Rectangle (595,469,65,16);
        pillar4Step2.setFill(Color.GREY);
        pillar4Step2.setStrokeWidth(1);
        pillar4Step2.setStroke(Color.BLACK);   
     
        Rectangle pillarRect1 = new Rectangle (124,473,67,19);
        pillarRect1.setFill(Color.WHITE);   
        pillarRect1.setStrokeWidth(1);
        pillarRect1.setStroke(Color.BLACK);
        
        Rectangle pillarRect2 = new Rectangle (282,475,64,14);
        pillarRect2.setFill(Color.WHITE);   
        pillarRect2.setStrokeWidth(1);
        pillarRect2.setStroke(Color.BLACK);
        
        Rectangle pillarRect3 = new Rectangle (436,473,69,18);
        pillarRect3.setFill(Color.WHITE);   
        pillarRect3.setStrokeWidth(1);
        pillarRect3.setStroke(Color.BLACK);
        
        Rectangle pillarRect4 = new Rectangle (596,475,61,15);
        pillarRect4.setFill(Color.WHITE);   
        pillarRect4.setStrokeWidth(1);
        pillarRect4.setStroke(Color.BLACK);
          
    // Grass
        Rectangle grass = new Rectangle (4,306, 750, 391 );
        grass.setFill(Color.GREEN);     
  
    // Groups
        
       Group house = new Group(frontWall, leftDoor,rightDoor,middleDoor,topWindow);
       Group roofPart = new Group(Roof, frontWallTop);
       Group ball = new Group(pillarBall1,pillarBall2,pillarBall3,pillarBall4,pillarBall5,pillarBall6,pillarBall7,pillarBall8);
       Group pillarAndBase = new Group(pillar1,pillar2,pillar3,pillar4,pillarRect1,pillarRect2,pillarRect3,pillarRect4);
       Group building = new Group(grass,house,pillarAndBase,ball,roofPart);
        
        Scene sn = new Scene(building,748,305, Color.LIGHTBLUE);
        
        stage.setScene(sn);
        stage.setTitle("House");
        stage.show();
        
        
        

        
        
        
    /*    for (int i = 0; i < size; i++){
                arrln[i] = new Line(300 - (i*stp),(20 + (i*stp)), 300 + (i*stp), (20+(i*stp)));
            gp.getChildren().add(arrln[i]);
            
            }
      */      
        
       
        
     
        
        
        
        
       
    }
}
