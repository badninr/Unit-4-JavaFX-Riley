import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AboutYouClient extends Application {
    public void start(Stage stage) {
        Scene scene = new Scene(new AboutYou(), 350, 300);

        stage.setTitle("About You");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[]args) {
        launch(args);
    }
}

