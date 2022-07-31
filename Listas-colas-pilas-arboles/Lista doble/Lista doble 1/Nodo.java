
package Dobles;

public class Nodo {
    //Atributos de la clase nodo
    private int dato;
    private Nodo sig;
    private Nodo ant;
    
    //Inicializar variables
    public Nodo(int dato) {
        this.dato = dato;
        this.sig = null;
        this.ant = null;
    }
    //métodos para asignar o obtener datos del nodo

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
    
}
