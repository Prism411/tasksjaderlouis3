package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainViewController implements Initializable {
	
	
	@FXML
	private Button btBegin;
	
	@FXML
	private Button btEnd;
	
	public void onBtBeginAction() {
		try {
		    AnchorPane newAnchorPane = FXMLLoader.load(getClass().getResource("/gui/Program.fxml"));
		    Scene newScene = new Scene(newAnchorPane);
		    Stage stage = (Stage) btBegin.getScene().getWindow();
		    stage.setScene(newScene);
		    stage.show();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	public void onBtEndAction() {
		Stage stage = (Stage) btEnd.getScene().getWindow();
		stage.close();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
