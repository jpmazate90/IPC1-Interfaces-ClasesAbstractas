/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

import com.mycompany.lab5.Abstractas.Animal;
import com.mycompany.lab5.Abstractas.SerVivo;
import com.mycompany.lab5.Clases.Elefante;
import com.mycompany.lab5.Clases.Gato;
import com.mycompany.lab5.Clases.Perro;
import com.mycompany.lab5.Clases.Tigre;
import com.mycompany.lab5.GUI.MenuPrincipalGUI;
import com.mycompany.lab5.Interfaces.Carnivoro;
import com.mycompany.lab5.Interfaces.Domestico;
import com.mycompany.lab5.Interfaces.Herbivoro;

/**
 *
 * @author jpmazate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MenuPrincipalGUI m = new MenuPrincipalGUI();
        m.setVisible(true);
        
        Perro perro1 = new Perro("Chihuahua", "cafe","Doki", 1);
        Gato gato1 = new Gato("grave","gris","gato1", 5);
        Elefante elefante1 = new Elefante(50, "gris", "elefante 1",50);
        Tigre tigre1 = new Tigre(10, "Anaranjado", "tigre 1",3);
        
        
        Domestico animalesDomesticos[] = new Domestico[2];
        animalesDomesticos[0] = perro1;
        animalesDomesticos[1] = gato1;
        
        
        
        
       // vacunarAnimalesDomesticos(animalesDomesticos);
        
        
        
        Herbivoro animalesHerbivoros[] = new Herbivoro[2];
        animalesHerbivoros[0] = perro1;
        animalesHerbivoros[1] = elefante1;
        
        //mostrarAnimalesHerbivoros(animalesHerbivoros);
        
        
        Carnivoro animalesCarnivoros[] = new Carnivoro[2];
        animalesCarnivoros[0] = perro1;
        animalesCarnivoros[1] = tigre1;
        
        
        mostrarAnimalesCarnivoros(animalesCarnivoros);
        
        
        
        perro1.dormir();
        gato1.dormir();
        elefante1.dormir();
        tigre1.dormir();


        
        
    }
    
    
    public static void vacunarAnimalesDomesticos(Domestico animales[]){
        for (int i = 0; i < animales.length; i++) {
            Domestico animal = animales[i];
            animal.vacunar();
            System.out.println("-------------");
        }
    }
    
    public static void mostrarAnimalesHerbivoros(Herbivoro animalesHerbivoros[]){
        for (int i = 0; i < animalesHerbivoros.length; i++) {
            Herbivoro animal = animalesHerbivoros[i];
            animal.comerHierba();
        }
    }
    
    public static void mostrarAnimalesCarnivoros(Carnivoro animalesCarnivoros[]){
        for (int i = 0; i < animalesCarnivoros.length; i++) {
            Carnivoro animal = animalesCarnivoros[i];
            animal.comerCarne();
            
        }
    }
}
