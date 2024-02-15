import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MedBeginController {

    @FXML
    private Button btnCad;

    @FXML
    private Button btnExit;

    @FXML
    private Button btnHconsul;

    @FXML
    private Button btnSearchPatient;

    @FXML
    void RegisPatiente(ActionEvent event) {
        App.changeScreen(5);
        System.out.println("soh testando");
    }
}
