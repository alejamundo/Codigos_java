
package colecciones;

import java.util.HashMap;
import java.util.Map;

public class Map_Diciionario {
    public static void main(String[] args) {
        HashMap<String,empleado> peronal=new HashMap<String,empleado>();
        peronal.put("12",new empleado("Alejandra"));
        peronal.put("14",new empleado("Julian"));
        peronal.put("16",new empleado("Jorge"));
        peronal.put("18",new empleado("yessica"));
        System.out.println(peronal);
        //eliminar elemnto
        peronal.remove("12");
        System.out.println(peronal);
        //sustituir un elemnto dentro del mapa
        peronal.put("16", new empleado("Linda"));
        System.out.println(peronal);
        //entryset() nos da la vista de lo que esta en el map
        System.out.println(peronal.entrySet());
        //recorrer elemneton y que debuelba en forma de set
        for (Map.Entry<String, empleado> entrada : peronal.entrySet()) {
            String key = entrada.getKey();
            empleado value = entrada.getValue();
            System.out.println("clave: "+key+" Valor: "+value);
        }
               
    }
}
class empleado{
    private double sueldo;
    private String nombre;

    public empleado(String nombre) {
        this.nombre = nombre;
        this.sueldo=2000;
    }
    //ver salida
    @Override
    public String toString() {
        return "Empleado{" + "sueldo=" + sueldo + ", nombre=" + nombre + '}';
    }
    
    
}
