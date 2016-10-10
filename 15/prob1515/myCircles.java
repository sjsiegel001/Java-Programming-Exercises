package prob1515;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.input.MouseButton;
import javafx.collections.ObservableList;
import javafx.scene.Node;


public class myCircles extends Pane {
	
	double x;
	double y;
	
	public myCircles() {
        //default constructor ..
	}
	
	public void clickEvent(double x, double y, MouseButton e) { 
		//System.out.println("x coordinate is: " + x + ", y coordinate is: " + y + ", The mouse button clicked was: " + e);
        if(e == MouseButton.PRIMARY) {
        	Circle myCircle = createPoint(x,y);
        	myCircle.setFill(new Color(Math.random(), Math.random(), Math.random(), 1));
        	this.getChildren().add(myCircle);
        } else if(e == MouseButton.SECONDARY) {
        	destroyPoint(x, y);
        }
	}
	
    private Circle createPoint(double x, double y) {
        Circle newCircle = new Circle(x, y, 5, Color.TRANSPARENT);
        newCircle.setStroke(Color.BLACK);
        return newCircle;
    }
    
    //uses the 'ObservableList' collection to remove nodes
    //https://docs.oracle.com/javase/8/javafx/api/javafx/collections/ObservableList.html
    private void destroyPoint(double x, double y) {
        ObservableList<Node> allCircles = this.getChildren();
        for (Node thisCircle:allCircles) {
            if (thisCircle.contains(x, y)) {
                this.getChildren().remove(thisCircle);
                break;
            }//endif
        }//endfor
    }//end destroyPoint
}
