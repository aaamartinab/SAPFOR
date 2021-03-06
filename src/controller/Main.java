package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Christophe
 */
public class Main extends Application {
    
    private Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("SAPFOR");
        

        mainWindow();
        
    }

    
    public void mainWindow(){

        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("Connexion.fxml"));
            AnchorPane pane = loader.load();
            
            ConnexionController connexionController = loader.getController();
            connexionController.setMain(this);
            
            
            Scene scene = new Scene(pane);
            
            
            
            primaryStage.setScene(scene);
            primaryStage.show();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
public void userViewWindow(){

        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("UserView.fxml"));
            AnchorPane pane = loader.load();
            
            UserViewController userViewController = loader.getController();
            userViewController.setMain(this);
            
            
            Scene scene = new Scene(pane);
            
            Stage userViewStage = new Stage();
            
            userViewStage.setScene(scene);
            userViewStage.show();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

/*
public void directorViewWindow(){

        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("DirectorView.fxml"));
            AnchorPane pane = loader.load();
            
            DirectorViewController directorViewController = loader.getController();
            directorViewController.setMain(this);
            
            
            Scene scene = new Scene(pane);
            
            Stage userViewStage = new Stage();
            
            userViewStage.setScene(scene);
            userViewStage.show();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
