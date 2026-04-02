package com.example.javafx26;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.Random;


public class Lec12_Panes extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {

        HBox hPane = new HBox(10);
        hPane.setStyle("-fx-background-color: GOLD");
//        hPane.setSpacing(10);
        hPane.setPadding(new Insets(15, 15, 15, 15));

        Button save = new Button("Save");
        Button open = new Button("Open");
        Button close = new Button("Close");
        Button print = new Button("Print");
        Button help = new Button("Help");

        hPane.getChildren().addAll(save, open, close, print, help);
//        Scene scene = new Scene(hPane,400,100);

        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(15, 15, 15, 15));
        Label[] a =new Label[]{new Label("C++ programming"),
                new Label("Java "),
                new Label("Data Structures"),
                new Label("Python")};

        for(int i=0; i<a.length; i++){
//            a[i].setFont(new Font("Arial",20));
            a[i].setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 20));
            Color c = new Color(Math.random(),Math.random(),Math.random(),1);
//            a[i].setTextFill(Color.RED);
            a[i].setTextFill(c);
            vBox.getChildren().add(a[i]);
        }

        Scene scene = new Scene(vBox,200,300);
        primaryStage.setTitle("Toolbar - vBox");
        primaryStage.setScene(scene);
        primaryStage.show();






    }

}
