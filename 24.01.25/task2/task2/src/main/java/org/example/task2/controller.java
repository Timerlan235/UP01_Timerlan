package org.example.task2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class controller {

    @FXML
    private Label RezultLabel;

    @FXML
    private ListView<Integer> SetListView;

    @FXML
    private Button okBTN;

    @FXML
    private Button dobButtonOnAction;

    @FXML
    private TextField numText;

    @FXML
    private Button dobButton;

    @FXML
    void okButtonOnAction(ActionEvent event) {

        int min = Integer.MAX_VALUE;
        for (int number : SetListView.getItems()) {
            if (number % 10 == 4) {
                if (number < min) {
                    min = number;
                }
            }
        }

        RezultLabel.setText("Минимальное число, оканчивающееся на 4: " + min);

    }

    @FXML
    void OtmenaButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void donActionOnAction(ActionEvent event) {
        int x = Integer.parseInt(numText.getText());
        if (x > 0 && x <= 30000) {
            SetListView.getItems().add(x);
            numText.setText("");

        }

    }
}
