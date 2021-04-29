/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5.Clases;

import com.mycompany.lab5.Abstractas.Animal;
import com.mycompany.lab5.Interfaces.Carnivoro;
import com.mycompany.lab5.Interfaces.Salvaje;
import java.io.Serializable;

/**
 *
 * @author jpmazate
 */
public class Tigre extends Animal implements Salvaje,Carnivoro,Serializable{

    private Integer cantidadRayas;

    public Tigre(Integer cantidadRayas, String color, String nombre, Integer edad) {
        super(color, nombre, edad);
        this.cantidadRayas = cantidadRayas;
    }

    public Integer getCantidadRayas() {
        return cantidadRayas;
    }

    public void setCantidadRayas(Integer cantidadRayas) {
        this.cantidadRayas = cantidadRayas;
    }
    
    @Override
    public void cazarOtroAnimal() {
        System.out.println("Voy a ir a ver que encuentro en la selva. "+this);
    }

    @Override
    public void huirDeHumano() {
        System.out.println("Estoy huyendo de un humano."+this);
    }
    
    
    
    @Override
    public void dormir() {
        System.out.println("Durmiendo como tigre");
    }

    @Override
    public void comerCarne() {
         System.out.println("Comiendo un venado");
    }
    
     @Override
    public String toString() {
        return "Tigre{"+ super.toString() +"Rayas: "+cantidadRayas+'}';
    }
    
}
