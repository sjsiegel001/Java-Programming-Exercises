package prob1515;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Prob1515 extends Application {
	public void start(Stage primaryStage) {
		InterestForm form = new InterestForm();
				
        Scene scene = new Scene(form);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculate Interest");
        primaryStage.show();
	}
	
    public static void main(String[] args) {
        Application.launch(args);
    }
	
	
}
