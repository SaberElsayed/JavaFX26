package com.example.javafx26;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class BorderPaneExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();

        HBox  toolBarPane = new HBox(10);
        toolBarPane.setPadding(new Insets(10,10,10,10));
        toolBarPane.setStyle("-fx-background-color: blue");
        Label appTitle = new  Label("Student Portal");
        appTitle.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        appTitle.setStyle("-fx-text-fill: white");

        Label profile = new  Label("Profile");
        profile.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        profile.setStyle("-fx-text-fill: white");

        Label courses = new  Label("Courses");
        courses.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        courses.setStyle("-fx-text-fill: white");

        toolBarPane.getChildren().addAll(appTitle, profile, courses);
        borderPane.setTop(toolBarPane);

        VBox leftSide = new VBox(10);
        leftSide.setPadding(new Insets(10,10,10,10));
        leftSide.setStyle("-fx-background-color: lightgreen");

        Label Menu = new  Label("Menu");
        Menu.setFont(Font.font("Arial", FontWeight.BOLD, 12));
//        Menu.setStyle("-fx-text-fill: black");

        Label   myProfile = new   Label("   My Profile");
        myProfile.setFont(new Font("Arial", 12));

        leftSide.getChildren().addAll(Menu, myProfile);

        borderPane.setLeft(leftSide);

        VBox imageSide = new VBox();
        imageSide.setPadding(new Insets(10,10,10,10));
        imageSide.setStyle("-fx-background-color: lightgrey");

        Image smile= new Image("smileyFace.png");
        ImageView image = new ImageView(smile);
        image.setFitWidth(80);
        image.setFitHeight(80);
        imageSide.getChildren().add(image);

        borderPane.setRight(imageSide);

        //-------- center ---
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setStyle("-fx-background-color: lighgrey");

        Label name = new  Label("Name");
        name.setFont(new Font("Arial", 12));

        TextField tf = new TextField();
        gridPane.add(name, 0, 0);
        gridPane.add(tf, 1, 0); // column 2, row 1


        Label id = new  Label("ID");
        id.setFont(new Font("Arial", 12));

        TextField tf2 = new TextField();
        gridPane.add(id, 0, 1);// column 1, row 2
        gridPane.add(tf2, 1, 1); // column 2, row 2

        borderPane.setCenter(gridPane);



        Scene scene = new Scene(borderPane, 600, 400);

        primaryStage.setTitle("Student Portal");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
