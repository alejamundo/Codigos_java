
package BinaryTree;

/**
 *
 * @author AlejaMundo
 */
public class NodoTree {
    private NodoTree LigaIzquierda;
    private NodoTree LigaDerecha;
    private int dato;
    //Constructor creacion nodo
    public NodoTree(int dato){
        this.dato=dato;
        this.LigaIzquierda=null;
        this.LigaDerecha=null;
    }
    //getter and setter

    public NodoTree getLigaIzquierda() {
        return LigaIzquierda;
    }

    public void setLigaIzquierda(NodoTree LigaIzquierda) {
        this.LigaIzquierda = LigaIzquierda;
    }

    public NodoTree getLigaDerecha() {
        return LigaDerecha;
    }

    public void setLigaDerecha(NodoTree LigaDerecha) {
        this.LigaDerecha = LigaDerecha;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    

   
}
