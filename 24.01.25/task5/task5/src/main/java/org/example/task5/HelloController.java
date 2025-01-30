package org.example.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button vchButton;

    @FXML
    private TextField number;

    @FXML
    private Label result;

    @FXML
    private TextField unumber;

    @FXML
    private TextField vnumber;

    @FXML
    void vchButtonOnAction(ActionEvent event) {


            double u = Double.parseDouble(unumber.getText());
            double v = Double.parseDouble(vnumber.getText());
            int n = Integer.parseInt(number.getText());

            if (n <= 0) {

            }

            double aPrev = u;
            double bPrev = v;
            double sum = 0;
            for (int k = 1; k <= n; k++) {
                double aCurr = 2 * bPrev + aPrev;
                double bCurr = 2 * Math.pow(aPrev, 2) + bPrev;
                long factorial = 1;
                for (int i = 2; i <= (k + 1); i++) {
                    factorial *= i;
                }
                sum += (aCurr * bCurr) / factorial;
                aPrev = aCurr;
                bPrev = bCurr;
            }
            result.setText(String.format("сумма=%.2f",sum));
        }
    }
