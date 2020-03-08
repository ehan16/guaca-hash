
package Clases;


import Ventanas.*;
import java.util.ArrayList;

/**
 *
 * @author Han, Serrano, Villegas
 */

public class ProyectoHash {
    
    public static HashTable hash = new HashTable();
    public static Main main = new Main();
    
    public static void main(String[] args) {
        
        Menu menu = new Menu();
        menu.setVisible(true);
        
        String cuerpo = "Los procesos de internacionalización y localización inciden directamente en la usabilidad de\n" +
"un sistema web al facilitar su adaptación a diferentes elementos culturales tales como la\n" +
"moneda, idioma, formato de fecha, sistema de medidas, entre otros. Algunos frameworks\n" +
"para aplicaciones web cuentan con soporte para dichos procesos. Sin embargo, en muchas\n" +
"ocasiones, la información sobre la arquitectura de los mecanismos utilizados en cada\n" +
"framework, así como su funcionamiento interno resulta insuficiente. La arquitectura de\n" +
"software se corresponde a visión abstracta de un sistema en la que se representan los\n" +
"componentes del mismo, el comportamieenfjsejnfnaskldefskekfksemfento de cada uno de dichos elementos y la forma en\n" +
"que se relacionan. Su uso adecuado conlleva a la disminución de lsdfsdfos costos de manutención\n" +
"del software, mayor facilidad en la toma de decisiones de diseño, dismisdnución de las fallas,\n" +
"entre otras ventajas. Por otra parte, la generación de una Arquitectura dfdsfsdfdsfsdfe Refesdfsdfsdfsdfsdfsrencia (AR), es\n" +
"el producto con mayor relevancia generasdasdasdasdascxzcsdfadado en la etapa de Análissdfsdfis del Dominio (sdfsdfsdfsdfAD), dentro\n" +
"de la denominada disciplina de Ingeniería del Dominio (ID), la cual tiene gran relevancia para\n" +
"el desarrollo de software basado en compoasfjasdjasdjasjdasdasdhahfkkfafjaefhaeuhfuhefuhajsflkadsadasdsnentes. En este tsdfsdfdsfsdrabajo, se aplica un AD,\n" +
"asumiendo un enfoque ascendente (“bottom-up”) sobre una muestra de frameworks de\n" +
"desarrollo para PHP, específicamente centrado en los mecanismos que cada framework\nfsdfdsf" +
"implementa para posibilitar la internacionalización y la localización en aplicaciones web. dsfsdfsdfsdfsdPara\n" +
"lograr lo anterior, se aplicó ingeniería inversa sobre las distintas arquitecturas sfdfsdfsfsfsdfsdfsdfsdfsdfsdfefheiuwhfre ejtei uehugheuhgfuew equ fieuqhf iuewiurwurieifeifgiweitw uwe iw4iwiwiuf hweiurfweirweir weu ww efuewruweiurfwiehfiwehrhweurweroey se modelaron\n" +
"en UML. Del análisis de las variantes e invariantes de las mismas, se obtuvo una\n" +
"Arquitectura de Referencia para un subsistema de internacionalización y localización. Si bien\n" +
"la muestra de arquitecturas analizadas en este trabajo se circunscriben a frameworks de\n" +
"desarrollo en PHP, la Arquitectura de Referencia obtenida puede ser considerada de carácter\n" +
"genérico, con el suficiente nivel de abstracción de manera que pueda ser asumida como una\n" +
"arquitectura base sobre la cual comenzar un desarrollo basado en componentes; sin\n" +
"embargo, su validación puede realizarse a través de la ampliación de la muestra inicial de\n" +
"frameworks seleccionados y el análisis de las posibles variantes que puedan generarse. No\n" +
"obstante, la Arquitectura de Referencia obtenida en este ejercicio de Análisis de Dominio\n" +
"puede utilizarse como referente  dentro de una organización para evaluar la mejor opción al\n" +
"momento de seleccionar la alternativa arquitectónica más robusta al considerar un conjunto\n" +
"de frameworks de desarrollo. ";
        
        
        
        
//        cuerpo = cuerpo.replaceAll("[^\\w]", " "); //Se eliminan todos los caracteres especiales, sustituyendolos por espacios
        cuerpo = cuerpo.replaceAll("[\\”“,.():;]", " ");
//        cuerpo = cuerpo.replaceAll("\\“", "");
//        cuerpo = cuerpo.replaceAll("\\”", "");
//        cuerpo = cuerpo.replaceAll("[\\()]", " ");
//        cuerpo = cuerpo.replaceAll("[\\-]", " ");
//        cuerpo = cuerpo.replaceAll("[\\.]", " ");
        String[] cuerpito = cuerpo.split("\\s+"); //Se separan las palabras por los espacios
        
        
//        hash.getDocumentos()[1] = null;
//        
//        System.out.println("Tamano de cuerpito es "+cuerpito.length);
//        



    JenkinsHash jh = new JenkinsHash();
//        
        for (int i = 0; i < cuerpito.length; i++) {

            int hash = 7;
            int h = 1;
            
            for (int j = 1; j <= cuerpito[i].length(); j++) {
                
                hash = hash + (cuerpito[i].charAt(j-1)*j);
//                hash = cuerpito[i].charAt(j-1) + (hash<<6) + (hash<<16) - hash;
                h = h*33 + cuerpito[i].charAt(j-1);
                
            }
            
//            System.out.println(hash%31);
            System.out.println("RICARDO COMPRAME UNA DONA");
            System.out.println(cuerpito[i] + " " + hash%379);
            System.out.println(cuerpito[i] + " " + h);
                        
            int pc = jh.hash32(cuerpito[i].getBytes());

            System.out.println(cuerpito[i] + " " + Integer.toHexString(pc));
                        
        }
//        


                System.out.println("para" + HashTable.hashPalabra("para"));

        System.out.println("pero" + HashTable.hashPalabra("pero"));







//        
//        for (int i = 0; i < cuerpito.length; i++) {
//            
//            System.out.println(hash.newPosition(cuerpito[i], 50));
//            
//        }
//        
        




//    for (int i = 0; i < cuerpito.length; i++) {
//
//            int hash = 0;
//            
//            for (int j = 0; j < cuerpito[i].length(); j++) {
//                
////                hash = hash + (int) (Math.pow(cuerpito[i].charAt(j), j));
//          
//                     hash += cuerpito[i].charAt(j)<<(5*i);
//                     
//                
//            }
//            
////            System.out.println(hash%31);
//                        System.out.println("RICARDO COMPRAME UNA DONA");
//                        System.out.println(hash);
//        }
//        
        
//        int[] vector = new int[2];
//        
//        for (int i = 0; i < vector.length; i++) {
//            
//            System.out.println(vector[i]);
//            
//            
//        }
        
        
        String prueba = "'hoal'";
        System.out.println(prueba);
        prueba = prueba.replaceAll("\'", "");
        System.out.println(prueba);
        
        ArrayList<String> hola = new ArrayList();
        hola.add("Hola");
        hola.add("hehe");
        
        System.out.println(hola.toString());
        
                
        
        
        
    }
    
}


