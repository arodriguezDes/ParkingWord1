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
@Table(name = "piso_cupo")
@XmlRootElement

public class PisoCupo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_piso_cupo")
    private Integer idPisoCupo;
    @Size(max = 45)
    @Column(name = "piso_cupo")
    private String pisoCupo;
    @Size(max = 15)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "pisoCupo")
    private List<Cupo> cupoList;
    
    public PisoCupo(){
        
    }
    
    public PisoCupo(Integer idPisoCupo ){
        this.idPisoCupo = idPisoCupo;
    }

    public Integer getIdPisoCupo() {
        return idPisoCupo;
    }

    public void setIdPisoCupo(Integer idPisoCupo) {
        this.idPisoCupo = idPisoCupo;
    }

    public String getPisoCupo() {
        return pisoCupo;
    }

    public void setPisoCupo(String pisoCupo) {
        this.pisoCupo = pisoCupo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Cupo> getCupoList() {
        return cupoList;
    }

    public void setCupoList(List<Cupo> cupoList) {
        this.cupoList = cupoList;
    }

}
