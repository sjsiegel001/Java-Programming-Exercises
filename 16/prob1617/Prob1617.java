package prob1617;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Prob1617 extends Application {

    public void start(Stage primaryStage) throws Exception {

    	ScrollColors scrollColors = new ScrollColors();

        primaryStage.setScene(new Scene(scrollColors));
        primaryStage.setTitle("Exercise 16_17");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}