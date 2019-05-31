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
@Table(name = "tipo_doc_persona")
@XmlRootElement

public class TipoDocPersona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_doc_persona")
    private Integer idTipoDocPersona;
    @Size(max = 50)
    @Column(name = "tipo_documento")
    private String tipoDocumento;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "tipoDocPersona")
    private List<Persona> personaList;
    
    public TipoDocPersona(){
        
    }
    
    public TipoDocPersona(Integer idTipoDocPersona){
        this.idTipoDocPersona = idTipoDocPersona;
    }

    public Integer getIdTipoDocPersona() {
        return idTipoDocPersona;
    }

    public void setIdTipoDocPersona(Integer idTipoDocPersona) {
        this.idTipoDocPersona = idTipoDocPersona;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }    
    
}
