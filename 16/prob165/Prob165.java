package prob165;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Prob165 extends Application {

    @Override
    public void start(Stage primaryStage) {

        DecBinHex pane = new DecBinHex();

        primaryStage.setTitle("Exercise 16_5");
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
