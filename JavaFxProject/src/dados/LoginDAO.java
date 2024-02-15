package dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import conector.Conectar;

public class LoginDAO {
	public static void logar(String nome,String senha) {

		Connection con = Conectar.getConectar();
		String sql ="SELECT * FROM medicos WHERE login = ? AND senha = ?";
		try(PreparedStatement smt = con.prepareStatement(sql)){
			smt.setString(1,nome);
			smt.setString(2,senha);
			ResultSet resultado = smt.executeQuery();
			if(resultado.next()) {
				//instanciar a proxima tela
			}else {
				JOptionPane.showMessageDialog(null,"Usuario e/ou senha invalido(s).");
			}
			smt.executeUpdate(); 
			smt.close();
			con.close();
			
			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro no Login: "+ex.getMessage());
		}
	}
}
