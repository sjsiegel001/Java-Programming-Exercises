package prob167;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Prob167 extends Application {
	
	public void start(Stage myStage) {
		BorderPane myBorderPane = new BorderPane();
		myBorderPane.setPrefWidth(280);
		myBorderPane.setPrefHeight(340);
		
		HBox centerClock = new HBox();
		ClockPane clock = new ClockPane();
		
		centerClock.getChildren().add(clock);
		
		centerClock.setPadding(new Insets(10));
		
        myBorderPane.setCenter(centerClock);
        
        TextField txtHours = new TextField(); 
        TextField txtMinutes = new TextField(); 
        TextField txtSeconds = new TextField();
        
        txtHours.setPrefWidth(40);
        txtMinutes.setPrefWidth(40);
        txtSeconds.setPrefWidth(40);
        
        Label lblHours = new Label("Hours", txtHours);
        Label lblMinutes = new Label("Minutes", txtMinutes);
        Label lblSeconds = new Label("Seconds", txtSeconds);
        
        lblHours.setContentDisplay(ContentDisplay.TOP);
        lblMinutes.setContentDisplay(ContentDisplay.TOP);
        lblSeconds.setContentDisplay(ContentDisplay.TOP);
        
        txtHours.setOnAction(e-> clock.setHour(Integer.parseInt(txtHours.getText())));
        txtMinutes.setOnAction(e-> clock.setMinute(Integer.parseInt(txtMinutes.getText())));
        txtSeconds.setOnAction(e-> clock.setSecond(Integer.parseInt(txtSeconds.getText())));
        
        HBox UserInputFields = new HBox(8);
        UserInputFields.setAlignment(Pos.CENTER);
        
        UserInputFields.getChildren().addAll(lblHours, lblMinutes, lblSeconds);
        
        myBorderPane.setBottom(UserInputFields);
        UserInputFields.setPadding(new Insets(10));
		
		myStage.setScene(new Scene(myBorderPane));
        myStage.setTitle("Exercise 15_19");
        myStage.show();
	}
	
	public static void main(String [] args) {
		Application.launch(args);
	}
}
