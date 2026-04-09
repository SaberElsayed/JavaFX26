package com.example.javafx26;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MovingBall extends Application {
    private double dx=3;
    private double dy=2;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Circle circle = new Circle(100, 100, 20);
        circle.setFill(Color.GREEN);

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(10),
                e->{
                    circle.setCenterX(circle.getCenterX()+dx);
                    circle.setCenterY(circle.getCenterY()+dy);

                    if(circle.getCenterX()>300 || circle.getCenterX()<0){
                        dx=-1*dx;
                    }else if(circle.getCenterY()>300 || circle.getCenterY()<0){
                        dy=-1*dy;
                    }
                }));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        pane.getChildren().add(circle);
        Scene scene = new Scene(pane, 300, 300);

        primaryStage.setTitle("Moving Ball");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
