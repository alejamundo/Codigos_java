
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsoThreads {

    public static void main(String[] args) {
        JFrame marco = new MarcoRebote();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

}

//Movimiento de la pelota-----------------------------------------------------------------------------------------
class Pelota {

    private static final int TAMX = 15;
    private static final int TAMY = 15;
    private double x = 0;
    private double y = 0;
    private double dx = 1;
    private double dy = 1;

    // Mueve la pelota invirtiendo posici�n si choca con l�mites
    public void mueve_pelota(Rectangle2D limites) {//resibe dimenciones de la lamina

        x += dx;

        y += dy;

        if (x < limites.getMinX()) {

            x = limites.getMinX();

            dx = -dx;
        }

        if (x + TAMX >= limites.getMaxX()) {

            x = limites.getMaxX() - TAMX;

            dx = -dx;
        }

        if (y < limites.getMinY()) {

            y = limites.getMinY();

            dy = -dy;
        }

        if (y + TAMY >= limites.getMaxY()) {

            y = limites.getMaxY() - TAMY;

            dy = -dy;

        }

    }

    //Forma de la pelota en su posici�n inicial
    public Ellipse2D getShape() {
        return new Ellipse2D.Double(x, y, TAMX, TAMY);
    }
}

// L�mina que dibuja las pelotas----------------------------------------------------------------------
class LaminaPelota extends JPanel {

    private ArrayList<Pelota> pelotas = new ArrayList<Pelota>();

    //A�adimos pelota a la l�mina
    public void add(Pelota b) {
        pelotas.add(b);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Pelota b : pelotas) {
            g2.fill(b.getShape());
        }
    }
}

//Marco con l�mina y botones------------------------------------------------------------------------------
class MarcoRebote extends JFrame {

    private LaminaPelota lamina;
    private Thread t;

    public MarcoRebote() {
        setBounds(600, 300, 400, 350);
        setTitle("Rebotes");
        lamina = new LaminaPelota();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones = new JPanel();
        ponerBoton(laminaBotones, "Dale!", new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                comienza_el_juego();
            }

        });
//-------------------------------------------------------------------------
        ponerBoton(laminaBotones, "Deterner", new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                detener();
            }
        });

        ponerBoton(laminaBotones, "Salir", new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                System.exit(0);
            }
        });
        add(laminaBotones, BorderLayout.SOUTH);
    }

    //Ponemos botones
    public void ponerBoton(Container c, String titulo, ActionListener oyente) {
        JButton boton = new JButton(titulo);
        c.add(boton);
        boton.addActionListener(oyente);

    }

    //A�ade pelota y la bota 1000 veces
    public void comienza_el_juego() {
        Pelota pelota = new Pelota();
        lamina.add(pelota);
        //creamos instancia runnable
        Runnable r = new hilos(pelota, lamina);
        //creamos instancia d ela clase thread
        t = new Thread(r);
        //indicamos que comience el hilo
        t.start();

    }

    //---------------------------------- detener hilo en ejecucion
    public void detener() {
        t.interrupt();
    }
}

class hilos implements Runnable {

    private Pelota pelota;
    private Component componente;

    public hilos(Pelota unaPelota, Component unComponent) {
        this.componente = unComponent;
        this.pelota = unaPelota;
    }

    //en este metodo debe estar el codigo que se ejecutara de forma simultanea
    @Override
    public void run() {
        //hacer una paisa a ca vuelta de bucle para que el movimiento se a mas lento
        //como podemos hacer una pausa en un hilo
        //sleep pausa(milisegundos)4000=4 segndos (4)milisegundos
        System.out.println("Estado hilo inicio: " + Thread.currentThread().isInterrupted());
        for (int i = 1; i <= 3000; i++) {
            pelota.mueve_pelota(componente.getBounds());
            componente.paint(componente.getGraphics());

            try {
                Thread.sleep(4);
            } catch (InterruptedException ex) {
                //Logger.getLogger(MarcoRebote.class.getName()).log(Level.SEVERE, null, ex);
                Thread.currentThread().interrupt();//detener hilo
            }
        }
        System.out.println("Estado hilo final: " + Thread.currentThread().isInterrupted());

        //si no tubiera el sleep
        //currentThread:
        /*while (!Thread.interrupted()) {//mientras no este inrrimpido mueva            
            pelota.mueve_pelota(componente.getBounds());
            componente.paint(componente.getGraphics());
        }*/
        //evento.getSource()preguntar que boton a sido precinnado
    }

}
