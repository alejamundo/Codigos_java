package programacionBasica;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
/*Java.nio.charset (Clase StandardCharsets):define constantes para cada uno 
de los conjuntos de caracteres estándar.

*Campo Statico de la clase con codigo ASCII (US_ASCII): ASCII de siete bits,
también conocido como ISO646-US, también conocido como el bloque latino 
básico del conjunto de caracteres Unicode, de tipo charset

*String.getBytes(String decode):  devolverá una representación de matriz de 
bytes de una cadena bajo la codificación de acuerdo con la codificación de 
decodificación especificada
*/
public class TablaAscii {

    public static void main(String[] args) {
        String s = "b";
        byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println("Codigo ASCII: " + bytes[0]);

        int ascii = 97;
        char caracter = (char) ascii;
        System.out.println("Caracter: " + caracter);

        String cdn1 = new String("Gran año para estudiar Java");
        try {
            String cdn2 = new String(cdn1.getBytes("utf-8"));
            System.out.println("Valor devuelto: " + cdn2);
            cdn2 = new String(cdn1.getBytes("ISO-8859-1"));
            System.out.println("Valor devuelto: " + cdn2);
            cdn2 = new String(cdn1.getBytes());
            System.out.println("Valor devuelto: " + cdn2);
            cdn2 = new String(cdn1.getBytes("tinchicus"));
            System.out.println("Valor devuelto: " + cdn2);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Charset no soportado");
        }

    }

}
