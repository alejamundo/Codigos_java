package BinaryTree;

import javax.swing.JOptionPane;

/**
 *
 * @author AlejaMundo
 */
public class Principal {

    public static void main(String[] args) {
        Arbol arbolito = new Arbol();
        //en un arbol no benen haber numeros repetidos
        String menu = "¿Que deseas hacer?\n"
                + "1.Insertar un nodo al arbol"
                + "\n2.Mostrar en preOrden"
                + "\n3.Mostrar en inOrden"
                + "\n4.Mostrar en posOrden"
                + "\n5.Mostrar hijos de un dato dado"
                + "\n6.Eliminar dato dado"
                + "\n7.Mostrar el nivel de un dato dado"
                + "\n8.Mostrar la altura de un arbol"//
                + "\n9.Datos de un nivel dado"
                + "\n10.Nivel de un dato dado"
                + "\n11.Pade de un dato dado"//se muestra cn el anterior ecepto la raiz
                + "\n12.Hermano de un dato dado"//el anterior es el papa, si liga isquierda es diferente de null tiene hermano
                + "\n0.Salida";
        int opc = 0;
        int dato = 0;
        String salida;
        NodoTree R;
        R = arbolito.getRaiz();
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu + "\nIngresa una opción"));
            switch (opc) {
                case 1:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a insertar"));
                    arbolito.Insertar(dato);
                    break;
                case 2:
                    if (arbolito.getRaiz() == null) {
                        JOptionPane.showMessageDialog(null, "El arbol esta vacío");
                    } else {
                        salida="";
                        //arbolito.rec_preorden(arbolito.getRaiz(),salida);
                        JOptionPane.showMessageDialog(null, "Recorrido preorden:\n"+arbolito.rec_preorden(arbolito.getRaiz(), salida));
                    }
                    break;
                case 3:
                     if (arbolito.getRaiz() == null) {
                        JOptionPane.showMessageDialog(null, "El arbol esta vacío");
                    } else {
                        salida="";
                        //arbolito.rec_inOrden(arbolito.getRaiz(),salida);
                        JOptionPane.showMessageDialog(null, "Recorrido Inorden:\n"+arbolito.rec_inOrden(arbolito.getRaiz(), salida));
                    }
                    break;
                case 4:
                     if (arbolito.getRaiz() == null) {
                        JOptionPane.showMessageDialog(null, "El arbol esta vacío");
                    } else {
                        salida="";
                        //arbolito.rec_posOrden(arbolito.getRaiz(),salida);
                        JOptionPane.showMessageDialog(null, "Recorrido posOrden:\n"+arbolito.rec_posOrden(arbolito.getRaiz(), salida));
                    }
                    break;
                case 5:
                    dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a buscar"));
                    arbolito.MostrarHijos(arbolito.getRaiz(), dato);
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
