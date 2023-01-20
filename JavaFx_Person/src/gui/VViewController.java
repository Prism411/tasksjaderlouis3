package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Person;

public class VViewController implements Initializable {
	
	@FXML
	private ComboBox<Person> comboBoxPerson;
	@FXML
	private Button btAll;
	
	private ObservableList<Person> obsList;
	
	public void onBtAllAction() {
		for (Person person : comboBoxPerson.getItems()) {
			System.out.println(person);
		}
	}

	
	public void onComboBoxPersonAction() { //Quando o combo box é Selecionado Printa Person no Console!
		Person person = comboBoxPerson.getSelectionModel().getSelectedItem();
		System.out.println(person);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("maria@gmail.com", "Maria", 1)); //dados que ja vem carregados
		list.add(new Person("Joao@gmail.com", "Joao", 2));	
		list.add(new Person("rafael@gmail.com", "rafael", 3));
		list.add(new Person("pedrao@gmail.com", "pedrao", 4));
		
		obsList = FXCollections.observableArrayList(list); //coloca isso dentro do ComboBox
		comboBoxPerson.setItems(obsList);
		
	}

}
