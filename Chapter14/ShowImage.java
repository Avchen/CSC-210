package Chapter14;

/**
 * Created by averychen on 4/24/17.
 *
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowImage extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane to hold the images views
        GridPane pane = new GridPane();

        Image image = new Image("http://www.almanac.com/sites/default/files/styles/primary_image_in_article/public/image_nodes/american_flag_guidelines-thinkstock.jpg?itok=9GOkgD1X");
        ImageView imageView = new ImageView(image);

        pane.add(imageView,1,0);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Showing Image"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage.
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
