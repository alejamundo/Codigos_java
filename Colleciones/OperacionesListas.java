package colecciones;

import java.util.ArrayList;
import java.util.List;

public class OperacionesListas {

    public static void main(String[] args) {
        //crear una lista
        List<Integer> listaEnteros = new ArrayList<>();
        //añadir elemntos
        listaEnteros.add(4);
        listaEnteros.add(5);
        listaEnteros.add(7);
        listaEnteros.add(2, 6); // Agrega 6 entre 5 y 7
        //tamaño de la ñlista
        System.out.println(listaEnteros.size());
        //buscar u dato en la lista
        System.out.println(listaEnteros.contains(7)); // 'true'
        System.out.println(listaEnteros.contains(8)); // 'false'
        //pocision de un objeto
        System.out.println(listaEnteros.indexOf(6)); // 2
        System.out.println(listaEnteros.indexOf(10)); // -1 no esta
        //obtener elemto de la lista
        var primero = listaEnteros.get(0); // 4
        var ultimo = listaEnteros.get(listaEnteros.size() - 1); // 7
        //eliminar un objeto
        //listaEnteros.remove(new Integer(7)); // true
        listaEnteros.remove(1); // 5
        //estara vacía
        listaEnteros.isEmpty(); // false
        listaEnteros.clear(); // Ahora si está vacía

        //--------------------------------------------------------
        //Recorre un alista
        //buque tradicional
        for (int i = 0; i < listaEnteros.size(); i++) {
            System.out.println(listaEnteros.get(i));
        }
        //for mejorado
        for (Integer entero : listaEnteros) {
            System.out.println(entero);
        }
        //iterador
        var iterador = listaEnteros.iterator();
        while (iterador.hasNext()) {
            Integer entero = iterador.next();
            System.out.println(entero);
        }
        //foreach
        listaEnteros.forEach((entero) -> {
            System.out.println(entero);
        });
        listaEnteros.forEach(System.out::println);
        
        //stream foreach
        listaEnteros.stream().forEach((entero) -> {
            System.out.println(entero);
        });
        listaEnteros.stream()
                .forEach(System.out::println);
    }
}
