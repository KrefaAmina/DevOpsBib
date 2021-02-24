package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	public static Connection myConn() {
		String serveurBD = "jdbc:mysql://localhost:3306/devopsbib?autoReconnect=true&useSSL=false";
		String login = "root";
		String motPasse = "";
		Connection conn = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(serveurBD, login, motPasse);
			System.out.println("Connection a la BD");
			return conn;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Execption BD");
		}
		return conn;
	}

}
