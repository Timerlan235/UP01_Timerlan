package ru.sau.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PeremController {

    @FXML
    private Button rButt;

    @FXML
    private Label rezButt;

    @FXML
    private TextField zTextField;

    @FXML
    void rButtonOnAction(ActionEvent event) {

    }

    @FXML
    void zTextField(ActionEvent event) {
        double z = Double.parseDouble(zTextField.getText());
if (z < 0 && z < 360);

    }

}
