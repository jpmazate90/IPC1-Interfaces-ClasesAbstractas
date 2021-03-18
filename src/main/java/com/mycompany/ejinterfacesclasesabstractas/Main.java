/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejinterfacesclasesabstractas;

import com.mycompany.ejinterfacesclasesabstractas.animales.Elefante;
import com.mycompany.ejinterfacesclasesabstractas.animales.Gato;
import com.mycompany.ejinterfacesclasesabstractas.animales.Perro;
import com.mycompany.ejinterfacesclasesabstractas.animales.Tigre;
import com.mycompany.ejinterfacesclasesabstractas.interfaces.Carnivoro;
import com.mycompany.ejinterfacesclasesabstractas.interfaces.Domestico;
import com.mycompany.ejinterfacesclasesabstractas.interfaces.Herbivoro;
import com.mycompany.ejinterfacesclasesabstractas.interfaces.Salvaje;

/**
 *
 * @author jpmazate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro = new Perro("raza1", "rojo","Perdigon", 23);
        perro.dormir();
        
        Gato gato =  new Gato("grav","gris","whiski", 7);
        gato.dormir();
        
        
        Tigre tigre = new Tigre(20, "Anaranjado", "Tigrito",10);
        tigre.dormir();

        Elefante elefante = new Elefante(1, "gris","Morita", 50);
        elefante.dormir();
        
        Domestico animalesDomesticos[] = new Domestico[2];
        animalesDomesticos[0] = perro;
        animalesDomesticos[1] = gato;
        
        mostrarAnimalesDomesticos(animalesDomesticos);
        
        
        Salvaje animalesSalvajes[] = new Salvaje[2];
        animalesSalvajes[0] = tigre;
        animalesSalvajes[1] = elefante;
        
        mostrarAnimalesSalvajes(animalesSalvajes);
        
        Herbivoro animalesHerbivoros[] = new Herbivoro[2];
        animalesHerbivoros[0] = perro;
        animalesHerbivoros[1] = elefante;
        
        mostrarAnimalesHerbivoros(animalesHerbivoros);
        
        Carnivoro animalesCarnivoros[] = new Carnivoro[2];
        animalesCarnivoros[0] = perro;
        animalesCarnivoros[1] = tigre;
        
        mostrarAnimalesCarnivoros(animalesCarnivoros);
        
    }
    
    
    public static void mostrarAnimalesDomesticos(Domestico animalesDomesticos[]){
        
        for (int i = 0; i < animalesDomesticos.length; i++) {
            Domestico animal = animalesDomesticos[i];
            animal.vacunar();
            
        }
    }
    public static void mostrarAnimalesSalvajes(Salvaje animalesSalvajes[]){
        
        for (int i = 0; i < animalesSalvajes.length; i++) {
            Salvaje animal = animalesSalvajes[i];
            animal.huirDeHumano();
            
        }
    }
    
    public static void mostrarAnimalesCarnivoros(Carnivoro animalesCarnivoros[]){
        for (int i = 0; i < animalesCarnivoros.length; i++) {
            Carnivoro animal = animalesCarnivoros[i];
            animal.comerCarne();
            
        }
    }
    
    public static void mostrarAnimalesHerbivoros(Herbivoro animalesHerbivoros[]){
        for (int i = 0; i < animalesHerbivoros.length; i++) {
            Herbivoro animal = animalesHerbivoros[i];
            animal.comerHierba();
        }
    }
}

// comentario







 

