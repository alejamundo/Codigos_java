package exepciones;

import java.util.Scanner;

public class Exepciones {

    public static void main(String[] args) {
        System.out.println("1.Introducir datos");
        System.out.println("2. Salir");
        Scanner tc = new Scanner(System.in);
        try {
            int opc = tc.nextInt();
            try {
               datos(opc);//si un metodo ranza una exepcion es mejor aggarrarla desde el nombramiento del metodo 
            } catch (Exception e) {
                System.out.println("Error al ingresar datos");
            }
            
        } catch (Exception e) {
            System.out.println("error opcion invalida");
        }
        System.out.println("Hemos terminado");
        

    }

    //le digo que genera un error no comprobada
    static void datos(int opc) throws Exception {
        Scanner tc = new Scanner(System.in);
        if (opc == 1) {
            //try {
                System.out.println("Ingresa tu nombre");
                String nombre = tc.next();
                System.out.println("Ingresa la edad: ");
                int edad = tc.nextInt();
            //} catch (InputMismatchException e) {///exeption mas generico
                System.out.println("Error, al introducir datos");
            //}

        } else if (opc == 2) {
            System.exit(0);
        } else {
            System.out.println("Error opción no valída");
        }
    }
}
