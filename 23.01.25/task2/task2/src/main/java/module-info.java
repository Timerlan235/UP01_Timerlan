module ru.sau.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sau.task2 to javafx.fxml;
    exports ru.sau.task2;
}