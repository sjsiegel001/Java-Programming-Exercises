package prob1614;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Prob1614 extends Application {

    @Override
    public void start(Stage primaryStage) {
    	
    	FontEditPane fep = new FontEditPane();
    	fep.setPrefSize(485, 150);
    	
        primaryStage.setTitle("Exercise 16_14");
        primaryStage.setScene(new Scene(fep));
        primaryStage.show();

    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}