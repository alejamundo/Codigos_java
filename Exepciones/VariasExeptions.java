
package exepciones;

import javax.swing.JOptionPane;

public class VariasExeptions {
    public static void main(String[] args)  {
        try {
           division(); 
        } catch (ArithmeticException e) {
            System.out.println("Error: al dividir por cero");
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Error: ingrese datos númericos");
            System.out.println(e.getClass()+"Mensaje: "+e.getMessage());
        }
        
    }

    private static void division() {
        double n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número:"));
        double n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro número:"));
        System.out.println("resultado= "+ n1/n2);
    }
}
