
package Gui_Utiles;

public class Metodos_String {
    public static void main(String[] args) {
        String variable="Aleja";
        System.out.println("Longitud de la cadena: "+variable.length());
        System.out.println("posición  de la primera aparicion de un caracter y "
                + "si no esta devuelve -1: "+variable.indexOf('A'));
        System.out.println("Devuelve la posición de la última aparicion de un "
                + "caracter y -1 si no lo encuentra: "+variable.lastIndexOf('a'));
        System.out.println("Devuelve el caracter que esta en la posición n: "
        +variable.charAt(2));
        System.out.println("Devuelve la subcadena  desde la pocision n1 hasta n2-1: "
        +variable.substring(0, 3));
        System.out.println("Cadena en mayúscula: "+variable.toUpperCase());
        System.out.println("cadena  en minúscula: "+variable.toLowerCase());
        System.out.println("Compara dos cadenas y si son iguales da true: "
        +variable.equals("Aleja"));
        System.out.println("No considera mayúsculas ni minúsculas: "
                +variable.equalsIgnoreCase("aleja"));
        System.out.println("Convierte el valor N a string 'Puede ser de cualquier tipo': "
        +variable.valueOf(3));
        System.out.println("Copia la cadena, eliminando espacios al principio y al final "
                + "de la cadena: "+variable.trim());
    }
    
    
}
