package ptv;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane window = FXMLLoader.load(getClass().getResource("/fxml/mainWindow.fxml"));
        Scene scene = new Scene(window);
        stage.setMinHeight(window.getPrefHeight());
        stage.setMinWidth(window.getPrefWidth());
        stage.setScene(scene);
        stage.setTitle("Patients Transit Visualizer");
        stage.show();
    }
}
