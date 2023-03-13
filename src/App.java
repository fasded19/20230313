import java.util.jar.Manifest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       StackPane stackPane = new StackPane();
       MainPanel mainPanel = new MainPanel();
       Scene scene =new Scene(stackPane,400,300);
       stage.setScene(scene);
       stage.show();
    }
}
