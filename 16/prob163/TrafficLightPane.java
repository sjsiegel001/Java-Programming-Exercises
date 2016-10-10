package prob163;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.*;

class TrafficLightPane extends Pane {

    double w;
    double h;
    
    public TrafficLightPane() {
    	
        Rectangle rec = new Rectangle(63, 45, 132, 200+50);
        rec.setFill(Color.TRANSPARENT);
        rec.setStroke(Color.BLACK);
        getChildren().add(rec);
        
        //make circles
        List<Circle> circles = new ArrayList<Circle>();
        
        Circle circleRed = new Circle(127, 100, 25);
        Circle circleYellow = new Circle(127, 175, 25);
        Circle circleGreen = new Circle(127, 250, 25);
        
        circles.add(circleRed); circles.add(circleYellow); circles.add(circleGreen);
        
        for(Circle circle : circles) {
        	circle.setFill(Color.TRANSPARENT);
        	circle.setStroke(Color.BLACK);
        	getChildren().add(circle);
        }
        
        //make radio buttons
        RadioButton[] rbColors = new RadioButton[3];
        ToggleGroup group = new ToggleGroup();
        String[] colorString = {"Red", "Yellow", "Green"};
        Color[] colors = new Color[]{Color.RED, Color.YELLOW, Color.GREEN};
        Integer[] spacing = new Integer[]{35, 95, 170};
        
        for (int i = 0; i < 3; i++) {
            rbColors[i] = new RadioButton(colorString[i]);


            final int index = i;
            rbColors[i].setOnAction(e-> {
                resetColors(circles);
                circles.get(index).setFill(colors[index]);
            });
            rbColors[i].setToggleGroup(group);
            rbColors[i].setLayoutY(350);
            rbColors[i].setLayoutX(spacing[index]);
            getChildren().add(rbColors[i]);
            
        }
    }

    private void resetColors(List<Circle> circles) {
        for(Circle circle : circles) {
        	circle.setFill(Color.TRANSPARENT);
        }
    }
}