
package Gui_Utiles;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Alejandra Orrego
 */
public class Imagenes extends JFrame{
    @Override
    public Image getIconImage(){
        Image nuevaImagen = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("Resources/icono.png"));
        return nuevaImagen;
    }
}
