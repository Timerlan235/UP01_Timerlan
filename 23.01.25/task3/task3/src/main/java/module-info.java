module ru.sau.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sau.task3 to javafx.fxml;
    exports ru.sau.task3;
}