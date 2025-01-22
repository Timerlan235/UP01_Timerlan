package ru.sau.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class SumController {

    @FXML
    private Label rez;

    @FXML
    private Button vch;

    @FXML
    private TextField xTextField;

    @FXML
    void vchButtonOnAction(ActionEvent event) {
        double x = Double.parseDouble(xTextField.getText());
        double y;

        // Вычисляем y в зависимости от x
        if (x < 0) {
            y = pow(x, 5) - 10 - pow(sqrt(PI + x), 4);
        } else if (x >= 0 && x < 1) {
            y = pow((pow(x, 3) + 3), 3) - sqrt(0.5 * PI + x);
        } else {
            y = x * (pow(x, 4) + 3 * x) + log(PI + x);
        }

        rez.setText("Результат: " + y);

    }

}
