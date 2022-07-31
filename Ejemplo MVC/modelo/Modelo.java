
package modelo;


public class Modelo {
    //propiedades del modelo
    private int n1,n2;
    private int resultado;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    //método para hacer la operacion
    public int multiplicar(){
        this.resultado=this.n1*this.n2;
        return this.resultado;
    }
}
