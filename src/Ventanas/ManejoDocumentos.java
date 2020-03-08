
package Ventanas;

import Clases.*;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Han, Serrano, Villegas
 */

public class ManejoDocumentos extends javax.swing.JFrame {

    public static DefaultListModel modelDocumentos = new DefaultListModel();
    
    public ManejoDocumentos() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.jListDocumentos.setModel(modelDocumentos);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escogerArchivo = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDocumentos = new javax.swing.JList<>();
        eliminarDocumento = new javax.swing.JButton();
        cargarArchivo = new javax.swing.JButton();
        elegirDocumento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(234, 219, 188));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jListDocumentos.setBackground(new java.awt.Color(231, 234, 166));
        jListDocumentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0), 3));
        jListDocumentos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListDocumentos);

        eliminarDocumento.setBackground(new java.awt.Color(211, 181, 84));
        eliminarDocumento.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        eliminarDocumento.setForeground(new java.awt.Color(0, 0, 0));
        eliminarDocumento.setText("Eliminar documento");
        eliminarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDocumentoActionPerformed(evt);
            }
        });

        cargarArchivo.setBackground(new java.awt.Color(211, 181, 84));
        cargarArchivo.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        cargarArchivo.setForeground(new java.awt.Color(0, 0, 0));
        cargarArchivo.setText("Cargar archivo");
        cargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArchivoActionPerformed(evt);
            }
        });

        elegirDocumento.setBackground(new java.awt.Color(211, 181, 84));
        elegirDocumento.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        elegirDocumento.setForeground(new java.awt.Color(0, 0, 0));
        elegirDocumento.setText("Elegir documento");
        elegirDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirDocumentoActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marco.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marcoArriba.png"))); // NOI18N

        cerrar.setBackground(new java.awt.Color(255, 227, 137));
        cerrar.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        cerrar.setForeground(new java.awt.Color(0, 0, 0));
        cerrar.setText("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elegirDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel3)))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(241, 241, 241))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(cargarArchivo)
                        .addGap(48, 48, 48)
                        .addComponent(elegirDocumento)
                        .addGap(48, 48, 48)
                        .addComponent(eliminarDocumento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addComponent(cerrar)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarArchivoActionPerformed
        
        JOptionPane.showMessageDialog(null, "Por favor escoja el archivo que desea cargar al sistema.", "Cargar archivo", JOptionPane.INFORMATION_MESSAGE);
            
        int result = escogerArchivo.showOpenDialog(this); //Se muestra la ventana para escoger el archivo
            
        if(result == JFileChooser.CANCEL_OPTION){
                
            //Por si el usuario ya no desea cargar el archivo
            JOptionPane.showMessageDialog(null, "Se ha cancelado la seleccion", "AVISO", JOptionPane.WARNING_MESSAGE);
                
        } else if(result == JFileChooser.APPROVE_OPTION){
                
            Archivero archivo = new Archivero();
            File archivoCargar = escogerArchivo.getSelectedFile(); //Se obtiene el archivo que se quiere cargar 
            archivo.leerResumen(archivoCargar);
                
        }
        
    }//GEN-LAST:event_cargarArchivoActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
       
        this.setVisible(false); //Se cierra la ventana
        
    }//GEN-LAST:event_cerrarActionPerformed

    private void eliminarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDocumentoActionPerformed
        
        if(this.jListDocumentos.isSelectionEmpty()){
            
            JOptionPane.showMessageDialog(null, "ERROR: Por favor escoja un documento", "ERROR", JOptionPane.WARNING_MESSAGE); //Manejo de errores
            
        } else {
        
            String aux = this.jListDocumentos.getSelectedValue(); //Se obtiene el nombre del documento que se quiere eliminar
            int hash = HashTable.hashDocumento(aux); //Se obtiene el indice hash del nombre del documento
        
            ProyectoHash.hash.getDocumentos()[hash] = null;
            modelDocumentos.removeElement(aux);
            
            if(ProyectoHash.main.getDocActual().getTitulo().equalsIgnoreCase(aux)){
                
                ProyectoHash.main.setDocActual(null);
                ProyectoHash.main.getTextoDocumento().setText("");
                
            }
        
        }
        
    }//GEN-LAST:event_eliminarDocumentoActionPerformed

    private void elegirDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirDocumentoActionPerformed
        
        if(this.jListDocumentos.isSelectionEmpty()){
            
            JOptionPane.showMessageDialog(null, "ERROR: Por favor escoja un documento", "ERROR", JOptionPane.WARNING_MESSAGE); //Manejo de errores
            
        } else {
            
            String aux = this.jListDocumentos.getSelectedValue(); //Se obtiene el nombre del documento que se quiere mostrar 
            int hash = HashTable.hashDocumento(aux); //Se obtiene el codigo hash para buscarlo en la tabla
            ProyectoHash.hash.getDocumentos()[hash].mostrarContenido(ProyectoHash.main.getTextoDocumento()); //Se muestra el documento en el main
            ProyectoHash.main.setDocActual(ProyectoHash.hash.getDocumentos()[hash]); //Se settea el documento actual
            
        }

    }//GEN-LAST:event_elegirDocumentoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargarArchivo;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton elegirDocumento;
    private javax.swing.JButton eliminarDocumento;
    private javax.swing.JFileChooser escogerArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jListDocumentos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
