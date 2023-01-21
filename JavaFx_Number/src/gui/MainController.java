package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import entities.Counter;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

@SuppressWarnings("unused")
public class MainController implements Initializable {
	
	
	@FXML
	private Button btAdd;
	@FXML
	private Button btRemove;
	
	@FXML
	private Label value;
	
	private Counter count = new Counter(23);;
	

	
	public void onBtAddAction() {
		count.CounterAdd();
		count.getNumber();
		value.setText(String.format("%d", count.getNumber()));
		
	}
	
	public void onBtRemoveAction() {
		count.CounterRemove();
		count.getNumber();
		value.setText(String.format("%d", count.getNumber()));
		
	}
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
