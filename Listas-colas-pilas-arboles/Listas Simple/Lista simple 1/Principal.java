package listas;

import javax.swing.*;
import java.util.*;


public class Principal {


    
    public static void main(String[] a) {

        String opcion;

        int op, valor;

        //instancia la clase lista 
        Lista l = new Lista();

        do {

            opcion = JOptionPane.showInputDialog("Menu de opciones\n"
                    + "1. Insertar al inicio\n"
                    + "2. Insertar al final\n"
                    + "3. Crear Lista Aleatoria\n"
                    + "4. Mostrar Lista \n"
                    + "5. Cantidad de Nodos\n"
                    + "6. Buscar un valor X \n"
                    + "7. Borrar un valor X \n"
                    + "8. Intercambiar Cabeza y Fin\n"
                    + "9. Contar pares \n"
                    + "10. Suma Impares \n"
                    + "11. Buscar X y reemplazar por Y \n"
                    + "12. Contar pares en Posiciones impares \n"
                    + "13. Invertir la lista \n"
                    + "14. Eliminar un nodo de la lista \n"
                    +"15. calcular producto\n"
                    + "20. Salir");

            op = Integer.parseInt(opcion);

            switch (op) {

                case 1:
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Da el valor a insertar"));
                    l.agregarInicio(valor);
                    break;
                case 2:
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Da el valor a insertar"));
                    l.agregarFinal(valor);
                    break;

                case 3:
                    l.asignarAleatorio();
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, l.mostrar());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, l.contar());
                    break;
                case 6:
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Da el valor que quieres borrar"));
                    l.buscarValor(valor);
                    break;

                case 7:

                    valor = Integer.parseInt(JOptionPane.showInputDialog("Da el valor que quieres borrar"));

                    l.eliminarNodo(valor); 
                    break;

                case 8:

                    l.intercambioCabFin();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "el numero de pares es " + l.contarPares());
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, "la suma de impares es " + l.sumarImpares());
                     int x=Integer.parseInt(JOptionPane.showInputDialog("Valor X a Buscar")); 
                     int y=Integer.parseInt(JOptionPane.showInputDialog("Valor Y : ")); 
                     l.buscarReemplazar(x,y); 
                    break;

                case 11:
                   // int x = Integer.parseInt(JOptionPane.showInputDialog("Valor X a Buscar"));
                    //int y = Integer.parseInt(JOptionPane.showInputDialog("Valor Y : "));
                    //l.buscarReemplazar(x, y);
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null, "la cantidad de pares ubicados en posiciones impares es " + l.contarParesPosImpares());
                    break;
                case 13:
                    l.invertir();
                    break;
                case 14:
                    y = Integer.parseInt(JOptionPane.showInputDialog("Digita Valor  a eliminar"));
                    l.eliminarNodo(y);
                    break;
                    
                case 15:
                   
                  //  1.productopares();
                    break;
                    
                default:

                    JOptionPane.showMessageDialog(null, "Error la opcion no existe");

            }//fin case 

        } while (op != 20);

    }// fin main 

}
