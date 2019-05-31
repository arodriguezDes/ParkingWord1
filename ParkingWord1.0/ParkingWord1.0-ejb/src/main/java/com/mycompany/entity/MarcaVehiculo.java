package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "marca_vehiculo")
@XmlRootElement

public class MarcaVehiculo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_marca_Vehiculo")
    private Integer idMarcaVehiculo;
    @Size(max = 50)
    @Column(name = "marca_Vehiculo")
    private String marcaVehiculo;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;    
    @JoinColumn(name = "id_tipo_vehiculo", referencedColumnName = "id_tipo_vehiculo")
    @ManyToOne
    private TipoVehiculo tipoVehiculo;    
    @OneToMany(mappedBy = "marcaVehiculo")
    private List<Vehiculo> vehiculoList;
    @OneToMany(mappedBy = "marcaVehiculo")
    private List<ModeloVehiculo> modeloVehiculoList;
    
    public MarcaVehiculo(){
        
    }
    
    public MarcaVehiculo(Integer idMarcaVehiculo){
        this.idMarcaVehiculo = idMarcaVehiculo;
    }

    public Integer getIdMarcaVehiculo() {
        return idMarcaVehiculo;
    }

    public void setIdMarcaVehiculo(Integer idMarcaVehiculo) {
        this.idMarcaVehiculo = idMarcaVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @XmlTransient
    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }

    @XmlTransient
    public List<ModeloVehiculo> getModeloVehiculoList() {
        return modeloVehiculoList;
    }

    public void setModeloVehiculoList(List<ModeloVehiculo> modeloVehiculoList) {
        this.modeloVehiculoList = modeloVehiculoList;
    }    
    
}
