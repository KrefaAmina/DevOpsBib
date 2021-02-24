package View;

import java.util.List;


import javafx.collections.FXCollections;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import model.Livre;

public class View {
  
	public TextField titre = new TextField("");
	@SuppressWarnings("unchecked")
	public TableView<Livre> creerTableView(List<Livre> list) {
		TableView<Livre> tableView = new TableView<>();
		TableColumn<Livre, Integer> idLivre = new TableColumn<Livre, Integer>("ID");
		TableColumn<Livre, String> titre = new TableColumn<Livre, String>("Titre");
		tableView.getColumns().addAll(idLivre, titre);
		idLivre.setCellValueFactory(new PropertyValueFactory<>("idLivre"));
		titre.setCellValueFactory(new PropertyValueFactory<>("titre"));
		tableView.setItems(FXCollections.observableList(list));
		return tableView;
	}
////interface ajouter Livre
	public VBox AjouterLivre(BorderPane BP) {
		VBox VB = new VBox();
		Label ajouter = new Label("Succes d'ajout");
		titre.setId("Titre");
		titre.setPromptText("titre");
		titre.setStyle("-fx-alignment: BASELINE_CENTER;");
		VB.getChildren().add(ajouter);
		VB.getChildren().add(titre);

		return VB;

	}
}
