package prob1515;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Prob1515 extends Application {
	

	myCircles circlePane = new myCircles();
	
	public void start(Stage primaryStage) {
		
		circlePane.setOnMouseClicked(e-> circlePane.clickEvent(e.getX(), e.getY(), e.getButton()));
		
        Scene scene = new Scene(circlePane, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise15_15");
        primaryStage.show();
	}
	
	public static void main(String [] args) {
		Application.launch(args);
	}
}
