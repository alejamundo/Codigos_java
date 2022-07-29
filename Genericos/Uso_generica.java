package Programacion_generica;

import java.util.GregorianCalendar;

public class Uso_generica {

    public static void main(String[] args) {
        // la clase generica se adacta al tipo de objeto especificado
        Clasepropia_generica<String> una = new Clasepropia_generica<String>();
        //cambiar valor de campo d eclase
        una.setPrimero("Alejandra objeto string");
        //ver en consola 
        System.out.println("Dato: " + una.getPrimero());
        persona p = new persona("Ana", 22);
        Clasepropia_generica<persona> dos = new Clasepropia_generica<persona>();
        dos.setPrimero(p);
        System.out.println("Dato 2: " + dos.getPrimero());
        System.out.println("");
        System.out.println("Metodo generico");
        String[] nombres = new String[3];
        nombres[0] = "Andres";
        nombres[1] = "Linda";
        nombres[2] = "yesica";
        String ele = Mismatrices.<String>getElementos(nombres);
        System.out.println(ele);
        System.out.println("");

        System.out.println("objetos");
        persona lista[] = {new persona("alejandra", 12),
            new persona("linda", 10),
            new persona("monba", 12),
            new persona("msd", 22)};
        System.out.println(Mismatrices.getElementos(lista));
        System.out.println("");
        
        //comparable solo se puede implementar en String Date calendar
        System.out.println(Mismatrices.elemMenor(nombres));
        
        //clase gregorian Calendar para fechas
        GregorianCalendar fechas[]={new GregorianCalendar(2022,06,1),
            new GregorianCalendar(2022,10,12),
            new GregorianCalendar(2022,8,12)};
        System.out.println("");
        System.out.println("fechas menor: "+Mismatrices.elemMenor(fechas).getTime().toLocaleString());

    }
}

class persona {

    private String nombre;
    private int edad;

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Tu nombre es " + nombre + " y tu edad es: " + edad;
    }

}

class Mismatrices {

    //metodo generico
    public static <T> String getElementos(T[] a) {
        return "El array tiene: " + a.length + " Elemntos";
    }

    public static <T extends Comparable> T elemMenor(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }//compareto comparar unoc con otros para devolver menor mayor iguales
        //comparable interfaz metodo compare to retorna 0 o positivo si es mayor ,menir igual
        //-1 menor, 0 igual, positivo mayor
        //comparar objetos hgenericos
        T elemenor = a[0];//
        for (int i = 1; i < a.length; i++) {//la cero ya la tengo
           // elemento menor es mayor que a[i]
            if (elemenor.compareTo(a[i])>0) {
                elemenor=a[i];
            }    
        }
        return elemenor;
    }

}
