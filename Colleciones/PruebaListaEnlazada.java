
package colecciones;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListaEnlazada {
    public static void main(String[] args) {
        //creo lista enlazada ordenada en el mismo orden que la pusimo
        LinkedList <String> personas=new LinkedList<String>(); 
        //agregar elemntos
        personas.add("Alejandra");
        personas.add("Linda");
        personas.add("Sofía");
        //conocer elemntos
        System.out.println(personas.size());
        personas.add("Laura");
        //almacenar indicando lugar
        ListIterator<String> it=personas.listIterator();
        it.next();
        //el iterador se mueve por la lista
        it.add("Milena");
        //mostrar
        System.out.println("");
        for (String persona : personas) {
            System.out.println(persona);
        }
    }
    
}
