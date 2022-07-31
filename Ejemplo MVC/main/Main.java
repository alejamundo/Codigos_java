
package main;

import controlador.Controlador;
import modelo.Modelo;
import vista.GUI;
public class Main {
    public static void main(String[] args) {
        Modelo mod=new Modelo();
        GUI view=new GUI();
        Controlador ctr1=new Controlador(view,mod);
        ctr1.iniciarVista();
        view.setVisible(true);
        
    }
}
