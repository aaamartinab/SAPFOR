/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Christophe
 */
public class ConnexionController implements Initializable {

    @FXML private TextField matricule;
    @FXML private PasswordField password;
    @FXML private Button connect;
    
    private Main main;

    public void setMain(Main main){
        
        this.main=main;
      
    }
    
    public void connectClick(){
        //envoie requete serveur
        String mat = matricule.getText();
        String Mpasse = password.getText();
        if(!(mat.isEmpty() || Mpasse.isEmpty())){
        
        }
        System.out.println("aaaaaaaaaaaaaa");
       main.userViewWindow();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    
}
