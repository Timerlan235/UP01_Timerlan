package sau7.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static sau7.util.Manager.showSecondScene;

public class Class7 {

    @FXML
    private Button BackB;

    @FXML
    private Button Cancel;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("class4.fxml","Marathon Skills 2016");

    }

    @FXML
    void Cancel(ActionEvent event) {
        showSecondScene("class1.fxml","Marathon Skills 2016 - Register as a runner");

    }

}
