package com.example.javafx26;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlAcircleUsingKeyboard extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Circle circle = new Circle(15);
        circle.setLayoutX(150);
        circle.setLayoutY(150);
        circle.setFill(Color.GOLD);
        circle.setStroke(Color.BLACK);
        root.getChildren().add(circle);

        circle.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                circle.setLayoutY(Math.max(0,circle.getLayoutY() - 5));


            }else if (e.getCode() == KeyCode.DOWN) {
                circle.setLayoutY(Math.min (circle.getLayoutY() + 5, 400));

            }else if (e.getCode() == KeyCode.LEFT) {
                circle.setLayoutX(Math.max(0,circle.getLayoutX() - 5));

            } else if (e.getCode() == KeyCode.RIGHT) {
                circle.setLayoutX(Math.min(400,circle.getLayoutX() + 5));
            }
        });

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
        circle.requestFocus();
    }
}
