
package swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class barrasMenu extends JFrame{
    public static void main(String[] args) {
        barrasMenu op=new barrasMenu();
    }
    public barrasMenu(){
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(500, 500);
        this.setTitle("Ejemplo Barras");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Lamina panel=new Lamina();
        add(panel);
    }
}

class Lamina extends JPanel{
    public Lamina(){
        JMenuBar barra=new JMenuBar();
        JMenu menu=new JMenu("Color");
        JMenuItem rojo=new JMenuItem("Rojo");
        JMenuItem amarilo=new JMenuItem("Amarillo");
        JMenuItem azul=new JMenuItem("Azul");
        menu.add(azul);
        menu.add(rojo);
        menu.add(amarilo);
        
        
        Action salir =new AbstractAction("salir") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        barra.add(menu);
        this.add(barra);
        //construccion de la barra de herramientas
        JToolBar b=new JToolBar();
        b.add(rojo);
        b.add(azul);
        b.add(amarilo);
        b.addSeparator();
        b.add(salir);
        this.add(b,BorderLayout.NORTH);
        
        
    }
    
}
