package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class VViewController {
	
	@FXML
	private Button btTest;
	
	public void onBtTestAction() {
		Alerts.showAlert("AlertTitle",null, "Click", AlertType.INFORMATION);
		
	}

}
