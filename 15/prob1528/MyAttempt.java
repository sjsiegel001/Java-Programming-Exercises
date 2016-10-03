package prob1528;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MyAttempt extends Application {
	public void start(Stage MyStage) {
		Fanblades myBlades = new Fanblades();
        Scene myScene = new Scene(myBlades);
        
        
        MyStage.setTitle("Fan Blade Spinning");
        MyStage.setScene(myScene);
        MyStage.show();
	}
	
	public static void main(String [] args) {
		Application.launch(args);
	}
}
