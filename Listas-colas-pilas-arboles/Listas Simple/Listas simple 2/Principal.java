package listasSimples;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        String menu = "1. Mostrar\n"
                + "2. Insertar Inicio\n" + "3. Insertar final\n" + "4. Eliminar mayor\n" 
                + "5. Eliminar primer impar\n" +"6. Insertar despues del primero\n"
                + "7. Insertar antes del menor\n" + "8. Eliminar el ultimo si es segundo es par, sino insertar un dato al inicio de la lista\n"
                + "9. Insertar antes del ultimo\n"+"10. Eliminar los impares\n"+"11.Eliminar todos los nodos\n"
                + "12. Insertar antes de un dato de referencia\n"
                + "13. Para eliminar penultimo nodo\n" + "0. Para salir";
        int opcion = 0, dato;
        LISTA lsl = new LISTA();
        do {    
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu + "\nIngrese una opción"));
            switch (opcion) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    lsl.mostrar();
                    break;
                case 2:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a insertar"));
                    lsl.insertarInicio(dato);
                    break;
                case 3:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a insertar"));
                    lsl.insertarFinal(dato);
                    break;
                case 4:
                    lsl.eliminarMayor();

                    break;
                case 5:
                    lsl.eliminarPrimerImpar();
                    break;
                case 6:
                     dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a insertar"));
                    lsl.insertarDespuesPrimero(dato);
                    break;
                case 7:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a insertar"));
                    lsl.insertarAntesMenor(dato);
                    break;
                case 8:
                    lsl.segunEliminarInsertar();
                    break;
                case 9:
                     dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a insertar"));
                    lsl.insertarAntesUltimo(dato);
                    break;
                case 10:
                    lsl.eliminarImpares();
                    break;
                case 11:
                    lsl.EliminarTodos();
                    break;
                case 12:   
                    lsl.insertarAntesDeReferencia();
                    break;
                    
                case 13:
                    lsl.EliminarPenultimo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida", "Incorrecto", 0);
            }

        } while (opcion != 0);

    }

}
