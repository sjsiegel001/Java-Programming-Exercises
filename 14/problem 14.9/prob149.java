package prob149;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.Group;

public class prob149 extends Application {

    int radius = 100;
    int radiusX = 85;
    int radiusY = 85;
    

    @Override
    public void start(Stage primaryStage) throws Exception {

        int x = radius;
        int y = radius;
        
        GridPane gridPane = new GridPane();
        
        StackPane myStackPane = new StackPane();
        StackPane myStackPane2 = new StackPane();
        StackPane myStackPane3 = new StackPane();
        StackPane myStackPane4 = new StackPane();
                
        
        //make circles
        Circle[] circleArray = new Circle[4];
        for (int i = 0; i < 4; i ++) {
	        Circle myCircle = new Circle(radius);
	        myCircle.setFill(Color.WHITE);
	        myCircle.setStroke(Color.BLACK);
	                
	        myCircle.setCenterX(x);
	        myCircle.setCenterY(y);
	        circleArray[i] = myCircle;
        }
        
        
        
        Group myGroup = new Group();
        //make arcs
        for (int j = 40; j < 360; j += 90) {
            Arc arc = new Arc(x, y, radiusX, radiusY, j, 40);
            arc.setFill(Color.RED);
            arc.setType(ArcType.ROUND);
            myGroup.getChildren().add(arc);
        }
        
        Group myGroup2 = new Group();
        //make arcs
        for (int j = 40; j < 360; j += 90) {
            Arc arc = new Arc(x, y, radiusX, radiusY, j, 40);
            arc.setFill(Color.GREEN);
            arc.setType(ArcType.ROUND);
            myGroup2.getChildren().add(arc);
        }
        
        Group myGroup3 = new Group();
        //make arcs
        for (int j = 40; j < 360; j += 90) {
            Arc arc = new Arc(x, y, radiusX, radiusY, j, 40);
            arc.setFill(Color.BLUE);
            arc.setType(ArcType.ROUND);
            myGroup3.getChildren().add(arc);
        }
        
        Group myGroup4 = new Group();
        //make arcs
        for (int j = 40; j < 360; j += 90) {
            Arc arc = new Arc(x, y, radiusX, radiusY, j, 40);
            arc.setFill( new Color(Math.random(),Math.random(),Math.random(),1.0) );
            arc.setType(ArcType.ROUND);
            myGroup4.getChildren().add(arc);
        }
        
        
        myStackPane.getChildren().add(myGroup);
        myStackPane2.getChildren().add(myGroup2);
        myStackPane3.getChildren().add(myGroup3);
        myStackPane4.getChildren().add(myGroup4);
        
        
        gridPane.add(circleArray[0], 0, 1);
        gridPane.add(circleArray[1], 1, 0);
        gridPane.add(circleArray[2], 1, 1);
        gridPane.add(circleArray[3], 0, 0);
        
        gridPane.add(myStackPane, 0, 1);
        gridPane.add(myStackPane2, 1, 1);
        gridPane.add(myStackPane3, 1, 0);
        gridPane.add(myStackPane4, 0, 0);
        
        gridPane.setHgap(5); 
        gridPane.setVgap(5); 
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        
        Scene myScene = new Scene(gridPane, 420, 420);
        primaryStage.setScene(myScene);
        primaryStage.setTitle("Exercise14_09");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
