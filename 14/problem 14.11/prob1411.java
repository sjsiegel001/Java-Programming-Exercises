package prob1411;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;


public class prob1411 extends Application {


    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        
        Circle head = new Circle(100);
        head.setFill(Color.WHITE);
        head.setStroke(Color.BLACK);
        head.setCenterX(100);
        head.setCenterY(100);
        
        Circle leftEye = new Circle(10);
        leftEye.setFill(Color.BLACK);
        leftEye.setCenterX(50);
        leftEye.setCenterY(60);
        
        Circle rightEye = new Circle(10);
        rightEye.setFill(Color.BLACK);
        rightEye.setCenterX(140);
        rightEye.setCenterY(60);
        

    	Line mouth = new Line(60, 160, 137, 160);
    	mouth.setStrokeWidth(5);
    	
        
        
        Arc nose = new Arc(80, 120, 25, 33, 22, 40);
        nose.setFill(Color.BLACK);
        nose.setType(ArcType.ROUND);
        
        
        
        pane.getChildren().add(head);
        pane.getChildren().add(leftEye);
        pane.getChildren().add(rightEye);
        pane.getChildren().add(nose);
        pane.getChildren().add(mouth);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Smiley Face!");
        primaryStage.show();
    }



    public static void main(String[] args) {
        Application.launch(args);
    }
}
