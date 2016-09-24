package prob141;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.application.Application;
import javafx.geometry.Insets;

public class prob141 extends Application {

	    public static void main(String[] args) {
	        Application.launch(args);
	    }
	    
	    @Override
	    public void start(Stage primaryStage) throws Exception {

	        GridPane gridPane = new GridPane();
	        
	        ImageView chinaFlag = new ImageView(new Image("china.gif")); 
	        ImageView ukFlag = new ImageView(new Image("uk.gif")); 
	        ImageView usFlag = new ImageView(new Image("us.gif")); 
	        
	        chinaFlag.setFitHeight(95);
	        chinaFlag.setFitWidth(193);
	        
	        ukFlag.setFitHeight(95);
	        ukFlag.setFitWidth(170);
	        
	        usFlag.setFitHeight(95);
	        usFlag.setFitWidth(170);
	        
	        gridPane.add(new ImageView(new Image("ca.gif")), 0, 0);
	        gridPane.add(chinaFlag, 0, 1);
	        gridPane.add(ukFlag, 1, 0);
	        gridPane.add(usFlag, 1, 1);      
	        
	        gridPane.setHgap(5); 
	        gridPane.setVgap(5); 
	        gridPane.setPadding(new Insets(10, 10, 10, 10));
	        
	        Scene scene = new Scene(gridPane, 410, 220);
	        primaryStage.setTitle("Flags");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

}