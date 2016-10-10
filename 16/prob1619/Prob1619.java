package prob1619;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class Prob1619 extends Application {
	public void start(Stage primaryStage) {
		
		BorderPane bigBorderPane = new BorderPane();
		
		List<OneFan> allFans = new ArrayList<OneFan>();
		OneFan fan1 = new OneFan();
		OneFan fan2 = new OneFan();
		OneFan fan3 = new OneFan();
		
		allFans.add(fan1); allFans.add(fan2); allFans.add(fan3);
		
		GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(5);
        gridPane.setPadding(new Insets(5));
        
        gridPane.add(fan1, 0, 0);
        gridPane.add(fan2, 1, 0);
        gridPane.add(fan3, 2, 0);
        
		bigBorderPane.setCenter(gridPane);
		
		HBox universalButtons = new HBox();
		
		Button btStart = new Button("Start All");
	    btStart.setOnAction(e -> startAllFans(allFans)); 
	    
	    
		Button btStop = new Button("Stop All");
	    btStop.setOnAction(e -> stopAllFans(allFans));
		
	    universalButtons.getChildren().addAll(btStart, btStop);
        bigBorderPane.setBottom(universalButtons);
        universalButtons.setAlignment(Pos.BOTTOM_CENTER);
        universalButtons.setSpacing(10);
        universalButtons.setPadding(new Insets(10));
        
	    
        Scene scene = new Scene(bigBorderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 16_19");
        primaryStage.show();
	}
	
	public static void main(String [] args) {
		Application.launch(args);
	}
	
	public void startAllFans(List<OneFan> allFans) {
		for (OneFan temp : allFans) {
			temp.setSpeed(temp.getBladesTimeline(), 3);
		}
	}
	
	public void stopAllFans(List<OneFan> allFans) {
		for (OneFan temp : allFans) {
			temp.setSpeed(temp.getBladesTimeline(), 0);
		}
	}
	
	
	
	
}
