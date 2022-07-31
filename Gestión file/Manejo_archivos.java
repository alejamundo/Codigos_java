
package Gui_Utiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Alejandra Orrego
 */
public class Manejo_archivos {
    public static void main(String[] args) throws IOException {
        
        //creo un objeto tipo archivo el cual e creado previamente
        File archivo=new File("src/Archivos_txt/Manejo_Archivos.txt");
        //avriguamos si el archivo existe
        System.out.println("Existe: "+archivo.exists());
        //si se puede leer y escribir
        System.out.println("Se puede leer: "+archivo.canRead());
        System.out.println("se Puede escribir: "+archivo.canWrite());
        
        FileWriter archivo1=null;
        PrintWriter escritor=null;
        
        try {
            archivo1=new FileWriter("src/Archivos_txt/Generado_java.txt");
            escritor=new PrintWriter(archivo1);
            escritor.println("Alejandra");
            escritor.print("Orrego");
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }finally{
            archivo1.close();
        }
        
        
        
           
    }
}
