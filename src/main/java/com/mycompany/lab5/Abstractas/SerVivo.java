/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5.Abstractas;

import java.io.Serializable;

/**
 *
 * @author jpmazate
 */
public abstract class SerVivo implements Serializable{
    
    private String nombre;
    private Integer edad;

    public SerVivo(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void dormir();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "SerVivo{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
    
    
    
}
