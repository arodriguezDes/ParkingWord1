package com.mycompany.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Andres
 */
@Entity
@Table(name = "empleado")
@XmlRootElement

public class Empleado implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_persona")
    private Integer idPersona;
    @Size(max = 45)
    @Column(name = "usuario")
    private String usuario;
    @Size(max = 45)
    @Column(name = "pass")
    private String pass;
    @Size(max = 45)
    @Column(name = "direccion_porteria")
    private String direccionPorteria;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;
    @JoinColumn(name = "id_perfil_empleado", referencedColumnName = "id_perfil_empleado")
    @ManyToOne
    private PerfilEmpleado perfilEmpleado;
    @JoinColumn(name = "id_area_empleado", referencedColumnName = "id_area_empleado")
    @ManyToOne
    private AreaEmpleado areaEmpleado;
    @JoinColumn(name = "id_turno_empleado", referencedColumnName = "id_turno_empleado")
    @ManyToOne
    private TurnoEmpleado turnoEmpleado;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private  Persona persona;
    @OneToMany(mappedBy = "empleado")
    private List<Reserva> reservaList;
    
    public Empleado(){
        
    }
    
    public Empleado(Integer idPersona){
        this.idPersona = idPersona;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDireccionPorteria() {
        return direccionPorteria;
    }

    public void setDireccionPorteria(String direccionPorteria) {
        this.direccionPorteria = direccionPorteria;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public PerfilEmpleado getPerfilEmpleado() {
        return perfilEmpleado;
    }

    public void setPerfilEmpleado(PerfilEmpleado perfilEmpleado) {
        this.perfilEmpleado = perfilEmpleado;
    }

    public AreaEmpleado getAreaEmpleado() {
        return areaEmpleado;
    }

    public void setAreaEmpleado(AreaEmpleado areaEmpleado) {
        this.areaEmpleado = areaEmpleado;
    }

    public TurnoEmpleado getTurnoEmpleado() {
        return turnoEmpleado;
    }

    public void setTurnoEmpleado(TurnoEmpleado turnoEmpleado) {
        this.turnoEmpleado = turnoEmpleado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @XmlTransient
    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }    
    
}
