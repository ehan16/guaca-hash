
package Ventanas;

import Clases.ProyectoHash;
import javax.swing.JOptionPane;

/**
 *
 * @author Han, Serrano, Villegas
 */

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        entrar = new javax.swing.JButton();
        informacion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(234, 219, 188));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 153), new java.awt.Color(255, 204, 102), new java.awt.Color(214, 184, 154), new java.awt.Color(204, 204, 120)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 501, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marco.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marcoArriba.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        salir.setBackground(new java.awt.Color(255, 227, 137));
        salir.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 165, -1));

        entrar.setBackground(new java.awt.Color(211, 181, 84));
        entrar.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        entrar.setForeground(new java.awt.Color(0, 0, 0));
        entrar.setText("Comenzar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        jPanel1.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 295, -1));

        informacion.setBackground(new java.awt.Color(211, 181, 84));
        informacion.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        informacion.setForeground(new java.awt.Color(0, 0, 0));
        informacion.setText("Información");
        informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informacionActionPerformed(evt);
            }
        });
        jPanel1.add(informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 295, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(28, 14, 0));
        jLabel4.setText("GUACAMASH");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 270, 50));

        jLabel7.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(173, 153, 116));
        jLabel7.setText("GUACAMASH");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/miniGuaca.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 530, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        
        System.exit(0); //Al hacer click en este boton, se sale del sistema
        
    }//GEN-LAST:event_salirActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed

        ProyectoHash.main.setVisible(true); //Se muestra el main
        this.setVisible(false);

    }//GEN-LAST:event_entrarActionPerformed

    private void informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informacionActionPerformed

        //Se muestra informacion sobre el proyecto
        JOptionPane.showMessageDialog(null, "Bienvenidos. \nEste programa ha sido realizado con la finalidad de buscar \npalabras claves"
                + "en distintos documentos.", "Bienvenida", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_informacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrar;
    private javax.swing.JButton informacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
