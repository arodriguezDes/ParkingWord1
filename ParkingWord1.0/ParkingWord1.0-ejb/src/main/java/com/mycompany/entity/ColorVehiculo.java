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
@Table(name = "color_vehiculo")
@XmlRootElement

public class ColorVehiculo implements Serializable{
    
    private static final long  serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_color_vehiculo")
    private Integer idColorVehiculo;
    @Size(max = 50)
    @Column(name = "color_vehiculo")
    private String colorVehiculo;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "colorVehiculo")
    private List<Vehiculo> vehiculoList;
    
    public ColorVehiculo(){
        
    }           
    
    public ColorVehiculo(Integer idColorVehiculo){
        this.idColorVehiculo = idColorVehiculo;
    }

    public Integer getIdColorVehiculo() {
        return idColorVehiculo;
    }

    public void setIdColorVehiculo(Integer idColorVehiculo) {
        this.idColorVehiculo = idColorVehiculo;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }    
    
}
