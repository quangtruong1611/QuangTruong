/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Admin
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private TextField txtCao;
    @FXML private TextField txtNang;
    
            
    public void TinhMBI(ActionEvent event){
        double cao = Double.parseDouble(this.txtCao.getText());
        double nang = Double.parseDouble(this.txtNang.getText());
        double bmi = nang / Math.pow(cao,2);
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        
        alert.setContentText(String.valueOf(bmi));
        alert.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
