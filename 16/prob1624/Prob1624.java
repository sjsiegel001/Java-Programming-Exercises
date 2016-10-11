package prob1624;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Prob1624 extends Application {


    public void start(Stage primaryStage) {
        
    	MediaDemo media = new MediaDemo();
    	
        Scene scene = new Scene(media, 800, 600);
        primaryStage.setTitle("MediaDemo"); 
        primaryStage.setScene(scene); 
        primaryStage.show();
        primaryStage.sizeToScene();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

