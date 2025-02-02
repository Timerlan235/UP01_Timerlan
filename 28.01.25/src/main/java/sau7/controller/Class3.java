package sau7.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static sau7.util.Manager.showSecondScene;

public class Class3 {

    @FXML
    private Button BackB;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("class4.fxml","Marathon Skills 2016");

    }

}
