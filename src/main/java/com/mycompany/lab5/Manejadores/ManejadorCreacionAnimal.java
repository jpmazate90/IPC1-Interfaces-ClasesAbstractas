/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5.Manejadores;

import com.mycompany.lab5.Clases.Elefante;
import com.mycompany.lab5.Clases.Gato;
import com.mycompany.lab5.Clases.Perro;
import com.mycompany.lab5.Clases.Tigre;
import com.mycompany.lab5.Enums.MensajePersonalizado;
import com.mycompany.lab5.Enums.TiposAnimales;
import com.mycompany.lab5.ExcepcionesPropias.ExcepcionFormAnimal;
import com.mycompany.lab5.GUI.CreacionAnimal;
import javax.swing.JFrame;

/**
 *
 * @author jpmazate
 */
public class ManejadorCreacionAnimal {

    private CreacionAnimal menu;

    public ManejadorCreacionAnimal(CreacionAnimal menuCreacionAnimal) {
        this.menu = menuCreacionAnimal;
    }

    public void actualizarCampoPersonalizado() {
        TiposAnimales tipoAnimal = TiposAnimales.valueOf((String)menu.getComboBoxAnimal().getSelectedItem());

        switch (tipoAnimal) {
            case ELEFANTE:
                menu.getLabelPersonalizado().setText(MensajePersonalizado.mensajeElefante);
                break;
            case GATO:
                menu.getLabelPersonalizado().setText(MensajePersonalizado.mensajeGato);
                break;
            case PERRO:
                menu.getLabelPersonalizado().setText(MensajePersonalizado.mensajePerro);
                break;
            case TIGRE:
                menu.getLabelPersonalizado().setText(MensajePersonalizado.mensajeTigre);
                break;
        }

    }

    public void crearAnimal() throws ExcepcionFormAnimal {
        TiposAnimales tipoAnimal = TiposAnimales.valueOf((String)menu.getComboBoxAnimal().getSelectedItem());
        validarAnimal();
        switch (tipoAnimal) {
            case ELEFANTE:
                crearElefante();
                break;
            case GATO:
                crearGato();
                break;
            case PERRO:
                crearPerro();
                break;
            case TIGRE:
                crearTigre();
                break;
        }
        menu.setVisible(false);
        menu.dispose();

    }

    public void crearElefante() throws ExcepcionFormAnimal {
        convertirEnNumero(menu.getCampoPersonalizado().getText(), "Longitud Trompa");

        String nombre = menu.getCampoNombre().getText();
        String edad = menu.getCampoEdad().getText();
        String color = menu.getCampoColor().getText();
        String trompa = menu.getCampoPersonalizado().getText();
        
        Elefante el = new Elefante(Integer.parseInt(trompa), color, nombre, Integer.parseInt(edad));
        menu.getMenuPrincipal().ingresarAnimal(el, menu.isEsInicio());


    }

    public void crearGato() throws ExcepcionFormAnimal {
        validarCampoVacio(menu.getCampoPersonalizado().getText(), "Tipo Maullado");

        String nombre = menu.getCampoNombre().getText();
        String edad = menu.getCampoEdad().getText();
        String color = menu.getCampoColor().getText();
        String tipoMaullado = menu.getCampoPersonalizado().getText();
        Gato gato = new Gato(tipoMaullado, color, nombre, Integer.parseInt(edad));
        menu.getMenuPrincipal().ingresarAnimal(gato, menu.isEsInicio());

    }

    public void crearTigre() throws ExcepcionFormAnimal {
        convertirEnNumero(menu.getCampoPersonalizado().getText(), "Cantidad Rayas");
        String nombre = menu.getCampoNombre().getText();
        String edad = menu.getCampoEdad().getText();
        String color = menu.getCampoColor().getText();
        String rayas = menu.getCampoPersonalizado().getText();

        Tigre tigre = new Tigre(Integer.parseInt(rayas), color, nombre, Integer.parseInt(edad));
        menu.getMenuPrincipal().ingresarAnimal(tigre, menu.isEsInicio());
    }

    public void crearPerro() throws ExcepcionFormAnimal {
        validarCampoVacio(menu.getCampoPersonalizado().getText(), "Raza");
        String nombre = menu.getCampoNombre().getText();
        String edad = menu.getCampoEdad().getText();
        String color = menu.getCampoColor().getText();
        String raza = menu.getCampoPersonalizado().getText();

        Perro p = new com.mycompany.lab5.Clases.Perro(raza, color, nombre, Integer.parseInt(edad));
        menu.getMenuPrincipal().ingresarAnimal(p, menu.isEsInicio());

    }

    public void validarAnimal() throws ExcepcionFormAnimal {
        validarCampoVacio(menu.getCampoNombre().getText(), "Nombre");
        validarCampoVacio(menu.getCampoColor().getText(), "Color");
        convertirEnNumero(menu.getCampoEdad().getText(), "edad");
    }

    public void validarCampoVacio(String campo, String tipoDato) throws ExcepcionFormAnimal {
        if (campo.equals("")) {
            throw new ExcepcionFormAnimal("Error en el formulario de Animal. El campo " + tipoDato + " esta vacio.");
        }
    }

    public int convertirEnNumero(String dato, String tipoDato) throws ExcepcionFormAnimal {
        try {
            int resultado = Integer.parseInt(dato);
            if (resultado < 0) {
                throw new ExcepcionFormAnimal("El campo: " + tipoDato + " no puede ser un numero negativo, dato ingresado:" + dato);
            } else {
                return resultado;
            }

        } catch (NumberFormatException e) {
            throw new ExcepcionFormAnimal("Error del tipo: " + e.getClass() + " en el formulario de animal. El campo: " + tipoDato + " no es un numero, dato ingresado:" + dato);
        }
    }

    public CreacionAnimal getMenuCreacionAnimal() {
        return menu;
    }

    public void setMenuCreacionAnimal(CreacionAnimal menuCreacionAnimal) {
        this.menu = menuCreacionAnimal;
    }

}
