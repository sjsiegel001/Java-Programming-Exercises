package prob1614;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


class FontEditPane extends BorderPane {
	
    Text text = new Text("Programming is fun");
    ComboBox<String> cbFontFamilies = new ComboBox<>();

    CheckBox chkBold = new CheckBox("Bold");
    CheckBox chkItalic = new CheckBox("Italic");
    ComboBox<Integer> cbFontSize = new ComboBox<>();
	
	public FontEditPane() {

        Integer[] sizes = new Integer[72];

        for (int i = 0; i < 72; i++)
            sizes[i] = i + 1;

        //System.out.println(Font.getFamilies());
        cbFontFamilies.getItems().addAll(Font.getFamilies());
        cbFontFamilies.setValue(text.getFont().getFamily());
        
        cbFontFamilies.setOnAction(e-> updateFont());
        
        Label lblFontFamilies = new Label("Font Name", cbFontFamilies);
        lblFontFamilies.setContentDisplay(ContentDisplay.RIGHT);
        lblFontFamilies.setPadding(new Insets(0,50,0,0));
        
        cbFontSize.getItems().addAll(getSizes());
        cbFontSize.setValue(30); 
        updateFont();
        cbFontSize.setOnAction(e -> {
            updateFont();
        });
        Label lblFontSizes = new Label("Font Size",cbFontSize);
        lblFontSizes.setContentDisplay(ContentDisplay.RIGHT);

        HBox topPane = new HBox(lblFontFamilies, lblFontSizes);
        topPane.setSpacing(5);
        topPane.setPadding(new Insets(5));

        chkBold.setOnAction(e-> updateFont());
        chkBold.setPadding(new Insets(0,10,0,0));
        chkItalic.setOnAction(e-> updateFont());


        HBox bottomPane = new HBox(chkBold, chkItalic);
        bottomPane.setAlignment(Pos.CENTER);
        bottomPane.setPadding(new Insets(10));

        StackPane centerPane = new StackPane(text);
        this.setCenter(centerPane);
        this.setTop(topPane);
        this.setBottom(bottomPane);        
	}
	
    public void updateFont(){
        FontWeight fontWeight;
        FontPosture fontPosture;
        
        if(chkBold.isSelected()) {
        	fontWeight = FontWeight.BOLD;
        } else {
        	fontWeight = FontWeight.NORMAL;
        }
        
        if(chkItalic.isSelected()) {
        	fontPosture = FontPosture.ITALIC;
        } else {
        	fontPosture = FontPosture.REGULAR;
        }        
        
        String fontFamily = cbFontFamilies.getValue();
        double size = cbFontSize.getValue();
        text.setFont(Font.font(fontFamily, fontWeight, fontPosture, size));
    }

    public Integer[] getSizes() {
        Integer[] sizes = new Integer[72];

        for (int i = 0; i < 72; i++)
            sizes[i] = i + 1;

        return sizes;
    }
}
