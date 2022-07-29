package Programacion_generica;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_ {

    public static void main(String[] args) {
        //capacidad inicial de 10 elemntos si se pasa consume mas recursos
        //permite almacenar objetos y no datos primitivos
        var array=new ArrayList<Integer>();
        //crear un array de 11 elemtos , eviatndo el consumo 
        array.ensureCapacity(11);
        
        array.add(12);//Agregar dato al array
        array.add(22);
        array.add(32);
        
        //set reemplazar, get obetener,
        array.set(0, 3);//coloca elelemnto en la pocision dada
        System.out.println("Elemento en 3 lugar: "+array.get(2));
        //cerrar el array list para que corte el execeso de memoria vacía
        array.trimToSize();
        //cuantos elemntos tiene el array
        System.out.println("Elemntos: "+array.size());
        for (Integer integer : array) {
            System.out.println(integer);
        }
        System.out.println("");
        //recorrer por pocision
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        System.out.println("");
        //copiar datos del array en un vector clasico
        Integer vector[]=new Integer[array.size()];
        //copiar el array dentro de vector
        array.toArray(vector);//copiar dentro del vector
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        System.out.println("");
        System.out.println("Iterador");
        //encargado de recorrer elemenetos de la collecion
        Iterator<Integer> iterador=array.iterator();
        //hasnext()
        while (iterador.hasNext()){//true hay datos
            //imprime elemtos del array list
            System.out.println(iterador.next());
        }
        
    }
}
