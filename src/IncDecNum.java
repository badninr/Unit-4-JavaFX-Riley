import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class IncDecNum extends Application
{

    private int count;
    private Text countText;

    @Override
    public void start(Stage stage)
    {
        count = 50;
        countText = new Text("Number: 50");

        Button incButton = new Button("Increment");
        incButton.setOnAction(this::incButtonPress);

        Button decButton = new Button("Decrement");
        decButton.setOnAction(this::decButtonPress);

        FlowPane pane = new FlowPane(incButton, decButton, countText);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: lightblue");

        Scene scene = new Scene(pane, 300, 100);

        stage.setTitle("Increment/Decrement Counter");
        stage.setScene(scene);
        stage.show();

    }

    private void incButtonPress(ActionEvent event)
    {
        count++;
        countText.setText("Number: " + count);
    }

    private void decButtonPress(ActionEvent event)
    {
        count--;
        countText.setText("Number: " + count);
    }
}
