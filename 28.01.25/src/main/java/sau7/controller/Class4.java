package sau7.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Class4 {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}