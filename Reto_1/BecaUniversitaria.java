package Reto_1;

public class BecaUniversitaria {

    int pTiempo;
    double pMonto;
    double pInteres;

    /*public static void main(String[] args) {
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion());
    }*/

    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres) {
        this.pInteres = pInteres;
        this.pMonto = pMonto;
        this.pTiempo = pTiempo;
    }

    public BecaUniversitaria() {
        this.pInteres = 0;
        this.pMonto = 0;
        this.pTiempo = 0;
    }

    public double calcularInteresSimple() {
        double monto = pMonto * (pInteres / 100) * pTiempo;
        return Math.round(monto);
    }

    public double calcularInteresCompuesto() {
        double monto = pMonto * (Math.pow((1 + pInteres / 100), pTiempo) - 1);
        return Math.round(monto);
    }

    public String compararInversion() {
        String mensaje;
        double diferencia;
        if (pTiempo == 0 & pMonto == 0 & pInteres == 0) {
            mensaje = "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        } else {
            diferencia = Math.round(calcularInteresCompuesto() - calcularInteresSimple());
            mensaje = "La diferencia entre la proyección de interés compuesto e interés simple es: $" + String.valueOf(diferencia);
        }
        return mensaje;
    }

    public String compararInversion(int pTiempo, double pMonto, double pInteres) {
        this.pInteres=pInteres;
        this.pMonto=pMonto;
        this.pTiempo=pTiempo;
        double diferencia;
        diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + String.valueOf(diferencia);
    }

}
