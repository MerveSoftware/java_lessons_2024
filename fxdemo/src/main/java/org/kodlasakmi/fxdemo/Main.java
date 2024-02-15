package org.kodlasakmi.fxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        // Kalp şeklini çizmek için bir yol (path) oluşturuyoruz
        Path heartShape = new Path();
        heartShape.setStroke(Color.RED);
        heartShape.setFill(Color.RED);

        // Kalp şeklinin çizimini yapıyoruz
        MoveTo moveTo = new MoveTo();
        moveTo.setX(150);
        moveTo.setY(75);

        CubicCurveTo curve1 = new CubicCurveTo();
        curve1.setControlX1(225);
        curve1.setControlY1(25);
        curve1.setControlX2(275);
        curve1.setControlY2(175);
        curve1.setX(150);
        curve1.setY(225);

        CubicCurveTo curve2 = new CubicCurveTo();
        curve2.setControlX1(125);
        curve2.setControlY1(175);
        curve2.setControlX2(175);
        curve2.setControlY2(25);
        curve2.setX(150);
        curve2.setY(75);

        heartShape.getElements().add(moveTo);
        heartShape.getElements().addAll(curve1, curve2);

        root.getChildren().add(heartShape);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Heart Drawing");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
