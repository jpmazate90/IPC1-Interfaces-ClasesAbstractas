/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejinterfacesclasesabstractas.Clases;

/**
 *
 * @author jpmazate
 */
public abstract class Animal extends SerVivo{
    
    private String color;

    public Animal(String color, String nombre, Integer edad) {
        super(nombre, edad);
        this.color = color;
    }
    
    
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{"+super.toString()+"color=" + color + '}';
    }

    

    

    
    
    
    
    
    
}
