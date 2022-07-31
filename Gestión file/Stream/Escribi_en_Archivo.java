package Secuencias_Streams_Flujos_datos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Escribi_en_Archivo {

    public static void main(String[] args) {
        write acces = new write();
        acces.escribir();
    }
}

class write {

    public void escribir() {
        //String frase = "\nNO pares de aprender";
        try {
            //File writer leer para escribir sino tubiera el archivo lo crea
            FileWriter escritura = new FileWriter("src/Secuencias_Streams_Flujos_datos/File.txt",true);
            BufferedWriter bw = new BufferedWriter(escritura);
            for (int x = 0; x < 10; x++) {
                bw.write("Fila numero " + x + "\n");
            }
            //con otro parameytro true  sobreescribe la frase 
            /*for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));//que vaya anotando caracter por caracter
            }*/
            escritura.close();
        } catch (IOException ex) {
            Logger.getLogger(write.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
