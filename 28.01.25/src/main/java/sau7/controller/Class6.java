package sau7.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static sau7.util.Manager.showCheScene;
import static sau7.util.Manager.showSecondScene;

public class Class6 {

    @FXML
    private Button BackB;

    @FXML
    private Button Cancel;

    @FXML
    private Button reg;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("class4.fxml","Marathon Skills 2016");

    }

    @FXML
    void Cancel(ActionEvent event) {
        showSecondScene("class1.fxml","Marathon Skills 2016 - Register as a runner");

    }

    @FXML
    void reg(ActionEvent event) {
        showCheScene("class2.fxml","Marathon Skills 2016 – Register for an event");

    }

}
