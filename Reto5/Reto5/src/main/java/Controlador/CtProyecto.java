
package Controlador;

import Clases.Lider;
import Clases.Proyecto;
import Modelo.MdProyecto;
import java.util.ArrayList;

/**
 *
 * @author Katherin
 */
public class CtProyecto {
    MdProyecto mdproyecto;

    public CtProyecto() {
        this.mdproyecto = new MdProyecto();
    }
    
    
    //Método que llama al modelo y en un array guarda lo que arroja la consulta de proyectos
     public ArrayList<Proyecto> listarProyecto(){
        
        ArrayList<Proyecto> resultado = new ArrayList<>();
        try {
            resultado = this.mdproyecto.generarReporteProyectos();
        } catch (Exception e) {

        }        
        return resultado;
        
    }
    
    
}
