package edu.pucmm.pwa.entities;

/**
 * Created by edmildimassimo on 10/5/16.
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="articulo")
public class Articulo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id" )
    private Integer id;

    @Column ( name= "nombre" )
    private String nombre;

    @Column ( name= "descripcion" )
    private String descripcion;

    @Column ( name= "cantidad")
    private Integer cantidad;

    @Column ( name = "costo" )
    private double costo;

    private byte[] imagen;

    public Articulo(){
        nombre = "";
        descripcion = "";
        cantidad= 0;
        costo = 0.0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}
