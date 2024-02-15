import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class App extends Application {
   
private static Stage stage;

private static Scene loginScene;
private static Scene medBeginScene;
private static Scene registerPatientScene;


@Override
public void start(Stage primaryStage) throws Exception {
    stage = primaryStage;
    primaryStage.setTitle("Teste");
   
    Parent fxmlMain = FXMLLoader.load(getClass().getResource("teste.fxml"));
    loginScene = new Scene(fxmlMain, 500, 400);

    Parent fxmlMedBegin = FXMLLoader.load(getClass().getResource("MedBegin.fxml"));
    medBeginScene = new Scene(fxmlMedBegin, 500, 400);

   Parent  fxmlRegister = FXMLLoader.load(getClass().getResource("RegisterPatient.fxml"));
    registerPatientScene = new Scene(fxmlRegister, 360, 550);
    
    primaryStage.setScene(loginScene);
    primaryStage.show();
} 

public static void changeScreen(int numS){
    switch(numS){
        case 1: 
            stage.setScene(loginScene);
            break;
        case 2:
            stage.setScene(medBeginScene);
            break;
        case 3:
            break;
        case 4:
            break;
        case 5:
            stage.setScene(registerPatientScene);
            break;
        
    }
}
public static void main(String[] args) {
    launch(args);
        
    }

}