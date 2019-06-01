package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "reserva")
@XmlRootElement

public class Reserva implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_reserva")
    private Integer idReserva;
    @Size(max = 20)
    @Column(name = "fecha_ingreso")
    private String fechaIngreso;
    @Size(max = 20)
    @Column(name = "hora_ingreso")
    private String horaIngreso;
    @JoinColumn(name = "id_vehiculo", referencedColumnName = "id_vehiculo")
    @ManyToOne
    private Vehiculo vehiculo;
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")
    @ManyToOne
    private Empleado empleado;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne
    private Cliente cliente;
    @JoinColumn(name = "id_cupo", referencedColumnName = "id_cupo")
    @ManyToOne
    private Cupo cupo;  
    @OneToMany(mappedBy =  "reserva")
    private List<Pago> pagoList;
    
    public Reserva(){
        
    }
    
    public Reserva(Integer idReserva){
        this.idReserva = idReserva;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
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

    public Cupo getCupo() {
        return cupo;
    }

    public void setCupo(Cupo cupo) {
        this.cupo = cupo;
    }
    
    @XmlTransient
    public List<Pago> getPagoList() {
        return pagoList;
    }

    public void setPagoList(List<Pago> pagoList) {
        this.pagoList = pagoList;
    }    
    
}
