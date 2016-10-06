package prob1528;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Fanblades extends Pane {
	
	private Arc[] myBlades = new Arc[4];
	int spinAmount = -5;
	
	public Fanblades() {
		displayFan();
        setMinHeight(200);
        setMinWidth(200);
	}
	
	protected void displayFan() {	
		
        Circle circle = new Circle(100,100,100,Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);
		
        //make arcs
        double bladeRadius = 90;
        for (int i = 0; i < myBlades.length; i++) {
            myBlades[i] = new Arc(
                    100,100,
                    bladeRadius, bladeRadius,
                    (i * 90) + 40, 40);
            myBlades[i].setType(ArcType.ROUND);
        }
        getChildren().addAll(myBlades);
        getChildren().addAll(circle);
	}
	
    public void spin() {
    	for (int i = 0; i < myBlades.length; i++) {
            double prevStartAngle = myBlades[i].getStartAngle();
            myBlades[i].setStartAngle(prevStartAngle + spinAmount);
        }
    }
	
}
