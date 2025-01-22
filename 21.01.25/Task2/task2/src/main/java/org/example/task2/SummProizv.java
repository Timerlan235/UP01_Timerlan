package org.example.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SummProizv {

    @FXML
    private Button but;

    @FXML
    private Label rez;

    @FXML
    private TextField vvod;

    @FXML
    void chsTextField(ActionEvent event) {

    }

    @FXML
    void vchButtonOnAction(ActionEvent event) {
        String d = vvod.getText();
        int h = Integer.parseInt(d);
        if (h >= 100 && h <= 999 )
        //String d = vvod.getText();
            h = Integer.parseInt(d);
        int a = h / 100;
        int b = (h / 10) % 10;
        int c = h % 10;
        int res = a * 100 + c * 10 + b;
        rez.setText("Результат: " + res);
    }

}
