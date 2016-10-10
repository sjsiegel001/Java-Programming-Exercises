package prob1610;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


class TextEdit extends VBox {
    TextArea txtArea;
    TextField txtPath;

    public TextEdit() {
    	txtArea = new TextArea();
    	txtArea.setPrefSize(350, 150);

        txtPath = new TextField();
        txtPath.setOnAction(e-> getFile());
        
        Label lblPath = new Label("Filename", txtPath);
        lblPath.setContentDisplay(ContentDisplay.RIGHT);
        
        
        Button btnView = new Button("View");
        btnView.setOnAction(e->{
            getFile();
        });

        txtPath.setPrefColumnCount(txtArea.getPrefColumnCount());

        HBox filePath = new HBox(lblPath, btnView);

        getChildren().addAll(txtArea, filePath);
        
    }

    public void getFile() {

        File file = new File(txtPath.getText());
        Scanner scan;
        
        if (!file.exists()) {
        	txtArea.setText("The specified file could not be found");
            return;
        }

        
        StringBuilder stringBuild = new StringBuilder();
        try {
        	scan = new Scanner(file);
            while (scan.hasNextLine()) {
                stringBuild.append(scan.nextLine() + "\n");
            }
            txtArea.setText(stringBuild.toString());
        } catch (IOException e) {
        	txtArea.setText("An error occured when attempting to open the file");
        }


    }
}