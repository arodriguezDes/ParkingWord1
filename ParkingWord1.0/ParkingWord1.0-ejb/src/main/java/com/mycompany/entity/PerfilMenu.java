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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andres
 */
@Entity
@Table(name = "perfil_menu")
@XmlRootElement

public class PerfilMenu implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPerfil_menu")
    private Integer idPerfilMenu;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "id_perfil_empleado", referencedColumnName = "id_perfil_empleado")
    @ManyToOne
    private PerfilEmpleado perfilEmpleado;
    @JoinColumn(name = "id_menu", referencedColumnName = "id_menu")
    @ManyToOne
    private Menu menu;
    
    public PerfilMenu() {
    }
    
    public PerfilMenu(Integer idPerfilMenu) {
        this.idPerfilMenu = idPerfilMenu;
    }

    public Integer getIdPerfilMenu() {
        return idPerfilMenu;
    }

    public void setIdPerfilMenu(Integer idPerfilMenu) {
        this.idPerfilMenu = idPerfilMenu;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public PerfilEmpleado getPerfilEmpleado() {
        return perfilEmpleado;
    }

    public void setPerfilEmpleado(PerfilEmpleado perfilEmpleado) {
        this.perfilEmpleado = perfilEmpleado;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }   
    
}
