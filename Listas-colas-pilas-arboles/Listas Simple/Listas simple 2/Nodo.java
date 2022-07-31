package listasSimples;

public class Nodo {

    private Nodo liga;
    private int dato;

    public Nodo(int dato) {
        this.dato = dato;
        this.liga = null;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

}
