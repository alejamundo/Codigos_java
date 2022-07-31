
package proyectolistadoble;

import javax.swing.JOptionPane;

public class ProyectoListaDoble 
{
    public static void main(String[] args) 
    {
       int opc = 0;
       int dato;
       ListaDoble ld = new ListaDoble();

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "bienvenido al menu \n"
                    + "1. para mostrar \n"
                    + "2. para insertar al inicio \n"
                    + "3. para insertar al final \n"
                    + "4. para eliminar un dato dado \n"
                    + "0.salir \n"
                    + "digite la opcion \n"));

            switch (opc) {
                case 1:
                    ld.mostrar();
                    break;

                case 2:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("ingrese un dato para insetar"));
                    ld.insertarInicio(dato);

                    break;
                case 3:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("ingrese un dato para insertar"));
                    ld.insertarFinal(dato);
                    break;
                case 4:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("ingrese un dato para eliminar"));

                    ld.eliminardatodado(dato);
                    break;
                
                case 0:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcion incorrecta");
                break;
            }
        } while (opc != 0);
    }
 }
