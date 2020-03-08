package Clases;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Han, Serrano, Villegas
 */

public class Archivero {
    
    public Archivero(){
    }
    
    public void leerPalabrasClaves(File file){
        
        try{
            
            //Se crean las variables respectivas para la lectura de archivos
            FileReader reader = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(reader);
            String line;
            
            while((line = buffReader.readLine()) != null){
                
                String[] palabras = line.split(","); //Se separan las palabras tomando como indicador la coma
                
                for (int i = 0; i < palabras.length; i++) {
                    
//                    palabras[i] = palabras[i].replaceAll("[^\\w]", ""); //Validacion para eliminar cualquier caracter especial que no sea ni letra ni numero
                    palabras[i] = palabras[i].replace("'", "");
                    palabras[i] = palabras[i].replace("`", "");
                    palabras[i] = palabras[i].replace("´", "");    
                    
                }

                //Ahora se procede a llenar la hashtable con las palabras de la linea
                
                for (int i = 0; i < palabras.length; i++) {
                    
                    int hash = HashTable.hashPalabra(palabras[i]); //Se llama a la funcion hash de las palabras
                    ProyectoHash.hash.insertarPalabra(hash, new Palabra(palabras[i])); //Se llena la hashtable
                    
                }
                
            }
            
            buffReader.close(); //Se cierra el reader
            
        } catch(IOException e){
            
            JOptionPane.showMessageDialog(null, "ERROR: no se pudo leer el archivo. \nIntente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
            //En caso de que se genere algun error a la hora de leer el archivo
            
        } 
        
    }
    
    public void leerResumen(File file){
        
        try{
            
            FileReader reader = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(reader);
            String line;
            
            String titulo = "", resumen = "";
            ArrayList<String> autores = new ArrayList();
            
            //Primero se lee el titulo del documento
            while ((line = buffReader.readLine()) != null && !(line.equalsIgnoreCase("Autores"))){
                
                titulo = titulo + line + " ";
                
            }
            
            //Despues se guardan los autores del documento
            while ((line = buffReader.readLine()) != null && !(line.equalsIgnoreCase("Resumen")) && !(line.equalsIgnoreCase("Autores"))){
                
                System.out.println(line);
                autores.add(line);
                
            }
            
            //Despues se guarda el cuerpo del resumen
            while ((line = buffReader.readLine()) != null && !(line.equalsIgnoreCase("Resumen"))){
                
                resumen = resumen + line + " ";
                
            }
            
            //Se crea el documento con los datos recolectados
            Documento doc = new Documento(titulo, autores, resumen);
            
            //Se llama la funcion hash para introducirlo en la hashtable
            int hash = HashTable.hashDocumento(titulo);
            
            ProyectoHash.hash.insertarDocumento(hash, doc); //Se inserta en la hashtable
            
            buffReader.close(); //Se cierra el reader   
            
        } catch(IOException e){
            
            JOptionPane.showMessageDialog(null, "ERROR: no se pudo leer el archivo. \nIntente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
            //En caso de que se genere algun error a la hora de leer el archivo
            
        } 
        
    }
    
    //Metodo para crear el archivo de un solo resumen, por lo que se pasa por parametro el indice hash del documento que se desea crear
    public void crearResumen(int indice, String nombreArchivo){
        
        try{
            
//            //Se crea una variable auxiliar que contendrá el nombre como desea llamar el archivo
//            String nombreArchivo;
//
//            nombreArchivo = JOptionPane.showInputDialog(null, "¿Cómo desea llamar el archivo de texto. \nSi se deja el campo vacío, se llamará MyDoc.", "Archivo", JOptionPane.INFORMATION_MESSAGE );
//            //Se le da la potestad al usuario de elegir el nombre del archivo, obviamente no puede estar vacio el nombre
            
            if((nombreArchivo != null)){
            //Verificacion por si el usuario ha oprimido el boton de cancelar 
            
                if(nombreArchivo.equalsIgnoreCase("")) nombreArchivo = "MyDoc"; //Como se ha dicho, si el campo es vacio, se llamara MyDoc
            
                //Se utilizan las librerias de Java pertinentes para la escritura de datos en un archivo de texto
                FileWriter write = new FileWriter(nombreArchivo+".txt");
                BufferedWriter buffWriter = new BufferedWriter(write);
            
                //Se escribe el titulo del documento
                buffWriter.write(ProyectoHash.hash.getDocumentos()[indice].getTitulo());
                buffWriter.newLine();
                
                //Se procede a introducir a los autores
                buffWriter.write("Autores");
                buffWriter.newLine();
                
                for (int i = 0; i < ProyectoHash.hash.getDocumentos()[indice].getAutores().size(); i++) {
                    
                    buffWriter.write(ProyectoHash.hash.getDocumentos()[indice].getAutores().get(i));
                    buffWriter.newLine();
                    
                }
                
                //Finalmente con el cuerpo del resumen
                buffWriter.write("Resumen");
                buffWriter.newLine();
                
                //Se obtienen todas las palabras del resumen
                String[] cuerpo = ProyectoHash.hash.getDocumentos()[indice].getResumen().split(" ");
                
                for (int i = 1; i <= cuerpo.length; i++) {
                    
                    if(i%16 == 0){
                        
                        buffWriter.write(cuerpo[i-1]);
                        buffWriter.newLine(); //Si se llega a la cantidad deseada de palabras por linea, se va a la siguiente
                        
                    } else {
                    
                        buffWriter.write(cuerpo[i-1]+" "); //Se va escribiendo cada palabra
                    
                    }
                    
                }
            
                buffWriter.close(); //Se tiene que finalizar el escritor 
            
                JOptionPane.showMessageDialog(null, "Se ha creado el archivo de texto plano de manera exitosa", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                //Se le informa al usuario que se pudo realizar de manera exitosa el archivo deseado
                
            } else {
                
                //Por si el usuario ya no desea crear el archivo
                JOptionPane.showMessageDialog(null, "Se ha cancelado la seleccion", "AVISO", JOptionPane.WARNING_MESSAGE);
                
            }
            
        } catch (IOException e){
            
            JOptionPane.showMessageDialog(null, "ERROR: no se pudo crear el archivo. \nIntente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
            //En caso de que se genere algun error a la hora de crear el archivo
            
        } 
        
    }
    
    public void crearPalabrasClaves(){
        
        try{
            
            //Se crea una variable auxiliar que contendrá el nombre como desea llamar el archivo
            String nombreArchivo;

            nombreArchivo = JOptionPane.showInputDialog(null, "¿Cómo desea llamar el archivo de texto. \nSi se deja el campo vacío, se llamará MyWords.", "Archivo", JOptionPane.INFORMATION_MESSAGE );
            //Se le da la potestad al usuario de elegir el nombre del archivo, obviamente no puede estar vacio el nombre
            
            if((nombreArchivo != null)){
            //Verificacion por si el usuario ha oprimido el boton de cancelar 
            
                if(nombreArchivo.equalsIgnoreCase("")) nombreArchivo = "MyWords"; //Como se ha dicho, si el campo es vacio, se llamara MyFile
            
                //Se utilizan las librerias de Java pertinentes para la escritura de datos en un archivo de texto
                FileWriter write = new FileWriter(nombreArchivo+".txt");
                BufferedWriter buffWriter = new BufferedWriter(write);
            
                //Se van escribiendo las palabras una por una, con sus comillas simples y comas
                for (int i = 1; i <= ProyectoHash.hash.getPalabrasClaves().length; i++) {
                 
                    if(i%5 == 0){
                        
                        if(ProyectoHash.hash.getPalabrasClaves()[i-1] != null){
                        
                            //Una vez que se llegue a la cantidad deseada de palabras por linea, se salta a la siguiente linea
                            buffWriter.write("'"+ProyectoHash.hash.getPalabrasClaves()[i-1]+"'");
                            buffWriter.newLine();
                            
                        }
                        
                    } else {
                    
                        if(ProyectoHash.hash.getPalabrasClaves()[i-1] != null){
                        
                            //En lo contrario, se seguira escribiendo palabras
                            buffWriter.write("'"+ProyectoHash.hash.getPalabrasClaves()[i-1]+"',"); 
                    
                        }
                        
                    }
                    
                }
            
                buffWriter.close(); //Se tiene que finalizar el escritor 
            
                JOptionPane.showMessageDialog(null, "Se ha creado el archivo de texto plano de manera exitosa", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                //Se le informa al usuario que se pudo realizar de manera exitosa el archivo deseado
                
            } else {
                
                //Por si el usuario ya no desea crear el archivo
                JOptionPane.showMessageDialog(null, "Se ha cancelado la seleccion", "AVISO", JOptionPane.WARNING_MESSAGE);
                
            }
            
        } catch (IOException e){
            
            JOptionPane.showMessageDialog(null, "ERROR: no se pudo crear el archivo. \nIntente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
            //En caso de que se genere algun error a la hora de crear el archivo
            
        } 
        
    }
    
}
