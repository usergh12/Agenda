package conector;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
	private static final String usuario = "root";
	private static final String senha = "Mari4096";
	private static final String url = "jdbc:mysql://localhost/pontuario";

	public static Connection getConectar() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, usuario, senha);
		}catch(Exception ex) {
			System.out.println("Erro ao conectar: "+ ex.getMessage());
			
		}
		return con;
	}
	
}
