package prob1532;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;

import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class prob1532 extends Application  {
	
	
    @Override
    public void start(Stage MyStage) {
    	
    	BorderPane borderPane = new BorderPane();
    	
    	//Clock
    	ClockPane clock = new ClockPane();
    	HBox clockbox = new HBox(8);
    	clockbox.getChildren().add(clock);
    	borderPane.setCenter(clockbox);
    	
        KeyFrame keyFrame = new KeyFrame(Duration.millis(1000), e-> clock.setCurrentTime());
        Timeline clockTimeline = new Timeline(keyFrame);
        clockTimeline.setCycleCount(Timeline.INDEFINITE);
    	
    	//Start and Stop
    	Button btStart = new Button("Start");
        btStart.setOnAction(e -> clockTimeline.play()); 
        
    	Button btStop = new Button("Stop");
        btStop.setOnAction(e -> clockTimeline.pause());
        
        HBox buttonbox = new HBox(8);
        buttonbox.getChildren().addAll(btStart, btStop);
        buttonbox.setAlignment(Pos.BOTTOM_CENTER);
        borderPane.setBottom(buttonbox);

        buttonbox.setPadding(new Insets(10, 10, 10, 10)); 
    	
        Scene myScene = new Scene(borderPane, 250, 300);
        MyStage.setTitle("Clock Pane");
        MyStage.setScene(myScene);
        MyStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }

}
