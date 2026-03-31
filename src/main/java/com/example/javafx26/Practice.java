package com.example.javafx26;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Practice extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {

        String[][] labels = {
                {"%", "CE", "C", "⌫"},
                {"1/x", "x²", "√x", "÷"},
                {"7", "8", "9", "×"},
                {"4", "5", "6", "−"},
                {"1", "2", "3", "+"},
                {"±", "0", ".", "="}
        };

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(1);
        pane.setVgap(1);
//        Text text = new Text("result");
//        pane.add(text,0,0, 4, 1);
        TextField tf = new TextField();
        tf.setEditable(false);
        pane.add(tf,0,0, 4, 1);

        for(int i = 0; i < labels.length; i++) {
            for(int j = 0; j < labels[i].length; j++) {
                Button button = new Button(labels[i][j]);
                button.setPrefSize(40, 40);
                pane.add(button, j, i+1);
            }
        }
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Image View");

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
