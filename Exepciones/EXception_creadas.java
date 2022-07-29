package exepciones;

import javax.swing.JOptionPane;

public class EXception_creadas {

    public static void main(String[] args) {
        String mail = JOptionPane.showInputDialog("Ingrese email: ");
        //como tienen una exeption debemos cacturarla
        try {
            examina(mail);
        } catch (Exception e) {
            System.out.println("Correo invalído: ");
            e.printStackTrace();//que imprima la llamada al error para q tengan una pista
        }
       
    }
    //debo indicar que podria mandar una exepcion
    private static void examina(String mail)throws longitudError{//throws ArrayIndexOutOfBoundsException{
        int arroba = 0;
        boolean punto = false;
        //generar una exepcion por no cumplir con los requisitos del mail
        if (mail.length() <= 3) {
            //----------------------------------------------
            //generar manualmente un error
            //ArrayIndexOutOfBoundsException e;//instancio ecepcion cualquiera
            //e=new ArrayIndexOutOfBoundsException();
            //luego lanzar esa clausula manualmente
            //throw e;//el programa se cae si no cumpple
            //---------------------------------------------
            //abreviar lo de arriba
            //throw new ArrayIndexOutOfBoundsException();//cuando se incluye debemos anunciar en el metodo q podria pasar
            throw  new longitudError();//llamar al constructor de la exepction
            //si quiero personalizar el mensaje de error llamo al constructor con parametro
        } else {
            for (int i = 0; i < mail.length(); i++) {
                if (mail.charAt(i) == '.') {
                    punto = true;
                }
                if (mail.charAt(i) == '@') {
                    arroba++;
                }
            }
            if (punto == true & arroba == 1) {
                System.out.println("Mail correcto");
            } else {
                System.out.println("No es correcto");

            }
        }

    }
}
//crear clase para crear nuestras propias exepciones
class longitudError extends Exception{
    //debe tener dos contructores sin parametros con string
    public longitudError() {
    }

    public longitudError(String message) {
        super(message);//llamar al constructor de la clase padre exeption pasandole messaje
        
    }
  
}