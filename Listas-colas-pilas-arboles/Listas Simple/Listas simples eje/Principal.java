package Listaejemplos;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        String opcion;
        int op, valor, x;
        ListaD l;
        l = new ListaD();
        do {
            opcion = JOptionPane.showInputDialog("Menu de opciones Lista Doble\n"
                    + "1. Insertar al inicio\n"
                    + "2. Insertar al final\n"
                    + "3. Crear Lista Aleatoria\n"
                    + "4. Buscar un valor X y traer valor anterior\n"
                    + "5. Mostrar Lista \n"
                    + "6. Borrar un valor X \n"
                    + "7. Ordenacion\n"
                    + "8. Capicua\n"
                    + "9. Intercambio inicio con final (intervalos 2 en 2)\n"
                    + "10. Suma extremos con un valor buscado\n"
                    + "11. Buscar mayor- contar pares izq y contar impares a la der\n"
                    + "12. Buscar un valor X y retorna (v-f)\n"
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
                    l.generarNodosAleatorios();
                    break;
                case 4:
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Da el valor a buscar"));
                    JOptionPane.showMessageDialog(null, "el valor anterior " + l.buscarX(valor));
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, l.mostrar());
                    break;
                case 6:
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Da el valor que quieres borrar"));
                    l.elimNodoX(valor);
                case 7:

                    //l.buscarReemplazar(valor1,valor2);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "la lista es capicua : " + l.capicua());
                    break;
                case 9:
                    l.interiniult();
                    break;
                case 10:
                    x = Integer.parseInt(JOptionPane.showInputDialog("Da el valor a buscar"));
                    l.sumaExtremos(x);
                    break;
                case 11:
                    l.buscarMy_par_imp();
                    break;
                case 12:
                    x = Integer.parseInt(JOptionPane.showInputDialog("Da el valor a buscar"));
                    JOptionPane.showMessageDialog(null,"el buscar retorna "+l.buscarValor(x));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error la opcion no existe");

            }//fin case
        } while (op != 20);
    }
}