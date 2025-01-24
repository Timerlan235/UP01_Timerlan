module org.example.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.task5 to javafx.fxml;
    exports org.example.task5;
}