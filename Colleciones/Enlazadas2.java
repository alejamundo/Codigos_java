
package colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class Enlazadas2 {
    public static void main(String[] args) {
        LinkedList<String> paises=new LinkedList<String>();
        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Perú");
        
        LinkedList<String> capital=new LinkedList<String>();
        capital.add("Madrid");
        capital.add("Bogotá");
        capital.add("DF");
        capital.add("Lima");
        System.out.println(paises);
        System.out.println(capital);
        //agg elemntos de la capital a la de paises
        ListIterator<String>itP=paises.listIterator();
        ListIterator<String>itC=capital.listIterator();
        while (itC.hasNext()) {
            if(itP.hasNext()){
                itP.next();
            }
            itP.add(itC.next());//agg la primera capital debajo de españa
            
        }
        System.out.println(paises);
        //eliminar los impares
        itC=capital.listIterator();
        while (itC.hasNext()) {
            itC.next();//1
            if (itC.hasNext()) {
                itC.next();//2
                itC.remove();    
            }  
        }
        System.out.println(capital);
        paises.removeAll(capital);
        System.out.println(paises);
    }
    
}
