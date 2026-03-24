package com.example.javafx26;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//

        // ┌─────────────────────────────────────────────────────┐
        // │  a simple JavaFX program                            │
        // │  One Button → one Scene → one Stage                 │
        // └─────────────────────────────────────────────────────┘

        // A Button is a Node — the most basic visible thing


        // Scene(node, width, height)
        // The scene holds what is displayed inside the window


        // Stage = the window
        // title bar text
        // attach the scene
        // make it visible

        //
        // The button fills the whole window.
        //   Because there is no layout container — the button IS the root.
        //  Notice how the button is always centered when you resize?
        //   We will fix that soon using a Pane.



        // ┌─────────────────────────────────────────────────────┐
        // │   Multiple Stages (multiple windows)                │
        // └─────────────────────────────────────────────────────┘

        // The primary stage is given to us automatically by the JVM
        // We can create MORE stages manually


        // Create a second window from scratch


        // A JavaFX app can have as many windows as it needs.
        // Each Stage has its own Scene.
        // Both windows run in the same application.


        // ┌─────────────────────────────────────────────────────┐
        // │  The problem: we need MORE than one button          │
        // │           Scene only accepts ONE root node          │
        // └─────────────────────────────────────────────────────┘

        // Try adding two buttons directly — this does NOT work:
        // new Scene(btn1, btn2, 400, 300)  ← compile error!


        // To fix it, we need a CONTAINER — a Pane!
        // A Pane can hold many nodes and gives us layout control.
        // ─────────────────────────────────────────────────────


        // ┌─────────────────────────────────────────────────────┐
        // │   Introducing Pane                                  │
        // │  Manual x,y positioning of nodes                    │
        // └─────────────────────────────────────────────────────┘

        //        Button btn1: "Open"


        //        Button btn2: "Close";

        // Place buttons at specific x,y coordinates using setLayoutX and setLayoutY


        // Pane = the simplest container, no automatic layout

        // add BOTH buttons, one by one or getChildren().addAll


        // now creat a scene, 400x300, set title, and attach it to stage, then show it


        // Take away points:
        // Now we can have as many nodes as we want!
        // getChildren().addAll() — adds multiple nodes at once
        // Nothing appears on screen unless added to the pane


        // ┌─────────────────────────────────────────────────────┐
        // │  Styling the Pane with JavaFX CSS                   │
        // └─────────────────────────────────────────────────────┘

//        Button btn1 = new Button("Open");
//        Button btn2 = new Button("Close");
//        btn1.setLayoutX(20);   btn1.setLayoutY(20);
//        btn2.setLayoutX(120);  btn2.setLayoutY(20);

//        Pane root = new Pane();

        // setStyle() uses JavaFX CSS — same idea as web CSS
        // but with the -fx- prefix on every property name
//        root.setStyle(
//                "-fx-background-color: lightblue;" +
//                "-fx-border-color: navy;"          +
//                "-fx-border-width: 3px;"
//        );

//        root.getChildren().addAll(btn1, btn2);
//        Scene scene = new Scene(root, 400, 300);
//        stage.setTitle("Styled Pane");
//        stage.setScene(scene);
//        stage.show();


        //  -fx- is JavaFX's version of standard CSS properties
        //  The Pane sits ON TOP of the Scene so the scene's
        //   own background color is hidden behind the pane


        // ┌─────────────────────────────────────────────────────┐
        // │   Text Node + Font                                  │
        // └─────────────────────────────────────────────────────┘

        //        Pane root = new Pane();
        //        root.setStyle("-fx-background-color: lightblue;");

        // Text(x, y, "string")


        // Simple font — name and size only: Font f1 = new Font("Arial", 28);
        //        Font f1 = new Font("Arial", 28);

        // Full control — name + weight + posture + size


        // set the new font to t.:  t.setFont(f2);

        //-------- Text decorations--------
        // setUnderline

        // setStrikethrough


        // add them to the pane --> scene -- set title --> show stage
//        root.getChildren().add(t);
//        Scene scene = new Scene(root, 500, 300);
//        stage.setTitle("Text and Font");
//        stage.setScene(scene);
//        stage.show();


        // → FontWeight: BOLD, NORMAL, LIGHT, BLACK ...
        // → FontPosture: ITALIC, REGULAR
        // → Text is a Node just like Button — add it to the pane



        // ┌─────────────────────────────────────────────────────┐
        // │   Color                                             │
        // └─────────────────────────────────────────────────────┘

//        Pane root = new Pane();


//        Text t = new Text(40, 80, "JavaFX Colors!");
//        t.setFont(Font.font("Arial", FontWeight.BOLD, 36));

        // setFill()   → the INTERIOR color of the text characters
        // setStroke() → the OUTLINE color of the text characters

        // Option 1 — named Color constant
//        t.setFill(Color.WHITE);

        // Option 2 — custom Color(red, green, blue, opacity) 0.0 to 1.0
//        t.setFill(new Color(1.0, 0.6, 0.0, 1.0));   // orange

        // Option 3 — hex string
//        t.setFill(Color.web("#e94560"));

//        t.setStroke(Color.CYAN);
//        t.setStrokeWidth(1.5);

//        root.getChildren().add(t);
//        Scene scene = new Scene(root, 500, 300);
//        stage.setTitle("Color Demo");
//        stage.setScene(scene);
//        stage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }

}
