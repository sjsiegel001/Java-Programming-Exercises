package prob1617;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.util.ArrayList;
import java.util.List;

public class ScrollColors extends BorderPane {
	
	public ScrollColors() {
		FontWeight fontWeight;
		FontPosture fontPosture;
		
		fontWeight = FontWeight.NORMAL;
		fontPosture = FontPosture.REGULAR;
		
		Text text = new Text("Show Colors");
		text.setFont(Font.font("Arial", fontWeight, fontPosture, 30));
		this.setCenter(text);
		
		String[] stringLabels = {"Red", "Green", "Blue", "Alpha"};
		Label[] labels = new Label[4];
		List<ScrollBar> myScrollbars = new ArrayList<ScrollBar>();
		
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(5);
        gridPane.setPadding(new Insets(5));
		
		ScrollBar scrollRed = new ScrollBar();
		ScrollBar scrollGreen = new ScrollBar();
		ScrollBar scrollBlue = new ScrollBar();
		ScrollBar scrollAlpha = new ScrollBar();
				
		myScrollbars.add(scrollRed); myScrollbars.add(scrollGreen); myScrollbars.add(scrollBlue); myScrollbars.add(scrollAlpha);
		
		int increment = 0;
		
		for (ScrollBar temp : myScrollbars) {
			temp.setMin(0);
			
			if(temp != scrollAlpha) {
				temp.setMax(255);
				temp.setValue(0);
			} else {
				temp.setMax(1);
				temp.setValue(1);
			}
			
			labels[increment] = new Label(stringLabels[increment]);
			temp.valueProperty().addListener(new ChangeListener<Number>() {
	            public void changed(ObservableValue<? extends Number> ov,
	                Number old_val, Number new_val) {
	                    //System.out.println((int)temp.getValue());
	            		text.setFill(getColor(myScrollbars));
	            }
	        });
			
            gridPane.add(labels[increment], 0, increment);
            gridPane.add(temp, 1, increment);
			
			increment++;
		}
		
		//text.setFill(Color.rgb(255, 0, 0, .75823023842));
		
		this.setBottom(gridPane);
		
	}
	
    private Color getColor(List<ScrollBar> myScrollbars) {
        double[] rgb = new double[4];
        int increment = 0;
        for (ScrollBar temp : myScrollbars) {
            rgb[increment] = temp.getValue();
            increment++;
        }
        //System.out.println(rgb[3]);
        return Color.rgb((int)rgb[0], (int)rgb[1], (int)rgb[2], rgb[3]);
    }
    
}
