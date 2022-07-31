
package Secuencias_Streams_Flujos_datos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio2 {
    public static void main(String[] args) {
        String ruta="src/Secuencias_Streams_Flujos_datos/ejercicio2.txt";
        String texto="Hola mundo y bienvenidos al cursollo";
        escribirTxt(ruta,texto);
        
    }
    public static void escribirTxt(String ruta,String texto){
        try {
            //abro el archivo
            var f=new FileWriter(ruta,false);
            //abro stream entre el y la consola
            f.write(texto);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void mostrarMayus(String ruta){
        try {
            //abro el archivo a leer
            var f=new FileReader(ruta);
            //leo con char
            int con=f.read();
            String salida="";
            while (con!=-1) {                
                salida+=(char)con;
            }
            f.close();
            System.out.println(salida);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
