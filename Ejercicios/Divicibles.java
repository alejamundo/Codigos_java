
package programacionBasica;

import java.util.ArrayList;
import java.util.List;

public class Divicibles {
    public static void main(String[] args) {
        //almacenar en un arraylist
        List <Integer> lista=new ArrayList();
                
        for (int i = 1; i <= 100; i++) {
            if (i%2==0 && i%3==0) {
                lista.add(i);
            }
        }
        //mostrar
        System.out.println("Lista");
        String salida="";
        for (Integer integer : lista) {
            salida+=integer+" , ";   
        }
        System.out.println(salida);
               
    }
}
