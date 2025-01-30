package ru.sau.task1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.List;

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
    void okButtonOnAction(ActionEvent event){int count = 0;
    for (int number : SetListView.getItems()) {
        if (number % 4 == 0 && number % 7 != 0) {
            count++;
        }
    }
    RezultLabel.setText("Количество: " + count);
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

}}
