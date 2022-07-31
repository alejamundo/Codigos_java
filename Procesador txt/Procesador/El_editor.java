package Procesador;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;

public class El_editor extends JFrame {

    public static void main(String[] args) {
        System.out.println("Funciona ale");
        El_editor txt = new El_editor();
    }

    public El_editor() {
        setSize(500, 500);
        setLocationRelativeTo(null);
        Lamina panel = new Lamina();
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class Lamina extends JPanel {

    JTextPane area = new JTextPane();
    JMenu fuente, estilo, tamagno, edicion, archivo, herramientas;
    Font letras;

    public Lamina() {
        //distribucion de la lamina
        setLayout(new BorderLayout());
        JPanel laminamenu = new JPanel();
        JMenuBar mibarra = new JMenuBar();//instancio la clase
        //crear obciones de esa barra
        //----------------------------------------------------------
        fuente = new JMenu("Fuente");//boton q pone archivo
        estilo = new JMenu("Estilo");
        tamagno = new JMenu("Tamaño");
        edicion = new JMenu("Edicion");
        archivo = new JMenu("Archivo");
        herramientas = new JMenu("Herramientas");
        //usar metodo para la in
        configura("Arial", "Fuente", "Arial", 9, 10,"");//resto de argumentos estandar
        configura("Courier", "Fuente", "Courier", 9, 10,"");
        configura("Verdana", "Fuente", "Verdana", 9, 10,"");

        configura("Negrita", "Estilo", "", Font.BOLD, 1,"");
        configura("Cursiva", "Estilo", "", Font.ITALIC, 1,"");

        configura("12", "Tamaño", "", 9, 12,"src/recursos/font.gif");//pasa argumentes a configuta menu
        configura("16", "Tamaño", "", 9, 16,"");
        configura("20", "Tamaño", "", 9, 20,"");
        configura("24", "Tamaño", "", 9, 24,"");
        //---------------------------------------------------------------------------------
        JMenuItem copiar = new JMenu("Copiar");
      
        Icon imIcon = new ImageIcon(new ImageIcon("src/recursos/font.gif").getImage().getScaledInstance(16,
                16, Image.SCALE_DEFAULT));

        copiar = new JMenuItem("Copiar", imIcon);
        JCheckBox pegar=new JCheckBox("Pegar", new ImageIcon(new ImageIcon("src/recursos/stile.gif").getImage().getScaledInstance(16,
                16, Image.SCALE_DEFAULT)));
        JCheckBox cortar=new JCheckBox("Cortar");
        // copiar.setHorizontalTextPosition(SwingContainer.LEFT); poner icono a la izquierad
        ButtonGroup archivos=new ButtonGroup();
        JRadioButtonMenuItem guardar=new JRadioButtonMenuItem("Guardar",new ImageIcon(new ImageIcon("src/recursos/stile.gif").getImage().getScaledInstance(16,
                16, Image.SCALE_DEFAULT)));
        JRadioButtonMenuItem guardarComo=new JRadioButtonMenuItem("Guardar Como");
        System.out.println("actualizado");
        
        //----------------------------------------------------------------------
        copiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
        copiar.addActionListener(new StyledEditorKit.BoldAction());
        
        archivos.add(guardar);
        archivos.add(guardarComo);
        archivo.add(guardar);
        archivo.add(guardarComo);
        edicion.add(copiar);
  
        edicion.add(pegar);
        edicion.add(cortar);

        mibarra.add(edicion);
        mibarra.add(archivo);
        //----------------------------------------------------------
        //crear opciones desplegables
        //JMenuItem arial = new JMenuItem("Arial");

        /*arial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //este metodo se ejecutara cuando se precione un evento
                //metodo setfont()
                area.setFont(new Font("Arial", Font.PLAIN, 12));
            }
        });*/
        //JMenuItem courier = new JMenuItem("Courier ");
        //instanciar para poner a la escucha
        /*gestiona fuen=new gestiona();
        courier.addActionListener(fuen);//ya el elemneto esta a al aescucha*/
        //evitar todas esas lineas de codigo con una clase anonima
        //JMenuItem verdana = new JMenuItem("Verdana");

        /*fuente.add(arial);
        fuente.add(courier);
        fuente.add(verdana);
        //-----------------------------------------------------------

        JMenuItem negrita = new JMenuItem("Negrita");
        JMenuItem cursiva = new JMenuItem("Cursiva");
        estilo.add(negrita);
        estilo.add(cursiva);
        //---------------------------------------------------------
        //pone un separador 
        //edicion.addSeparator();
        //---------------------------------------------------------
        JMenuItem tam12 = new JMenuItem("12");
        JMenuItem tam16 = new JMenuItem("16");
        JMenuItem tam20 = new JMenuItem("20");
        JMenuItem tam24 = new JMenuItem("24");
        tamagno.add(tam12);
        tamagno.add(tam16);
        tamagno.add(tam20);
        tamagno.add(tam24);
        //---------------------------------------------------------
        //sub menu con jmenu sirve de menu para dos opc
        /*JMenu opciones=new JMenu("Opciones");
        JMenuItem opc1=new JMenuItem("Opción 1");
        JMenuItem opc2=new JMenuItem("Opción 2");
        opciones.add(opc1);
        opciones.add(opc2); 
        //decir donde se agragara
        //edicion.add(opciones);
        
        JMenuItem  generales=new JMenuItem("Generales");
        //herramientas.add(generales);*/
        //hacer q esto aparezca en la barra
        mibarra.add(fuente);

        mibarra.add(estilo);

        mibarra.add(tamagno);
        //agragar menu enel bode de arriba

        laminamenu.add(mibarra);

        add(laminamenu, BorderLayout.NORTH);

        //contruir el jtextpanel  
        add(area, BorderLayout.CENTER);
        //------------------------------------------------------------------
        //barra emerjente
        JToolBar barra=new JToolBar();
        JButton neg=new JButton(new ImageIcon("src/recursos/font.gif"));
        barra.add(neg);
        JButton cur=new JButton(new ImageIcon("src/recursos/stile.gif"));
        barra.add(cur);
        this.add(barra,BorderLayout.WEST);
        
    }

//creador de elemntos de menu
    public void configura(String rotulo, String menu, String tipoLetra, int estilo1, int tam,String ruta) {

        JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(16,
                16, Image.SCALE_DEFAULT)));//acompañarlo de un icono
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
                        elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Arial"));
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
        //luego lo pone a la escucha y pasa al constructor de la clase interna
        //elem_menu.addActionListener(new gestiona_eventos(rotulo, tipoLetra, estilo1, tam));

    }
    //clase stylededitorkit= herramientas para modificar estilo de texto
    //incluye clases internas, cambiar alineasion de texto, poner texto negrita, tamaño cambiar color txto
    //ahora sera mas sencillo manipular el texto

