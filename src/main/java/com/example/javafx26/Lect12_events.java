/**
 * learning events
 */
package com.example.javafx26;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Lect12_events extends Application {

    Button button = new Button("Hello World");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        Pane pane = new Pane();
        pane.setStyle("-fx-background-color: white; ");
        root.setCenter(pane);

        pane.setOnMouseClicked(e -> {
            Circle circle = new Circle(3);
            circle.setLayoutX(e.getX());
            circle.setLayoutY(e.getY());
            circle.setFill(Color.RED);
            pane.getChildren().add(circle);

        });

        pane.setOnMouseDragged(e -> {
            Circle circle = new Circle(3);
            circle.setLayoutX(e.getX());
            circle.setLayoutY(e.getY());
            circle.setFill(Color.GREEN);
            pane.getChildren().add(circle);
        });
        Label label = new Label();
        pane.getChildren().add(label);
        pane.setOnMouseMoved(e->{
            label.setText("x:"+(int) e.getX() + ",y: " + (int) e.getY());

        });

        pane.setOnMouseExited(e -> {
            label.setText("");
        });

        // bottom pane
        HBox buttonPane = new HBox(5);
        buttonPane.setStyle("-fx-background-color: lightgrey; ");
        buttonPane.setPadding(new Insets(5, 5, 5, 5));
        Button blue = new Button("Blue");
        ButtonClicked b = new ButtonClicked();
        blue.setOnAction(b);

        Button red = new Button("Red");

        red.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Red Button Clicked");
            }
        });


        Button addBall = new Button("Add Ball");
        addBall.setOnAction (e->{
            Circle circle = new Circle(15);
            circle.setLayoutX(Math.random()*400);
            circle.setLayoutY(Math.random()*400);
            Color c = new Color(Math.random(),Math.random(),Math.random(),1);
            circle.setFill(c);
            circle.setStroke(Color.BLUE);
            pane.getChildren().add(circle);
        });

        Button clear = new Button("Clear");
        clear.setOnAction (e->{
            pane.getChildren().clear();
        });

        Button exit = new Button("Exit");
        // i am using lambda style
        exit.setOnAction(e -> {
                    System.exit(0);
                }
        );

        // gridpane
        Label num1 = new Label("Num1");
        TextField num1Text = new TextField();
        Label num2 = new Label("Num2");
        TextField num2Text = new TextField();
        Label total = new Label("Total");
        TextField totalText = new TextField();
        totalText.setEditable(false);
        Button add = new Button("+");

        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-background-color: gold; ");
        gridPane.setPadding(new Insets(5, 5, 5, 5));
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(num1, 0, 0);
        gridPane.add(num1Text, 1, 0);
        gridPane.add(num2, 0, 1);
        gridPane.add(num2Text, 1, 1);
        gridPane.add(total, 0, 2);
        gridPane.add(totalText, 1, 2);
        gridPane.add(add, 0, 3);

        // assign an action to the + button
        add.setOnAction(e->{
            try {

                double value1 = Double.parseDouble(num1Text.getText());
                double value2 = Double.parseDouble(num2Text.getText());
                totalText.setText(String.valueOf(value1 + value2));
                totalText.setStyle("-fx-background-color: white;");
            } catch (Exception ex) {
                totalText.setText("ERROR");
                totalText.setStyle("-fx-background-color: red;");

            }

        });
        root.setRight(gridPane);


        buttonPane.getChildren().addAll(blue, red, addBall, clear, exit);
        root.setBottom(buttonPane);

        Scene scene = new Scene(root, 800, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

class ButtonClicked implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {

        System.out.println("Blue Button Clicked");
    }
}
