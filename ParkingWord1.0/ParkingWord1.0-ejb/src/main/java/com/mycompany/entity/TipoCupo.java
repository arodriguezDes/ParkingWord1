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
@Table(name = "tipo_cupo")
@XmlRootElement

public class TipoCupo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_cupo")
    private Integer idTipoCupo;
    @Size(max = 45)
    @Column(name = "tipo_cupo")
    private String tipoCupo;
    @Size(max = 15)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "tipoCupo")
    private List<Cupo> cupoList;
    
    public TipoCupo(){
        
    }
    
    public TipoCupo(Integer idTipoCupo){
        this.idTipoCupo = idTipoCupo;
    }

    public Integer getIdTipoCupo() {
        return idTipoCupo;
    }

    public void setIdTipoCupo(Integer idTipoCupo) {
        this.idTipoCupo = idTipoCupo;
    }

    public String getTipoCupo() {
        return tipoCupo;
    }

    public void setTipoCupo(String tipoCupo) {
        this.tipoCupo = tipoCupo;
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
