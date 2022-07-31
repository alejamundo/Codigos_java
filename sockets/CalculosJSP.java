package Aleja.com.calculos;

public class CalculosJSP {

    private static int result;

    public static int suma(int n1, int n2) {
        result = n1 + n2;
        return result;
    }

    public static int mult(int n1, int n2) {
        result = n1 * n2;
        return result;
    }

    public static int rest(int n1, int n2) {
        result = n1 - n2;
        return result;
    }
}
