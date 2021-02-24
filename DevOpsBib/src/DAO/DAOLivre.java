package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Livre;
public class DAOLivre {
	
	public static List<Livre> getlistLivre() {
		List<Livre> listLivre = new ArrayList<>();
		String req = "Select * from livre";
		Statement ps;
		ResultSet rs;

		try {

			Connection conn = Dao.myConn();
			ps = conn.createStatement();

			rs = ps.executeQuery(req);
			while (rs.next()) {

				int id = (int) rs.getLong("idLivre");
				String titre = rs.getString("titre");
				Livre l = new Livre(id, titre);
				listLivre.add(l);
			}
			rs.close();
			ps.close();
			conn.close();

		} catch (SQLException ee) {
			ee.printStackTrace();
			System.out.println("Execption");
		}

		return listLivre;
	}

	public static boolean addLivre(Livre c) {
		PreparedStatement ps;
		Connection conn = Dao.myConn();
		try {

			String req1 = "INSERT INTO livre (titre) VALUES (?)";
			ps = conn.prepareStatement(req1);
			if (c.getIdLivre() == 0) {
				ps = conn.prepareStatement(req1, Statement.RETURN_GENERATED_KEYS);
				ps.setString(1, c.getTitre());
				ps.execute();
				ResultSet rs = ps.getGeneratedKeys();
				if (rs.next()) {
					c.setIdLivre(rs.getInt(1));
				}
				ps.close();
				System.out.println("livre ajouté a la base ");
			}
			conn.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Execption d'ajout");
		}
		return false;
	}


}
