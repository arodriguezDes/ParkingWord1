package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Andres
 */
@Entity
@Table(name = "turno_empleado")
@XmlRootElement

public class TurnoEmpleado implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_turno_empleado")
    private Integer idTurnoEmpleado;
    @Size(max = 45)
    @Column(name = "turno_empleado")
    private String turnoEmpleado ;
    @Size(max = 15)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "turnoEmpleado")
    private List<Empleado> empleadoList;
    
    private TurnoEmpleado(){
        
    } 
    
    private TurnoEmpleado(Integer idTurnoEmpleado){
        this.idTurnoEmpleado = idTurnoEmpleado;
    } 

    public Integer getIdTurnoEmpleado() {
        return idTurnoEmpleado;
    }

    public void setIdTurnoEmpleado(Integer idTurnoEmpleado) {
        this.idTurnoEmpleado = idTurnoEmpleado;
    }

    public String getTurnoEmpleado() {
        return turnoEmpleado;
    }

    public void setTurnoEmpleado(String turnoEmpleado) {
        this.turnoEmpleado = turnoEmpleado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }    
    
}
