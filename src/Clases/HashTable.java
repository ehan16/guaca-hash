
package Clases;

import Ventanas.*;
import javax.swing.JOptionPane;

/**
 * @author Han, Serrano, Villegas
 */

public class HashTable {
    
    private Palabra[] palabrasClaves = new Palabra[400];
    private Documento[] documentos = new Documento[50];

    //Constructor de la clase
    public HashTable(){
    }
    
    //Metodos de la clase
    
    //En caso de que se necesite una hashtable mas grande
    public void expandSizePalabra(){
        
        Palabra[] aux = new Palabra[this.palabrasClaves.length*2];
        
        for (int i = 0; i < this.palabrasClaves.length; i++) {
            
            if(this.palabrasClaves[i] != null){
                
                aux[i] = this.palabrasClaves[i];
                
            }
            
        }
        
        setPalabrasClaves(aux);
        
    }
    
    //En caso de que se necesite una hashtable mas grande 
    public void expandSizeDocumento(){
        
        Documento[] aux = new Documento[this.documentos.length*2];
        
        for (int i = 0; i < this.documentos.length; i++) {
            
            if(this.documentos[i] != null){
                
                aux[i] = this.documentos[i];
                
            }
            
        }
        
        setDocumentos(aux);
        
    }
    
    //Metodo para insertar un documento
    public void insertarDocumento(int indice, Documento doc){
        
        //Se valida si el indice es valido
        if(this.esValidoDoc(indice)){
        
            if(ProyectoHash.hash.getDocumentos()[indice] != null){
            
                //Se verifica si ese indice ya se encuentra ocupado
                
                if(ProyectoHash.hash.getDocumentos()[indice].getTitulo().equalsIgnoreCase(doc.getTitulo())){
            
                //Se verifica si ya existe el documento
                JOptionPane.showMessageDialog(null, "ERROR: Ya existe el documento", "ERROR", JOptionPane.WARNING_MESSAGE);
            
                } else {
                    
                    //Se hace el manejo de colisiones
                    do {
                    
                        indice++;
                        
                    } while (ProyectoHash.hash.getDocumentos()[indice] != null && (indice < ProyectoHash.hash.getDocumentos().length));
                    
                    insertarDocumento(indice, doc);
                
                }
            
            } else {
            
                //Si no, se agrega el documento a la hashtable
                ProyectoHash.hash.getDocumentos()[indice] = doc;
                ManejoDocumentos.modelDocumentos.addElement(doc.getTitulo()); //Se agrega el nombre del resumen
                JOptionPane.showMessageDialog(null, "Se ha agregado el documento de manera exitosa", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            
            }
        
        } else {
            
            //Si no, se expande el tamano de la hashtable y se intenta insertar otra vez
            expandSizeDocumento();
            insertarDocumento(indice, doc);
            
        }
        
    }
    
    //Metodo para insertar una palabra
    public void insertarPalabra(int indice, Palabra pal){
        
        //Se valida si el indice es valido
        if(this.esValidoPalabra(indice)){
           
            if(ProyectoHash.hash.getPalabrasClaves()[indice] != null){  //Se verifica si ese indice ya se encuentra ocupado
            
                if(ProyectoHash.hash.getPalabrasClaves()[indice].getPalabra().equalsIgnoreCase(pal.getPalabra())){
            
                //Se verifica si ya existe la palabra o no 
                JOptionPane.showMessageDialog(null, "ERROR: Ya existe la palabra clave", "ERROR", JOptionPane.WARNING_MESSAGE);
            
                } else {
                
                    //Se hace el manejo de colisiones en caso de que no es palabra repetida
                    do {
                    
                        indice++;
                        
                    } while (ProyectoHash.hash.getPalabrasClaves()[indice] != null && (indice < ProyectoHash.hash.getPalabrasClaves().length));
                    
                    insertarPalabra(indice, pal);
                
                }
            
            } else {
            
                //Si no, se agrega la palabra
                ProyectoHash.hash.getPalabrasClaves()[indice] = pal;
                ManejoPalabras.modelPalabras.addElement(pal.getPalabra());
                JOptionPane.showMessageDialog(null, "Se ha agregado la palabra de manera exitosa", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            
            }
            
        } else {
            
            //Si no, se expande el tamano de la hashtable y se intenta insertar otra vez
            expandSizePalabra();
            insertarPalabra(indice, pal);
            
        }
        
    }
    
    //Funciones hash
    
    //Metodo que le asignara a cada palabra su indice
    public static int hashPalabra(String palabra){
        
        palabra = palabra.toLowerCase(); //Se transforma todo a minusculas para tener consistencia
        
        int hash = 7; //Este sera el "codigo" que diferenciara la palabra
        
        
        for (int j = 1; j <= palabra.length(); j++) {
                
                hash = hash + (palabra.charAt(j-1)*j);
                
        }
        
        hash = hash%379;
        
        return hash;
        
    }
    
    //Metodo que le asignara a cada titulo su indice
    public static int hashDocumento(String titulo){
        
        titulo = titulo.toLowerCase(); //Se transforma todo a minusculas para tener consistencia
        titulo = titulo.replaceAll("\\s+", "");
        
        int hash = 7; //Este sera el "codigo" que diferenciara la palabra
        
        for (int j = 1; j <= titulo.length(); j++) {
                
                hash = hash + (titulo.charAt(j-1)*j);
                
        }
        
        hash = hash%31;
        
        return hash;
        
    }
    
    //Para verificar si el indice es valido o no 
    public boolean esValidoDoc(int indice){
        
        return (indice >= 0 && indice < this.documentos.length);
        
    }
    
    //Para verificar si el indice es valido o no 
    public boolean esValidoPalabra(int indice){
        
        return (indice >= 0 && indice < this.palabrasClaves.length);
        
    }
    
    
    
    
    public int charToAscii(char letter){
        int asciiValue = letter;
        return asciiValue;
    }
    
    /**
     * Convertir una palabra a codigo Ascii
     * @param word
     * @return asciiValueWord
     */
    public int wordToAscii(String word) {
        int acum = 0;
        for (int i = 0; i < word.length(); i++) {
            if ((64 < charToAscii(word.charAt(i)) && charToAscii(word.charAt(i)) < 91) || (96 < charToAscii(word.charAt(i)) && charToAscii(word.charAt(i)) < 123)) {
                acum = acum + charToAscii(word.charAt(i));
            }
        }
        return acum;
    }
    
    /**
     * Asignar el indice de la palabra clave donde se agregará en el HashTable
     * @param word
     * @param vector
     * @return index
     */
    public int newPosition(String word, int tam){
        int index = wordToAscii(word) % tam;
        return index;
    }
    
    //Setters de la clase
    public void setPalabrasClaves(Palabra[] palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
    }

    public void setDocumentos(Documento[] documentos) {
        this.documentos = documentos;
    }

    public Palabra[] getPalabrasClaves() {
        return palabrasClaves;
    }

    public Documento[] getDocumentos() {
        return documentos;
    }
    
}
