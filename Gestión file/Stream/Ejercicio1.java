
package Secuencias_Streams_Flujos_datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio1 {
    public static void main(String[] args) throws FileNotFoundException {
        //creo el archivo
        final String nombre="src/Serealizable_toString/ejercicio1.txt";
        //var fichero=new FileOutputStream(nombre);
        try {
            //abro el archivo para leerlo
            var f=new FileReader(nombre);
            //leeo cuantas lineas de codiigo hay
            int cont=f.read();
            while (cont!=-1) {
                //como los espacios estan especificados con el 32 hacemos una condicios
                if (cont!=32){
                     System.out.println((char)cont);
                }
               
                //ago que vanace la variable read
                cont=f.read();
               
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
