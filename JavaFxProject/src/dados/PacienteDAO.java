package dados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import classes.Paciente;
import conector.Conectar;

public class PacienteDAO {
	public void cadastrar(Paciente p) {
		Connection con = Conectar.getConectar();
		String sql = "INSERT INTO pacientes (nome,cpf,endereco,cep,telefone,nascimento,sexo,altura,peso,alergias,senha_pac) VALUES (?,?,?,?,?,'"+p.getDatanas()+"',?,?,?,?,?);";
		try(PreparedStatement smt = con.prepareStatement(sql)){

			smt.setString(1, p.getNome());
			smt.setString(2, p.getCpf());
			smt.setString(3, p.getEndereco());
			smt.setString(4, p.getCep());
			smt.setString(5, p.getTelefone());
			smt.setLong(6,p.getSexo());
			smt.setFloat(7, p.getAltura());
			smt.setFloat(8, p.getPeso());
			smt.setString(9, p.getAlergias());
			smt.setString(10, p.getSenha());
			
			smt.executeUpdate();
			smt.close();
			con.close();
			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar: "+ ex.getMessage());
		}
    }
	public void atualizar(Paciente p) {
		Connection con = Conectar.getConectar();
		String sql = "UPDATE pacientes SET peso = ?, alergias = ?, altura = ? WHERE id_pac = ?";
		try(PreparedStatement smt = con.prepareStatement(sql)){
			smt.setFloat(1, p.getPeso());
			smt.setString(2, p.getAlergias());
			smt.setFloat(3, p.getAltura());
			smt.setInt(7, p.getId_paciente());
			
			smt.executeUpdate();
			smt.close();
			con.close();
			
			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex.getMessage());
		}
	}
	
	public void excluir(Paciente p) {
		Connection con = Conectar.getConectar();
		String sql = "DELETE FROM pacientes WHERE id_pac = ?";
		int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir  " + p.getNome(),"?",JOptionPane.YES_NO_OPTION);
		if(opcao == JOptionPane.YES_OPTION) {
			
				try(PreparedStatement smt = con.prepareStatement(sql)){
				smt.setInt(1, p.getId_paciente());
				smt.executeUpdate();
				smt.close();
				con.close();
			}catch(Exception ex) {
				JOptionPane.showConfirmDialog(null, "Erro ao deletar: " + ex.getMessage());
			}
			
		}
		
		
	}

	public List<Paciente> listarTodos(){
		Connection con = Conectar.getConectar();
		List<Paciente> lista = new ArrayList<>();
		String sql = "SELECT * FROM pacientes ORDER by nome";
		try(PreparedStatement smt = con.prepareStatement(sql)){
			ResultSet resultado = smt.executeQuery();
			while(resultado.next()) {
				Paciente p = new Paciente();
				p.setId_paciente(resultado.getInt("id_pac"));
				p.setNome(resultado.getString("Nome:"));
				
				lista.add(p);
			}
		}catch(Exception ex) {
			
		}
		return lista;
	}


}