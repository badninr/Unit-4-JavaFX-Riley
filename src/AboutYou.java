import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.text.*;



public class AboutYou extends GridPane {
    private Text result = new Text();
    private TextField nameInput;
    private TextField ageInput;
    private TextField colorInput;
    private TextField hobbyInput;


    public AboutYou() {
        Font font = new Font(12);


        //labels
        Label nameLabel = new Label("Name:");
        nameLabel.setFont(font);
        GridPane.setHalignment(nameLabel, HPos.RIGHT);

        Label ageLabel = new Label("Age:");
        ageLabel.setFont(font);
        GridPane.setHalignment(ageLabel, HPos.RIGHT);

        Label favColorLabel = new Label("Favorite Color:");
        favColorLabel.setFont(font);
        GridPane.setHalignment(favColorLabel, HPos.RIGHT);

        Label favHobbyLabel = new Label("Favorite Hobby:");
        favHobbyLabel.setFont(font);
        GridPane.setHalignment(favHobbyLabel, HPos.RIGHT);

        //text fields
        nameInput = new TextField();
        nameInput.setFont(font);
        nameInput.setPrefWidth(100);
        nameInput.setAlignment(Pos.CENTER);

        ageInput = new TextField();
        ageInput.setFont(font);
        ageInput.setPrefWidth(100);
        ageInput.setAlignment(Pos.CENTER);

        colorInput = new TextField();
        colorInput.setFont(font);
        colorInput.setPrefWidth(100);
        colorInput.setAlignment(Pos.CENTER);

        hobbyInput = new TextField();
        hobbyInput.setFont(font);
        hobbyInput.setPrefWidth(100);
        hobbyInput.setAlignment(Pos.CENTER);

        //button
        Button print = new Button("Print");
        print.setFont(font);
        print.setPrefWidth(70);
        print.setAlignment(Pos.CENTER);
        print.setOnAction(this::processReturn);


        //making screen pretty
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: lightblue");

        add(nameLabel, 0, 0);
        add(nameInput, 1, 0);
        add(ageLabel, 0, 1);
        add(ageInput, 1, 1);
        add(favColorLabel, 0, 2);
        add(colorInput, 1, 2);
        add(favHobbyLabel, 0, 3);
        add(hobbyInput, 1, 3);
        add(print, 0, 4);
        add(result, 1, 4);
    }

    //string
    private void processReturn(ActionEvent event) {
        String name = nameInput.getText();
        String age = ageInput.getText();
        String color = colorInput.getText();
        String hobby = hobbyInput.getText();
        result.setText("Your name is " + name + ".\nYou are " + age + " years old.\nYour favorite color is " + color.toLowerCase() +
                ".\nYour favorite hobby is " + hobby.toLowerCase() + ".");
    }
}




