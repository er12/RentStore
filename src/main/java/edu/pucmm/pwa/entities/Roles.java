package edu.pucmm.pwa.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by edmildimassimo on 10/6/16.
 */
@Entity
@Table(name="roles")
public class Roles implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id" )
    private
    Integer id;

    @Column (name = "nombre" )
    private
    String nombre;

    public Roles(){
        nombre = "";
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
}
