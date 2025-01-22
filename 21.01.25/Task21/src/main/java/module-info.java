module org.example.task21 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.task21 to javafx.fxml;
    exports org.example.task21;
    exports ru.sau.task1;
    opens ru.sau.task1 to javafx.fxml;
}