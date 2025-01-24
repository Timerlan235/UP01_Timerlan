module org.example.task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.task6 to javafx.fxml;
    exports org.example.task6;
}