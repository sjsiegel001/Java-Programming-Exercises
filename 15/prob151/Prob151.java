package prob151;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Prob151 extends Application {

	HBox myBox = new HBox();
	
	public void start(Stage primaryStage) {
        OKHandlerClass handler1 = new OKHandlerClass(myBox);		
		myBox.setAlignment(Pos.CENTER);
		handler1.showFiveCards(myBox);
		
        HBox myButton = new HBox();
        myButton.setAlignment(Pos.BOTTOM_CENTER);
		
        Button btRefresh = new Button("Refresh");

        btRefresh.setOnAction(handler1);
        myButton.getChildren().add(btRefresh);
				
        BorderPane myBorderPane = new BorderPane();
        myBorderPane.setCenter(myBox);
        myBorderPane.setBottom(myButton);
		
		
        Scene myScene = new Scene(myBorderPane);
        primaryStage.setTitle("5 Random Cards (NO BETTING!)");
        primaryStage.setScene(myScene);
        primaryStage.show();
	}
	
	public static void main(String [] args) {
		Application.launch(args);
	}
 
}