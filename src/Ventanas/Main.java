
package Ventanas;

import Clases.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Han, Serrano, Villegas
 */

public class Main extends javax.swing.JFrame {
    
    private ManejoDocumentos venDoc = new ManejoDocumentos();
    private ManejoPalabras venPal = new ManejoPalabras();
    private Resultados venRel = new Resultados();
    private Documento docActual; //facilitar manejo de informacion

    public Main() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoDocumento = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        analizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        documentos = new javax.swing.JButton();
        palabras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(234, 219, 188));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel2.setBackground(new java.awt.Color(234, 219, 188));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 2, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tha Resumen");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 300, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 250, 10));

        jPanel3.setBackground(new java.awt.Color(175, 128, 77));

        jScrollPane1.setBackground(new java.awt.Color(204, 148, 77));

        textoDocumento.setEditable(false);
        textoDocumento.setBackground(new java.awt.Color(175, 128, 77));
        textoDocumento.setColumns(20);
        textoDocumento.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        textoDocumento.setForeground(new java.awt.Color(0, 0, 0));
        textoDocumento.setRows(5);
        textoDocumento.setBorder(null);
        textoDocumento.setCaretColor(new java.awt.Color(204, 255, 0));
        textoDocumento.setOpaque(false);
        jScrollPane1.setViewportView(textoDocumento);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 310, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paper.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 390, 510));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        analizar.setBackground(new java.awt.Color(211, 181, 84));
        analizar.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        analizar.setForeground(new java.awt.Color(0, 0, 0));
        analizar.setText("Analizar");
        analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marcoArriba.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marco.png"))); // NOI18N

        salir.setBackground(new java.awt.Color(255, 227, 137));
        salir.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        documentos.setBackground(new java.awt.Color(211, 181, 84));
        documentos.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        documentos.setForeground(new java.awt.Color(0, 0, 0));
        documentos.setText("Documentos");
        documentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentosActionPerformed(evt);
            }
        });

        palabras.setBackground(new java.awt.Color(211, 181, 84));
        palabras.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        palabras.setForeground(new java.awt.Color(0, 0, 0));
        palabras.setText("Palabras");
        palabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(analizar, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(documentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(palabras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(analizar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(documentos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(palabras, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(salir)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizarActionPerformed
        
        //Se verifica que se haya seleccionado algun documento
        if(docActual != null && !textoDocumento.getText().equalsIgnoreCase("")){
            
            long start = System.currentTimeMillis();
        
            String[] cuerpo = docActual.separarCuerpo(); //Se obtiene cada palabra del cuerpo

            for (int i = 0; i < cuerpo.length; i++) {
                
                int hashAux = HashTable.hashPalabra(cuerpo[i]); //Se obtiene el codigo hash
                Palabra palAux = ProyectoHash.hash.getPalabrasClaves()[hashAux]; //Auxiliar para la palabra con la que se esta trabajando
                
                //Dado el caso de que la casilla puede ser vacia, se verifica
                if(palAux != null){
                    
                    if(palAux.getPalabra().equalsIgnoreCase(cuerpo[i])){
                        
                        //Si es la misma palabra, se aumenta la frencuencia
                        ProyectoHash.hash.getPalabrasClaves()[hashAux].setFrecuencia(ProyectoHash.hash.getPalabrasClaves()[hashAux].getFrecuencia()+1);
                        
                    } else {
                        
                        //Como existe un metodo de manejo de colisiones, se tiene que revisar otras casillas por si acaso
                        do{
                            
                            hashAux++;
                            
                        } while(ProyectoHash.hash.getPalabrasClaves()[hashAux] != null && (hashAux < ProyectoHash.hash.getPalabrasClaves().length));
                        
                    }
                    
                }
                
            }
            
            long end = System.currentTimeMillis();
            long time = end - start;
        
            String autoresAux = ""; //String para tener los nombres de los autores
        
            for (int i = 0; i < docActual.getAutores().size(); i++) {
            
                autoresAux = autoresAux + docActual.getAutores().get(i) +"\n"; //Se obtiene el nombre de cada autor
            
            }
        
            String palabrasAux = ""; //String para tener las palabras claves con sus respectivas palabras claves
        
            for (int i = 0; i < ProyectoHash.hash.getPalabrasClaves().length; i++) {
            
                if(ProyectoHash.hash.getPalabrasClaves()[i] != null){
                
                    palabrasAux = palabrasAux + ProyectoHash.hash.getPalabrasClaves()[i].toString() + "\n"; //Se obtiene la informacion de cada palabra clave

                }
                
            }

            //Se settea la informacion del resultado en el text area de la ventana de resultados
            venRel.getjTxtResultados().setText(docActual.getTitulo() + "\nAutores: \n" + autoresAux + "Palabras claves: \n" + palabrasAux
            + "Numero de palabras del resumen: " + docActual.separarCuerpo().length + "\nTiempo empleado: " + time + " ms"); 
            venRel.setVisible(true); //Se hace visible la ventana de resultados
            
            Palabra.reiniciarFrecuencia(ProyectoHash.hash.getPalabrasClaves()); //Se reinicia la frecuencia de cada palabra para nuevos analisis

        } else {
            
            JOptionPane.showMessageDialog(null, "ERROR: No ha seleccionado ningún resumen.", "ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_analizarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        
        //Se guardan todas las palabras claves y documentos 
        JOptionPane.showMessageDialog(null, "Se guardará toda la información existente en archivos de texto.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        Archivero archivo = new Archivero();
        archivo.crearPalabrasClaves(); //Se guardan las palabras claves en un archivo de texto plano
        
        for (int i = 0; i < ProyectoHash.hash.getDocumentos().length; i++) {
            
            if(ProyectoHash.hash.getDocumentos()[i] != null){
                
                archivo.crearResumen(i, "Documento "+(i+1)); //Se va creando un archivo de texto para cada resumen, se colocara un nombre por default
                
            }
            
        }
        
        System.exit(0); //Al hacer click en este boton, se sale del sistema
        
    }//GEN-LAST:event_salirActionPerformed

    private void documentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentosActionPerformed
        
        venDoc.setVisible(true); //Se abre la ventana de manejo de documentos
        
    }//GEN-LAST:event_documentosActionPerformed

    private void palabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabrasActionPerformed
        
        venPal.setVisible(true); //Se abre la ventana de manejo de palabras
        
    }//GEN-LAST:event_palabrasActionPerformed

    //Getter y setter

    public Documento getDocActual() {
        return docActual;
    }

    public void setDocActual(Documento docActual) {
        this.docActual = docActual;
    }
    
    public JTextArea getTextoDocumento() {
        return textoDocumento;
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analizar;
    private javax.swing.JButton documentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton palabras;
    private javax.swing.JButton salir;
    private javax.swing.JTextArea textoDocumento;
    // End of variables declaration//GEN-END:variables
}
