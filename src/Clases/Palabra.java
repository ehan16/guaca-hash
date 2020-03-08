
package Clases;

import Ventanas.ManejoDocumentos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Han, Serrano, Villegas
 */

public class Palabra {

    private String palabra;
    private int frecuencia;
    private ArrayList<Integer> indiceDoc;
    
    public Palabra(String palabra){
        
        this.palabra = palabra;
        this.frecuencia = 0;
        this.indiceDoc = new ArrayList();
        
    }
    
    //Cada vez que se termine de analizar un documento, se vuelven a poner los valores originales de la frecuencia
    public static void reiniciarFrecuencia(Palabra[] palabras){
        
        for (int i = 0; i < palabras.length; i++) {
            
            if(palabras[i] != null){
                
                palabras[i].setFrecuencia(0); //Se settea la frecuencia de cada palabra
                
            }
            
        }
        
    }
    
    //Metodo para mostrar todos los documentos en los que aparece una palabra
    public void mostrarDocumentos(){
        
        //Para revisar todos los documentos
        for (int i = 0; i < ManejoDocumentos.modelDocumentos.getSize(); i++) {
            
            //Se obtiene el nombre del documento y se encuentra su codigo hash
            int hash = HashTable.hashDocumento(ManejoDocumentos.modelDocumentos.getElementAt(i).toString()); 
            
            String[] palabras = ProyectoHash.hash.getDocumentos()[hash].separarCuerpo(); //Se obtiene cada palabra del cuerpo
            
            for (String palabra1 : palabras) {
                
                //Se va comparando la palabra con cada palabra del cuerpo, cuando se encuentre la primera ocurrencia, se detiene
                if (palabra1.equalsIgnoreCase(this.palabra)) {
                    this.indiceDoc.add(hash);
                    break;
                }
                
            }
            
        }
        
        String doc = ""; //Variable auxiliar para tener los nombres de los documentos 
        
        for (int i = 0; i < indiceDoc.size() ; i++) {
            
            doc = doc + ProyectoHash.hash.getDocumentos()[indiceDoc.get(i)].toString() + "\n";
            
        }
        
        //Se muestra al usuario los documentos en el que aparece la palabra
        JOptionPane.showMessageDialog(null, "Documentos en los que aparece la palabra: \n" + doc, "Documentos", JOptionPane.INFORMATION_MESSAGE);
        
        //Se recorre el model, en cada documento se "analiza" y una vez que encuentre la primera ocurrencia, para, mete el indice
        //en indiceDoc y pasa al siguiente documento
        //Se muestran los documentos
        
        indiceDoc.clear(); //Se limpia la lista por cuestiones de la vida
        
    }
    
    @Override
    public String toString(){
        
        return palabra + ": " + frecuencia;
        
    }

    //Getters y setters
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

}
