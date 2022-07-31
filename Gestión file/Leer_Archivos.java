package Gui_Utiles;

import com.sun.source.tree.TryTree;
import java.io.BufferedReader;
import java.io.FileReader;

public class Leer_Archivos {

    public static void main(String[] args) {
        FileReader archivo;
        BufferedReader lector;

        try {
            archivo=new FileReader("src/Archivos_txt/Generado_java.txt");
            if (archivo.ready()) {
                lector=new BufferedReader(archivo);
                String cadena;
                while ((cadena=lector.readLine())!=null){
                    System.out.println(cadena);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

}
