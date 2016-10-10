package prob164;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

class TextPane extends GridPane {

    Label lblMiles = new Label("Mile: ");
    Label lblKilometers = new Label("Kilometers: ");

    TextField txtMiles = new TextField();
    TextField txtKilos = new TextField();

    public TextPane() {

        setHgap(10);
        setVgap(10);
        setPadding(new Insets(10, 10, 10, 10));

        add(lblMiles, 0, 0);
        add(txtMiles, 1, 0);
        add(lblKilometers, 0, 1);
        add(txtKilos, 1, 1);

        txtMiles.setAlignment(Pos.CENTER_RIGHT);
        txtKilos.setAlignment(Pos.CENTER_RIGHT);

        txtKilos.setOnAction(e-> { txtMiles.setText(Double.toString(new Double(txtKilos.getText()) * 0.621)); });
        txtMiles.setOnAction(e-> { txtKilos.setText(Double.toString(new Double(txtMiles.getText()) / 0.621)); });

    }
}