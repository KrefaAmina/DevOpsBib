package model;

public class Livre {
	private int idLivre;
	private String titre;
	public int getIdLivre() {
		return idLivre;
	}
	
	public Livre(int idLivre, String titre) {
		this.idLivre = idLivre;
		this.titre = titre;
	}

	public void setIdLivre(int idLivre) {
		this.idLivre = idLivre;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Override
	public String toString() {
		return "Livre [idLivre=" + idLivre + ", titre=" + titre + "]";
	}
	
	

}
