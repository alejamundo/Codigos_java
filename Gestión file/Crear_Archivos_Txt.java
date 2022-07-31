
package Gui_Utiles;

import java.io.PrintWriter;

/**
 *
 * @author Alejandra Orrego
 */
public class Crear_Archivos_Txt {
    public static void main(String[] args) {
        try {
            //Crear un archivo en la ruta especificada,con formato de caracteres espesificado
            PrintWriter escribir = new PrintWriter("src/Archivos_txt/Creado_Con_printWrite");
            //Escribe en el archivo las dos lineas siguientes dejando un espacio al final de cada una
            escribir.println("Alejandra Orrego");
            escribir.println("Aloja");
            escribir.append("Amor");
            escribir.append("Locos");
            //Cierra la tramision de datos 
            escribir.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
