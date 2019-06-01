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

/**
 *
 * @author Andres
 */
@Entity
@Table(name = "cupo")
@XmlRootElement

public class Cupo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cupo")
    private Integer idCupo;
    @Size(max = 10)
    @Column(name = "numero_cupo")
    private String numeroCupo;
    @Size(max = 15)
    @Column(name = "estado")
    private String estado;
    @Size(max = 10)
    @Column(name = "placa")
    private String placa;
    @Size(max = 10)
    @Column(name = "fecha_ingreso")
    private String fechaIngreso;
    @Size(max = 10)
    @Column(name = "hora_ingreso")
    private String horaIngreso;
    @JoinColumn(name = "id_tipo_cupo", referencedColumnName = "id_tipo_cupo")
    @ManyToOne
    private TipoCupo tipoCupo;
    @JoinColumn(name = "id_piso_cupo", referencedColumnName = "id_piso_cupo")
    @ManyToOne
    private PisoCupo pisoCupo;
    @JoinColumn(name = "id_medidas_cupo", referencedColumnName = "id_medidas_cupo")
    @ManyToOne
    private MedidasCupo medidasCupo;
    @OneToMany(mappedBy = "cupo")
    private List<CupoTarifa> cupoTarifaList;
    @OneToMany(mappedBy = "cupo")
    private List<Reserva> reservaList;
    
    public Cupo(){
        
    }
    
    public Cupo(Integer idCupo){
        this.idCupo = idCupo;
    }

    public Integer getIdCupo() {
        return idCupo;
    }

    public void setIdCupo(Integer idCupo) {
        this.idCupo = idCupo;
    }

    public String getNumeroCupo() {
        return numeroCupo;
    }

    public void setNumeroCupo(String numeroCupo) {
        this.numeroCupo = numeroCupo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public TipoCupo getTipoCupo() {
        return tipoCupo;
    }

    public void setTipoCupo(TipoCupo tipoCupo) {
        this.tipoCupo = tipoCupo;
    }

    public PisoCupo getPisoCupo() {
        return pisoCupo;
    }

    public void setPisoCupo(PisoCupo pisoCupo) {
        this.pisoCupo = pisoCupo;
    }

    public MedidasCupo getMedidasCupo() {
        return medidasCupo;
    }

    public void setMedidasCupo(MedidasCupo medidasCupo) {
        this.medidasCupo = medidasCupo;
    }

    public List<CupoTarifa> getCupoTarifaList() {
        return cupoTarifaList;
    }

    public void setCupoTarifaList(List<CupoTarifa> cupoTarifaList) {
        this.cupoTarifaList = cupoTarifaList;
    }

    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }
       
}
