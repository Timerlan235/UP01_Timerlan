package org.example.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button vchButton;

    @FXML
    private TextField number;

    @FXML
    private Label result;

    @FXML
    void calculateButtonOnAction(ActionEvent event) {
            int N = Integer.parseInt(number.getText());
            if (N > 0) {
                double res = 1.0;
                for (int i = 1; i <= N; i++) {
                    res *= (1.0 + i / 10.0);
                }
                result.setText("Результат: " + res);

        }
}}
