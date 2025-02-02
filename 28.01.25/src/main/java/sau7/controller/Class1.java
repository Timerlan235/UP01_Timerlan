package sau7.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static sau7.util.Manager.*;

public class Class1 {

    @FXML
    private Button BackB;

    @FXML
    private Button Login;

    @FXML
    private Button NewB;

    @FXML
    private Button OldB;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("class4.fxml","Marathon Skills 2016");

    }

    @FXML
    void Login(ActionEvent event) {
        showTriScene("class6.fxml","Marathon Skills 2016 - Login");

    }

    @FXML
    void NewB(ActionEvent event) {
        showChScene("class5.fxml","Marathon Skills 2016 – Register as a runner");

    }

    @FXML
    void OldB(ActionEvent event) {
        showTriScene("class6.fxml","Marathon Skills 2016 - Login");

    }

}
