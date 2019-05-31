package com.mycompany.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Andres
 */
@Entity
@Table(name = "persona")
@XmlRootElement

public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_persona")
    private Integer idPersona;
    @Size(max = 30)
    @Column(name = "identificacion")
    private String identificacion;    
    @Size(max = 50)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 50)
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Size(max = 100)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 20)
    @Column(name = "celular")
    private String celular;
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "id_tipo_doc_persona", referencedColumnName = "id_tipo_doc_persona")
    @ManyToOne
    private TipoDocPersona tipoDocPersona;
    @JoinColumn(name = "id_lugar_nac_persona", referencedColumnName = "id_lugar_nac_persona")
    @ManyToOne
    private LugarNacPersona lugarNacPersona;
    @OneToMany(mappedBy = "persona")
    private List<Vehiculo> vehiculoList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "persona")
    private Empleado empleado;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "persona")
    private Cliente cliente;
    
    public Persona(){
        
    }
    
    public Persona(Integer idPersona){
        this.idPersona = idPersona;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TipoDocPersona getTipoDocPersona() {
        return tipoDocPersona;
    }

    public void setTipoDocPersona(TipoDocPersona tipoDocPersona) {
        this.tipoDocPersona = tipoDocPersona;
    }

    public LugarNacPersona getLugarNacPersona() {
        return lugarNacPersona;
    }

    public void setLugarNacPersona(LugarNacPersona lugarNacPersona) {
        this.lugarNacPersona = lugarNacPersona;
    }

    @XmlTransient
    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }    
    
}
