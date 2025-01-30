package org.example.task4;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class HelloController {

    @FXML
    private TextField Anum;

    @FXML
    private TextField Nnum;

    @FXML
    private Label Rezult;

    @FXML
    private Button cBTN;

    @FXML
    private Button okBTN;

    @FXML
    void OKonAction(ActionEvent event) {
        int a = Integer.parseInt(Anum.getText());
        int n = Integer.parseInt(Nnum.getText());
        double sum = 1;
        double d = 1;
        for (int i = 1; i <= n; i++) {
            d *= a;
            sum += d;
        }

        Rezult.setText(""+sum);
    }

    @FXML
    void cancelonAction(ActionEvent event) {
        Platform.exit();
    }

}