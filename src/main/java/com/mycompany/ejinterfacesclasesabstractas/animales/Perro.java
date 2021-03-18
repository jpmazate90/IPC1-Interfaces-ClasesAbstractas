/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejinterfacesclasesabstractas.animales;

import com.mycompany.ejinterfacesclasesabstractas.Clases.Animal;
import com.mycompany.ejinterfacesclasesabstractas.interfaces.Domestico;
import com.mycompany.ejinterfacesclasesabstractas.interfaces.Omnivoro;

/**
 *
 * @author jpmazate
 */
public class Perro extends Animal implements Domestico,Omnivoro{
    
    private String raza;


    public Perro(String raza, String color, String nombre, Integer edad) {
        super(color, nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void salirPasear() {
        System.out.println("Voy a salir a pasear."+ this);
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
    public void dormir(){
        System.out.println("Durmiendo como perro");
    }
    
    @Override
    public String toString() {
        return "Perro{"+ super.toString() +"Raza: "+raza+'}';
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
