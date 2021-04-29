/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5.Listas;

import com.mycompany.lab5.Abstractas.Animal;
import java.io.Serializable;
import javax.swing.JTextArea;

/**
 *
 * @author jpmazate
 * @param <T>
 */
public class Lista<T> implements Serializable {
    
    private Nodo<T> inicio;
    private Nodo<T> fin;
    private JTextArea area;

    public Lista(JTextArea area) {
        this.inicio = null;
        this.fin = null;
        this.area = area;
    }
    
    public void agregarAlInicio(T dato){
        inicio = new Nodo<>(dato, inicio);

        if (fin == null) {
            fin = inicio;
        }
    }
    
    public void mostrarLista(){
        Nodo auxiliar = inicio;
        area.setText("");
        while (auxiliar != null) { 
            area.append("\n"+auxiliar.getDato() + " --> ");
            auxiliar = auxiliar.getSiguiente();
        }
        
    }
    
    
    public boolean estaVacia(){
        return inicio == null;
    }
    
    public void agregarAlFinal(T dato){
        if (!estaVacia()) {
            fin.setSiguiente( new Nodo<>(dato));
            fin = fin.getSiguiente();
        } else {
            Nodo nuevoNodo = new Nodo<>(dato);
            inicio = nuevoNodo;
            fin = nuevoNodo;
        }
    }
    
    public void mostrarPrimerDato(){
        area.setText("");
        area.setText(" El primer dato en la lista es: "+inicio.getDato());
    }
    
    public void mostrarUltimoDato(){
       area.setText("");
       area.append(" El ultimo dato en la lista es: "+fin.getDato());
    }

    public JTextArea getArea() {
        return area;
    }

    public void setArea(JTextArea area) {
        this.area = area;
    }
    
    
    
    
}