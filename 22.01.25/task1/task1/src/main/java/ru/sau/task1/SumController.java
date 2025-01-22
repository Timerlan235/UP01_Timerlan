package ru.sau.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField numTextField;

    @FXML
    private TextField res;

    @FXML
    private Button rezult;

    @FXML
    void resButtonOnAction(ActionEvent event) {

    }

    @FXML
    void rezButtonOnAction(ActionEvent event) {
        String v = numTextField.getText();
        int number = Integer.parseInt(v);
        int a, b, c;
        a = number / 100;
        b = (number / 10) % 10;
        c = number % 10;
        if (a > b) {
            res.setText("" + a);
        } else if (a < b) {
            res.setText(""+ b);


        }

    }
}
