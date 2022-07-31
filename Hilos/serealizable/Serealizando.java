
package Serealizable_toString;

public class Serealizando {
    public static void main(String[] args) {
        Serealizando pc=new Serealizando();
        System.out.println(pc.toString());
    }
    @Override
    public String toString(){
        return "Hola Aleja";
    }
}
