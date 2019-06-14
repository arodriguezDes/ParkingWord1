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
@Table(name = "tarifa")
@XmlRootElement

public class Tarifa implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tarifa")
    private Integer idTarifa;
    @Column(name = "valor_minuto")
    private double valorMinuto;
    @Column(name = "valor_hora")
    private double valorHora;
    @Column(name = "valor_dia")
    private double valorDia;
    @Column(name = "valor_noche")
    private double valorNoche;
    @Column(name = "valor_mes_diurno")
    private double valorMesDiurno;
    @Column(name = "valor_mes_nocturna")
    private double valorMesNocturna;
    @Size(max = 15)
    @Column(name = "estado")
    private String estado;   
    @OneToMany(mappedBy = "tarifa")    
    private List<CupoTarifa> cupotarifaList;
    @OneToMany(mappedBy = "tarifa")    
    private List<Pago> pagoList;
    @JoinColumn(name = "id_tipo_Vehiculo", referencedColumnName = "id_tipo_Vehiculo")
    @ManyToOne
    private TipoVehiculo tipoVehiculo;
    
    public Tarifa(){
        
    }
    
    public Tarifa(Integer idTatifa){
        this.idTarifa = idTatifa;
    }

    public Integer getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(Integer idTarifa) {
        this.idTarifa = idTarifa;
    }

    public double getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(double valorMinuto) {
        this.valorMinuto = valorMinuto;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    public double getValorNoche() {
        return valorNoche;
    }

    public void setValorNoche(double valorNoche) {
        this.valorNoche = valorNoche;
    }

    public double getValorMesDiurno() {
        return valorMesDiurno;
    }

    public void setValorMesDiurno(double valorMesDiurno) {
        this.valorMesDiurno = valorMesDiurno;
    }

    public double getValorMesNocturna() {
        return valorMesNocturna;
    }

    public void setValorMesNocturna(double valorMesNocturna) {
        this.valorMesNocturna = valorMesNocturna;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @XmlTransient
    public List<CupoTarifa> getCupotarifaList() {
        return cupotarifaList;
    }

    public void setCupotarifaList(List<CupoTarifa> cupotarifaList) {
        this.cupotarifaList = cupotarifaList;
    }

    @XmlTransient
    public List<Pago> getPagoList() {
        return pagoList;
    }

    public void setPagoList(List<Pago> pagoList) {
        this.pagoList = pagoList;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
    
    
    
}
