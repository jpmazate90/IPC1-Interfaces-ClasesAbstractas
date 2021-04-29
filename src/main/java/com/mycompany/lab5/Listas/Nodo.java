/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5.Listas;

/**
 *
 * @author jpmazate
 */
import java.io.Serializable;

/**
 *
 * @author jpmazate
 * @param <T>
 */
public class Nodo<T> implements Serializable {
    
    private T dato;
    private Nodo siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo(T dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    
    public T getDato(){
        return this.dato;
    }
    
    public void setDato(T dato){
        this.dato = dato;
    }
    

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
 
}