package ejerpilascolas;

import javax.swing.JOptionPane;
import java.util.*;

class Pila {

    int[] p = new int[3];
    int max = 3;
    int tope = 0;

    //método constructor
    public Pila() {
    }

    //para definir magnitud
    public void definirmagnitud(int x) {
        p = new int[x];
        max = x;
        tope = 0;
    }

    //metodo utilizado para imprimir la pila
    public String mostrar() {
        String pil = "";
        int i = tope - 1;
        for (; i >= 0; i--) {
            pil = pil + p[i] + " , ";
        }
        return pil;
    }

    //método utilizado para apilar
    public void Apilar(int dato) {
        if (tope < max) {
            p[tope] = dato;
            tope++;
            
        } else {
            JOptionPane.showMessageDialog(null, "Pila llena");
        }
    }

    //método utilizado para desapilar
    public int Desapilar() {
        int dato = -1;
        if (tope > 0) {
            dato = p[tope - 1];
            tope--;
            
        } else {
            JOptionPane.showMessageDialog(null, "pila vacia");
        }
        return dato;
    }

    //método para hacer una pila aleatoria
    public void PilaAleatoria() {
        Random r;
        int d, k;
        int i;
        //p = new int[max];
        r = new Random();
        for (i = 0; i < max; i++) {
            int x = Math.abs(r.nextInt()) % 99;
            Apilar(x);
        }
        JOptionPane.showMessageDialog(null, "Se genero una pila Aleatoria");
    }

}

 
