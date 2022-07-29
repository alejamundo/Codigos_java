package Hilo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Sincronizando_hilos {

    public static void main(String[] args) {
        varioHilos hilo1 = new varioHilos();
        Hilos2 hilo2 = new Hilos2(hilo1);//pasamos por parametro el hilo que hara que se inicie el otro
        //iniciamos primer hilo
        hilo1.start();
        //join()esoera hasta que un hilo muera con el fin de que se sincronicen
        /*try {
            hilo1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Sincronizando_hilos.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        hilo2.start();
        //main tiene un hilo de ejecucion
        System.out.println("Hilo del main");//se libero el hilo del main

    }
}

class varioHilos extends Thread {

    //este tienen el hilo ose la tarea
    public void run() {
        for (int i = 0; i < 15; i++) {
            //para saber a que hilo pertenece 
            System.out.println("Ejecutando hilo: " + getName());
        }
    }
}

class Hilos2 extends Thread {

    private Thread nombrehilo;

    public Hilos2(Thread nombrehilo) {
        this.nombrehilo = nombrehilo;
    }

    //este tienen el hilo ose la tarea
    public void run() {
        try {
            //decir cuando inicia el hilo
            nombrehilo.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilos2.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < 15; i++) {
            //para saber a que hilo pertenece
            System.out.println("Ejecutando hilo: " + getName());
        }
    }
}
