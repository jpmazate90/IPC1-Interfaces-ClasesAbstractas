/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5.Clases;

import com.mycompany.lab5.Abstractas.Animal;
import com.mycompany.lab5.Interfaces.Herbivoro;
import com.mycompany.lab5.Interfaces.Salvaje;
import java.io.Serializable;

/**
 *
 * @author jpmazate
 */
public class Elefante extends Animal implements Salvaje,Herbivoro,Serializable{

    private Integer longitudTrompa;

    public Elefante(Integer longitudTrompa, String color, String nombre, Integer edad) {
        super(color, nombre, edad);
        this.longitudTrompa = longitudTrompa;
    }
    
     

    @Override
    public void dormir() {
        System.out.println("Durmiendo como elefante");
    }
    
    @Override
    public String toString() {
        return "Elefante{" +super.toString()+ "longitud trompa=" + longitudTrompa + '}';
    }

    public Integer getLongitudTrompa() {
        return longitudTrompa;
    }

    public void setLongitudTrompa(Integer longitudTrompa) {
        this.longitudTrompa = longitudTrompa;
    }

    @Override
    public void cazarOtroAnimal() {
        System.out.println("Los elefantes cazamos de dia. "+this);
    }

    @Override
    public void huirDeHumano() {
        System.out.println("Nosotros los elefante no huimos, "+this);
    }

    @Override
    public void comerHierba() {
        System.out.println("Comiendo pasto");
    }
    
    
    
}
