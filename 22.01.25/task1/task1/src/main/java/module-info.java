module ru.sau.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sau.task1 to javafx.fxml;
    exports ru.sau.task1;
}