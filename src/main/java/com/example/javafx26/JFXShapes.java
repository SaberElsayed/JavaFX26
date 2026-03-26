package com.example.javafx26;
/**
 * Dealing with shapes in javaFX- drawing a house
 *
 * @author:Saber Elsayed
 * @date: March 2026
 * @version: 1.0
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JFXShapes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {

        // button 1: open, x: 230, y=5
        Button btn = new Button("Open");
        btn.setLayoutX(230);
        btn.setLayoutY(5);
        // button 1: Close, x: 280, y=5
        Button btn2 = new Button("Close");
        btn2.setLayoutX(280);
        btn2.setLayoutY(5);

        // pane: color:-fx-background-color: lightblue- boraderline-color:white
        Pane pane = new Pane();
        pane.setStyle("-fx-background-color: lightblue;" +
                "-fx-border-color: white;");

        // text: Welcome: x=10. y, 20, color: white, underline, strokewidth:20
        Text t = new Text(10, 20, "Welcome");
        Color c = new Color(1, 1, 1, 1);
        t.setFill(c);
        t.setUnderline(true);


        // font Arial, FontWeight.BOLD, FontPosture.REGULAR, 20
        Font font = new Font("Arial", 20);
        t.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20));


        //line: x=0,30 y= 500,30, color 1, setStrokeWidth:1
        Line l = new Line(0, 30, 500, 30);
//        l.setFill(Color.WHITE);
        l.setStroke(Color.WHITE);
        l.setStrokeWidth(1);


        // grass: Rectangle  x= 0, 400, width= 500, height= 100: color= green
        Rectangle grass = new Rectangle(0, 400, 500, 100);
        grass.setFill(Color.GREEN);
//        grass.setArcHeight(20);
//        grass.setArcWidth(20);
//        grass.setRotate(90);
//        grass.setStroke(Color.BLACK);
//        grass.setWidth(10);

        // house wall (Rec):  x= 10,230, width= 300, height= 180, color= TAN
        Rectangle wall = new Rectangle(100, 230, 300, 180);
        wall.setFill(Color.TAN);

        // window (Rec)  x= 300,255, width= 75, height= 60, fill= SKYBLUE, stroke=STEELBLUE, strokewidth=2
        Rectangle winR = new Rectangle(300, 255, 75, 60);
        winR.setFill(Color.SKYBLUE);
        winR.setStroke(Color.STEELBLUE);
        winR.setStrokeWidth(2);

        // -- window crosslines --
        // X= 335, 255; y= 335, 315;  STEELBLUE, setStrokeWidth=1.5
        Line wr1 = new Line(335, 255, 335, 315);
        // X= 300, 285; y= 375, 285;  STEELBLUE, setStrokeWidth=1.5
        Line wr2 = new Line(300, 285, 375, 285);
        wr1.setStroke(Color.STEELBLUE);
        wr1.setStrokeWidth(1.5);
        wr2.setStroke(Color.STEELBLUE);
        wr2.setStrokeWidth(1.5);


        // door (rec): X= 210, 320,  width 80, height=90;  color: SADDLEBROWN
        Rectangle door = new Rectangle(210, 320, 80, 90);
        door.setFill(Color.SADDLEBROWN);

        // doorknob (circle): 280, 370, Radius= 5, color: GOLD
        Circle knob = new Circle(280, 370, 5);
        knob.setFill(Color.GOLD);


        // SUN (circle):center: 420, 90; Radius= 40; color: orange
        Circle sun = new Circle(420, 90, 40);
        sun.setFill(Color.ORANGE);
        // to convert it to a moon uncomment the following, change color, add to the pane
//        sun.setFill(Color.WHITE);
//        Circle sun2 = new Circle(410, 90, 40);
//        sun2.setFill(Color.LIGHTBLUE);


        //cloud#1: Ellipse: center:(100, 70), w: 55, h:28, Color: white, opacity 0.5
        Ellipse cloud1 = new Ellipse(100, 70, 55, 28);
        Color c1 = new Color(1, 1, 1, 0.5);
        cloud1.setFill(c1);
        //cloud#1: Ellipse: center:(100, 70), w: 55, h:28, Color: white, opacity 0.5
        Ellipse cloud2 = new Ellipse(150, 58, 45, 26);
        cloud2.setFill(c1);

        //roof: Polygon- use getPoints().addAll
        //point1: 70.0, 230.0; point2:250.0, 100.0; point3:430.0, 230.0
        //color BROWN
        Polygon roof = new Polygon();
        roof.getPoints().addAll(
                70.0, 230.0,   // left corner
                250.0, 100.0,   // peak
                430.0, 230.0    // right corner
        );
        roof.setFill(Color.BROWN);


        // do not forget to add the nodes to the pane
        pane.getChildren().addAll(btn, btn2, t, l, grass, wall, sun, roof,
                door, knob, cloud1, cloud2, winR, wr1, wr2);


        // create the pane
        Scene scene = new Scene(pane, 500, 500);

        //attach it to the stage
        primaryStage.setScene(scene);
        //set title of the stage
        primaryStage.setTitle("Shapes");
        //show the entire stage (window)
        primaryStage.show();

    }

}
