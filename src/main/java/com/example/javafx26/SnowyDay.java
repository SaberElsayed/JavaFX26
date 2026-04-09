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

public class SnowyDay extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setStyle("-fx-background-color: Navy;");
        Circle [] circleArray = new Circle[1000];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(Math.random()*300, Math.random()*300, 0.5);
            circleArray[i].setFill(Color.WHITE);
            circleArray[i].setOpacity(0.5);
            pane.getChildren().add(circleArray[i]);
        }

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(10), e->{
            for(int i=0; i<circleArray.length;i++){
                circleArray[i].setCenterY(circleArray[i].getCenterY()+1);

                if(circleArray[i].getCenterY()>300){
                    circleArray[i].setCenterY(0);
                }
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();





        Scene scene = new Scene(pane, 300, 300);

        primaryStage.setTitle("Moving Ball");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
