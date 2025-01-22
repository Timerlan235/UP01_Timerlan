package org.example.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class YrDy {

    @FXML
    private TextField chislo;

    @FXML
    private Label rez;

    @FXML
    private Button srch;

    @FXML
    void srchButtONAction(ActionEvent event) {
        int d = Integer.parseInt(chislo.getText());
        int day = d % 7;

        if (day == 0) {
            day = 7;
            switch (day) {

                case 1:
                    day = 1;
                    break;
                case 2:
                    day = 2;
                    break;
                case 3:
                    day = 3;
                    break;
                case 4:
                    day = 4;
                    break;
                case 5:
                    day = 5;
                    break;
                case 6:
                    day = 6;
                    break;
                case 7:
                    day = 7;
                    break;
            }
            rez.setText(String.valueOf(day));
        }

    }}
