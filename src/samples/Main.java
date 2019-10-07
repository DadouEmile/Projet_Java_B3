package samples;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.geometry.Rectangle2D;
import javax.tools.Tool;
import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //get the screen display size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        //load graphics for the app window
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        // Display the app window
        primaryStage.setTitle("SecuriScan");
        primaryStage.setScene(new Scene(root, screenWidth, screenHeight));
        primaryStage.getIcons().add( new Image( Main.class.getResourceAsStream( "icon.png" )));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
