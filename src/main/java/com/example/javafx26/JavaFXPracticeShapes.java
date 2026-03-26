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

public class JavaFXPracticeShapes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {

        // button 1: open, x: 230, y=5
        Button button = new Button("Open");
        button.setLayoutX(230);
        button.setLayoutY(5);


        // button 1: Close, x: 280, y=5
        Button button2 = new Button("Close");
        button2.setLayoutX(280);
        button2.setLayoutY(5);


        // pane: color:-fx-background-color: lightblue- borderline-color:white
        Pane pane = new Pane();
        pane.setStyle("-fx-background-color: lightblue");

        // text: Welcome: x=10. y, 20, color: white, underline, strokewidth:20

        Text text = new Text(10, 20, "Welcome");
        Color color = new Color(1, 1, 1, 1);
        text.setFill(color);
        text.setUnderline(true);


        // font Arial, FontWeight.BOLD, FontPosture.REGULAR, 20
//         Font font = new Font("Arial", 20);

        Font font = Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 20);
        text.setFont(font);

        //line: x=0,30 y= 500,30, color 1, setStrokeWidth:1
        Line line = new Line(0, 30, 500, 30);
        line.setStroke(Color.WHITE);
        line.setStrokeWidth(1);


        // grass: Rectangle  x= 0, 400, width= 500, height= 100: color= green
        Rectangle grass = new Rectangle(0, 400, 500, 100);
        grass.setFill(Color.GREEN);
//        grass.setRotate(90);


        // house wall (Rec):  x= 100,230, width= 300, height= 180, color= TAN

        Rectangle wall = new Rectangle(100, 230, 300, 180);
        wall.setFill(Color.TAN);


        // window (Rec)  x= 300,255, width= 75, height= 60, fill= SKYBLUE, stroke=STEELBLUE, strokewidth=2

        Rectangle window = new Rectangle(300, 255, 75, 60);
        window.setFill(Color.SKYBLUE);
        window.setStroke(Color.STEELBLUE);
        window.setStrokeWidth(2);
//        window.setArcHeight(50);
//        window.setArcWidth(50);

        // -- window crosslines --
        // X= 335, 255; y= 335, 315;  STEELBLUE, setStrokeWidth=1.5
        Line wLin1 = new Line(335, 255, 335, 315);
        wLin1.setStroke(Color.STEELBLUE);
        wLin1.setStrokeWidth(1.5);


        // X= 300, 285; y= 375, 285;  STEELBLUE, setStrokeWidth=1.5
        Line wLin2 = new Line(300, 285, 375, 285);
        wLin2.setStroke(Color.STEELBLUE);
        wLin2.setStrokeWidth(1.5);

        // door (rec): X= 210, 320,  width 80, height=90;  color: SADDLEBROWN

        Rectangle door = new Rectangle(210, 320, 80, 90);
        door.setFill(Color.SADDLEBROWN);

        // doorknob (circle): 280, 370, Radius= 5, color: GOLD
        Circle doorknob = new Circle(280, 370, 5);
        doorknob.setFill(Color.GOLD);

        // SUN (circle):center: 420, 90; Radius= 40; color: orange

        Circle sun = new  Circle(420, 90, 40);
        sun.setFill(Color.ORANGE);
        // to change the sun to a moon
//        sun.setFill(Color.WHITE);
//
//        Circle c2= new Circle(410,90,40);
//        c2.setFill(Color.LIGHTBLUE);



        //cloud#1: Ellipse: center:(100, 70), w: 55, h:28, Color: white, opacity 0.5
        Ellipse cloud1 = new Ellipse(100,70, 55,30);
        Color color1 = new Color(1, 1, 1, 0.5);
        cloud1.setFill(color1);

        //cloud#1: Ellipse: center:(150, 60), w: 45, h:25, Color: white, opacity 0.5
        Ellipse cloud2 = new Ellipse(150,60, 45,25);
        cloud2.setFill(color1);

        //roof: Polygon- use getPoints().addAll
        //point1: 70.0, 230.0; point2:250.0, 100.0; point3:430.0, 230.0
        //color BROWN

        Polygon roof = new  Polygon(70.0, 230.0, 250.0, 100.0, 430.0, 230.0);
//        roof.getPoints().addAll(70.0, 230.0, 250.0, 100.0, 430.0, 230.0);
        roof.setFill(Color.BROWN);



        // do not forget to add the nodes to the pane
        pane.getChildren().addAll(button, button2, text, line, grass,
                wall, window, wLin1, wLin2, door, sun, doorknob,cloud1, cloud2, roof);


        // create the Scene
        Scene scene = new Scene(pane, 500, 500);


        //attach it to the stage
        primaryStage.setScene(scene);

//        primaryStage.setResizable(false);


        //set title of the stage
        primaryStage.setTitle("Shapes");


        //show the entire stage (window)
        primaryStage.show();


    }

}
