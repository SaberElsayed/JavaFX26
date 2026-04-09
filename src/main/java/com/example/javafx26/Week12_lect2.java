package com.example.javafx26;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Week12_lect2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Pane pane = new  Pane();
        pane.setStyle("-fx-background-color: wheat;");

        Rectangle rectangle = new Rectangle(0,0,3,50);
        rectangle.setFill(Color.RED);

        Circle circle = new Circle(200, 100, 50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        // what kind of animation you need to use
        PathTransition pathTransition = new PathTransition();
        // which node you want to animate
        pathTransition.setNode(rectangle);
        // which path to follow
        pathTransition.setPath(circle);
        //  how fast it will be
        pathTransition.setDuration(Duration.millis(5000));// every one second the rect will move

        // the whole time for the animation scene
        pathTransition.setCycleCount(Timeline.INDEFINITE);

        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);

        pathTransition.setAutoReverse(true);

        // when should it start

       pathTransition.play();

        //
        circle.setOnMouseClicked(e->{
            if(e.getButton() ==  MouseButton.PRIMARY){
                pathTransition.play();
            }else if (e.getButton() ==  MouseButton.SECONDARY){
                pathTransition.pause();
            } else if (e.getButton()==MouseButton.MIDDLE) {
                pathTransition.stop();
            }

        });

        // part 2

        Circle circle2 = new Circle(200, 200, 50);
        circle2.setFill(Color.RED);
        FadeTransition fadeTransition = new FadeTransition(Duration.millis(1000), circle2);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0);
        fadeTransition.setCycleCount(Timeline.INDEFINITE);
        fadeTransition.play();

        // TimeLine animation
        Text message= new Text("Hello");
        message.setFont(new Font("Arial", 20));
        message.setLayoutX(175);
        message.setLayoutY(400);

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            if(message.getText().equals("Hello")){
                message.setText("Assalamu Alaikum");
            }else if(message.getText().equals("Assalamu Alaikum")){
                message.setText("Hello");
            }
        }));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        // second animation assigned to the same node
        FadeTransition fadeTransition2 = new FadeTransition(Duration.millis(1000), message);
        fadeTransition2.setFromValue(1.0);
        fadeTransition2.setToValue(0);
        fadeTransition2.setCycleCount(Timeline.INDEFINITE);
        fadeTransition2.play();



        pane.getChildren().addAll(rectangle, circle, circle2, message);

        Scene  scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Path Animation");
        primaryStage.show();

    }
}
