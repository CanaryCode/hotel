package dam.gestionhotelera.modelo.Pojos;
// Generated 02-dic-2017 19:12:02 by Hibernate Tools 4.3.1



/**
 * ParteTieneEmpleadoId generated by hbm2java
 */
public class ParteTieneEmpleadoId  implements java.io.Serializable {


     private int empleadoIdEmpleado;
     private int parteIdparte;

    public ParteTieneEmpleadoId() {
    }

    public ParteTieneEmpleadoId(int empleadoIdEmpleado, int parteIdparte) {
       this.empleadoIdEmpleado = empleadoIdEmpleado;
       this.parteIdparte = parteIdparte;
    }
   
    public int getEmpleadoIdEmpleado() {
        return this.empleadoIdEmpleado;
    }
    
    public void setEmpleadoIdEmpleado(int empleadoIdEmpleado) {
        this.empleadoIdEmpleado = empleadoIdEmpleado;
    }
    public int getParteIdparte() {
        return this.parteIdparte;
    }
    
    public void setParteIdparte(int parteIdparte) {
        this.parteIdparte = parteIdparte;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ParteTieneEmpleadoId) ) return false;
		 ParteTieneEmpleadoId castOther = ( ParteTieneEmpleadoId ) other; 
         
		 return (this.getEmpleadoIdEmpleado()==castOther.getEmpleadoIdEmpleado())
 && (this.getParteIdparte()==castOther.getParteIdparte());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getEmpleadoIdEmpleado();
         result = 37 * result + this.getParteIdparte();
         return result;
   }   


}


