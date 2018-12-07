
package assignment2;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author harvinder
 */
public class CarController implements Initializable {

    
    /**
     *  DECLEARING THE FIX:ID OF THE TEXTBOXES , DATEPICKER AND CHECKBOXES
     */
    
     @FXML
    private TextField manufactureTxtField;

    @FXML
    private TextField modelTxtFiled;

    @FXML
    private DatePicker modelYearlabel;

    @FXML
    private TextField priceTextField;

    @FXML
    private ChoiceBox colourChoiceBox;

    @FXML
    private TextField distanceTxtField;

    @FXML
    private TextField currentYearTxtField;

    @FXML
    private Label sellCarLabel;

    @FXML
    private CheckBox yesCheckBox;

    @FXML
    private CheckBox noCheckBox;

    @FXML
    private CheckBox notSureCheckBox;

    @FXML
    private ImageView imageView;
    
    @FXML
    private Label errMsgLabel;

    
    
    /**
     * DECLEARING THE METHOD NAME DATEPICKERCHANGED WHICH IS SEETING THE VALUE IN CURRENTYEAT TXTFIELD
     */
    
     @FXML
    public void datePickerChanged()
    {
        Period period = Period.between(modelYearlabel.getValue(), LocalDate.now());
        int years = period.getYears();
        
        
        if (years<=15)
            currentYearTxtField.setText(String.format(" %d years",years));
        
            
    }
    
    
    /**
     * DETERMING THE METHOD TO CHECK BOX SELECTED AND THEN ADD IMAGES IN IMAGEVIEW 
     */
    
     @FXML
     public void checkBoxSelected()
     {
         if(yesCheckBox.isSelected())
         {
             imageView.setImage(new Image("./images/accept.jfif"));
         }
         
         else if(noCheckBox.isSelected())
         {
             imageView.setImage(new Image("./images/reject.jfif"));
         }    
             
         else if(notSureCheckBox.isSelected())
         {
             imageView.setImage(new Image("./images/doubt.jpg"));
         }
         else{
             throw new IllegalArgumentException("you must select one chechBox only ");
         }
     }
     
     
     // THIS METHOS IS USED TO MOVE THE SCENE TO OTHER SCENE
     @FXML
     public void changeToCarTableButtonPushed(ActionEvent event) throws IOException
     {
         Parent tableCar = FXMLLoader.load(getClass().getResource("TableCar.fxml"));
        Scene tableCarScene = new Scene(tableCar);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(tableCarScene);
        window.show();
     }
     
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // INITILIZING THE VALUE TO COMBO SO THAT USER SELECTS
       colourChoiceBox.getItems().add("Red");
       colourChoiceBox.getItems().add("Black");
       colourChoiceBox.getItems().add("Blue");
       colourChoiceBox.getItems().add("Orange");
       colourChoiceBox.getItems().add("Grey");
       colourChoiceBox.getItems().add("White");
       colourChoiceBox.getItems().add("Yellow");
       colourChoiceBox.getItems().add("Dark red");
       colourChoiceBox.getItems().add("Silver");
       colourChoiceBox.setValue("choose");
 
       
    }  
    
    
      
}