    //Al utilizar la anterior clase sobra toda esta clase interna
    //-----------------------------------------------------------------------------
    //claswe interna para manejar los eventos
/*
    private class gestiona_eventos implements ActionListener {

        //variables para sustituir
        String tipo_Texto, menu;
        int stil, tamn;//alamacenar aca los valores del menu correspondiente
        //pasar los valores

        public gestiona_eventos(String elemento, String text2, int stile2, int tam_) {
            //damos valores a las variaebles
            tipo_Texto = text2;
            stil = stile2;
            tamn = tam_;
            menu = elemento;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //metodo setfont pide un objeto de tipo font
            //tinen sobrecarga de constructores usamos el que mas nos conviene
            letras = area.getFont();//tipo de letra
            //extraer estilo tam y letra
            if (menu == "Arial" || menu == "Courier" || menu == "Verdana") {
                 //si pulso en alguna de estas
                    //dejar estilo y tamaño y modificar solo funete 
                    stil = letras.getStyle();//determina el estilo que hay 
                    tamn = letras.getSize();        
            }else if (menu=="Cursiva" || menu=="Negrita") { 
                if (letras.getStyle()==1 || letras.getStyle()==2) {
                    stil=3;   
                }
                tipo_Texto=letras.getFontName();
                tamn=letras.getSize();         
    
            }else if (menu=="12"||menu=="16"||menu=="20"||menu=="24") {
                tipo_Texto=letras.getFontName();
                stil=letras.getStyle();   
            }
            //evaluar en que menu emos pulzado
            area.setFont(new Font(tipo_Texto, stil, tamn));
            //JTEXTPANEL con metodo getfont dice tipo de fuente
            System.out.println("tipo: "+tipo_Texto+" estilo: "+stil+" tamaño: "+tamn);
        }
    }*/
}
