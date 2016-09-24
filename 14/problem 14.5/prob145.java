package prob145;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class prob145 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane myPane = new Pane();
        String s = "Welcome to Java";
        Font font = Font.font("Arial", 50);
        
        int radius = 150;
        
        for(int i = 0; i < s.length(); i++) {
        	double alpha = 2 * Math.PI * (s.length() - i) / s.length();
        	Text txt = new Text(radius * Math.cos(alpha) + 220,
        						220 - radius * Math.sin(alpha), s.charAt(i) + "");
        	
        	txt.setFont(font);
        	txt.setRotate(360 * i / s.length() + 90);
        	myPane.getChildren().add(txt);
        }

        Scene myScene = new Scene(myPane, 475, 446);
        primaryStage.setTitle("Exercise 14_05");
        primaryStage.setScene(myScene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
