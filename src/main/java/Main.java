import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by continue-juan aon 19/09/17.
 */
public class Main extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("textfield_test.fxml"));
        Scene newScene = new Scene(loader.load());
        newScene.getStylesheets().add(this.getClass().getResource("style.css").toExternalForm());

        primaryStage.setScene(newScene);
        primaryStage.show();
    }

}
