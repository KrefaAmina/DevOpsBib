package Controler;



import View.View;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import model.Modele;

public class Control {
	TableView<Livre> tableView = new TableView<>();
	View myview = new View();
	Modele modele = new Modele();
	BorderPane root;

}
