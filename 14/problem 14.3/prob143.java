package prob143;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import java.util.*;

public class prob143 extends Application {
		
	    @Override
	    public void start(Stage MyStage) {
	    	
			ArrayList<Integer> deck = new ArrayList<Integer>();
			
			for (int i = 1; i < 53; i++) {
				deck.add(i);
			}
			
			Collections.shuffle(deck);
				
			HBox myBox = new HBox();
	        
	        myBox.getChildren().add(new ImageView(new Image("card/" + deck.get(1) + ".png")));
	        myBox.getChildren().add(new ImageView(new Image("card/" + deck.get(2) + ".png")));
	        myBox.getChildren().add(new ImageView(new Image("card/" + deck.get(3) + ".png")));
	        myBox.getChildren().add(new ImageView(new Image("card/" + deck.get(4) + ".png")));
	        myBox.getChildren().add(new ImageView(new Image("card/" + deck.get(5) + ".png")));
	        
	        Scene myScene = new Scene(myBox);
	        MyStage.setTitle("Display 5 Cards");
	        MyStage.setScene(myScene);
	        MyStage.show();
	    }

	    public static void main(String[] args) {
	        Application.launch(args);

	    }


}
