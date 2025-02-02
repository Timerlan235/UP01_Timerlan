package sau7;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

import static sau7.util.Manager.showMainStage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        showMainStage(stage, "class4.fxml","Marathon Skills 2016");
    }

    public static void main(String[] args) {
        launch();
    }
}