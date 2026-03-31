package com.example.javafx26;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Chess extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        for(int i =0; i<8; i++){
            for(int j =0; j<8; j++){
                Rectangle rectangle = new Rectangle(60,60);
                if((i+j) % 2 == 0 ){
                    rectangle.setFill(Color.WHITE);
                }else {
                    rectangle.setFill(Color.BLACK);
                }
                pane.add(rectangle,i,j);

                Text text = new Text("♔");
                text.setFont(new Font("Arial",20));
                text.setStroke(Color.GOLD);
                pane.add(text,i,j);

            }
        }

        Scene scene = new Scene(pane, 480,480);
        primaryStage.setTitle("Chess");
        primaryStage.setScene(scene);
//        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
