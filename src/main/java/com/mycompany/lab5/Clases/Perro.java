/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5.Clases;

import com.mycompany.lab5.Abstractas.Animal;
import com.mycompany.lab5.Interfaces.Domestico;
import com.mycompany.lab5.Interfaces.Omnivoro;
import java.io.Serializable;

/**
 *
 * @author jpmazate
 */
public class Perro extends Animal implements Domestico,Omnivoro,Serializable{
    
    private String raza;
    

    public Perro(String raza, String color, String nombre, Integer edad) {
        super(color, nombre, edad);
        this.raza = raza;
    }

    @Override
    public void dormir(){
        System.out.println("Durmiendo como perro");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public String toString() {
        return "Perro{"+ super.toString() +"Raza: "+raza+'}';
    }

    @Override
    public void salirPasear() {
    System.out.println(" Soy un perro y voy a salir a pasear."+ this);    
    }

    @Override
    public void cortarlePelo() {
         System.out.println("Ire a cortarme el pelo. "+this);
    }

    @Override
    public void vacunar() {
         System.out.println("Voy a ir a vacunarme contra el covid. Vacunate #QueDiosBendigaAGuatemala "+this);
    }

     @Override
    public void comerNueces() {
        System.out.println("Mi amo me dio unas manias para comer");
    }

    @Override
    public void comerCarne() {
        System.out.println("Mi amo me dio un filete ");
    }

    @Override
    public void comerHierba() {
        System.out.println("Mi amo me dio espinacas");
    }
    
      
    

     

    
    
}
