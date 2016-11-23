package edu.pucmm.pwa.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id" )
    private Integer id;

    @Column(name = "usuario")
    private String usuario;

    @Column( name = "nombre" )
    private String nombre;

    @Column( name = "telefono" )
    private String telefono;

    @Column( name = "es_administrador" )
    private boolean es_administrador;

    @Column( name = "clave" )
    private String clave;

    @Column ( name = "apellido" )
    private String apellido;

    public Usuario(){
        es_administrador = false;
        setClave("");
        usuario = "";
        nombre = "";
        apellido = "";
        telefono = "";
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

    public boolean getEs_administrador() {
        return es_administrador;
    }

    public void setEs_administrador(boolean es_administrador) {
        this.es_administrador = es_administrador;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
