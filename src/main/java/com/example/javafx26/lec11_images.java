package com.example.javafx26;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class lec11_images extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {

        //---------------- Image
//        Pane pane = new Pane();
//        pane.setStyle("-fx-background-color: warmwhite;");
//
////        Image img = new Image("smileyFace.png");
//        ImageView imageView = new ImageView("smileyFace.png");
//
//        imageView.setFitHeight(100);
//        imageView.setFitWidth(100);
//
//        imageView.setLayoutX(100);
//        imageView.setLayoutY(100);
//
//        imageView.setRotate(-90);
//        pane.getChildren().add(imageView);
 //------------------ FlowPane
//        FlowPane pane = new FlowPane();
//        pane.setPadding(new Insets(5,5,5,5));
////        pane.setAlignment(Pos.CENTER);
//        pane.setHgap(5);
//        pane.setVgap(10);
//
//        for(int i=1; i<=10; i++) {
//            Button button = new Button("Buton#"+i);
//            pane.getChildren().add(button);
//        }
//
//        Scene scene = new Scene(pane, 300, 300);
//        primaryStage.setScene(scene);
//        primaryStage.show();

        //---------------- GridPane- example #1 ----
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10, 10, 10, 10));

        pane.setStyle("-fx-background-color: cornflowerblue;");
        Label userLabel = new Label("Username");
        pane.add(userLabel, 0, 0);

        TextField tf = new TextField();
        pane.add(tf, 1, 0);

        Label pass = new Label("Password");
        pane.add(pass, 0, 1);

        PasswordField tP = new PasswordField();
        pane.add(tP, 1, 1);

        CheckBox cb = new CheckBox("Remember Me");
        pane.add(cb, 0, 2);

        Button login = new Button("Login");

        GridPane.setHalignment(login, HPos.RIGHT);
        pane.add(login, 1, 3);

        pane.setHgap(5);
        pane.setVgap(5);



        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
