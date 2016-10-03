package prob1528;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Fanblades extends Pane {
	
	
	
	public Fanblades() {
		paintFan();
	}
	
	protected void paintFan() {
        Group myGroup = new Group();
        //make arcs
        int x = 50;
        int y = 50;
        int radiusX = 20;
        int radiusY = 20;
        for (int j = 40; j < 360; j += 90) {
            Arc arc = new Arc(x, y, radiusX, radiusY, j, 40);
            arc.setFill(Color.RED);
            arc.setType(ArcType.ROUND);
            myGroup.getChildren().add(arc);
        }
        getChildren().addAll(myGroup);
	}
}
