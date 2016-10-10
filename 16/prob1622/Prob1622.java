package prob1622;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Prob1622 extends Application {  

    @Override
    public void start(Stage primaryStage) {
    	
    	AudioPlayer audio = new AudioPlayer();
    	
        primaryStage.setScene(new Scene(audio));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
