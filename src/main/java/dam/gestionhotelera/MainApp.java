/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.gestionhotelera;

/**
 *
 * @author Antonio Jesús Pérez Delgado
 */

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Antonio Jesús Pérez Delgado
 */
public class MainApp extends Application {

    /**
     * @return the PrimaryStage
     */
    public Stage getPrimaryStage() {
        return PrimaryStage;
    }

    /**
     * @param PrimaryStage the PrimaryStage to set
     */
    public void setPrimaryStage(Stage PrimaryStage) {
        this.PrimaryStage = PrimaryStage;
    }

    /**
     * @return the calculadoraStage
     */
    public Stage getCalculadoraStage() {
        return calculadoraStage;
    }

    /**
     * @param calculadoraStage the calculadoraStage to set
     */
    public void setCalculadoraStage(Stage calculadoraStage) {
        this.calculadoraStage = calculadoraStage;
    }

    /**
     * @return the parteStage
     */
    public Stage getParteStage() {
        return parteStage;
    }

    /**
     * @param parteStage the parteStage to set
     */
    public void setParteStage(Stage parteStage) {
        this.parteStage = parteStage;
    }

    /**
     * @return the plantasStage
     */
    public Stage getPlantasStage() {
        return plantasStage;
    }

    /**
     * @param plantasStage the plantasStage to set
     */
    public void setPlantasStage(Stage plantasStage) {
        this.plantasStage = plantasStage;
    }

    /**
     * @return the pedidoStage
     */
    public Stage getPedidoStage() {
        return pedidoStage;
    }

    /**
     * @param pedidoStage the pedidoStage to set
     */
    public void setPedidoStage(Stage pedidoStage) {
        this.pedidoStage = pedidoStage;
    }

    /**
     * @return the checkInStage
     */
    public Stage getCheckInStage() {
        return checkInStage;
    }

    /**
     * @param checkInStage the checkInStage to set
     */
    public void setCheckInStage(Stage checkInStage) {
        this.checkInStage = checkInStage;
    }

    MainApp principal;
    private Stage PrimaryStage;
    private Stage calculadoraStage;
    private Stage parteStage;
    private Stage plantasStage;
    private Stage pedidoStage;
    private Stage checkInStage;
    private Stage chatStage;
    private Stage emplesdoStage;

    public Stage getEmplesdoStage() {
        return emplesdoStage;
    }

    public void setEmplesdoStage(Stage emplesdoStage) {
        this.emplesdoStage = emplesdoStage;
    }

    @Override
    public void start(Stage stage) throws Exception {
  
        Stage PrimarStage = stage;
        AnchorPane root = FXMLLoader.load(getClass().getResource("/fxml/VPrincipal.fxml"));
        stage.initStyle(StageStyle.DECORATED);
        stage.centerOnScreen();
        stage.setOpacity(0.97);
        stage.setTitle("Aplicacion Principal");
        stage.getIcons().add(new Image(getClass().getResource("/images/hotel.png").toString()));
        Scene scene = new Scene(root);
        stage.setOnCloseRequest((event) -> {
            System.exit(0);
        });
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(stage.getHeight());
        stage.setMinWidth(stage.getWidth());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        launch(args);
    }

    public MainApp() {
        principal = this;
        
    }

    public MainApp getPrincipal() {
        return principal;
    }

    public void abrirVentanaCalculadora() throws IOException {
        if (getCalculadoraStage() == null) {
            AnchorPane root = FXMLLoader.load(getClass().getResource("/fmxl/Calculadora.fxml"));
            setCalculadoraStage(new Stage());
            getCalculadoraStage().initModality(Modality.NONE);
            getCalculadoraStage().initOwner(getPrimaryStage());
            getCalculadoraStage().centerOnScreen();
            getCalculadoraStage().setOpacity(0.97);
            getCalculadoraStage().setTitle("Calculadora");
            getCalculadoraStage().getIcons().add(new Image(getClass().getResource("/images/hotel.png").toString()));
            Scene scene = new Scene(root);
            getCalculadoraStage().setAlwaysOnTop(true);
            getCalculadoraStage().setScene(scene);
            getCalculadoraStage().setResizable(false);
            getCalculadoraStage().setOnCloseRequest((event) -> {
                setCalculadoraStage(null);
            });
            getCalculadoraStage().showAndWait();
        }
    }
    public void abrirVentanaParte() throws IOException {
        if (getParteStage() == null) {
            AnchorPane root = FXMLLoader.load(getClass().getResource("/fxml/Partes.fxml"));
            setParteStage(new Stage());
            getParteStage().initModality(Modality.NONE);
            getParteStage().initOwner(getPrimaryStage());
            getParteStage().centerOnScreen();
            getParteStage().setOpacity(0.97);
            getParteStage().setTitle("Partes");
            getParteStage().getIcons().add(new Image(getClass().getResource("/images/hotel.png").toString()));
            Scene scene = new Scene(root);
            getParteStage().setScene(scene);
            getParteStage().setResizable(false);
            getParteStage().setOnCloseRequest((event) -> {
                setParteStage(null);
            });
            getParteStage().showAndWait();
        }

    }

