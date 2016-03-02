/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author Christophe
 */
public class ConnexionController {
    
    @FXML private TextField matricule;
    @FXML private PasswordField password;
    
    private Main main;
    
    public void setMain(Main main){
        
        this.main=main;
      
    }
    
    public void connectClick(){
        
    }
    
}
