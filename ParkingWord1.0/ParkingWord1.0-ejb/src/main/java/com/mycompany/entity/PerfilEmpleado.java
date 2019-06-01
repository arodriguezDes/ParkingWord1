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
@Table(name = "perfil_empleado")
@XmlRootElement

public class PerfilEmpleado implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_perfil_empleado")
    private Integer idPerfilEmpleado;
    @Size(max = 45)
    @Column(name = "perfil_empleado")
    private String perfilEmpleado;
    @Size(max = 256)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "perfilEmpleado")
    private List<Empleado> empleadoList;
    @OneToMany(mappedBy = "perfilEmpleado")
    private List<PerfilMenu> perfilMenuList;
    
    public PerfilEmpleado() {
    }
    
    public PerfilEmpleado(Integer idPerfilEmpleado) {
        this.idPerfilEmpleado = idPerfilEmpleado;
    }

    public Integer getIdPerfilEmpleado() {
        return idPerfilEmpleado;
    }

    public void setIdPerfilEmpleado(Integer idPerfilEmpleado) {
        this.idPerfilEmpleado = idPerfilEmpleado;
    }

    public String getPerfilEmpleado() {
        return perfilEmpleado;
    }

    public void setPerfilEmpleado(String perfilEmpleado) {
        this.perfilEmpleado = perfilEmpleado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }
    
    @XmlTransient
    public List<PerfilMenu> getPerfilMenuList() {
        return perfilMenuList;
    }

    public void setPerfilMenuList(List<PerfilMenu> perfilMenuList) {
        this.perfilMenuList = perfilMenuList;
    }
            
}
