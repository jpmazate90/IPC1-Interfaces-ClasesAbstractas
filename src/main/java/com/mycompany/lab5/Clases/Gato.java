/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5.Clases;

import com.mycompany.lab5.Abstractas.Animal;
import com.mycompany.lab5.Interfaces.Carnivoro;
import com.mycompany.lab5.Interfaces.Domestico;
import java.io.Serializable;

/**
 *
 * @author jpmazate
 */
public class Gato extends Animal implements Domestico, Carnivoro,Serializable{
    
    private String tipoMaullado;

    public Gato(String tipoMaullado, String color, String nombre, Integer edad) {
        super(color, nombre, edad);
        this.tipoMaullado = tipoMaullado;
    }
    
    

    @Override
    public void dormir() {
        System.out.println("Durmiendo como gato");
    }
    
    
    @Override
    public String toString() {
        return "Gato{"+ super.toString() +"Tipo Maullado: "+tipoMaullado+'}';
    }

    public String getTipoMaullado() {
        return tipoMaullado;
    }

    public void setTipoMaullado(String tipoMaullado) {
        this.tipoMaullado = tipoMaullado;
    }

    @Override
    public void salirPasear() {
        System.out.println("Voy a ir al jardin."+ this);
    }

    @Override
    public void cortarlePelo() {
        System.out.println("Yo no me lo corto porque a los gatos no les gusta cortarse el pelo. "+this);
    }
   

    @Override
    public void vacunar() {
        System.out.println("A los gatos no nos da el covid #OjitosCansados "+this);
    }

    @Override
    public void comerCarne() {
        System.out.println("Comiendo una rata");
    }

    
    
    
}
