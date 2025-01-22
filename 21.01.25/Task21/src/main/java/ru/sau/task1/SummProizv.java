package ru.sau.task1;

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

        String v = vvod.getText();
        int number = Integer.parseInt(v);

        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;
        int sum = a + b + c;
        int umn = a * b * c;
        rez.setText("Сумма: " + sum + ", Произведение: " + umn);
    }

}
