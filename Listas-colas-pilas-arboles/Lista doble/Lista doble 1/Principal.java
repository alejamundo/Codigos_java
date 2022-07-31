package Dobles;

import javax.swing.JOptionPane;

public class Principal {

    //Método principal
    public static void main(String[] args) {
        //creo los atributos que necesitare en la clase
        int dato;//para cuando voy a insertar un nodo nuevo
        int opcion = 0;//para cuando haga el menu de opciones
        Lista ld = new Lista();//objeto de la clase Lista, en donde estan las operaciones
        String menu = "0.Salir\n1.Mostrar\n2.Insertar Inicio\n3.Insertar Final"
                + "\n4.Eliminar ultimo\n5.Eliminar primero"
                + "\n6.Insertar antes de Referencia\n7.Insertar Despues de Referencia";//Menu de principal
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu + "\nIngresa una opción"));
            switch (opcion) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    ld.Mostrar();
                    break;
                case 2:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a insertar"));
                    ld.InsertarInicio(dato);
                    break;
                case 3:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a insertar"));
                    ld.InsertarFinal(dato);
                    break;
                case 4:
                    ld.EliminarUltimo();
                    break;
                case 5:
                    ld.EliminarPrimero();
                    break;
                case 6:
                    ld.InsertarAntesRef();
                    break;
                case 7:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato de referencia"));
                    ld.InsertarDespuesRef(dato);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"La opción no se encuentra");
            }
        } while (opcion != 0);
    }
}
