module ru.sau.task22 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sau.task22 to javafx.fxml;
    exports ru.sau.task22;
}