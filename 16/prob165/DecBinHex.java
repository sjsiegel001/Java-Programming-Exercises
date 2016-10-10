package prob165;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import java.util.*;

class DecBinHex extends GridPane {

    Label lblDecimal = new Label("Decimal:");
    Label lblHex = new Label("Hex:");
    Label lblBinary = new Label("Binary:");

    TextField txtDecimal = new TextField();
    TextField txtHex = new TextField();
    TextField txtBinary = new TextField();
    List<TextField> txtList = new ArrayList<TextField>();
    

    Integer integer = 0;

    public DecBinHex() {

        setHgap(10);
        setVgap(10);
        setPadding(new Insets(10, 10, 10, 10));
        
        txtList.add(txtDecimal);
        txtList.add(txtHex);
        txtList.add(txtBinary);
        
        add(lblDecimal, 0, 0);
        add(txtDecimal, 1, 0);
        add(lblHex, 0, 1);
        add(txtHex, 1, 1);
        add(lblBinary, 0, 2);
        add(txtBinary, 1, 2);  
        
        for(TextField thisField : txtList) {
        	thisField.setAlignment(Pos.CENTER_RIGHT);
        }
        

        txtDecimal.setOnAction(e -> {
            integer = new Integer(txtDecimal.getText());
            setTextValues();
        });
        txtHex.setOnAction(e -> {
            integer = Integer.parseInt(txtHex.getText(), 16);
            setTextValues();
        });

        txtBinary.setOnAction(e-> {
            integer = Integer.parseInt(txtBinary.getText(), 2);
            setTextValues();
        });
    }
    
    //Simply uses the toHexString toBinaryString methods
    private void setTextValues() {
        txtDecimal.setText(integer.toString());
        txtHex.setText(Integer.toHexString(integer).toUpperCase());
        txtBinary.setText(Integer.toBinaryString(integer));
    }
}
