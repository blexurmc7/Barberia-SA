package com.tdea.demo3.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_reserva")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    @JsonFormat (pattern = "yyyy-MM-dd")
    private Date fecha;


    @Column(name = "hora")
    private String hora;

    @Column(name = "nombre_cliente")
    private String nombreCliente;

    @Column(name = "tipo_corte")
    private String tipoCorte; // Ej: "Corte sencillo", "Barba", "Combo corte+barba"

    @Column(name = "nombre_barbero")
    private String nombreBarbero;

    @Column(name = "estado")
    private String estado; // Ej: "Pendiente", "Confirmada", "Cancelada"

    public Person() {
    }

    public Person(Long id, Date fecha, String hora, String nombreCliente, String tipoCorte, String nombreBarbero, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.nombreCliente = nombreCliente;
        this.tipoCorte = tipoCorte;
        this.nombreBarbero = nombreBarbero;
        this.estado = estado;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }

    public String getTipoCorte() { return tipoCorte; }
    public void setTipoCorte(String tipoCorte) { this.tipoCorte = tipoCorte; }

    public String getNombreBarbero() { return nombreBarbero; }
    public void setNombreBarbero(String nombreBarbero) { this.nombreBarbero = nombreBarbero; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Reserva [id=" + id + ", fecha=" + fecha + ", hora=" + hora +
               ", nombreCliente=" + nombreCliente + ", tipoCorte=" + tipoCorte +
               ", nombreBarbero=" + nombreBarbero + ", estado=" + estado + "]";
    }
}
