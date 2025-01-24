package org.example.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Day {

    @FXML
    private TextField num;

    @FXML
    private Label rez;

    @FXML
    private Button rezult;

    @FXML
    void rezultButtonOnAction(ActionEvent event) {
        double p = Double.parseDouble(num.getText());
        double sum = 0;
        double dist = 10;
        int day = 0;
        while (sum <=200) {
            sum += dist;
            day++;
            dist += dist * (p / 100.0);
        }
        rez.setText("Прошло дней: " + day + " Суммарно лыжник проехал: " + sum);
    }

}