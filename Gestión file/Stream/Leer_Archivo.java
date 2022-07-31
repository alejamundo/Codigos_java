package Secuencias_Streams_Flujos_datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Leer_Archivo {

    public static void main(String[] args) {
        Leer acces = new Leer();
        acces.lee();
    }
}

class Leer {

    FileReader entrada;

    //decir donde se encuentra el fichero
    //Reader/inputStreamReader (puente entre string y byte, decodifica de straing a bytes)/fileReader
    public void lee() {

        try {
            entrada = new FileReader("src/Secuencias_Streams_Flujos_datos/File.txt");
            BufferedReader mibuffer = new BufferedReader(entrada);
            String line = "";
            while (line != null) {
                //readLine: retorno linea y de carro
                line = mibuffer.readLine();//lee la linea
                if (line != null) {
                    System.out.println(line);
                }

            }
            //debemos capcturar la exepcion
            //read()/IOexception/si tenemos -1 es porque termino de leer
            // int c = 0;//almacenar los numeros de las pocisiones leidas en c
            //con un while
            /*while (c != -1) {   //mientras no llegue al final             
                c = entrada.read();//imprime unicode
                //castiar datos
                char letra = (char) c;
                //System.out.println(c);
                System.out.print(letra);
            }*/

        } catch (IOException ex) {
            System.out.println("Error al leer archivo");
        } finally {
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
