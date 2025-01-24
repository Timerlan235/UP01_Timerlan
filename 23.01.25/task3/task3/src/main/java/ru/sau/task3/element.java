package ru.sau.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.lang.Math.*;

import static java.lang.Math.sqrt;

public class element {

    @FXML
    private Button elem;

    @FXML
    private TextField elemZnach;

    @FXML
    private TextField numElement;

    @FXML
    private Label rez;

    @FXML
    void elemButtOnAction(ActionEvent event) {
        int v = Integer.parseInt(elemZnach.getText());
        double z = Double.parseDouble(numElement.getText());
        double a = 0, c = 0, h = 0, S = 0;
        switch (v) {
            case 1:
                a = z;
                c = a * (sqrt(2));
                h = c / 2;
                S = c * h / 2;
                break;
            case 2:
                c = z;
                a = c / Math.sqrt(2);
                h = c / 2;
                S = c * h / 2;
                break;
            case 3 :
                h = z;
                c = h * 2;
                a = c / Math.sqrt(2);
                S = c * h / 2;
                break;
            case 4 :
                S = z;
                h = sqrt(S);
                c = c / Math.sqrt(2);
                a = c * h / 2;
                break;


        }
        rez.setText("Катет: " + a + "\n Гипотенуза: " + c + "\n Высота: " + h + "\n Площадь: " + S);

    }
}
