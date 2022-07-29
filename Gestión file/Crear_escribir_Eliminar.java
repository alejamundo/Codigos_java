
package MnipularSistema_Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Crear_escribir_Eliminar {
    public static void main(String[] args) {
        //crear un directorio
        //File ruta=new File("src/nuevodir");
        //crear un fichero
        File ruta=new File("src/nuevodir/prueba.txt");
        String archivo_destino=ruta.getAbsolutePath();//almacenado la ruta de la carpeta
        try {
            //ruta.mkdir();
            ruta.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Crear_escribir_Eliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
        //escribir en el archivo
        //Escribiendo accede=new Escribiendo();
        //accede.escribir(archivo_destino);//ruta carpeta 
    }
    class Escribiendo{
        public void escribir(String ruta){
            String frse="Ejemplo uno";
            try {
                FileWriter escritura=new FileWriter(ruta);
                for (int i = 0; i < frse.length(); i++) {
                    escritura.write(frse.charAt(i));
                }
                escritura.close();
            } catch (Exception e) {
            }
        }
    }
}
