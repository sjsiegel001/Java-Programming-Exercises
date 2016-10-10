package prob1619;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.util.Duration;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.GridPane;

public class OneFan extends BorderPane {
	
	Timeline bladesTimeline;
	
	public OneFan() {
		
		
		HBox fanbox = new HBox(8);
		Fanblades myBlades = new Fanblades();
		fanbox.getChildren().add(myBlades);
		fanbox.setAlignment(Pos.CENTER);
		this.setCenter(fanbox);
		
		
		//actions
	    KeyFrame keyFrame = new KeyFrame(Duration.millis(20), e-> myBlades.spin());
	    bladesTimeline = new Timeline(keyFrame);
	    bladesTimeline.setCycleCount(Timeline.INDEFINITE);
	    bladesTimeline.play();
	    setSpeed(bladesTimeline, 0);
		
		//buttons
		Button btStart = new Button("Start");
	    btStart.setOnAction(e -> SetDefaultTime(bladesTimeline)); 
	    
		Button btStop = new Button("Stop");
	    btStop.setOnAction(e -> setSpeed(bladesTimeline, 0));
	    
	    Button btReverse = new Button("Reverse");
	    btReverse.setOnAction(e-> myBlades.spinAmount *= -1);
	    

	    GridPane buttonbox = new GridPane();
	    
	    buttonbox.add(btStart, 0, 0);
	    buttonbox.add(btStop, 1, 0);
	    buttonbox.add(btReverse, 2, 0);
	    buttonbox.setAlignment(Pos.BOTTOM_CENTER);
	    
	    buttonbox.setHgap(5); 
	    buttonbox.setVgap(5); 
	    buttonbox.setPadding(new Insets(5));

	    
	    this.setTop(buttonbox);
	    
	    ScrollBar scrollFan = new ScrollBar();
	    scrollFan.setMin(0);
	    scrollFan.setMax(5);
	    scrollFan.setUnitIncrement(0.1);     
	    scrollFan.setBlockIncrement(0.1);  
	    
	    scrollFan.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {
            	setSpeed(bladesTimeline, scrollFan.getValue());
            }
        });
	    
	    this.setBottom(scrollFan);
	    

	    fanbox.setPadding(new Insets(10, 10, 10, 10)); 
	    buttonbox.setPadding(new Insets(10, 10, 10, 10)); 
	}
	
	public void setSpeed(Timeline timeline, double rate) {
		timeline.setRate(rate);
	}
	
	public void SetDefaultTime(Timeline timeline) {
		timeline.setRate(3);
	}

	public Timeline getBladesTimeline() {
		return bladesTimeline;
	}

	public void setBladesTimeline(Timeline bladesTimeline) {
		this.bladesTimeline = bladesTimeline;
	}
	
	
}
