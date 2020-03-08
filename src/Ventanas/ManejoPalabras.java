
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

public class ManejoPalabras extends javax.swing.JFrame {

    public static DefaultListModel modelPalabras = new DefaultListModel();
    
    public ManejoPalabras() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.jListPalabras.setModel(modelPalabras);
        
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escogerArchivo = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPalabras = new javax.swing.JList<>();
        eliminarPalabra = new javax.swing.JButton();
        cargarArchivo = new javax.swing.JButton();
        cargarPalabra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();
        mostrarDocs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(234, 219, 188));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jListPalabras.setBackground(new java.awt.Color(231, 234, 166));
        jListPalabras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0), 3));
        jListPalabras.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListPalabras);

        eliminarPalabra.setBackground(new java.awt.Color(211, 181, 84));
        eliminarPalabra.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        eliminarPalabra.setForeground(new java.awt.Color(0, 0, 0));
        eliminarPalabra.setText("Eliminar palabra");
        eliminarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPalabraActionPerformed(evt);
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

        cargarPalabra.setBackground(new java.awt.Color(211, 181, 84));
        cargarPalabra.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        cargarPalabra.setForeground(new java.awt.Color(0, 0, 0));
        cargarPalabra.setText("Cargar palabra");
        cargarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarPalabraActionPerformed(evt);
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

        mostrarDocs.setBackground(new java.awt.Color(211, 181, 84));
        mostrarDocs.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        mostrarDocs.setForeground(new java.awt.Color(0, 0, 0));
        mostrarDocs.setText("Mostrar resúmenes");
        mostrarDocs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDocsActionPerformed(evt);
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
                            .addComponent(cargarPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mostrarDocs, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(35, 35, 35)
                        .addComponent(cargarArchivo)
                        .addGap(25, 25, 25)
                        .addComponent(cargarPalabra)
                        .addGap(25, 25, 25)
                        .addComponent(mostrarDocs)
                        .addGap(25, 25, 25)
                        .addComponent(eliminarPalabra))
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
                archivo.leerPalabrasClaves(archivoCargar);          
                
            }
        
    }//GEN-LAST:event_cargarArchivoActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        
        this.setVisible(false); //Se cierra la ventana
        
    }//GEN-LAST:event_cerrarActionPerformed

    private void eliminarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPalabraActionPerformed
        
        if(this.jListPalabras.isSelectionEmpty()){
            
            JOptionPane.showMessageDialog(null, "ERROR: Por favor escoja una palabra", "ERROR", JOptionPane.WARNING_MESSAGE); //Manejo de errores
            
        } else {
        
            String aux = this.jListPalabras.getSelectedValue(); //Se obtiene el nombre de la palabra que se quiere eliminar
            int hash = HashTable.hashPalabra(aux); //Se obtiene el indice hash de la palabra
        
            ProyectoHash.hash.getPalabrasClaves()[hash] = null;
            modelPalabras.removeElement(aux);
        
        }
        
    }//GEN-LAST:event_eliminarPalabraActionPerformed

    private void cargarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarPalabraActionPerformed
        
        //Se le pide al usuario que ingrese la palabra clave
        String nombre = JOptionPane.showInputDialog(null, "Ingrese la palabra clave: ", "Palabras claves", JOptionPane.QUESTION_MESSAGE);
        
        //VALIDAR CARACTERES ESPECIALES
        
        if (nombre == null) {

            //Por si el usuario ya no desea crear una palabra
            JOptionPane.showMessageDialog(null, "Se ha cancelado la seleccion", "AVISO", JOptionPane.WARNING_MESSAGE);

        } else {
            
            if (!nombre.equalsIgnoreCase("")) {

                Palabra palabra = new Palabra(nombre.trim()); //Si el campo no estaba vacio, se crea la palabra 
                int hash = HashTable.hashPalabra(nombre); //Se consigue el indice hash
                ProyectoHash.hash.insertarPalabra(hash, palabra); //Se inserta la palabra a la hashtable

            } else {

                //Si dejo el campo vacio, se le avisa, manejo de errores
                JOptionPane.showMessageDialog(null, "ERROR: El campo está vacío. \nIntente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);

            }
            
        }
        
    }//GEN-LAST:event_cargarPalabraActionPerformed

    private void mostrarDocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDocsActionPerformed
        
        if(this.jListPalabras.isSelectionEmpty()){
            
            JOptionPane.showMessageDialog(null, "ERROR: Por favor escoja una palabra", "ERROR", JOptionPane.WARNING_MESSAGE); //Manejo de errores
            
        } else {
            
            String aux = this.jListPalabras.getSelectedValue(); //Se consigue el nombre de la palabra
            int hash = HashTable.hashPalabra(aux); //Se consigue el indice hash de la palabra para poder buscarla en la tabla
            ProyectoHash.hash.getPalabrasClaves()[hash].mostrarDocumentos(); //Se llama a la funcion que muestra los documentos en los que aparece la palabra
            
        }
        
    }//GEN-LAST:event_mostrarDocsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargarArchivo;
    private javax.swing.JButton cargarPalabra;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton eliminarPalabra;
    private javax.swing.JFileChooser escogerArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jListPalabras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrarDocs;
    // End of variables declaration//GEN-END:variables
}
