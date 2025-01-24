package org.example.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TrueOrFalse {

    @FXML
    private TextField chsloN;

    @FXML
    private Label rez;

    @FXML
    private Button rezult;

    @FXML
    void rezultButtonOnAction(ActionEvent event) {
        int number = Integer.parseInt(chsloN.getText());
        boolean d = v(number);
        rez.setText("" + d);
    }

    private boolean v(int n) {

        if (n < 1) return false;

        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;

    }

}


