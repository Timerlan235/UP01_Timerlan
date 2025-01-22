package ru.sau.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField numTextField; // Поле для ввода A

    @FXML
    private TextField res; // Поле для ввода B

    @FXML
    private Button rezult; // Кнопка для расчета

    @FXML
    void rezButtonOnAction(ActionEvent event) {

            int a = Integer.parseInt(numTextField.getText());
            int b = Integer.parseInt(res.getText());


                if (a > b) {
                    a = b = a;
                } else {
                    a = b = b;
                } if (a == b);
         {
                    a = b = 0;
        }



            numTextField.setText("" +a);
            res.setText("" +b);




}}