package ru.sau.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField NomberMonth;

    @FXML
    private Button Opredelit;

    @FXML
    private Label rez;

    @FXML
    void OprButtonOnActnion(ActionEvent event) {
        int v = Integer.parseInt(NomberMonth.getText());
        int d = 0;
        switch (v) {
            case 1:
                d = 31;
                break;
            case 2:
                d = 28;
                break;
            case 3:
                d = 31;
                break;
            case 4:
                d = 30;
                break;
            case 5:
                d = 31;
                break;
            case 6:
                d = 30;
                break;
            case 7:
                d = 31;
                break;
            case 8:
                d = 31;
                break;
            case 9:
                d = 30;
                break;
            case 10:
                d = 31;
                break;

            case 11:
                d = 30;
                break;
            case 12:
                d = 31;
                break;

        }
        rez.setText(String.valueOf(d)) ;
    }

}
