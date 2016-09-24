package prob1427;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class prob1427 extends Application {
	
    @Override
    public void start(Stage MyStage) {
    	
    	Pane pane = new Pane();
    	
    	ClockPane clock = new ClockPane();
    	
    	pane.getChildren().add(clock);
    	
        Scene myScene = new Scene(pane, 250, 260);
        MyStage.setTitle("Clock Pane");
        MyStage.setScene(myScene);
        MyStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }


}
