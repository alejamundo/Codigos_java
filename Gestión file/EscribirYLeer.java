package MnipularSistema_Archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EscribirYLeer {

    public static void main(String[] args) {
        //escribir en archivo de texto
        int[][] numeros = {{1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25}};
        var archivo = "src/MnipularSistema_Archivos/Numeros.txt";
        try {
            var salida = new PrintWriter(archivo);
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros[i].length; j++) {
                    salida.print(numeros[i][j] + ",");
                }
                salida.println("");
            }
            salida.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscribirYLeer.class.getName()).log(Level.SEVERE, null, ex);
        }
        //leer de archivos de texto
        String nombre = "src/MnipularSistema_Archivos/Numeros.txt";
        var archivo1 = new File(nombre);
        if (archivo1.exists()) {
            var lector = new Scanner(archivo);
            System.out.println("Números del archivo");
            while (lector.hasNext()) {
                var numeros1 = new StringTokenizer(lector.next(), ",");
                while (numeros1.hasMoreTokens()) {
                    System.out.print(numeros1.nextToken() + "\t");
                }
                System.out.println("");
            }
            lector.close();
        } else {
            System.out.println("¡El fichero no existe!");
        }

    }
}
