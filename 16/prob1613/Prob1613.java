package prob1613;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Prob1613 extends Application {

    @Override
    public void start(Stage primaryStage) {
    	LoanPane borderPane = new LoanPane();
        primaryStage.setScene(new Scene(borderPane));
        primaryStage.setTitle("Display Loan");
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
