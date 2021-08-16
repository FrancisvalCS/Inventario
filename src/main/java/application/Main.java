package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{
	
	private static Stage primaryStage;
	private static Scene mainScene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/main.fxml"));
			Pane pane = loader.load();
			Main.primaryStage = primaryStage;
			mainScene = new Scene(pane);
			
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("INVENTÁRIO");
			primaryStage.setResizable(false);
			primaryStage.getIcons().add(new Image("/img/icoti.png"));
			primaryStage.show();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Stage getPrimaryStage() {
		return primaryStage;
	}
	
	public static Scene getScene() {
		return mainScene;
	}
	
	public static void closePrimaryStage() {
		primaryStage.close();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	

}
