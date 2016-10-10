package prob1626;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Prob1626 extends Application {

    Pane pane = new Pane();

    public void start(Stage primaryStage) throws Exception {

        AudioClip audioClip = new AudioClip("file:/C:/Users/steve/workspace/chap16/assets/National-Anthem-Of-The-United-States.mp3");
        ImageView flag = new ImageView(new Image("us.gif"));
        pane.getChildren().addAll(flag);
        //Line(double startX, double startY, double endX, double endY)
        PathTransition flagPath = new PathTransition(Duration.seconds(5), new Line(110, 300, 110, 200), flag);
        
        flagPath.play();
        audioClip.play();

        primaryStage.setScene(new Scene(pane, 400, 300));
        primaryStage.setTitle("Pane");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}