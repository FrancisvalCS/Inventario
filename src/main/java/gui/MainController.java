package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainController implements Initializable{
	
	@FXML
	private Button pc;
	
	@FXML
	private Button notebook;
	
	@FXML
	private Button impressora;
	
	@FXML
	private Button suprimento;
	
	@FXML
	private Button camera;
	
	@FXML
	private Button rede;
	
	@FXML
	private Button painel;
	
	@FXML
	private Button outros;
	
	//Obtem a imagem externa
	private final Image pcImage = new Image("/img/pcicon.png");
	private final Image noteImage = new Image("/img/notebook.png");
	private final Image printerImage = new Image("/img/impressoras.png");
	private final Image suprimentosImage = new Image("/img/suprimentos.png");
	private final Image camImage = new Image("/img/cam.png");
	private final Image redesImage = new Image("/img/redes.png");
	private final Image painelImage = new Image("/img/painel.png");
	private final Image outrosImage = new Image("/img/outros.png");
	
	
	@FXML
	public void onPcSelect() {
		loadView("/gui/computador.fxml");
	}
	
	
	public void initialize(URL location, ResourceBundle resources) {
		//Adiciona a imagem externa à um ImageView
		ImageView pcimg = new ImageView(pcImage);
		ImageView ntimg = new ImageView(noteImage);
		ImageView prtimg = new ImageView(printerImage);
		ImageView suprimentosimg = new ImageView(suprimentosImage);
		ImageView camimg = new ImageView(camImage);
		ImageView redesimg = new ImageView(redesImage);
		ImageView panelimg = new ImageView(painelImage);
		ImageView outrosimg = new ImageView(outrosImage);
		
		//Adiciona a ImageView gerada ao botão correspondente
		pc.setGraphic(pcimg);
		notebook.setGraphic(ntimg);
		impressora.setGraphic(prtimg);
		suprimento.setGraphic(suprimentosimg);
		rede.setGraphic(redesimg);
		camera.setGraphic(camimg);
		painel.setGraphic(panelimg);
		outros.setGraphic(outrosimg);
	}
	
	
	private void loadView(String content) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(content));
			Parent root = (Parent) loader.load();
			Stage stage = new Stage();
			stage.setTitle("INVENTÁRIO");
			stage.setResizable(false);
			stage.setScene(new Scene(root));
			Main.closePrimaryStage();
			stage.show();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
