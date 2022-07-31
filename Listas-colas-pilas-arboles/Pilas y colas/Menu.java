package Taller;

import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {
        String menu = "1. Apilar\n2. Desapilar\n3. Mostrar Pila\n4. Encolar\n"
                + "5. Desencolar\n6. Mostrar Datos de la Cola\n"
                + "7.Pasar un Dato de pila a cola\n8. Pasar un dato de cola a pila\n0. Salir";
        int opc = 0;
        int dato;
        int tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño\n de la pila y cola"));
        Pila colaPila=new Pila(tam);

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, menu + "\nIngrese una opción", "Menu Principal", JOptionPane.INFORMATION_MESSAGE));
            switch (opc) {
                case 1:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dato a insertar"));
                    colaPila.apilar(dato);
                    break;
                case 2:
                    colaPila.desapilar();
                    break;
                case 3:
                    colaPila.MostrarPila();
                    break;
                case 4:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dato a insertar"));
                    colaPila.encolar(dato);
                    break;
                case 5:
                    colaPila.desencolar();
                    break;
                case 6:
                    colaPila.mostrarCola();
                    break;
                case 7:
                    colaPila.PasarDepilaACola();
                    break;
                case 8:
                   colaPila.PasarDeColaAPila();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida");
            }

        } while (opc != 0);
    }
}
