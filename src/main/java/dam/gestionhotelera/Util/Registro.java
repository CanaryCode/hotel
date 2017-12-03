package dam.gestionhotelera.Util;

import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio Jesús Pérez Delgado
 */
public class Registro{


    
   private final String[] arrayPaises = {"desconocido","España","Alemania","Inglaterra","Francia","Italia",
        "Austria","Bèlgica","Holanda","Portugal","Suiza","Luxemburgo","Rusia","Suecia","Noruega",
        "Finlandia","Irlanda","Escocia","Gales","Dinarmaca","Polonia",
        "Afganistán","Albania","Alemania","Andorra","Angola","Antigua y Barbuda","Arabia Saudita",
        "Argelia","Argentina","Armenia","Australia","Austria","Azerbaiyán","Bahamas","Bangladés",
        "Barbados","Baréin","Bélgica","Belice","Benín","Bielorrusia","Birmania","Bolivia",
        "Bosnia y Herzegovina","Botsuana","Brasil","Brunéi","Bulgaria","Burkina Faso","Burundi","Bután"
        ,"Cabo Verde","Camboya","Camerún","Canadá","Catar","Chad","Chile","China","Chipre",
        "Ciudad del Vaticano","Colombia","Comoras","Corea del Norte","Corea del Sur","Costa de Marfil",
        "Costa Rica","Croacia","Cuba","Dinamarca","Dominica","Ecuador","Egipto","El Salvador",
        "Emiratos Árabes Unidos","Eritrea","Eslovaquia","Eslovenia","España","Estados Unidos","Estonia"
        ,"Etiopía","Filipinas","Finlandia","Fiyi","Francia","Gabón","Gambia","Georgia","Ghana","Granada"
        ,"Grecia","Guatemala","Guyana","Guinea","Guinea ecuatorial","Guinea-Bisáu","Haití","Honduras",
        "Hungría","India","Indonesia","Irak","Irán","Irlanda","Islandia","Islas Marshall","Islas Salomón",
        "Israel","Italia","Jamaica","Japón","Jordania","Kazajistán","Kenia","Kirguistán","Kiribati","Kuwait",
        "Laos","Lesoto","Letonia","Líbano","Liberia","Libia","Liechtenstein","Lituania","Luxemburgo",
        "Madagascar","Malasia","Malaui","Maldivas","Malí","Malta","Marruecos","Mauricio","Mauritania","México",
        "Micronesia","Moldavia","Mónaco","Mongolia","Montenegro","Mozambique","Namibia","Nauru","Nepal",
        "Nicaragua","Níger","Nigeria","Noruega","Nueva Zelanda","Omán","Países Bajos","Pakistán","Palaos",
        "Panamá","Papúa Nueva Guinea","Paraguay","Perú","Polonia","Portugal","Reino Unido","República Centroafricana",
        "República Checa","República de Macedonia","República del Congo","Rep Democrática del Congo",
        "República Dominicana","República Sudafricana","Ruanda","Rumanía","Rusia","Samoa","San Cristóbal y Nieves",
        "San Marino","San Vicente y las Granadinas","Santa Lucía","Santo Tomé y Príncipe","Senegal","Serbia",
        "Seychelles","Sierra Leona","Singapur","Siria","Somalia","Sri Lanka","Suazilandia","Sudán","Sudán del Sur",
        "Suecia","Suiza","Surinam","Tailandia","Tanzania","Tayikistán","Timor Oriental","Togo","Tonga","Trinidad y Tobago",
        "Túnez","Turkmenistán","Turquía","Tuvalu","Ucrania","Uganda","Uruguay","Uzbekistán","Vanuatu","Venezuela","Vietnam",
        "Yemen","Yibuti","Zambia","Zimbabue"};
   
   private final String[] arrayTurnos = {
       "primero", "segundo"
   };
    List<String> listaTurno = Arrays.asList(arrayTurnos);
   private final String[] arrayMesas= {
       "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
       "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
       "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", 
       "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", 
       "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55",
       "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", 
       "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77",
       "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", 
       "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99"

   };
    List<String> listaMesa = Arrays.asList(arrayMesas);
   private final String[] arrayCategoria = {
       "Normal", "V.I.P", "Especial", "Repetidor"
   };
    List<String> listaCategoria = Arrays.asList(arrayCategoria);
   private final String[] arrayPension = {
       "M.P.", "Completa","Alo Y Des"
   };
    List<String> ListaPension = Arrays.asList(arrayPension);
   private final String[] arrayCategoriaRiu = {
       "Class", "Diamante","Gold"
   };
    List<String> ListaCategoriaRiu = Arrays.asList(arrayCategoriaRiu);
   private final String[] arrayHabitacion = {
       "11", "13","412"
   };
    List<String> ListaHabitacion= Arrays.asList(arrayHabitacion);
   private final String[] arrayTratamiento = {
       "Sr/Sra", "Dr/Dra", "Ingeniero/a","Don/Doña", "Ilustrisimo/a","Excelentisimo/a", "ninguno"
   };
    List<String> ListaTratamiento = Arrays.asList(arrayTratamiento);

    public List<String> getListaTurno() {
        return listaTurno;
    }

    public void setListaTurno(List<String> listaTurno) {
        this.listaTurno = listaTurno;
    }

    public List<String> getListaMesa() {
        return listaMesa;
    }

    public void setListaMesa(List<String> listaMesa) {
        this.listaMesa = listaMesa;
    }

    public List<String> getListaCategoria() {
        return listaCategoria;
    }

    public void setListaCategoria(List<String> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }

    public List<String> getListaPension() {
        return ListaPension;
    }

    public void setListaPension(List<String> ListaPension) {
        this.ListaPension = ListaPension;
    }

    public List<String> getListaCategoriaRiu() {
        return ListaCategoriaRiu;
    }

    public void setListaCategoriaRiu(List<String> ListaCategoriaRiu) {
        this.ListaCategoriaRiu = ListaCategoriaRiu;
    }

    public List<String> getListaHabitacion() {
        return ListaHabitacion;
    }

    public void setListaHabitacion(List<String> ListaHabitacion) {
        this.ListaHabitacion = ListaHabitacion;
    }

    public List<String> getListaTratamiento() {
        return ListaTratamiento;
    }

    public void setListaTratamiento(List<String> ListaTratamiento) {
        this.ListaTratamiento = ListaTratamiento;
    }

   List listaPaises = Arrays.asList(arrayPaises);
   
        public List getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(List listaPaises) {
        this.listaPaises = listaPaises;
    }
}

