package Procesador;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class txt_corre extends JFrame {

    public static void main(String[] args) {
        System.out.println("Funciona ale");
        El_editor txt = new El_editor();
    }

    public txt_corre() {
        setSize(500, 500);
        setLocationRelativeTo(null);
        Laminas panel = new Laminas();
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class Laminas extends JPanel {

    JTextPane area = new JTextPane();
    JMenu fuente, estilo, tamagno;
    Font letras;

    public Laminas() {

        setLayout(new BorderLayout());
        JPanel laminamenu = new JPanel();
        JMenuBar mibarra = new JMenuBar();
        //crear obciones de esa barra
        //----------------------------------------------------------
        fuente = new JMenu("Fuente");//boton q pone archivo
        estilo = new JMenu("Estilo");
        tamagno = new JMenu("Tamaño");
        //usar metodo para la in
        configura("Arial", "Fuente", "Arial", 9, 10);
        configura("Courier", "Fuente", "Courier", 9, 10);
        configura("Verdana", "Fuente", "Verdana", 9, 10);

        configura("Negrita", "Estilo", "", Font.BOLD, 1);
        configura("Cursiva", "Estilo", "", Font.ITALIC, 1);

        configura("12", "Tamaño", "", 9, 12);
        configura("16", "Tamaño", "", 9, 16);
        configura("20", "Tamaño", "", 9, 20);
        configura("24", "Tamaño", "", 9, 24);
        //----------------------------------------------------------

        mibarra.add(fuente);
        mibarra.add(estilo);
        mibarra.add(tamagno);

        laminamenu.add(mibarra);
        add(laminamenu, BorderLayout.NORTH);
        add(area, BorderLayout.CENTER);
    }

    public void configura(String rotulo, String menu, String tipoLetra, int estilo1, int tam) {
        JMenuItem elem_menu = new JMenuItem(rotulo);
        if (null != menu) //donde quedara cada elemnto de menu
        {
            switch (menu) {
                case "Fuente":
                    fuente.add(elem_menu);
                    if (tipoLetra == "Arial") {
                        elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Arial"));//
                    } else if (tipoLetra == "Courier") {
                        elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Courier"));

                    } else if (tipoLetra == "Verdana") {
                        elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Verdana"));
                    }
                    break;
                case "Estilo":
                    estilo.add(elem_menu);
                    if (estilo1 == Font.BOLD) {
                        elem_menu.addActionListener(new StyledEditorKit.BoldAction());
                    } else if (estilo1 == Font.ITALIC) {
                        elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
                    }
                    break;
                case "Tamaño":
                    tamagno.add(elem_menu);
                    //modifica el texto solo del texto seleccionado
                    elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", tam));//establezco tamaño q se desea
                    break;
                default:
                    break;
            }
        }
    }
}
