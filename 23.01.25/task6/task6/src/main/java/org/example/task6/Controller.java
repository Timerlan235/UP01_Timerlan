package org.example.task6;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
public class Controller {




    @FXML
    private TextField number;

    @FXML
    private TextField result;

    @FXML
    void onResultClick(ActionEvent event) {
        int N = Integer.parseInt(number.getText());
        boolean d = false;

        while (N > 0) {
            if (N % 10 == 2) {
                d = true;
                break;
            }
            N = N / 10;
        }
        result.setText("" + d);
    }

}