class JenkinsHash {

    /**
     * Default constructor.
     */
    public JenkinsHash() {
    }

    /**
     * Returns a 64-bit hash value.
     *
     * @return 64-bit hash value
     */
    public long hash64(byte[] input) {
        int pc = 0;
        int pb = 0;

        return hash(input, input.length, pc, pb, false);
    }

    /**
     * Returns a 32-bit hash value.
     *
     * @return 32-bit hash value
     */
    public int hash32(byte[] input) {
        int pc = 0;
        int pb = 0;

        return (int) hash(input, input.length, pc, pb, true);
    }

    /**
     * Calculate a 32-bit hash value, using the method signature and parameters matching those of the original Lookup3.c#hashLittle method.
     *
     * @param input  The data.
     * @param length The number of elements (starting from index 0) from the input array to calculate the hash on.
     * @param pc     The offset for the hash for incremental hashes or {@code 0} for a new hash.
     *
     * @return 32-bit hash value.
     */
    public int hashLittle(byte[] input, int length, int pc) {
        return (int) hash(input, length, pc, 0, true);
    }

    /**
     * Calculate a 64-bit hash value, using the method signature and parameters matching those of the original Lookup3.c#hashLittle2 method.
     *
     * @param input  The data.
     * @param length The number of elements (starting from index 0) from the input array to calculate the hash on.
     * @param pc     The offset for the hash for incremental hashes or {@code 0} for a new hash.
     * @param pb     The offset for the hash for incremental hashes or {@code 0} for a new hash.
     *
     * @return 64-bit hash value.
     */
    public long hashLittle2(byte[] input, int length, int pc, int pb) {
        return hash(input, length, pc, pb, false);
    }

