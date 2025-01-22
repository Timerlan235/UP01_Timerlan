package ru.sau.task22;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PeremController {

    @FXML
    private TextField aTaskField;

    @FXML
    private TextField bTaskField;

    @FXML
    private TextField cTaskField;

    @FXML
    private Button peremBut;

    @FXML
    void peremButtonOnAction(ActionEvent event) {

        String a = aTaskField.getText();
        String b = bTaskField.getText();
        String c = cTaskField.getText();
        aTaskField.setText(b);
        bTaskField.setText(c);
        cTaskField.setText(a);
    }

}
