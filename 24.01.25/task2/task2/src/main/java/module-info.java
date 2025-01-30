module org.example.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.task2 to javafx.fxml;
    exports org.example.task2;
}