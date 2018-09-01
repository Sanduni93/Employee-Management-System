
package auraemployeemanagementsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class AuraEmployeeManagementSystemController implements Initializable {

    @FXML
    private AnchorPane loginOverView;
    @FXML
    private Label lbl_aura;
    @FXML
    private Label lbl_aura_empmgtsystem;
    @FXML
    private Label lbl_signin;
    @FXML
    private TextField tf_username;
    @FXML
    private PasswordField pwf_password;
    @FXML
    private Button btn_login;
    
    @FXML
    
    public void btnLogIn(ActionEvent event) throws IOException
    {
    if(tf_username.getText().equals("user")&& pwf_password.getText().equals("pass"))
    {
    
        Parent manageEmployee = FXMLLoader.load(getClass().getResource("ManageEmployee.fxml"));
        Scene employee = new Scene(manageEmployee);
        Stage mngEmpStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        mngEmpStage.setScene(employee);
        mngEmpStage.show();
        
    
    }
    
    
    
    }
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
}
