package prob151;

import java.util.ArrayList;
import java.util.Collections;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class OKHandlerClass implements EventHandler<ActionEvent> {
	
	HBox myBox;
		
	public OKHandlerClass(HBox myBox) {
		super();
		this.myBox = myBox;
	}


	@Override
	public void handle(ActionEvent e) {
		showFiveCards(myBox);
	}
	
	public void showFiveCards(HBox box) {
		ArrayList<Integer> deck = new ArrayList<Integer>();
		
		for (int i = 1; i < 53; i++) {
			deck.add(i);
		}
		
		Collections.shuffle(deck);	
        
		box.getChildren().clear();
		box.getChildren().add(new ImageView(new Image("card/" + deck.get(1) + ".png")));
		box.getChildren().add(new ImageView(new Image("card/" + deck.get(2) + ".png")));
		box.getChildren().add(new ImageView(new Image("card/" + deck.get(3) + ".png")));
		box.getChildren().add(new ImageView(new Image("card/" + deck.get(4) + ".png")));
		box.getChildren().add(new ImageView(new Image("card/" + deck.get(5) + ".png")));
        
	}
}