    /**
     * Hash algorithm.
     *
     * @param k           message on which hash is computed
     * @param length      message size
     * @param pc          primary init value
     * @param pb          secondary init value
     * @param is32BitHash true if just 32-bit hash is expected.
     *
     * @return
     */
    private long hash(byte[] k, int length, int pc, int pb, boolean is32BitHash) {
        int a, b, c;

        a = b = c = 0xdeadbeef + length + pc;
        c += pb;

        int offset = 0;
        while (length > 12) {
            a += k[offset + 0];
            a += k[offset + 1] << 8;
            a += k[offset + 2] << 16;
            a += k[offset + 3] << 24;
            b += k[offset + 4];
            b += k[offset + 5] << 8;
            b += k[offset + 6] << 16;
            b += k[offset + 7] << 24;
            c += k[offset + 8];
            c += k[offset + 9] << 8;
            c += k[offset + 10] << 16;
            c += k[offset + 11] << 24;

            // mix(a, b, c);
            a -= c;
            a ^= rot(c, 4);
            c += b;
            b -= a;
            b ^= rot(a, 6);
            a += c;
            c -= b;
            c ^= rot(b, 8);
            b += a;
            a -= c;
            a ^= rot(c, 16);
            c += b;
            b -= a;
            b ^= rot(a, 19);
            a += c;
            c -= b;
            c ^= rot(b, 4);
            b += a;

            length -= 12;
            offset += 12;
        }

        switch (length) {
            case 12:
                c += k[offset + 11] << 24;
            case 11:
                c += k[offset + 10] << 16;
            case 10:
                c += k[offset + 9] << 8;
            case 9:
                c += k[offset + 8];
            case 8:
                b += k[offset + 7] << 24;
            case 7:
                b += k[offset + 6] << 16;
            case 6:
                b += k[offset + 5] << 8;
            case 5:
                b += k[offset + 4];
            case 4:
                a += k[offset + 3] << 24;
            case 3:
                a += k[offset + 2] << 16;
            case 2:
                a += k[offset + 1] << 8;
            case 1:
                a += k[offset + 0];
                break;
            case 0:
                return is32BitHash ? c : ((((long) c) << 32)) | ((long) b &0xFFFFFFFFL);
        }

        // Final mixing of thrree 32-bit values in to c
        c ^= b;
        c -= rot(b, 14);
        a ^= c;
        a -= rot(c, 11);
        b ^= a;
        b -= rot(a, 25);
        c ^= b;
        c -= rot(b, 16);
        a ^= c;
        a -= rot(c, 4);
        b ^= a;
        b -= rot(a, 14);
        c ^= b;
        c -= rot(b, 24);

        return is32BitHash ? c : ((((long) c) << 32)) | ((long) b &0xFFFFFFFFL);
    }

    long rot(int x, int distance) {
        return (x << distance) | (x >>> (32 - distance));
        // return (x << distance) | (x >>> -distance);
    }
}
