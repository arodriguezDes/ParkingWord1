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

/**
 *
 * @author Andres
 */
@Entity
@Table(name = "medidas_cupo")
@XmlRootElement

public class MedidasCupo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medidas_cupo")
    private Integer idMedidasCupo;
    @Size(max = 45)
    @Column(name = "medidas_cupo")
    private String medidasCupo;
    @Size(max = 15)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "medidasCupo")
    private List<Cupo> cupoList;

    public MedidasCupo() {
    }

    public MedidasCupo(Integer idMedidasCupo) {
        this.idMedidasCupo = idMedidasCupo;
    }

    public Integer getIdMedidasCupo() {
        return idMedidasCupo;
    }

    public void setIdMedidasCupo(Integer idMedidasCupo) {
        this.idMedidasCupo = idMedidasCupo;
    }

    public String getMedidasCupo() {
        return medidasCupo;
    }

    public void setMedidasCupo(String medidasCupo) {
        this.medidasCupo = medidasCupo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Cupo> getCupoList() {
        return cupoList;
    }

    public void setCupoList(List<Cupo> cupoList) {
        this.cupoList = cupoList;
    }
    
}
