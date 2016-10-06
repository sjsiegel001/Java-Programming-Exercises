package prob1519;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import java.util.Calendar;

public class Prob1519 extends Application {	
	
	public void start(Stage primaryStage) {
		
		//time it
		Calendar rightNow = Calendar.getInstance();
		long start = rightNow.getTimeInMillis();
		
		Circle myCircle = new Circle(0, 0, 10);
		RandCircle pane = new RandCircle(myCircle, start);
		pane.updateCircle(myCircle);
		
		
        myCircle.setOnMouseClicked(e-> pane.clickedCircle(myCircle));
		
        Scene scene = new Scene(pane,500,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 15_19");
        primaryStage.show();
	}
	
	public static void main(String [] args) {
		Application.launch(args);
	}
}
