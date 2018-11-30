package Chapter14;

/**
 * Created by averychen on 4/21/17.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class MyJavaFX extends Application {
    @Override
    //// Override the start method in the Application class
    public void start(Stage primaryStage) {

        // Create a scene and place a button in the scene
        Button button = new Button("Hello World!");

        Scene scene = new Scene(button, 200, 250);

        primaryStage.setTitle("My JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Stage stage2 = new Stage();
        //  stage2.setTitle("second stage");

        // stage2.setScene(new Scene(new Button("second"), 500, 500 ));
        // stage2.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
