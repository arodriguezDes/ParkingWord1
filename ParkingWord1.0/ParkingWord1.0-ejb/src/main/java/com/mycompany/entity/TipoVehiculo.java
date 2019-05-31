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
@Table(name = "tipo_vehiculo")
@XmlRootElement

public class TipoVehiculo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_Vehiculo")
    private Integer idTipoVehiculo;
    @Size(max = 50)
    @Column(name = "tipo_Vehiculo")
    private String tipoVehiculo;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "tipoVehiculo")
    private List<Vehiculo> vehiculoList;
    @OneToMany(mappedBy = "tipoVehiculo")
    private List<MarcaVehiculo> marcaVehiculoList;
    @OneToMany(mappedBy = "tipoVehiculo")
    private List<Tarifa> tafifaList;
    
    public TipoVehiculo(){
        
    }
    
    public TipoVehiculo(Integer idTipoVehiculo){
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public Integer getIdTipoVehiculo() {
        return idTipoVehiculo;
    }

    public void setIdTipoVehiculo(Integer idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
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

    @XmlTransient
    public List<MarcaVehiculo> getMarcaVehiculoList() {
        return marcaVehiculoList;
    }

    public void setMarcaVehiculoList(List<MarcaVehiculo> marcaVehiculoList) {
        this.marcaVehiculoList = marcaVehiculoList;
    }

    @XmlTransient
    public List<Tarifa> getTafifaList() {
        return tafifaList;
    }
    
    public void setTafifaList(List<Tarifa> tafifaList) {
        this.tafifaList = tafifaList;
    }   
    
}
