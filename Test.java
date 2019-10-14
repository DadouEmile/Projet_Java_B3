import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.awt.*;

import java.io.IOException;

public class Test extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Go Securi Login");
        primaryStage.getIcons().add(new Image("file:/Users/emiledadou/IdeaProjects/Projet-JavaB3/src/icon-gosecuri.png"));
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
}
