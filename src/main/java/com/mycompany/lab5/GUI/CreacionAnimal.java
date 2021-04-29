/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5.GUI;

import com.mycompany.lab5.ExcepcionesPropias.ExcepcionFormAnimal;
import com.mycompany.lab5.Manejadores.ManejadorCreacionAnimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author jpmazate
 */
public class CreacionAnimal extends javax.swing.JFrame {

    private MenuPrincipalGUI menuPrincipal;
    private ManejadorCreacionAnimal manejador;
    private boolean esInicio;
    
    public CreacionAnimal(MenuPrincipalGUI menuPrincipal, boolean esInicio) {
        initComponents();
        manejador = new ManejadorCreacionAnimal(this);
        this.menuPrincipal = menuPrincipal;
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.esInicio = esInicio;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoEdad = new javax.swing.JTextField();
        campoColor = new javax.swing.JTextField();
        comboBoxAnimal = new javax.swing.JComboBox<>();
        labelPersonalizado = new javax.swing.JLabel();
        campoPersonalizado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Edad:");

        jLabel3.setText("Color:");

        comboBoxAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELEFANTE", "GATO", "PERRO", "TIGRE" }));
        comboBoxAnimal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxAnimalItemStateChanged(evt);
            }
        });

        labelPersonalizado.setText("Longitud Trompa:");

        jButton1.setText("Crear Animal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Creacion Animal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoColor, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(labelPersonalizado)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoPersonalizado))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(comboBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(72, 72, 72)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel5)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(comboBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPersonalizado)
                    .addComponent(campoPersonalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxAnimalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxAnimalItemStateChanged
        manejador.actualizarCampoPersonalizado();
    }//GEN-LAST:event_comboBoxAnimalItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            manejador.crearAnimal();
        } catch (ExcepcionFormAnimal ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public MenuPrincipalGUI getMenuPrincipal() {
        return menuPrincipal;
    }

    public JComboBox<String> getComboBoxAnimal() {
        return comboBoxAnimal;
    }

    public void setComboBoxAnimal(JComboBox<String> comboBoxAnimal) {
        this.comboBoxAnimal = comboBoxAnimal;
    }

    
    
    public void setMenuPrincipal(MenuPrincipalGUI menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }

    public ManejadorCreacionAnimal getManejador() {
        return manejador;
    }

    public void setManejador(ManejadorCreacionAnimal manejador) {
        this.manejador = manejador;
    }

    public JTextField getCampoColor() {
        return campoColor;
    }

    public void setCampoColor(JTextField campoColor) {
        this.campoColor = campoColor;
    }

    public JTextField getCampoEdad() {
        return campoEdad;
    }

    public void setCampoEdad(JTextField campoEdad) {
        this.campoEdad = campoEdad;
    }

    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public void setCampoNombre(JTextField campoNombre) {
        this.campoNombre = campoNombre;
    }

    public JTextField getCampoPersonalizado() {
        return campoPersonalizado;
    }

    public void setCampoPersonalizado(JTextField campoPersonalizado) {
        this.campoPersonalizado = campoPersonalizado;
    }

    public JComboBox<String> getjComboBox1() {
        return comboBoxAnimal;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.comboBoxAnimal = jComboBox1;
    }

    public JLabel getLabelPersonalizado() {
        return labelPersonalizado;
    }

    public void setLabelPersonalizado(JLabel labelPersonalizado) {
        this.labelPersonalizado = labelPersonalizado;
    }

    public boolean isEsInicio() {
        return esInicio;
    }

    public void setEsInicio(boolean esInicio) {
        this.esInicio = esInicio;
    }

     
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoColor;
    private javax.swing.JTextField campoEdad;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPersonalizado;
    private javax.swing.JComboBox<String> comboBoxAnimal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelPersonalizado;
    // End of variables declaration//GEN-END:variables
}
