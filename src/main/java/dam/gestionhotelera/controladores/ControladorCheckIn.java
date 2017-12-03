/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.gestionhotelera.controladores;

import dam.gestionhotelera.Util.LimitadorDeCaracteres;
import dam.gestionhotelera.Util.Registro;
import java.net.URL;
import java.util.List;
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
public class ControladorCheckIn implements Initializable {

    /**
     * Initializes the controller class.
     */
    Registro r = new Registro();
    @FXML
    ComboBox<String> comboBoxPaises;
    @FXML
    ComboBox<String> comboBoxPension;
    @FXML
    ComboBox<String> comboBoxTurno;
    @FXML
    ComboBox<String> comboBoxHabitacion;
    @FXML
    ComboBox<String> comboBoxMesa;
    @FXML
    ComboBox<String> comboBoxCategoriaRiu;
    @FXML
    ComboBox<String> comboBoxTratamiento;
    @FXML
    ComboBox<String> comboBoxCategoria;
    @FXML
    TextField textFieldDni;
    @FXML
    TextField textFieldPrimerApellido;
    @FXML
    TextField textFieldSegundoApellido;
    @FXML
    TextField textFieldTelFijo;
    @FXML
    TextField textFieldTelMovil;
    @FXML
    TextField textFieldNumReserva;
    @FXML
    TextField textFieldNumPasaporte;
    @FXML
    TextField textFieldProvincia;
    @FXML
    TextField textFieldCodigoPostal;
    @FXML
    TextField textFieldCiudad;
    @FXML
    TextField textFieldCalle;
    @FXML
    TextField textFieldNumero;
    @FXML
    TextField textFieldBloque;
    @FXML
    TextField textFieldEscalera;
    @FXML
    TextField textFieldNombre;
    @FXML
    TextField textFieldVia;

    
    List listaPension = r.getListaPension();
    List listaHabitacion = r.getListaHabitacion();
    List listaTratamiento = r.getListaTratamiento();
    List listaMesa = r.getListaMesa();
    List listaCategoria = r.getListaCategoria();
    List listaCategoriaRiu = r.getListaCategoriaRiu();
    List listaturno = r.getListaTurno();

    
    ObservableList<String> oListPension = FXCollections.observableList(listaPension);
    ObservableList<String> oListHabitacion = FXCollections.observableList(listaHabitacion);
    ObservableList<String> oListTratamiento = FXCollections.observableList(listaTratamiento);
    ObservableList<String> oListMesa = FXCollections.observableList(listaMesa);
    ObservableList<String> oListCategoria = FXCollections.observableList(listaCategoria);
    ObservableList<String> oListCategoriaRiu = FXCollections.observableList(listaCategoriaRiu);
    ObservableList<String> oListTurno = FXCollections.observableList(listaturno);

    public void initialize(URL url, ResourceBundle rb) {

        comboBoxPaises.setItems(FXCollections.observableList(r.getListaPaises()));
        comboBoxPension.setItems(oListPension);
        comboBoxHabitacion.setItems(oListHabitacion);
        comboBoxTratamiento.setItems(oListTratamiento);
        comboBoxMesa.setItems(oListMesa);
        comboBoxCategoria.setItems(oListCategoria);
        comboBoxCategoriaRiu.setItems(oListCategoriaRiu);
        comboBoxTurno.setItems(oListTurno);

        LimitadorDeCaracteres.limitacion45Caracteres(textFieldPrimerApellido, 
                textFieldSegundoApellido,textFieldDni,textFieldTelFijo,
                textFieldTelMovil,textFieldNumReserva,textFieldNumPasaporte,
                textFieldProvincia,textFieldCodigoPostal,textFieldCiudad,
                textFieldCalle,textFieldNumero,textFieldBloque,textFieldEscalera,
                textFieldNombre,textFieldVia);
        
    }

}
