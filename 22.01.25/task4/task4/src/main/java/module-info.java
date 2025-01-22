module ru.sau.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sau.task4 to javafx.fxml;
    exports ru.sau.task4;
}