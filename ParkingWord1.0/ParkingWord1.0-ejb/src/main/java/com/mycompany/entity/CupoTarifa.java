package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andres
 */
@Entity
@Table(name = "cupo_tarifa")
@XmlRootElement

public class CupoTarifa implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cupo_tarifa")
    private Integer idCupoTarifa;
    @JoinColumn(name = "id_cupo", referencedColumnName = "id_cupo")
    @ManyToOne
    private Cupo cupo;
    @JoinColumn(name = "id_tarifa", referencedColumnName = "id_tarifa")
    @ManyToOne
    private Tarifa tarifa;
    
    public CupoTarifa(){
        
    }
    
    public CupoTarifa(Integer idCupoTarifa){
        this.idCupoTarifa = idCupoTarifa;
    }

    public Integer getIdCupoTarifa() {
        return idCupoTarifa;
    }

    public void setIdCupoTarifa(Integer idCupoTarifa) {
        this.idCupoTarifa = idCupoTarifa;
    }

    public Cupo getCupo() {
        return cupo;
    }

    public void setCupo(Cupo cupo) {
        this.cupo = cupo;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
    
    
    
    
}
