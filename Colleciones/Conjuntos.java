package colecciones;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {

    public static void main(String[] args) {
        //crear
        Set<Integer> conjuntoEnteros = new HashSet<>();
        //añadir
        conjuntoEnteros.add(4);
        conjuntoEnteros.add(5);
        conjuntoEnteros.add(7);
        conjuntoEnteros.add(4); // retorna false por repetido
        //tamaño conjunto
        System.out.println(conjuntoEnteros.size()); // 3
        //esta en el conjunto
        System.out.println(conjuntoEnteros.contains(7)); // 'true'
        System.out.println(conjuntoEnteros.contains(8)); // 'false'
        //eliminar
        conjuntoEnteros.remove(new Integer(7)); // true
        //esta vacio
        conjuntoEnteros.isEmpty(); // false
        conjuntoEnteros.clear(); // Ahora si está vacía
        //recorrer todo 
        for (Integer entero : conjuntoEnteros) {
            System.out.println(entero);
        }
    }
}
