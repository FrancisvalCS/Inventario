package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import util.combo.Status;
import util.combo.StorageType;
import util.combo.UnidadeHd;

public class ComputadorController implements Initializable{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("inventario");
	EntityManager em = emf.createEntityManager();
	
	@FXML
	private TextField nome;
	@FXML
	private TextField marca;
	@FXML
	private TextField modelo;
	@FXML
	private TextField hd;
	@FXML
	private TextField ram;
	@FXML
	private TextField inventario;
	@FXML
	private TextField setor;
	@FXML
	private TextField sn;
	@FXML
	private TextField so;
	@FXML
	private TextArea obs;
	@FXML
	private ComboBox<UnidadeHd> unidadeHd;
	@FXML
	private ComboBox<Status> status;
	@FXML
	private ComboBox<StorageType> type;
	@FXML
	private Button cancela;
	@FXML
	private Button inserir;
	
	//Lista para combo box de unidade de disco
	private List<UnidadeHd> unityHd = new ArrayList<UnidadeHd>();
	private ObservableList<UnidadeHd> lst;
	
	//Lista para combo box de status
	private List<Status> stat = new ArrayList<Status>();
	private ObservableList<Status> st;
	
	//Lista para combo do tipo de armazenamento
	private List<StorageType> tp = new ArrayList<StorageType>();
	private ObservableList<StorageType> tipo; 
	
	public void initialize(URL location, ResourceBundle resources) {
		carregarHdSize(); //ComboBox unidadeHd
		carregaStatus(); //ComboBox status
		carregaTipo(); //ComboBox type
	}
	
	@FXML
	public void cancela() {
		Stage stage = (Stage) cancela.getScene().getWindow(); //Obtem a janela atual
		stage.close();
		Main.getPrimaryStage().show();
	}
	
	@FXML
	public void salvaNoBanco() throws IOException{
		
	}
	
	//Povoar Combo box de unidade de disco
	public void carregarHdSize() {
		UnidadeHd uhdd = new UnidadeHd(1,"MB"); 
		UnidadeHd uhdd2 = new UnidadeHd(2,"TB");
		
		unityHd.add(uhdd);
		unityHd.add(uhdd2);
		
		lst = FXCollections.observableArrayList(unityHd);
		unidadeHd.setItems(lst);
	}
	
	//Povoar Combo Box de Status
	public void carregaStatus() {
		Status stt = new Status(1,"Operacional");
		Status stt2 = new Status(2,"Defeituoso");
		Status stt3 = new Status(3,"Disponível");
		
		stat.add(stt);
		stat.add(stt2);
		stat.add(stt3);
		
		st = FXCollections.observableArrayList(stat);
		status.setItems(st);
	}
	
	//Povoar Combo Box de Tipo de Armazenamento
	public void carregaTipo() {
		StorageType tp1 = new StorageType(1,"HD");
		StorageType tp2 = new StorageType(2,"SSD");
		
		tp.add(tp1);
		tp.add(tp2);
		
		tipo = FXCollections.observableArrayList(tp);
		type.setItems(tipo);
	}
	
	

}
