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
@Table(name = "vehiculo")
@XmlRootElement

public class Vehiculo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_vehiculo")
    private Integer idVehiculo;
    @Size(max = 10)
    @Column(name = "placa")
    private String placa;
    @Size(max = 15)
    @Column(name = "estado")
    private String estado;
    @Size(max = 20)
    @Column(name = "estado_contrato")
    private String estadoContrato;
    @JoinColumn(name = "id_parqueadero", referencedColumnName = "id_parqueadero")
    @ManyToOne
    private Parqueadero parqueadero;
    @JoinColumn(name = "id_tipo_vehiculo", referencedColumnName = "id_tipo_vehiculo")
    @ManyToOne
    private TipoVehiculo tipoVehiculo;
    @JoinColumn(name = "id_marca_vehiculo", referencedColumnName = "id_marca_vehiculo")
    @ManyToOne
    private MarcaVehiculo marcaVehiculo;
    @JoinColumn(name = "id_modelo_vehiculo", referencedColumnName = "id_modelo_vehiculo")
    @ManyToOne
    private ModeloVehiculo modeloVehiculo;
    @JoinColumn(name = "id_color_vehiculo", referencedColumnName = "id_color_vehiculo")
    @ManyToOne
    private ColorVehiculo colorVehiculo;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne
    private Persona persona;
    @OneToMany(mappedBy = "vehiculo")
    private List<Reserva> reservaList;
    
    public Vehiculo(){
        
    }
    
    public Vehiculo(Integer idVehiculo){
        this.idVehiculo = idVehiculo;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstadoContrato() {
        return estadoContrato;
    }

    public void setEstadoContrato(String estadoContrato) {
        this.estadoContrato = estadoContrato;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public MarcaVehiculo getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(MarcaVehiculo marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public ModeloVehiculo getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(ModeloVehiculo modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public ColorVehiculo getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(ColorVehiculo colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @XmlTransient
    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }
    
 }