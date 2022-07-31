package Secuencias_Streams_Flujos_datos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Leer_escribir_Byte {

    public static void main(String[] args) {
        //conocer cuantos byte hay
        int cont = 0;
        //crear array para guardar los datpos
        int array[] = new int[5933];
        
        try {
            FileInputStream archivo = new FileInputStream("src/Secuencias_Streams_Flujos_datos/descarga.png");

            boolean final_ = false;

            while (!final_) {//mientras se a flase
                int byte_entrada = archivo.read();//lee byte a byte el archivo
                if (byte_entrada != -1) {
                    array[cont] = byte_entrada;
                } else {
                    final_ = true;
                }
                /*if (byte_entrada==-1) { 
                    final_=true;//indica que ha llegado alfinal del archivo
                }*/

                System.out.println(array[cont]);//se almacenan los byte que va lellendo
                cont++;
            }
            System.out.println("Bytes: " + cont);
            archivo.close();
        } catch (IOException e) {
            System.out.println("No se pudo leer archivo");
        }
        crearCopia(array);
        
    }

    static void crearCopia(int dat[]) {
        try {
            FileOutputStream archivoNuevo = new FileOutputStream("src/Secuencias_Streams_Flujos_datos/descarga_copia.png");
            for (int i = 0; i < dat.length; i++) {
                archivoNuevo.write(dat[i]);
            }
            archivoNuevo.close();
        } catch (IOException e) {
            System.out.println("Error al crear copia");
        }
    }
}
