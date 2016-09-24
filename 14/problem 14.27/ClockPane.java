package prob1427;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.transform.Rotate;


public class ClockPane extends Pane {
	private int hour;
	private int minute;
	private int second;

	// Clock pane's width and height
	private double w = 250, h = 250;

	/** Construct a default clock with the current time */
	public ClockPane() {
		setCurrentTime();
	}

	/** Construct a click with specified hour, minute, and second */
	public ClockPane(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		paintClock();
	}

	/** Return hour */
	public int getHour() {
		return hour;
	}

	/** Set a new hour */
	public void setHour(int hour) {
		this.hour = hour;
		paintClock();
	}

	/** Return minute */
	public int getMinute() {
		return minute;
	}

	/** Set a new minute */
	public void setMinute(int minute) {
		this.minute = minute;
		paintClock();
	}

	/** Return second */
	public int getSecond() {
		return second;
	}

	/** Set a new second */
	public void setSecond(int second) {
		this.second = second;
		paintClock();
	}

	/** Return clock pane's width */
	public double getW() {
		return w;
	}

	/** Set clock pane's width */
	public void getW(double w) {
		this.w = w;
		paintClock();
	}

	/** Return clock pane's height */
	public double getH() {
		return h;
	}

	/** Set clock pane's height */
	public void setH(double h) {
		this.h = h;
		paintClock();
	}

	/* Set the current time for the clock */
	public void setCurrentTime() {
		// Construct a Calendar for the current date and time
		Calendar calendar = new GregorianCalendar();

		// Set current hour, minute and second
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);

		paintClock(); // Repaint the clock
	}
	
	/** Paint the clock */
	protected void paintClock() {
		// Initialize clock parameters
		double clockRadius = Math.min(w, h) * 0.8 * 0.5;
		double centerX = w / 2;
		double centerY = h / 2;

		// Draw circle
		Circle circle = new Circle(centerX, centerY, clockRadius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		
		Text t1 = new Text(centerX + 35, centerY - clockRadius + 35, "1");
		Text t2 = new Text(centerX + 65, centerY - clockRadius + 65, "2");
		Text t3 = new Text(centerX + clockRadius - 25, centerY + 5, "3");
		Text t4 = new Text(centerX + clockRadius - 35, centerY + 45, "4");
		Text t5 = new Text(centerX + 35, centerY + clockRadius - 30, "5");
		Text t6 = new Text(centerX - 4, centerY + clockRadius - 18, "6");
		Text t7 = new Text(centerX - 42, centerY + clockRadius - 30, "7");
		Text t8 = new Text(centerX - clockRadius + 29, centerY + 45, "8");
		Text t9 = new Text(centerX - clockRadius + 15, centerY + 5, "9");
		Text t10 = new Text(centerX - clockRadius + 25, centerY - 35, "10");
		Text t11 = new Text(centerX - 47, centerY - clockRadius + 35, "11");
		Text t12 = new Text(centerX - 6, centerY - clockRadius + 25, "12");

		
		// Draw big ticks
	    Group bigticks = new Group();
	    for (int i = 0; i < 12; i++) {
	      Line tick = new Line(0, -100, 0, -90);
	      tick.setTranslateX(centerX); tick.setTranslateY(centerY);
	      tick.getStyleClass().add("tick");
	      tick.getTransforms().add(new Rotate(i * (360 / 12)));
	      bigticks.getChildren().add(tick);
	    }
	    
		// Draw small ticks
	    Group smallticks = new Group();
	    for (int i = 0; i < 60; i++) {
	      Line smalltick = new Line(0, -100, 0, -96);
	      smalltick.setTranslateX(centerX); smalltick.setTranslateY(centerY);
	      smalltick.getStyleClass().add("tick");
	      smalltick.getTransforms().add(new Rotate(i * (360 / 60)));
	      smallticks.getChildren().add(smalltick);
	    }
		
		
		// Draw second hand
		double sLength = clockRadius * 0.8;
		double secondX = centerX + sLength *
			Math.sin(second * (2 * Math.PI / 60));
		double secondY = centerY - sLength *
			Math.cos(second * (2 * Math.PI / 60));
		Line sLine = new Line(centerX, centerY, secondX, secondY);
		sLine.setStroke(Color.RED);

		// Draw minute hand
		double mLength = clockRadius * 0.65;
		double xMinute = centerX + mLength *
			Math.sin(minute * (2 * Math.PI / 60));
		double minuteY = centerY - mLength *
			Math.cos(minute * (2 * Math.PI / 60));
		Line mLine = new Line(centerX, centerY, xMinute, minuteY);
		mLine.setStroke(Color.BLUE);

		// Draw hour hand 
		double hLength = clockRadius * 0.5;
		double hourX = centerX + hLength *
			Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		double hourY = centerY - hLength * 
			Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		Line hLine = new Line(centerX, centerY, hourX, hourY);
		hLine.setStroke(Color.GREEN);
		
		// Draw Text Time
		Text t = new Text(centerX - 20, centerY + 120, hour + ":" + minute + ":" + second);

		getChildren().clear();
		getChildren().addAll(circle, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, sLine, mLine, hLine, bigticks, smallticks, t);
	}
}