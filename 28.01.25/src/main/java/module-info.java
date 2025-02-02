module ru.staroverov.staroverov_prakt7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sau7 to javafx.fxml;
    exports sau7;
    exports sau7.controller;
    opens sau7.controller to javafx.fxml;
}