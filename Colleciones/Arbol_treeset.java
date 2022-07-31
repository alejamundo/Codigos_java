package colecciones;

import java.util.Comparator;
import java.util.TreeSet;

public class Arbol_treeset {

    public static void main(String[] args) {
        TreeSet<String> ordena = new TreeSet<String>();
        ordena.add("Aleja");
        ordena.add("Linda");
        ordena.add("Diana");
        //compara y los ordena en orden alfabetico
        for (String string : ordena) {
            System.out.println(string);
        }
        System.out.println("");
        System.out.println("Ordeno objetos por número");
        Ar p = new Ar(1, "Articulo 11");
        Ar p1 = new Ar(3, "Articuloss 2");
        Ar p2 = new Ar(5, "Articulo 3");
        TreeSet<Ar> ordenaAr = new TreeSet<Ar>();//ordena objeto segun el metodo que hemos construido en el objeto
        ordenaAr.add(p);
        ordenaAr.add(p2);
        ordenaAr.add(p1);
        for (Ar ar : ordenaAr) {
            System.out.println(ar.getDes());
        }
        //crear el nuevo comprador
        //clase interna anonima para ordenar dentros
        TreeSet<Ar> ordena2Ars = new TreeSet<Ar>(new Comparator<Ar>() {
            @Override
            public int compare(Ar o1, Ar o2) {
                String des1 = o1.getDes();
                String des2 = o2.getDes();
                return des1.compareTo(des2);
            }
        });
        ordena2Ars.add(p);
        ordena2Ars.add(p2);
        ordena2Ars.add(p1);
        System.out.println("\nOrdeno utilizando clase anonima compare de Comparator");
        for (Ar ordena2Ar : ordena2Ars) {
            System.out.println(ordena2Ar.getDes());
        }
    }
}

//con un objeto si deceo que se ordene debo crear la clase que implemente la interfaz comparable
class Ar implements Comparable<Ar> {

    private int num;
    private String des;

    public Ar(int num, String des) {
        this.num = num;
        this.des = des;
    }

    public int getNum() {
        return num;
    }

    public String getDes() {
        return des;
    }

    //construir mi propio comparador dl objeto
    @Override
    public int compareTo(Ar o) {
        //comparael el numero de articulo de dos objetos
        return num - o.num;
    }
}
