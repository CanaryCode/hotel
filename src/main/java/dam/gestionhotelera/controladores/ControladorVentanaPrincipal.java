/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.gestionhotelera.controladores;

import dam.gestionhotelera.MainApp;
import dam.gestionhotelera.Util.Fechas;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import dam.gestionhotelera.reloj.Reloj;


/**
 *
 * @author Antonio Jesús Pérez Delgado
 */
public class ControladorVentanaPrincipal implements Initializable {

    MainApp principal = new MainApp();
    @FXML
    private Label eticquetaFecha;
    @FXML
    private AnchorPane panelReloj;
    Fechas fechas = new Fechas();
    Reloj reloj = new Reloj();
    @FXML
    private void abrirVentanaCalculadora() throws IOException {

        principal.abrirVentanaCalculadora();

    }
    @FXML
    private void abrirVentanaParte() throws IOException {

        principal.abrirVentanaParte();

    }
    @FXML
    private void abrirVentanaPedido() throws IOException {

        principal.abrirVentanaPedidos();

    }
    @FXML
    private void abrirVentanaPlantas() throws IOException {

        principal.abrirVentanaPlantas();

    }
    @FXML
    private void abrirCheckIn() throws IOException {

        principal.abrirVentanaCheckIn();

    }
    @FXML
    private void abrirVentanaChat()throws IOException {

        principal.abrirVentanaChat();

    }
    @FXML
    private void abrirVentanaEmpleado()throws IOException {

        principal.abrirVentanaEmpleado();

    }

  
VBox relojArrancable;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Thread hilo = new Thread(new Runnable() {
            
            @Override
            public void run() {
              relojArrancable =reloj.getReloj();
              
            }
        });
       hilo.run();
        panelReloj.getChildren().add(relojArrancable);
        eticquetaFecha.setText(fechas.getTimeActual());
    }

}
