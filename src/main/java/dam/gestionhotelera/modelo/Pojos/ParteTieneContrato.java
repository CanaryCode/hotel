package dam.gestionhotelera.modelo.Pojos;
// Generated 02-dic-2017 19:12:02 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ParteTieneContrato generated by hbm2java
 */
public class ParteTieneContrato  implements java.io.Serializable {


     private Integer idparteTieneContrato;
     private Contrato contrato;
     private Parte parte;
     private Date fechaInicio;
     private Date fechaFin;

    public ParteTieneContrato() {
    }

	
    public ParteTieneContrato(Contrato contrato, Parte parte) {
        this.contrato = contrato;
        this.parte = parte;
    }
    public ParteTieneContrato(Contrato contrato, Parte parte, Date fechaInicio, Date fechaFin) {
       this.contrato = contrato;
       this.parte = parte;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
    }
   
    public Integer getIdparteTieneContrato() {
        return this.idparteTieneContrato;
    }
    
    public void setIdparteTieneContrato(Integer idparteTieneContrato) {
        this.idparteTieneContrato = idparteTieneContrato;
    }
    public Contrato getContrato() {
        return this.contrato;
    }
    
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
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


