package Controler;

import DAO.DAOLivre;
import View.View;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import model.Livre;
import model.Modele;

public class Control {
	TableView<Livre> tableView = new TableView<>();
	View myview = new View();
	Modele modele = new Modele();
	BorderPane root;
    
	public Control(BorderPane root) {
		this.root = root;
	}
	public void listLivre() {
		root.setRight(null);
		root.setLeft(null);
		root.setCenter(null);
		tableView = myview.creerTableView(modele.l);
		root.setLeft(tableView);

	}
	public void AjouterLivre() {
		Button B1 = new Button("Ajouter Livre");
		B1.setPrefSize(150, 20);
		B1.setOnAction((e -> {
			Livre L = new Livre(0, myview.titre.getText());
			if (DAOLivre.addLivre(L)) {

				System.out.println("Le Livre est ajoute avec succes");
				myview.AjouterLivre(root);

			} else
				System.out.println("Erreur d'ajout");

		}));
		root.setLeft(myview.AjouterLivre(root));
		root.setBottom(B1);
	}

}
