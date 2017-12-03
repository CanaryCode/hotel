/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.gestionhotelera.Util;

import java.awt.Toolkit;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Antonio Jesús Pérez Delgado
 */
public class LimitadorDeCaracteres {

    public static void addLimitacion(final TextField tf, final int longitud) {
        tf.textProperty().addListener((final ObservableValue<? extends String> ov, final String ViejoValor, final String valorNuevo) -> {
            if (tf.getText().length() > longitud) {
                Toolkit.getDefaultToolkit().beep();
                String texto = tf.getText().substring(0, longitud);
                tf.setText(texto);
            }
        });
    }

    public static void addLimitacion(final TextArea tf, final int longitud) {
        tf.textProperty().addListener((final ObservableValue<? extends String> ov, final String ViejoValor, final String valorNuevo) -> {
            if (tf.getText().length() > longitud) {
                Toolkit.getDefaultToolkit().beep();
                String texto = tf.getText().substring(0, longitud);
                tf.setText(texto);
            }
        });
    }

    public static void limitacion45Caracteres(TextField... args) {
        for (int i = 0; i < args.length; i++) {
            addLimitacion(args[i],45);
        }
    }
}
