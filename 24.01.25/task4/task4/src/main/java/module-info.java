module org.example.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.task4 to javafx.fxml;
    exports org.example.task4;
}