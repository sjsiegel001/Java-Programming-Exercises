package prob164;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Prob164 extends Application {

    public void start(Stage primaryStage) throws Exception {

    	TextPane pane = new TextPane();

        primaryStage.setTitle("Exercise16_04");
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
