package MnipularSistema_Archivos;

import java.io.File;

public class GestionArchivos {

    public static void main(String[] args) {
        var f = new File("src/MnipularSistema_Archivos/prueba.txt");
        System.out.println("pathSeparator: " + File.pathSeparator);
        System.out.println("separator: " + File.separator);
        System.out.println("separatorChar: " + File.separatorChar);
        System.out.println("canRead():" + f.canRead());
        System.out.println("canWrite():" + f.canWrite());
        System.out.println("exists():" + f.exists());
        System.out.println("getName():" + f.getName());
        System.out.println("getParent():" + f.getParent());
        System.out.println("isDirectory():" + f.isDirectory());
        System.out.println("isFile():" + f.isFile());
        System.out.println("length():" + f.length());
    }
}
