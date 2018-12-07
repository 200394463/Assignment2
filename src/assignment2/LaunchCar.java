/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author harvinder
 */
public class LaunchCar extends Application {
    
    /**
     * main method which launches the application that is scene builder
     */
    
     public static void main(String[] args)
    {
        launch(args);
    }
     
     
     /**
      * method which load the Car.fxml file 
      */
     @Override
    public void start(Stage primaryStage) throws Exception {
         Parent root = FXMLLoader.load(getClass().getResource("Car.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Car Details");
        primaryStage.show();
    }
    
    
}
