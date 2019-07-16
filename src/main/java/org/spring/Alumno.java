/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.spring;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import org.springframework.data.annotation.Id;

/**
 *
 * @author campitos
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Alumno {

    @Id
    String id;

    public void setId(String id) {
        this.id = id;
    }

    private String cuenta;
    private String nombre;
    private List<Materia> materias;
    private String email;
    private boolean autenticado;

    public Alumno(String cuenta, String nombre, List<Materia> materias, String email) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.materias = materias;
        this.email = email;
    }

    public Alumno(String id, String cuenta, String nombre, List<Materia> materias, String email, boolean autenticado) {
        this.id = id;
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.materias = materias;
        this.email = email;
        this.autenticado = autenticado;
    }

    public Alumno() {
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id='" + id + '\'' +
                ", cuenta='" + cuenta + '\'' +
                ", nombre='" + nombre + '\'' +
                ", materias=" + materias +
                ", email='" + email + '\'' +
                ", autenticado=" + autenticado +
                '}';
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }
    
}
