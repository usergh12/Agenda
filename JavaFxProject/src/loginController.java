
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import dados.LoginDAO;
public class loginController {

    @FXML
    private TextField Nome;

    @FXML
    private TextField Senha;

    @FXML
    private Button botaoLogin;

    @FXML
    void FazerLogin(ActionEvent event) {
        String nome = Nome.getText();
        String senha = Senha.getText();
           LoginDAO.logar(nome,senha);
    }
    

}
