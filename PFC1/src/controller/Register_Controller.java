
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.TreeView;


public class Register_Controller implements Initializable {
    
    @FXML
    private JFXTextField text_professor;

    @FXML
    private JFXCheckBox cb_ativo;

    @FXML
    private JFXCheckBox cb_inativo;

    @FXML
    private TreeView<?> treeview_professores;
    
    //##################################################

    @FXML
    private JFXHamburger hamb_menu;
    
   //#################################################

    @FXML
    private JFXTextField text_cpf;

    @FXML
    private JFXTextField text_nome;

    @FXML
    private JFXTextField text_telefone;

    @FXML
    private JFXTextField text_cidade;
    
    //################################################

    @FXML
    private JFXButton bt_disciplina;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
    }    
    
}
