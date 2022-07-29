
package programacionBasica;

import javax.swing.JOptionPane;

/**
 *
 * @author AlejanMundo
 */
public class Contraseñas {
    public static void main(String[] args) {
        String contrasena="Aleja123";
        boolean correcta=false;
        int contador=1;
        while (correcta==false && contador<=3) {            
            String CIngresada=JOptionPane.showInputDialog("Ingresa la contraseña");
            if (CIngresada.equals(contrasena)) {
                JOptionPane.showMessageDialog(null, "Bienvenido  :)");
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta","Error",0);
            }
            contador++;
        }
    }
}
