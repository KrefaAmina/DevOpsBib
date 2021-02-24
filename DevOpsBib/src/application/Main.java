package application;
	

import Controler.Control;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	BorderPane root = new BorderPane();
	Control control =  new Control(root);
	Scene scene;
	public void start(Stage primaryStage) {
		try {
			menu();
			primaryStage.setTitle("Gestion de Bibliotheque");
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void menu() {
		Menu livre = new Menu("Les livres");
		MenuItem listLivre=new MenuItem("La liste des Livres");
		listLivre.setOnAction((event -> {
		    control.listLivre();
		}));
		MenuItem AjoutLivre = new MenuItem("Ajouter Livre");
		AjoutLivre.setOnAction((event -> {
		    control.AjouterLivre();
		}));
		livre.getItems().addAll(listLivre,AjoutLivre);
		MenuBar menuBar= new MenuBar();
		menuBar.getMenus().addAll(livre);
		root.setTop(menuBar);
		System.out.println("Menu de l'application Gestion de bibliotheque");
	}
	public static void main(String[] args) {
		launch(args);
	}
}
