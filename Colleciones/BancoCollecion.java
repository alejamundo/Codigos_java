
package colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class BancoCollecion {
    public static void main(String[] args) {
        Cliente p1=new Cliente("Alejandra", "001", 200);
        Cliente p2=new Cliente("Linda", "002", 300);
        Cliente p3=new Cliente("Julian", "003", 400);
        Cliente p4=new Cliente("Stefania", "004", 500);
        Cliente p5=new Cliente("Stefania", "004", 500);//son lo mismo pero se llaman diferente
        //collecion adecuada "No clientes repetidos"
        //                   "Agregar borra, solo lectura..."
        //coleccion set.
        Set <Cliente> coleccion=new HashSet<Cliente>();//es una interfaz por lo tanto debo elegir una clase que implemnete esta interFAZ    
        //agregar clientes
        coleccion.add(p1);
        coleccion.add(p2);
        coleccion.add(p3);
        coleccion.add(p4);
        coleccion.add(p5);
        //p4=p5;//indico que son las mismas
        //recorrer esta collecion
        for (Cliente cliente : coleccion) {
            System.out.println(cliente.getNombre()+" "+cliente.getnCuenta()+" "+cliente.getSaldo());
        }
        //fundamentales equals() 
        //hashcode():
        if (p4.equals(p5)) {//no es capaz de dicernir si los objetos son ono iguales
            System.out.println("Mismo libro");
        }else{
            System.out.println("son diferentes");
            System.out.println(p4.hashCode());
            System.out.println(p5.hashCode());
        }
        //recorrer con el iterator
        Iterator<Cliente> it=coleccion.iterator();
        while(it.hasNext()){
            String nombre=it.next().getNombre();
            System.out.println(nombre);
        }
        //eliminar un cliente
        while (it.hasNext()) {
            String nombre=it.next().getNombre();
            
            if (nombre.equalsIgnoreCase("Linda")) {
                it.remove();
            }
            
        }
        System.out.println("");
        System.out.println("Eliminado");
        for (Cliente cliente : coleccion) {
            System.out.println(cliente.getNombre()+" "+cliente.getnCuenta()+" "+cliente.getSaldo());
        }
        
        
    }
}
class Cliente{
    private String nombre;
    private String nCuenta;
    private double saldo;

    public Cliente(String nombre, String nCuenta, double saldo) {
        this.nombre = nombre;
        this.nCuenta = nCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //sobreescribir equals
    /*@Override
    public boolean equals(Object obj){
        if (obj instanceof Cliente) {//averiguar si un objeto es de una instancia de la clase
            Cliente otro=(Cliente)obj;//onj ya es un objeto de tipo libro
            if (this.nCuenta==otro.nCuenta) {//estamos comparando que realmente sean iguales
                return true;     
            }else{
                return false;
            }
        }else{
            return false;
        }
    }*/

    //@Override
   /* public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nCuenta);
        return hash;
    }

   // @Override
   /* public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {//para saber de que clase biene
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.nCuenta, other.nCuenta);
    }*/
    
    
}
