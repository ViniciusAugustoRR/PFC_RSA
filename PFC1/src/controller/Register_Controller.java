
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXHamburger;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;


public class Register_Controller implements Initializable {

    @FXML
    private TextField text_professor;

    @FXML
    private CheckBox cb_ativo;

    @FXML
    private CheckBox cb_inativo;

    @FXML
    private TreeView<?> treeview_professores;
    
    //##################################################

    @FXML
    private JFXHamburger hamb_menu;
    
   //#################################################

    @FXML
    private TextField text_cpf;

    @FXML
    private TextField text_nome;

    @FXML
    private TextField text_telefone;

    @FXML
    private TextField text_cidade;
    
    //################################################

    @FXML
    private Button bt_disciplina;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
    }    
    
}
