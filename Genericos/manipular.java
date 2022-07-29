
package MnipularSistema_Archivos;

import java.io.File;

public class manipular {
    public static void main(String[] args) {
        File ar=new File("src");//la crea en el dir donde estamos
        System.out.println(ar.getAbsolutePath());//muestra la ruta
        //System.out.println(ar.exists());//indica si existe o no
        String[]nombres_Archivos=ar.list();
        for (int i = 0; i < nombres_Archivos.length; i++) {
            System.out.println(nombres_Archivos[i]);
            //recorrer archivos y dirrectorios
            File f=new File(ar.getAbsolutePath(),nombres_Archivos[i]);
            //averiguar a que esta apuntando f
            if (f.isDirectory()) {
                String[]subcarpetas=f.list();
                for (int j = 0; j < subcarpetas.length; j++) {
                    System.out.println(subcarpetas[j]);
                }
            }
        }
    }
            
}
