package ru.sau.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField Nombe;

    @FXML
    private Button Opredelit;

    @FXML
    private Label rez;

    @FXML
    void OprButtonOnActnion(ActionEvent event) {
        int v = Integer.parseInt(Nombe.getText());
        if ((v >= 20 && v <= 69)){
        int ten = v / 10;
        int un = v % 10;
        String age = "";

        switch (ten) {
            case 2:
                age = "Двадцать";
                break;
            case 3:
                age = "Тридцать";
                break;
            case 4:
                age = "Сорок";
                break;
            case 5:
                age = "Пятьдесят";
                break;
            case 6:
                age = "Шестьдесят";
                break;
        }
        if (un == 0) {
            age = age + " лет";
        } else
            switch (un) {
                case 1:
                    age = age + " один год";
                    break;
                case 2:
                    age = age + " два года";
                    break;
                case 3:
                    age = age + " три года";
                    break;
                case 4:
                    age = age + " четыре года";
                    break;
                case 5:
                    age = age + " пять лет";
                    break;
                case 6:
                    age = age + " шесть лет";
                    break;
                case 7:
                    age = age + " семь лет";
                    break;
                case 8:
                    age = age + " восемь лет";
                    break;
                case 9:
                    age = age + " девять лет";
                    break;

            }


        rez.setText((age));
    }

}}