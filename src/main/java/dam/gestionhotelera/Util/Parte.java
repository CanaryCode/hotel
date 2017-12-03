/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.gestionhotelera.Util;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import javafx.scene.control.TextField;

/**
 *
 * @author Antonio Jesús Pérez Delgado
 */


public class Parte {
    private String[] arrayDirigido={
        "Empleado","cliente","Empresa","Articulo","Oferta","departamento","proveedores"
    };
    private String[] arrayCategoría={
       "Incidencia","comentario","Precaución"
    };
    private String[] arrayConcepto={
        
    };
    private String[] arrayGrado={
        "Normal", "Urgente", "Prioritario"
    };
    private List listaGrado;
    private List listaCategoria;
    private List listaDirigido;

    public List getListaGrado() {
        listaGrado=Arrays.asList(arrayGrado);
        return listaGrado;
    }

    public void setListaGrado(List listaGrado) {
        this.listaGrado = listaGrado;
    }

    public List getListaCategoria() {
        listaCategoria=Arrays.asList(arrayCategoría);
        return listaCategoria;
    }

    public void setListaCategoria(List listaCategoria) {
        this.listaCategoria = listaCategoria;
    }

    public List getListaDirigido() {
        listaDirigido=Arrays.asList(arrayDirigido);
        return listaDirigido;
    }

    public void setListaDirigido(List listaDirigido) {
        this.listaDirigido = listaDirigido;
    }
  

  
}
