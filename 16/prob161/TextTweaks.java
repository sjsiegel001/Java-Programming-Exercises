package prob161;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class TextTweaks extends BorderPane {
		
	Text text;
    String[] strmyColors = {"Red", "Yellow", "Black", "Orange", "Green"};
    Color[] myColors = {Color.RED, Color.YELLOW, Color.BLACK, Color.ORANGE, Color.GREEN};
	
	public TextTweaks(Text text) {
		this.text = text;
        Pane textPane = new Pane(this.text);
        setPrefWidth(400);
        setPrefHeight(150);
        
        setCenter(textPane);
        makeRadioButtons();
        makeArrowButtons();
        
	}
	
	private void makeRadioButtons() {
        RadioButton[] rbmyColors = new RadioButton[5];

        HBox colorRbs = new HBox(15);
        colorRbs.setAlignment(Pos.CENTER);
        colorRbs.setPadding(new Insets(10, 10, 10, 10));
        setTop(colorRbs);

        ToggleGroup myColorGroup = new ToggleGroup();

        for (int i = 0; i < rbmyColors.length; i++) {
            rbmyColors[i] = new RadioButton(strmyColors[i]);            
            rbmyColors[i].setToggleGroup(myColorGroup);

            final int index = i;
            rbmyColors[i].setOnAction(e -> text.setFill(myColors[index]));
            colorRbs.getChildren().add(rbmyColors[i]); 
        }
        
        rbmyColors[2].setSelected(true); //black selected by default
	}
	
	private void makeArrowButtons() {    
        Button btLeft = new Button("<=");
        Button btRight = new Button("=>");
        
        HBox arrowButtons = new HBox(btLeft, btRight);
        
        setBottom(arrowButtons);
       
        arrowButtons.setAlignment(Pos.CENTER);
        arrowButtons.setPadding(new Insets(10, 10, 10, 10));
        arrowButtons.setSpacing(10);

        btLeft.setOnAction(e -> text.setX(text.getX() - 10));
        btRight.setOnAction(e -> text.setX(text.getX() + 10));
	}
}
