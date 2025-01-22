module ru.saubanov.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.saubanov.task1 to javafx.fxml;
   // exports ru.saubanov.task1;
    exports ru.Saubanov.task1;
    opens ru.Saubanov.task1 to javafx.fxml;
}