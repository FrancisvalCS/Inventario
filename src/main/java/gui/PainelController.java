package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PainelController implements Initializable{

	@FXML
	private Button cancela;
	
	
	@FXML
	public void cancela() {
		Stage stage = (Stage) cancela.getScene().getWindow(); //Obtem a janela atual
		stage.close();
		Main.getPrimaryStage().show();
	}
	
	public void initialize(URL location, ResourceBundle resources) {}

}
