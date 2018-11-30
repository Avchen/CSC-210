package Chapter14;

/**
 * Created by averychen on 4/21/17.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ShowCircle extends Application{
    // create a circle and set its properties
    public void start(Stage primaryStage) {
        Circle circle = new Circle();

        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);

        circle.setStroke(Color.AQUA);
        circle.setFill(Color.BLACK);
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        Label label = new Label("JavaFX");
        label.setFont(Font.font("Times New Roman"));

        pane.getChildren().add(label);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("show circles");
        primaryStage.show();

    }
}
