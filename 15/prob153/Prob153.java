package prob153;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Prob153 extends Application {

    @Override
    public void start(Stage primaryStage) {

        int width = 500;
        int height = 500;
        MyBall myBall = new MyBall(width, height);

        Button btUp = new Button("Up");
        btUp.setOnAction(e -> myBall.moveUp());

        Button btDown = new Button("Down");
        EventHandler<ActionEvent> goDown = e-> myBall.moveDown();
        btDown.setOnAction(goDown);
        
        
        Button btLeft = new Button("Left");
        EventHandler<ActionEvent> goLeft = e-> myBall.moveLeft();
        btLeft.setOnAction(goLeft);
        

        Button btRight = new Button("Right");
        EventHandler<ActionEvent> goRight = e-> myBall.moveRight();
        btRight.setOnAction(goRight);

        HBox buttons = new HBox(btUp, btDown, btLeft, btRight);
        buttons.setAlignment(Pos.BOTTOM_CENTER);
        BorderPane pane = new BorderPane();
        pane.setCenter(myBall);
        pane.setBottom(buttons);

        Scene scene = new Scene(pane, width, height);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click to move ball");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}