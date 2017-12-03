/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.gestionhotelera.controladores;

import dam.gestionhotelera.Util.LimitadorDeCaracteres;
import dam.gestionhotelera.Util.Parte;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Antonio Jesús Pérez Delgado
 */
public class ControladorParte implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    ComboBox comboBoxDirigido;
    @FXML
    ComboBox comboBoxGrado;
    @FXML
    ComboBox comboBoxCategoría;
    @FXML
    TextField textFieldConcepto;
    ObservableList<String> oListaDirigido;
    ObservableList<String> oListaGrado;
    ObservableList<String> oListaCategoria;
  Parte parte = new Parte();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    oListaDirigido =FXCollections.observableArrayList(parte.getListaDirigido());
            comboBoxDirigido.setItems(oListaDirigido);
       oListaGrado =FXCollections.observableArrayList(parte.getListaGrado());
            comboBoxGrado.setItems(oListaGrado);
       oListaCategoria =FXCollections.observableArrayList(parte.getListaCategoria());
            comboBoxCategoría.setItems(oListaCategoria);
            LimitadorDeCaracteres.addLimitacion(textFieldConcepto, 45);
        
    }    
    
}
