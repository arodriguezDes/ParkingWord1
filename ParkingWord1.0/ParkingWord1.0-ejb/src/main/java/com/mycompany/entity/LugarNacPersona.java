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
@Table(name = "lugar_nac_persona")
@XmlRootElement

public class LugarNacPersona implements Serializable{
    
    private static final long serialVersionUID = 1L;
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_lugar_nac_persona")
    private Integer idLugarNacPersona;
    @Size(max = 50)
    @Column(name = "lugar_nacimiento")
    private String lugarNacimiento;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "lugarNacPersona")
    private List<Persona> personaList;
    
    public LugarNacPersona(){
        
    }
    
    public LugarNacPersona(Integer idLugarNacPersona){
        this.idLugarNacPersona = idLugarNacPersona;
    }

    public Integer getIdLugarNacPersona() {
        return idLugarNacPersona;
    }

    public void setIdLugarNacPersona(Integer idLugarNacPersona) {
        this.idLugarNacPersona = idLugarNacPersona;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
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
