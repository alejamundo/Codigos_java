package colecciones;

import java.util.PriorityQueue;
import java.util.Queue;

public class Colas {

    public static void main(String[] args) {
        //crear
        Queue<Integer> colaEnteros = new PriorityQueue<>();
        //añadir elemntos 
        colaEnteros.add(4);
        colaEnteros.offer(5);
        colaEnteros.offer(7);
        colaEnteros.offer(6);
        //tamaño
        colaEnteros.size(); // 4
        //obtener elemntos de cola
        colaEnteros.poll(); // 4
        colaEnteros.remove(); // 5
        //obtener el primer elemento de la cola
        colaEnteros.peek(); // 7
        colaEnteros.element(); // 7
        //eliminar objetio
        colaEnteros.remove(); // 7
        //esta vacia
        colaEnteros.isEmpty(); // false
        colaEnteros.clear(); // Ahora si está vacía
        //recorrer todo los elemtos
        for (Integer entero : colaEnteros) {
            System.out.println(entero);
        }

    }
}
