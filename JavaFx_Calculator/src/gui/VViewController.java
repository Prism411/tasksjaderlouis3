package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VViewController {
	
	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;
	
	@FXML
	private Label labelResult;
	
	
	public void onbtTestAction() {
		Locale.setDefault(Locale.US);
		double number1 = Double.parseDouble(txtNumber1.getText());
		double number2 = Double.parseDouble(txtNumber2.getText());
		double sum = number1 + number2;
		Alerts.showAlert("Resultado", null, String.format("%.2f", sum), AlertType.INFORMATION);
		
	}

}
