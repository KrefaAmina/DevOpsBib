package model;

import java.util.ArrayList;
import java.util.List;
import DAO.DAOLivre;

public class Modele {
	public List<Livre> l = new ArrayList<>();
	public Modele() {

		l = DAOLivre.getlistLivre();
		affichage(l);
	}
	
	public void affichage(List<Livre> l) {
		for (Livre itemLivre : l) {
			System.out.println("Id Livre : " + itemLivre.getIdLivre() + "\n Titre :" + itemLivre.getTitre());

		}
	}
	
	public void newLivre(Livre l) {
		try {
			DAOLivre.addLivre(l);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
