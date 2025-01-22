package ru.sau.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private TextField cTextField;

    @FXML
    private Button zamena;

    @FXML
    void zmButtOnAction(ActionEvent event) {
        double a = Double.parseDouble(aTextField.getText());
        double b = Double.parseDouble(bTextField.getText());
        double c = Double.parseDouble(cTextField.getText());
        if (a < b && b < c)  {
                a = a * 2;
        b = b * 2;
        c = c * 2;
    } else {
            a = -a;
            b = -b;
            c = -c;
        }
        aTextField.setText("" + a );
        bTextField.setText("" + b );
        cTextField.setText("" + c);
}
}