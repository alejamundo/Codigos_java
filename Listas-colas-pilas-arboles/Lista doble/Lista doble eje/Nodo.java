
package proyectolistadoble;

public class Nodo 
{
    int dato;
    Nodo sig;
    Nodo ant;

    public Nodo(int dato) {
        this.dato = dato;
        sig=null;
        ant=null;
    }

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
