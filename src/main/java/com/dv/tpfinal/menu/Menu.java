/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dv.tpfinal.menu;

import com.dv.tpfinal.controllers.AutoController;
import com.dv.tpfinal.controllers.GarageController;
import com.dv.tpfinal.controllers.MotoController;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;

/**
 *
 * @author nico
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Menu() {
        initComponents();
        
        fieldCantidadMaximaVehiculos.setText(Integer.toString(GarageController.getInstance().getCapacidadMaxima()));
        fieldPrecioCambioRueda.setText(Double.toString(GarageController.getInstance().getPrecioRueda()));

        botonAgregarAuto.addActionListener(e -> agregarAuto());
        botonAgregarMoto.addActionListener(e -> agregarMoto());
        botonEliminarVehiculos.addActionListener(e -> eliminarSeleccionados());
        botonGuardarConfiguracion.addActionListener(e -> guardarConfiguracion());
        
        updateTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculos = new javax.swing.JTable();
        botonEliminarVehiculos = new javax.swing.JButton();
        labelCostoTotalRuedas = new javax.swing.JLabel();
        labelVehiculosEnGarage = new javax.swing.JLabel();
        labelKilometrajeMedio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fieldMarcaAuto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botonAgregarAuto = new javax.swing.JButton();
        botonAgregarMoto = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fieldKilometrajeAuto = new javax.swing.JTextField();
        fieldPuertasAuto = new javax.swing.JTextField();
        fieldKilometrajeMoto = new javax.swing.JTextField();
        fieldMarcaMoto = new javax.swing.JTextField();
        fieldCilindradaMoto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel11 = new javax.swing.JLabel();
        fieldCantidadMaximaVehiculos = new javax.swing.JTextField();
        fieldPrecioCambioRueda = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        botonGuardarConfiguracion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setText("Sistema de gestión de garage");

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane2.setMixingCutoutShape(null);

        jPanel1.setToolTipText("");

        tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Kilometraje", "Marca", "Puertas", "Cilindrada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVehiculos);

        botonEliminarVehiculos.setText("Eliminar seleccionados");
        botonEliminarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarVehiculosActionPerformed(evt);
            }
        });

        labelCostoTotalRuedas.setText("jLabel12");

        labelVehiculosEnGarage.setText("jLabel13");

        labelKilometrajeMedio.setText("jLabel13");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelCostoTotalRuedas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelVehiculosEnGarage))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelKilometrajeMedio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminarVehiculos)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCostoTotalRuedas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelVehiculosEnGarage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEliminarVehiculos)
                    .addComponent(labelKilometrajeMedio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jTabbedPane2.addTab("Listar y modificar", jPanel1);

        fieldMarcaAuto.setPreferredSize(new java.awt.Dimension(80, 26));

        jLabel3.setText("Kilometraje");

        jLabel4.setText("Marca");

        jLabel5.setText("Cantidad de puertas");

        jLabel6.setText("Kilometraje");

        jLabel7.setText("Marca");

        jLabel8.setText("Cilindrada");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        botonAgregarAuto.setText("Agregar auto");

        botonAgregarMoto.setText("Agregar moto");

        jLabel9.setText("Moto");

        jLabel10.setText("Auto");

        fieldKilometrajeAuto.setPreferredSize(new java.awt.Dimension(80, 26));

        fieldPuertasAuto.setPreferredSize(new java.awt.Dimension(80, 26));

        fieldKilometrajeMoto.setPreferredSize(new java.awt.Dimension(80, 26));

        fieldMarcaMoto.setPreferredSize(new java.awt.Dimension(80, 26));

        fieldCilindradaMoto.setPreferredSize(new java.awt.Dimension(80, 26));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(botonAgregarAuto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAgregarMoto)
                .addGap(109, 109, 109))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldMarcaAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldKilometrajeAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldPuertasAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(fieldCilindradaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(46, 46, 46)
                                        .addComponent(fieldMarcaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldKilometrajeMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(146, 146, 146))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(fieldKilometrajeMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(fieldMarcaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(fieldKilometrajeAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(fieldMarcaAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(fieldPuertasAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(fieldCilindradaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarAuto)
                    .addComponent(botonAgregarMoto))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Agregar", jPanel2);

        jLabel2.setText("Cantidad máxima de vehículos:");

        jLabel11.setText("Precio de cambio de rueda:");

        fieldCantidadMaximaVehiculos.setPreferredSize(new java.awt.Dimension(80, 26));

        fieldPrecioCambioRueda.setPreferredSize(new java.awt.Dimension(80, 26));

        botonGuardarConfiguracion.setText("Guardar cambios");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonGuardarConfiguracion)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator2)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                            .addComponent(fieldCantidadMaximaVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldPrecioCambioRueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldCantidadMaximaVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(fieldPrecioCambioRueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(botonGuardarConfiguracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPane2.addTab("Configuración", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarVehiculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarVehiculosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    public void guardarConfiguracion() {
        String capacidadMaximaTexto = fieldCantidadMaximaVehiculos.getText();
        String precioRuedaTexto = fieldPrecioCambioRueda.getText();
        
        if (capacidadMaximaTexto.isEmpty() || precioRuedaTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes completar todos los cmapos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            int capacidadMaxima = Integer.parseInt(capacidadMaximaTexto);
            double precioRueda = Double.parseDouble(precioRuedaTexto);
            
            GarageController garage = GarageController.getInstance();
            garage.setCapacidadMaxima(capacidadMaxima);
            garage.setPrecioRueda(precioRueda);            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debes introducir un número válido para la capacidad máxima y el precio por rueda.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateTableData();
    }
    
    private void agregarAuto() {
        GarageController garage = GarageController.getInstance();
        if ((garage.getAutos().size() + garage.getMotos().size()) >= garage.getCapacidadMaxima()) {
            JOptionPane.showMessageDialog(this, "Se ha llegado a la cantidad máxima de vehículos en el garage.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String kilometrajeTexto = fieldKilometrajeAuto.getText();
        String marca = fieldMarcaAuto.getText();
        String cantidadPuertasTexto = fieldPuertasAuto.getText();

        if (kilometrajeTexto.isEmpty() || marca.isEmpty() || cantidadPuertasTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes completar todos los cmapos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int kilometraje = Integer.parseInt(kilometrajeTexto);
            int cantidadPuertas = Integer.parseInt(cantidadPuertasTexto);

            garage.addAuto(kilometraje, marca, cantidadPuertas);

            fieldMarcaAuto.setText("");
            fieldKilometrajeAuto.setText("");
            fieldPuertasAuto.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debes introducir un número válido para kilometraje y cantidad de puertas.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateTableData();
    }
    
    private void agregarMoto() {
        GarageController garage = GarageController.getInstance();
        if ((garage.getAutos().size() + garage.getMotos().size()) >= garage.getCapacidadMaxima()) {
            JOptionPane.showMessageDialog(this, "Se ha llegado a la cantidad máxima de vehículos en el garage.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String kilometrajeTexto = fieldKilometrajeMoto.getText();
        String marca = fieldMarcaMoto.getText();
        String cilindradaTexto = fieldCilindradaMoto.getText();
        
        if (kilometrajeTexto.isEmpty() || marca.isEmpty() || cilindradaTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes completar todos los cmapos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            int kilometraje = Integer.parseInt(kilometrajeTexto);
            int cilindrada = Integer.parseInt(cilindradaTexto);

            garage.addMoto(kilometraje, marca, cilindrada);

            fieldKilometrajeMoto.setText("");
            fieldMarcaMoto.setText("");
            fieldCilindradaMoto.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debes introducir un número válido para kilometraje y cilindrada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateTableData();
    }
    
    private void eliminarSeleccionados() {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tablaVehiculos.getModel();
        var selectedRows = tablaVehiculos.getSelectedRows();
        for (int row : selectedRows) {
            var id = (int) tablaVehiculos.getValueAt(row, 0);
            GarageController garage = GarageController.getInstance();
            garage.removeVehiculo(id);
        }
        
        tablaVehiculos.clearSelection();
        model.setRowCount(0);
        updateTableData();
    }
    
    private void updateTableData() {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tablaVehiculos.getModel();
        model.setRowCount(0);
        GarageController garage = GarageController.getInstance();
        
        var cantidadVehiculos = garage.getAutos().size() + garage.getMotos().size();
        labelVehiculosEnGarage.setText("Cantidad de vehículos en el garage: " + cantidadVehiculos);
        
        double precioTotalRuedas = garage.getPrecioTotalRuedas();
        labelCostoTotalRuedas.setText("Costo de reemplazar todas las ruedas: $" + String.format("%.2f", precioTotalRuedas));

        double kilometrajeMedio = garage.getKilometrajeMedio();
        labelKilometrajeMedio.setText("Kilometraje medio: " + String.format("%.2f", kilometrajeMedio));
        
        ArrayList<Integer> motos = garage.getMotos();
        ArrayList<Integer> autos = garage.getAutos();
        
        AtomicInteger contadorFila = new AtomicInteger(0);
        motos.forEach(motoId -> {
            var moto = MotoController.get(motoId).get();
            Object[] nuevaRow = { motoId, "Moto", moto.getKilometraje(), moto.getMarca(), "N/A", moto.getCilindrada()};
            model.addRow(nuevaRow);
            contadorFila.getAndIncrement();
        });
        autos.forEach(autoId -> {
            var auto = AutoController.get(autoId).get();
            Object[] nuevaRow = { autoId, "Auto", auto.getKilometraje(), auto.getMarca(), auto.getCantidadPuertas(), "N/A"};
            model.addRow(nuevaRow);
            contadorFila.getAndIncrement();
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarAuto;
    private javax.swing.JButton botonAgregarMoto;
    private javax.swing.JButton botonEliminarVehiculos;
    private javax.swing.JButton botonGuardarConfiguracion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField fieldCantidadMaximaVehiculos;
    private javax.swing.JTextField fieldCilindradaMoto;
    private javax.swing.JTextField fieldKilometrajeAuto;
    private javax.swing.JTextField fieldKilometrajeMoto;
    private javax.swing.JTextField fieldMarcaAuto;
    private javax.swing.JTextField fieldMarcaMoto;
    private javax.swing.JTextField fieldPrecioCambioRueda;
    private javax.swing.JTextField fieldPuertasAuto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel labelCostoTotalRuedas;
    private javax.swing.JLabel labelKilometrajeMedio;
    private javax.swing.JLabel labelVehiculosEnGarage;
    private javax.swing.JTable tablaVehiculos;
    // End of variables declaration//GEN-END:variables
}
