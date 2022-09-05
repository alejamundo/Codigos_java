
package Controlador;

import Clases.Compra;
import Clases.Proyecto;
import Modelo.MdCompra;
import java.util.ArrayList;

/**
 *
 * @author Katherin
 */
public class CtCompra {
    
    MdCompra mdcompra;

    public CtCompra() {
        this.mdcompra = new MdCompra();
    }
    
    //Método que llama al modelo y en un array guarda lo que arroja la consulta de compras
     public ArrayList<Compra> listarCompra(){
        
        ArrayList<Compra> resultado = new ArrayList<>();
        try {
            resultado = this.mdcompra.generarReporteCompras();
        } catch (Exception e) {

        }        
        return resultado;
        
    }
    
    
}
