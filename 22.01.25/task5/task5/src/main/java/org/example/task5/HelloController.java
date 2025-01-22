package org.example.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class HelloController {

    @FXML
    private Label rzult;

    @FXML
    private Button srch;

    @FXML
    private TextField xTextField;

    @FXML
    private TextField yTextField;

    @FXML
    void srchButtOnActon(ActionEvent event) {
        int x = Integer.parseInt(xTextField.getText());
        int y = Integer.parseInt(yTextField.getText());
        if (y <= 0 && y >= -100) {
            if (y < abs(x)) {
                rzult.setText("Да");
            } else if (y > abs(x)) {
                rzult.setText("Нет");
            } else {
                rzult.setText("На границе");
            }
        }else {rzult.setText("Нет");}
    }

}



