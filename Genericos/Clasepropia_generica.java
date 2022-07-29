
package Programacion_generica;

public class Clasepropia_generica <T>{//creamos clases genericas T, U, K, geenricos
    //campo de clase 
    private T primero;//campo generico
    //constructor

    public Clasepropia_generica() {
        this.primero = null;
    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }

    public T getPrimero() {
        return primero;
    }
   
    
            
    
}
