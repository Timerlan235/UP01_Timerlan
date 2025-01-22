package ru.saubanov.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController1 {

    @FXML
    private TextField aTaskField;

    @FXML
    private TextField bTaskField;

    @FXML
    private Label result;

    @FXML
    void ChastButtonOnAcnion(ActionEvent event) {
        float A=Float.parseFloat(aTaskField.getText());
        float B=Float.parseFloat(aTaskField.getText());
        result.setText("S="+(A/B));

    }

    @FXML
    void proizButtonOnAcnion(ActionEvent event) {
        float A=Float.parseFloat(aTaskField.getText());
        float B=Float.parseFloat(aTaskField.getText());
        result.setText("S="+(A*B));

    }

    @FXML
    void razButtonOnAcnion(ActionEvent event) {
        float A=Float.parseFloat(aTaskField.getText());
        float B=Float.parseFloat(aTaskField.getText());
        result.setText("S="+(A-B));

    }

    @FXML
    void sumButtonOnAcnion(ActionEvent event) {
        float A=Float.parseFloat(aTaskField.getText());
        float B=Float.parseFloat(aTaskField.getText());
        result.setText("S="+(A+B));

    }

}
