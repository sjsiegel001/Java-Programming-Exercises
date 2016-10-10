package prob163;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Prob163 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new TrafficLightPane();

        primaryStage.setScene(new Scene(pane,270,400));
        primaryStage.setTitle("Traffic Light");
        primaryStage.show();
    }
    
    public static void main(String [] args) {
    	Application.launch(args);
    }
    
}