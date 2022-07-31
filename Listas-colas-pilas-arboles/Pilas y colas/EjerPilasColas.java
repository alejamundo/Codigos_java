package ejerpilascolas;

import javax.swing.*;

public class EjerPilasColas extends Operaciones{

    public static void main(String[] args) {
        int op,valor;
        Cola c = new Cola();
        Pila p = new Pila();

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu de opciones Pila\n"
                    + "1. Cantidad de elementos\n"
                    + "2. Invertir pila y cola\n"
                    + "3. Busque y retire un valor X\n"
                    + "4. Insertar un valor en una posicion dada\n"
                    + "5. Convertir Pila en una Cola\n"
                    + "6. Mostrar pila y cola \n"
                    + "7. Crear pila y cola aleatoria\n"
                    + "8. Agregar elementos (Pila y Cola)\n"
                    + "9. Retira elementos (Pila y Cola)\n"
                    + "10. Salir"));

            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "cantidad de elementos cola " + c.ult);
                    JOptionPane.showMessageDialog(null, "cantidad de elementos pila " + p.tope);
                    break;
                case 2:
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Digite dato para la cola"));
                    c.encolar(valor);
                    invertirCola(c);
                    invertirPila(c);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Datos de la Cola\n" + c.mostrar());
                    JOptionPane.showMessageDialog(null, "Datos de la Pila\n" + p.mostrar());
                    break;
                case 7:
                    c.generarColaAleatoria();
                    p.PilaAleatoria();
                    break;
                case 8:
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Digite dato para la cola"));
                    int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite dato para la Pila"));
                    c.encolar(valor);
                    p.Apilar(valor1);
                    break;
                case 9:
                    c.descolar();
                    p.Desapilar();
                    break;
                case 0:System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error la opcion no existe");
            }
        } while (op != 0);

    }
}
