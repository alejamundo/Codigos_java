
package Procesador;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class Menus_emerjentes extends JFrame {
    public static void main(String[] args) {
        System.out.println("Funciona ale");
        Menus_emerjentes txt = new Menus_emerjentes();
    }

    public Menus_emerjentes() {
        setSize(500, 500);
        setLocationRelativeTo(null);
        Lamina2 panel = new Lamina2();
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class Lamina2 extends JPanel {

    public Lamina2(){
        JTextPane area=new JTextPane();
        this.add(area);
        
        JPopupMenu emergente=new JPopupMenu();
        JMenuItem opc1=new JMenuItem("Negrita");
        JMenuItem opc2=new JMenuItem("Italica");
        
        opc1.addActionListener(new StyledEditorKit.BoldAction());
        opc2.addActionListener(new StyledEditorKit.ItalicAction());
        
        emergente.add(opc1);
        emergente.add(opc2);
        setComponentPopupMenu(emergente);//aplicar este metodo en el area que deseemos que funcione
        add(area);
        
    }
       
}
