package com.example.javafx26;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//
        Button button = new Button("Open!");
        Button button2 = new Button("close!");

        button.setLayoutX(10);
        button.setLayoutY(10);

        button2.setLayoutX(100);
        button2.setLayoutY(10);

        Pane root = new Pane();
//        root.setStyle("-fx-background-color: lightblue;"); // ← set here

        root.setStyle(
                "-fx-background-color: lightblue;" +
                        "-fx-border-color: red;" +
                        "-fx-border-width: 10px;" +
                        "-fx-font-size: 24px;"
        );



        Text t= new Text(150,150, "Hello World!");
        t.setStyle("-fx-font-size:30");
        t.setText("Hello World!!!!!!!!!!!!!!!!!!!"); // set the text if not defined in the constructor
        t.setStrikethrough(true);
        t.setUnderline(true);
        t.setStroke(Color.BLUE);
        t.setFill(new Color(0,0,0,1));

        Font f = new  Font("Arial", 12);
        Font font2 = Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 15);
        t.setFont(font2);

        root.getChildren().addAll(button,button2, t);

        // scene object
        Scene scene = new Scene(root, 500, 300);
        scene.setFill(Color.LIGHTBLUE);

        //set title
        stage.setTitle("this is my first JavaFX application");
        //stick/attach to scene
        stage.setScene(scene);


        // display the stage
        stage.show();




    }

    public static void main(String[] args) {
        launch(args);
    }

}
