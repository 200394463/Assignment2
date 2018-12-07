/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author harvinder
 */
public class TableCarController implements Initializable {
    
    
    /**
     * created the method name changeToTableButtonPushed to go back to the previous scene
     * @throws IOException in this TableCarController
     */

   
    @FXML
     public void changeToCarTableButtonPushed(ActionEvent event) throws IOException
     {
         Parent tableCar = FXMLLoader.load(getClass().getResource("Car.fxml"));
        Scene tableCarScene = new Scene(tableCar);
        
        
        /**
         * added this line because there is no primary scene 
         */
                
                
                
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(tableCarScene);
        window.show();
     }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
