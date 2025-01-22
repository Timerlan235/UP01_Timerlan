module org.example.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.task3 to javafx.fxml;
    exports org.example.task3;
}