package prob1610;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Prob1610 extends Application {

	    @Override
	    public void start(Stage primaryStage) throws Exception {
	        TextEdit textEdit = new TextEdit();
	        primaryStage.setScene(new Scene(textEdit));
	        primaryStage.setTitle("Exercise 16_10");
	        primaryStage.show();
	    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
