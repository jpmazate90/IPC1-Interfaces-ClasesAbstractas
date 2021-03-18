/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejinterfacesclasesabstractas.animales;

import com.mycompany.ejinterfacesclasesabstractas.Clases.Animal;
import com.mycompany.ejinterfacesclasesabstractas.interfaces.Carnivoro;
import com.mycompany.ejinterfacesclasesabstractas.interfaces.Salvaje;

/**
 *
 * @author jpmazate
 */
public class Tigre extends Animal implements Salvaje, Carnivoro{
    
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
    public void dormir(){
        System.out.println("Durmiendo como tigre");
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
    public String toString() {
        return "Tigre{" +super.toString()+ "cantidadRayas=" + cantidadRayas + '}';
    }

    @Override
    public void comerCarne() {
        System.out.println("Comiendo un venado");
    }
    
    
    
    
    
    
}
