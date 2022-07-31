package Secuencias_Streams_Flujos_datos;

import java.io.IOException;

public class EstradaSalida {

    public static void main(String[] args) {
        int bytes = 0;
        char caracter;
        System.out.println("\nEscribe un texto: ");
        System.out.println("");
        try {
            do {
                caracter = (char) System.in.read();
                System.out.print(caracter);
                bytes++;
            } while (caracter != '\n');
            System.err.printf("%d bytes leidos %n", bytes);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
