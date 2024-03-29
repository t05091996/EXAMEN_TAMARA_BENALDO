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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tamara benaldo
 */
public class ELIMINAR extends javax.swing.JFrame {

    ArrayList<Modelo> ListaMecanicos = new ArrayList<Modelo>();

    DefaultTableModel tabla = new DefaultTableModel();

    /**
     * Creates new form ELIMINAR
     */
    public ELIMINAR() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Eliminar Mecanicos");
        obtenerDatos();
        llenarTabla();
    }

    //metodo privado para obtener los datos guardados enla variable temporal
    private void obtenerDatos() {
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("modelo.CUE"));
            ListaMecanicos = (ArrayList<Modelo>) entrada.readObject();
            entrada.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + ex.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //metodo privado para guardar los datos en una variable temporal o un archivo .CUE mas especificamente
    private void guardarDatos(ArrayList<Modelo> modelo) {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("modelo.CUE"));
            salida.writeObject(modelo);
            salida.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + ex.getMessage() + "_:_" + ex.getLocalizedMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    //metodo privado para agregar las columnas y los datos leidos en el metodo obtenerDatos().-
    private void llenarTabla() {
        tabla.addColumn("Id");
        tabla.addColumn("Nombre");
        tabla.addColumn("Edad");
        tabla.addColumn("Domicilio");
        tabla.addColumn("Titulo");
        tabla.addColumn("Especialidad");
        tabla.addColumn("Sueldo Base");
        tabla.addColumn("Gratificacion");
        tabla.addColumn("Sueldo Total");
        tablaMecanicos.setModel(tabla);
        for (int i = 0; i < ListaMecanicos.size(); i++) {
            Object[] fila = {
                ListaMecanicos.get(i).getIdMecanico(), ListaMecanicos.get(i).getNombre(), ListaMecanicos.get(i).getEdad(),
                ListaMecanicos.get(i).getDomicilio(), ListaMecanicos.get(i).getTitulo(), ListaMecanicos.get(i).getEspecialidad(),
                ListaMecanicos.get(i).getSueldoBase(), ListaMecanicos.get(i).getGratTitulo(), ListaMecanicos.get(i).getSueldoTotal()
            };
            tabla.addRow(fila);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMecanicos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaMecanicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaMecanicos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Eliminar Mecanicos");

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //obtengo la fila seleccionada
        int index = tablaMecanicos.getSelectedRow();
        //consulto si he seleccionado una fila
        if (index >= 0) {
            //envio un mensaje de confirmacion
            int showConfirmDialog = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar a este mecanico?", "Atención", JOptionPane.OK_CANCEL_OPTION);
            //si he presionado el boton ok
            if (showConfirmDialog == JOptionPane.OK_OPTION) {
                //elimino el dato o fila de la lista
                ListaMecanicos.remove(index);
                //lo elimino de la tabla
                tabla.removeRow(index);
                //lo guardo en la variable temporal para asi saber en las demas pantallas que yano existe
                //ese dato
                guardarDatos(ListaMecanicos);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

 
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
            java.util.logging.Logger.getLogger(ELIMINAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ELIMINAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ELIMINAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ELIMINAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ELIMINAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMecanicos;
    // End of variables declaration//GEN-END:variables
}
