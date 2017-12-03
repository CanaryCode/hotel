package dam.gestionhotelera.modelo.Pojos;
// Generated 02-dic-2017 19:12:02 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ParteTieneEmpleado generated by hbm2java
 */
public class ParteTieneEmpleado  implements java.io.Serializable {


     private ParteTieneEmpleadoId id;
     private Empleado empleado;
     private Parte parte;
     private Date fechaInicio;
     private Date fechaFin;

    public ParteTieneEmpleado() {
    }

	
    public ParteTieneEmpleado(ParteTieneEmpleadoId id, Empleado empleado, Parte parte) {
        this.id = id;
        this.empleado = empleado;
        this.parte = parte;
    }
    public ParteTieneEmpleado(ParteTieneEmpleadoId id, Empleado empleado, Parte parte, Date fechaInicio, Date fechaFin) {
       this.id = id;
       this.empleado = empleado;
       this.parte = parte;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
    }
   
    public ParteTieneEmpleadoId getId() {
        return this.id;
    }
    
    public void setId(ParteTieneEmpleadoId id) {
        this.id = id;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Parte getParte() {
        return this.parte;
    }
    
    public void setParte(Parte parte) {
        this.parte = parte;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }




}


