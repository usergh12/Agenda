import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class RegisterPatientController {

    @FXML
    private Button btncadastro;

    @FXML
    private RadioButton rbFem;

    @FXML
    private RadioButton rbMasc;

    @FXML
    private TextField txtAlergias;

    @FXML
    private TextField txtAltura;

    @FXML
    private TextField txtCep;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtDataNasc;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtEndereço;

    @FXML
    private TextField txtFone;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtSenha;

    @FXML
    private TextField txtpeso;

    @FXML
    void CadastrarPaciente(ActionEvent event) {

    }
    @FXML
    void VoltarMedInicial(ActionEvent event) {
        App.changeScreen(2);
    }

}