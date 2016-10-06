package prob1528;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Prob1528 extends Application {
	public void start(Stage MyStage) {
		
		BorderPane borderPane = new BorderPane();
		
		//create fanblade hbox
		HBox fanbox = new HBox(8);
		Fanblades myBlades = new Fanblades();
		fanbox.getChildren().addAll(myBlades);
		fanbox.setAlignment(Pos.CENTER);
		borderPane.setCenter(fanbox);
		
		
		//actions
        KeyFrame keyFrame = new KeyFrame(Duration.millis(20), e-> myBlades.spin());
        Timeline bladesTimeline = new Timeline(keyFrame);
        bladesTimeline.setCycleCount(Timeline.INDEFINITE);
		
    	//buttons
    	Button btStart = new Button("Start");
        btStart.setOnAction(e -> bladesTimeline.play()); 
        
    	Button btStop = new Button("Stop");
        btStop.setOnAction(e -> bladesTimeline.pause());
        
        Button btReverse = new Button("Reverse");
        btReverse.setOnAction(e-> myBlades.spinAmount *= -1);
		
		//create button hbox
        HBox buttonbox = new HBox(8);
        buttonbox.getChildren().addAll(btStart, btStop, btReverse);
        buttonbox.setAlignment(Pos.BOTTOM_CENTER);
        borderPane.setBottom(buttonbox);

        fanbox.setPadding(new Insets(10, 10, 10, 10)); 
        buttonbox.setPadding(new Insets(10, 10, 10, 10)); 
        
        Scene myScene = new Scene(borderPane);
        MyStage.setTitle("Spinning Blades");
        MyStage.setScene(myScene);
        MyStage.show();
	}
	
	public static void main(String [] args) {
		Application.launch(args);
	}
}
