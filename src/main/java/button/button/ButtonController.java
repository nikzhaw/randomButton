package button.button;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ButtonController {

    Generator answers = new Generator();

    @FXML
    private Label welcomeText;

    @FXML
    private Button toDoButton;

    @FXML
    private TextField newAnswer;


    public ButtonController(){
        answers.setAnswers("Programieren");
        answers.setAnswers("Aus dem Fenster Springen");
        answers.setAnswers("Kühlschrank leer Essen");
    }


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        toDoButton.setText("test");
    }
    @FXML
    public void onToDocklick(ActionEvent actionEvent) {
        welcomeText.setText("Welcome to JavaFX Application!");
        toDoButton.setText(answers.getAnswer());
    }

    public void addAnswer(ActionEvent actionEvent) {
        answers.setAnswers("neuerText");
    }
}