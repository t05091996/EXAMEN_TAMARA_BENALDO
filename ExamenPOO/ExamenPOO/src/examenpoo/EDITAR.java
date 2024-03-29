/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpoo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tamara benaldo
 */
public class EDITAR extends javax.swing.JFrame {

    /**
     * Creates new form EDITAR
     */
    ArrayList<Modelo> ListaMecanicos = new ArrayList<Modelo>();

    public EDITAR() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Editar Mecanico");
        obtenerDatos();
    }

    private void obtenerDatos() {
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("modelo.CUE"));
            ListaMecanicos = (ArrayList<Modelo>) entrada.readObject();
            entrada.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + ex.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardarDatos(ArrayList<Modelo> modelo) {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("modelo.CUE"));
            salida.writeObject(modelo);
            salida.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + ex.getMessage() + "_:_" + ex.getLocalizedMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDomicilio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jTitulo = new javax.swing.JComboBox<>();
        btnCorregir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jEspecialidad = new javax.swing.JTextField();
        jId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSueldo = new javax.swing.JTextField();
        jNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jGratificacion = new javax.swing.JTextField();
        jEdad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Editar Mecanico");

        jLabel5.setText("Titulo:");

        btnGuardar.setText("EDITAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jTitulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INGENIERO MECANICO", "MECANICO INDUSTRIAL" }));

        btnCorregir.setText("CORREGIR");
        btnCorregir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorregirActionPerformed(evt);
            }
        });

        jLabel6.setText("Especialidad:");

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setText("IdMecanico:");

        jId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jIdFocusLost(evt);
            }
        });

        jLabel7.setText("Sueldo Base:");

        jLabel2.setText("Nombre:");

        jLabel8.setText("Gratificación Titulo:");

        jLabel3.setText("Edad:");

        jLabel9.setText("Sueldo Total:");

        jLabel4.setText("Domicilio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jGratificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnGuardar)
                            .addGap(18, 18, 18)
                            .addComponent(btnCorregir)
                            .addGap(18, 18, 18)
                            .addComponent(btnVolver))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(33, 33, 33)
                            .addComponent(jTotal))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(34, 34, 34)
                            .addComponent(jEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(34, 34, 34)
                            .addComponent(jSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTitulo, 0, 193, Short.MAX_VALUE)
                                    .addComponent(jNombre)
                                    .addComponent(jEdad)
                                    .addComponent(jDomicilio)
                                    .addComponent(jId))))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jGratificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCorregir)
                    .addComponent(btnVolver))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //obtener los datos del nuevo mecanico.
        int IdMecanico = Integer.parseInt(jId.getText());
        int index = 0;
        for (int i = 0; i < ListaMecanicos.size(); i++) {
            if (IdMecanico == ListaMecanicos.get(i).getIdMecanico()) {
                index = i;
            }
        }
        String Nombre = jNombre.getText();
        int Edad = Integer.parseInt(jEdad.getText());
        String Domicilio = jDomicilio.getText();
        String Titulo = jTitulo.getSelectedItem().toString();
        String Especialidad = jEspecialidad.getText();
        int SueldoBase = Integer.parseInt(jSueldo.getText());
        int GratTitulo = Integer.parseInt(jGratificacion.getText());
        int SueldoTotal = SueldoBase + GratTitulo;
        Modelo mecanico = new Modelo(IdMecanico, Nombre, Edad, Domicilio, Titulo, Especialidad, SueldoBase, GratTitulo, SueldoTotal);
        ListaMecanicos.set(index, mecanico);
        guardarDatos(ListaMecanicos);
        //mostrar mensaje
        JOptionPane.showMessageDialog(rootPane, mecanico.toString(), "Mecanico: [" + Nombre + "] Editado!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jIdFocusLost
        int IdMecanico = Integer.parseInt(jId.getText());
        Modelo meca = new Modelo();
        for (int i = 0; i < ListaMecanicos.size(); i++) {
            if (IdMecanico == ListaMecanicos.get(i).getIdMecanico()) {
                meca = ListaMecanicos.get(i);
            }
        }
        try {
            if (!meca.getNombre().isEmpty() || meca != null) {
                jNombre.setText(meca.getNombre());
                jDomicilio.setText(meca.getDomicilio());
                jTitulo.setSelectedItem(meca.getTitulo());
                jEspecialidad.setText(meca.getEspecialidad());
                jSueldo.setText("" + meca.getSueldoBase());
                jGratificacion.setText("" + meca.getGratTitulo());
                jTotal.setText("" + meca.getSueldoTotal());
            } else {
                JOptionPane.showMessageDialog(rootPane, "No Existe un Mecanico con este Id!!!", "Error 300", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "No Existe un Mecanico con este Id!!!", "Error 300", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jIdFocusLost

    private void btnCorregirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorregirActionPerformed
        //limpiar los campos
        jId.setText("");
        jEdad.setText("");
        jNombre.setText("");
        jDomicilio.setText("");
        jTitulo.setSelectedIndex(1);
        jEspecialidad.setText("");
        jSueldo.setText("");
        jGratificacion.setText("");
        jTotal.setText("");
    }//GEN-LAST:event_btnCorregirActionPerformed

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
            java.util.logging.Logger.getLogger(EDITAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EDITAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EDITAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EDITAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EDITAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCorregir;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField jDomicilio;
    private javax.swing.JTextField jEdad;
    private javax.swing.JTextField jEspecialidad;
    private javax.swing.JTextField jGratificacion;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jSueldo;
    private javax.swing.JComboBox<String> jTitulo;
    private javax.swing.JTextField jTotal;
    // End of variables declaration//GEN-END:variables
}
