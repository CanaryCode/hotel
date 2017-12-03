/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.gestionhotelera.Util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;


/**
 *
 * @author deico
 */
public class Fechas {
    LocalDateTime fechaActual;
    public Fechas() {
        fechaActual= LocalDateTime.now();
      
    }

  

    public void setFechaActual(LocalDateTime fechaActual) {
        this.fechaActual = fechaActual;
    }
    public String getTimeActual(){
        return fechaActual.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
     
    }
   
    
    
   
}
