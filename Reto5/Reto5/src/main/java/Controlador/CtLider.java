package Controlador;

import Clases.Lider;
import Modelo.MdLider;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Katherin
 */
public class CtLider {

    MdLider mdlider;

    public CtLider() {
        this.mdlider = new MdLider();
    }

       
    public ArrayList<Lider> listarLideres(){
        
        ArrayList<Lider> resultado = new ArrayList<>();
        try {
            resultado = this.mdlider.generarReporteLideres();
        } catch (Exception e) {

        }
        
        return resultado;
        
    }

}
