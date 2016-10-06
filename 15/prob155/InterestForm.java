package prob155;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class InterestForm extends GridPane {
    Label lbInvestAmount = new Label("Investment Amount:");
    TextField tfInvestAmount = new TextField();

    Label lbNumberOfYears = new Label("Number Of Years:");
    TextField tfNumberOfYears = new TextField();

    Label lbAnnualInterestRate = new Label("Monthly Interest Rate:");
    TextField tfMonthlyInterestRate = new TextField();

    Label lbFutureValue = new Label("Future Value:");
    TextField tfFutureValue = new TextField();

    Button btCalc = new Button("Calculate");

    public InterestForm() {
    	add(lbInvestAmount, 0, 0);
        add(tfInvestAmount, 1, 0);

        add(lbNumberOfYears, 0, 1);
        add(tfNumberOfYears, 1, 1);

        add(lbAnnualInterestRate, 0, 2);
        add(tfMonthlyInterestRate, 1, 2);

        add(lbFutureValue, 0, 3);
        add(tfFutureValue, 1, 3);
        
        HBox buttons = new HBox();
        buttons.getChildren().add(btCalc);
        buttons.setAlignment(Pos.BOTTOM_RIGHT);
        add(buttons, 1, 4);
        btCalc.setOnAction(e-> calcInterest());
        
        tfFutureValue.setDisable(true);
        
        setPadding(new Insets(10, 10, 10, 10));
        setHgap(10);
        setVgap(10);
        
    }
    
    public void calcInterest() {
    	double investAmount = Double.parseDouble(tfInvestAmount.getText());
    	double monthlyInterestRate = Double.parseDouble(tfMonthlyInterestRate.getText());
    	double years = Double.parseDouble(tfNumberOfYears.getText());
    	
    	double futureValue = investAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    	/*
    	System.out.println("invest amount: " + investAmount);
    	System.out.println("monthly interest rate: " + monthlyInterestRate);
    	System.out.println("years: " + years);
    	System.out.println("power calc: " + Math.pow(1 + monthlyInterestRate, years * 12));
    	*/
    	tfFutureValue.setText(String.format("$%.2f", futureValue));
    }
}
