package edu.pucmm.pwa.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by edmildimassimo on 10/6/16.
 */

@Entity
@Table(name="alquiler")
public class Alquiler implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id" )
    private
    Integer id;

    @Column (name =  "fecha_alquiler" )
    private
    Date fecha_alquiler;

    @Column (name =  "fecha_retorno" )
    private
    Date fecha_retorno;

    @Column (name =  "id_equipo" )
    private
    Integer id_equipo;

    @Column (name =  "id_cliente" )
    private
    Integer id_cliente;

    public Alquiler(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_alquiler() {
        return fecha_alquiler;
    }

    public void setFecha_alquiler(Date fecha_alquiler) {
        this.fecha_alquiler = fecha_alquiler;
    }

    public Date getFecha_retorno() {
        return fecha_retorno;
    }

    public void setFecha_retorno(Date fecha_retorno) {
        this.fecha_retorno = fecha_retorno;
    }

    public Integer getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(Integer id_equipo) {
        this.id_equipo = id_equipo;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }
}