    public void abrirVentanaEmpleado() throws IOException {
        if (getEmplesdoStage() == null) {
            AnchorPane root = FXMLLoader.load(getClass().getResource("/fxml/Empleado.fxml"));
            setEmplesdoStage(new Stage());
            getEmplesdoStage().initModality(Modality.NONE);
            getEmplesdoStage().initOwner(getPrimaryStage());
            getEmplesdoStage().centerOnScreen();
            getEmplesdoStage().setOpacity(0.97);
            getEmplesdoStage().setTitle("Empleado");
            getEmplesdoStage().getIcons().add(new Image(getClass().getResource("/images/hotel.png").toString()));
            Scene scene = new Scene(root);
            getEmplesdoStage().setScene(scene);
            getEmplesdoStage().setResizable(false);
            getEmplesdoStage().setOnCloseRequest((event) -> {
                setEmplesdoStage(null);
            });
            getEmplesdoStage().showAndWait();
        }

    }

    public void abrirVentanaPedidos() throws IOException {
        if (getPedidoStage() == null) {
            AnchorPane root = FXMLLoader.load(getClass().getResource("/fxml/Pedido.fxml"));
            setPedidoStage(new Stage());
            getPedidoStage().initModality(Modality.NONE);
            getPedidoStage().initOwner(getPrimaryStage());
            getPedidoStage().centerOnScreen();
            getPedidoStage().setOpacity(0.97);
            getPedidoStage().setTitle("Pedido");
            getPedidoStage().getIcons().add(new Image(getClass().getResource("/images/hotel.png").toString()));
            Scene scene = new Scene(root);
            getPedidoStage().setScene(scene);
            getPedidoStage().setResizable(false);
            getPedidoStage().setOnCloseRequest((event) -> {
                setPedidoStage(null);
            });

            getPedidoStage().showAndWait();

        }

    }

    public void abrirVentanaPlantas() throws IOException {
        if (getPlantasStage() == null) {
            TabPane root = FXMLLoader.load(getClass().getResource("/fxml/Plantas.fxml"));
            setPlantasStage(new Stage());
            getPlantasStage().initModality(Modality.NONE);
            getPlantasStage().initOwner(getPrimaryStage());
            getPlantasStage().centerOnScreen();
            getPlantasStage().setOpacity(0.97);
            getPlantasStage().setTitle("Pedido");
            getPlantasStage().getIcons().add(new Image(getClass().getResource("/images/hotel.png").toString()));
            Scene scene = new Scene(root);
            getPlantasStage().setScene(scene);
            getPlantasStage().setResizable(false);
            getPlantasStage().setOnCloseRequest((event) -> {
                setPlantasStage(null);
            });
            getPlantasStage().showAndWait();

        }

    }

    public void abrirVentanaCheckIn() throws IOException {
        if (getCheckInStage() == null) {
            AnchorPane root = FXMLLoader.load(getClass().getResource("/fxml/CheckIn.fxml"));
            setCheckInStage(new Stage());
            getCheckInStage().initModality(Modality.NONE);
            getCheckInStage().initOwner(getPrimaryStage());
            getCheckInStage().centerOnScreen();
            getCheckInStage().setOpacity(0.97);
            getCheckInStage().setTitle("Check-in");
            getCheckInStage().getIcons().add(new Image(getClass().getResource("/images/hotel.png").toString()));
            Scene scene = new Scene(root);
            getCheckInStage().setScene(scene);
            getCheckInStage().setResizable(false);

            getCheckInStage().setOnCloseRequest((event) -> {
                setCheckInStage(null);
            });
            getCheckInStage().showAndWait();

        }
    }

    public void abrirVentanaChat() throws IOException {
        if (chatStage == null) {

            BorderPane root = FXMLLoader.load(getClass().getResource("/fxml/LoginView.fxml"));
            chatStage = new Stage();
            chatStage.initModality(Modality.NONE);
            chatStage.initOwner(getPrimaryStage());
            chatStage.centerOnScreen();
            chatStage.setOpacity(0.97);
            chatStage.setTitle("Check-in");
            chatStage.getIcons().add(new Image(getClass().getResource("/images/hotel.png").toString()));
            Scene scene = new Scene(root);
            chatStage.setScene(scene);
            chatStage.setResizable(false);
            chatStage.setOnCloseRequest((event) -> {
                chatStage = (null);
            });
            chatStage.showAndWait();
        }

    }
}
