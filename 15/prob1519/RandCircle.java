package prob1519;

import java.util.Calendar;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class RandCircle extends Pane {
	
	Circle myCircle;	
	Text count;
	public int circleCount = 0;
	public long start;
	
	public RandCircle(Circle myCircle, long start) {
		this.myCircle = myCircle;
		this.start = start;
		count = new Text(450,50, this.getCircleCount() + "");
		getChildren().add(count);
		getChildren().add(myCircle);
	}
	
    public void updateCircle(Circle c) {

        double min = 50;
        double max = 450;

        c.setCenterX((Math.random() * (max - min) + min));
        c.setCenterY((Math.random() * (max - min) + min));

        c.setFill(new Color(Math.random(), Math.random(), Math.random(), 1));
    }
    
    public void clickedCircle(Circle myCircle) {
        if (circleCount < 19) {
        	circleCount++;
            count.setText(circleCount + "");

            this.updateCircle(myCircle);
        } else {
            this.getChildren().remove(myCircle);
            Calendar later = Calendar.getInstance();
            long end = later.getTimeInMillis();
            long duration = end - start;
            displayTimeSpent(duration);
        }
    }
    
    private void displayTimeSpent(long duration) {
		getChildren().remove(count);
		getChildren().remove(myCircle);
		Text timeSpent = new Text(170,250, "Time spent is " + duration + " milliseconds");
    	getChildren().add(timeSpent);
    }
    
    public int getCircleCount() {
    	return circleCount;
    }
}
