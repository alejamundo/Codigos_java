
package Gui_Utiles;

public class Metodos_math {
    public static void main(String[] args) {
        int numero=2022;
        Double numero2=1.3;
        float numero3=2.5f;
        System.out.println("Valor absoluto: "+Math.abs(numero2));
        System.out.println("Seno: "+ Math.sin(numero2));
        System.out.println("Coseno: "+Math.cos(numero2));
        System.out.println("Tangente: "+Math.tan(numero2));
        System.out.println("Exponenciación neperiana: "+Math.exp(numero2));
        System.out.println("Logaritmo Neperiano: "+Math.log(numero2));
        System.out.println("Potencia: "+Math.pow(2, 3));
        System.out.println("Redondear: "+Math.round(numero2));
        System.out.println("Aproximación entero mayor: "+Math.floor(numero2));
        System.out.println("Aproxima entero menor: "+Math.ceil(numero2));
    }
}
