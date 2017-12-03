/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.gestionhotelera.controladores;

import dam.gestionhotelera.MainApp;
import java.awt.Toolkit;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author Antonio Jesús Pérez Delgado
 */
public class ControladorCalculadora implements Initializable {

    /**
     * Initializes the controller class.
     */
    MainApp principal;
    @FXML
    TextField campoTexto;
    String operadorString;
    String primeroString;
    String segundoString;

    @FXML
    Button botonResta;
    @FXML
    Button botonDivide;
    @FXML
    Button botonMultiplica;
    @FXML
    Button botonSuma;
    @FXML
    Button botonPorcentaje;

    @Override

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        operadorString = "";
        primeroString = "";
        segundoString = "";
    }

    @FXML
    public void capturaBoton(ActionEvent e) {
        Button boton = (Button) e.getSource();

        //si exite el primer número añadelo al textField
        if (operadorString.equals("")) {

            primeroString += boton.getText();
            campoTexto.setText(primeroString);

        } else {

            segundoString += boton.getText();
            campoTexto.setText(primeroString + operadorString + segundoString);
        }
    }

    @FXML
    public void borraPantalla() {
        campoTexto.setText("");
        primeroString = "";
        segundoString = "";
        operadorString = "";
    }

    @FXML
    public void borraNumero(ActionEvent e) {
        if (!primeroString.equals("")) {
            borra();
        }

    }

    public void borra() {

        if (operadorString.equals("")) {
            primeroString = primeroString.substring(0, primeroString.length() - 1);
            campoTexto.setText(primeroString);
        } else {
            if (segundoString.length() != 0) {
                segundoString = segundoString.substring(0, segundoString.length() - 1);
                campoTexto.setText(primeroString + operadorString + segundoString);
            }

        }
    }

    @FXML
    public void capturaTeclas(KeyEvent e) {
        if (campoTexto.getText().equals("Error!!") || campoTexto.equals("indeterminado")) {
            borraPantalla();
        }
        if (e.getCode().isDigitKey()) {
            if (operadorString.equals("")) {

                primeroString += e.getText();
                campoTexto.setText(primeroString);

            } else {

                segundoString += e.getText();
                campoTexto.setText(primeroString + operadorString + segundoString);
            }
        } else if (e.getCode().equals(KeyCode.BACK_SPACE)) {
            borra();

        } else {

            Toolkit.getDefaultToolkit().beep();
        }
    }

    @FXML
    public void capturaOperaciones(ActionEvent e) {
        if (campoTexto.getText().equals("Error!!") || campoTexto.equals("indeterminado")) {
            borraPantalla();
        }
        Button boton = (Button) e.getSource();
        if (operadorString.equals("")) {
            operadorString = boton.getText();
            campoTexto.setText(primeroString + operadorString);
        } else {
            muestraResultado();
            operadorString = boton.getText();
            campoTexto.setText(primeroString + operadorString);
        }
    }

    @FXML
    public void capturaCambioSigno(ActionEvent e) {
        if (operadorString.equals("")) {
            if (primeroString.startsWith("-")) {
                primeroString = primeroString.substring(1, primeroString.length());
                campoTexto.setText(primeroString);
            } else {
                primeroString = "-" + primeroString;
                campoTexto.setText(primeroString);
            }

        } else {
            if (segundoString.startsWith("-")) {
                segundoString = segundoString.substring(1, primeroString.length());
                campoTexto.setText(primeroString + operadorString + segundoString);
            } else {
                segundoString = "-" + segundoString;
                campoTexto.setText(primeroString + operadorString + segundoString);
            }
        }

    }

    public BigDecimal dividir() {
        BigDecimal resultado;
        String resultadoString;
        BigDecimal primerNumero = new BigDecimal(primeroString);
        BigDecimal segundoNumero = new BigDecimal(segundoString);
        resultado = primerNumero.divide(segundoNumero, 3, RoundingMode.CEILING);
        resultadoString = resultado.toPlainString();
        int contador=resultadoString.length();
        for (int i = resultadoString.length(); i >0; i--) {
            if(resultadoString.endsWith("0")){
                resultadoString=resultadoString.substring(0, resultadoString.length()-1);
            }else if(resultadoString.endsWith(".")){
                resultadoString= resultadoString.substring(0,resultadoString.length()-1);
            }else
                break;
        }
     
        segundoString = "";
        primeroString = resultadoString;
        campoTexto.setText(primeroString);
        operadorString = "";

        return resultado;
    }

    public BigDecimal multiplicar() {
        BigDecimal resultado;
        BigDecimal primerNumero = new BigDecimal(primeroString);
        BigDecimal segundoNumero = new BigDecimal(segundoString);
        resultado = primerNumero.multiply(segundoNumero);
        primeroString = resultado.toPlainString();
        segundoString = "";
        campoTexto.setText(primeroString);
        operadorString = "";
        return resultado;
    }

    public BigDecimal restar() {
        BigDecimal resultado;
        BigDecimal primerNumero = new BigDecimal(primeroString);
        BigDecimal segundoNumero = new BigDecimal(segundoString);
        resultado = primerNumero.subtract(segundoNumero);
        primeroString = resultado.toPlainString();
        segundoString = "";
        campoTexto.setText(primeroString);
        operadorString = "";
        return resultado;
    }

    public BigDecimal sumar() {
        BigDecimal resultado;
        BigDecimal primerNumero = new BigDecimal(primeroString);
        BigDecimal segundoNumero = new BigDecimal(segundoString);
        resultado = primerNumero.add(segundoNumero);
        primeroString = resultado.toPlainString();
        segundoString = "";
        campoTexto.setText(primeroString);
        operadorString = "";
        return resultado;
    }

    public BigDecimal porcentaje() {
        BigDecimal resultado;
        BigDecimal primerNumero = new BigDecimal(primeroString);
        BigDecimal segundoNumero = new BigDecimal(segundoString);
        resultado = primerNumero.multiply(segundoNumero).divide(new BigDecimal(100));
        primeroString = resultado.toPlainString();
        segundoString = "";
        operadorString = "";
        campoTexto.setText(primeroString);
        return resultado;
    }

    @FXML
    public BigDecimal muestraResultado() {
        if (campoTexto.getText().equals("Error!!") || campoTexto.equals("indeterminado")) {
            borraPantalla();
        }

        BigDecimal resultado = null;
        if (segundoString.equals("0")) {
            borraPantalla();
            campoTexto.setText("indeterminado");
            return null;
        } else {
            try {
                switch (operadorString) {
                    case "/":
                        resultado = dividir();
                        break;
                    case "*":
                        resultado = multiplicar();
                        break;
                    case "+":
                        resultado = sumar();
                        break;
                    case "-":
                        resultado = restar();
                        break;
                }
            } catch (Exception e) {
                borraPantalla();
                campoTexto.setText("Error!!");

            }

            return resultado;

        }
    }
}
