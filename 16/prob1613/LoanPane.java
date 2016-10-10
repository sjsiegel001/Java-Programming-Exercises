package prob1613;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.text.DecimalFormat;


public class LoanPane extends BorderPane {
	

    TextField txtprinciple = new TextField();
    TextField txtNumYears = new TextField();
    TextArea textArea = new TextArea();
	
	public LoanPane() {
		
		this.setMinHeight(520);
		
        txtNumYears.setOnAction(e -> { updateRates(); });
        txtprinciple.setOnAction(e -> { updateRates(); });
		
        HBox topPane = new HBox();
        topPane.setSpacing(10);
        topPane.setPadding(new Insets(5));
        Label lblprinciple = new Label("Loan Amount:", txtprinciple);
        lblprinciple.setContentDisplay(ContentDisplay.RIGHT);

        Label lblNumOfYears = new Label("Number Of Years:", txtNumYears);
        lblNumOfYears.setContentDisplay(ContentDisplay.RIGHT);

        Button btShowTable = new Button("Show Table");
        btShowTable.setOnAction(e -> { updateRates(); });
        topPane.getChildren().addAll(lblprinciple, lblNumOfYears, btShowTable);
        this.setCenter(textArea);
        this.setTop(topPane);
	}
	

    public void updateRates() {
    	DecimalFormat df1 = new DecimalFormat("#.000");
    	DecimalFormat df2 = new DecimalFormat("##.##");
    	
        double annualInterestRate = 5.00;

        double principle = Double.parseDouble(txtprinciple.getText());

        double numberOfYears = Double.parseDouble(txtNumYears.getText());

        String s = "Interest Rate\t\t\tMonthly Payment\t\tTotal Payment";

        for ( ; annualInterestRate <= 8.00; annualInterestRate += 0.125) {

            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = principle * monthlyInterestRate / 
            		(1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

            double totalPayment = monthlyPayment * numberOfYears * 12;
            
            s += "\n" + df1.format(annualInterestRate) + "\t\t\t\t"
                  + df2.format(monthlyPayment)
                  + "\t\t\t\t" + df2.format(totalPayment);
            
        }

        textArea.setText(s);
    }
}
