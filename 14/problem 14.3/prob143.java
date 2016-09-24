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
			
			for (int i = 0; i < 52; i++) {
				deck.add(i);
			}
			
			Collections.shuffle(deck);
				
	        GridPane myPane = new GridPane();
	        
	        myPane.add(new ImageView(new Image("card/" + deck.get(1) + ".png")), 1, 0);
	        myPane.add(new ImageView(new Image("card/" + deck.get(2) + ".png")), 2, 0);
	        myPane.add(new ImageView(new Image("card/" + deck.get(3) + ".png")), 3, 0);
	        
	        Scene myScene = new Scene(myPane);
	        MyStage.setTitle("Display 3 Cards");
	        MyStage.setScene(myScene);
	        MyStage.show();
	    }

	    public static void main(String[] args) {
	        Application.launch(args);

	    }


}
