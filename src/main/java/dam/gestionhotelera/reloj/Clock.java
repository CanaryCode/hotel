/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.gestionhotelera.reloj;

import java.time.LocalDateTime;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.*;


/** Note that this clock does not keep perfect time, but is close. 
    It's main purpose is to demonstrate various features of JavaFX. */
public class Clock extends Application {
    private LocalDateTime fechaHora;
    Reloj reloj = new Reloj();
    
  public static void main(String[] args) throws Exception { launch(args); }
  public void start(final Stage stage) throws Exception {

    // layout the scene.
    final VBox layout = reloj.getReloj();
    final Scene scene = new Scene(layout, Color.TRANSPARENT);
    stage.setScene(scene);
    stage.show();
  }

  private String pad(int fieldWidth, char padChar, String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = s.length(); i < fieldWidth; i++) {
      sb.append(padChar);
    }
    sb.append(s);

    return sb.toString();
  }

public LocalDateTime getFechaHora(){
    fechaHora=LocalDateTime.now();
    System.out.println(fechaHora);
    return fechaHora;
}
  
  // records relative x and y co-ordinates.
  class Delta { double x, y; }  
}
