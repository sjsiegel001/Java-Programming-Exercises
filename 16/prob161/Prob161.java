package prob161;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Prob161 extends Application {
	public void start(Stage primaryStage) {
		
        Text text = new Text(90, 40, "Programming is fun");
        text.setFont(Font.font("Arial", 25));
        TextTweaks pane = new TextTweaks(text);

        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Text Pane");
        primaryStage.show();
	}
	
	public static void main(String [] args) {
		Application.launch(args);
	}
}
