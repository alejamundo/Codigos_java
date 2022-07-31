package Taller;
import javax.swing.JOptionPane;

public class Pila extends Cola{
    int tam;
    int tope;
    int vectorPila[];

    //Constructor para inicializar variables
    public Pila(int tam) {
        super(tam);
        this.tam = tam;
        vectorPila = new int[tam];
        tope = -1;
    }

    //Método Interno para validar si esta Vacía
    public boolean esVaciaPila() {
        if (tope == -1) {
            return true;
        } else {
            return false;
        }
    }
    //método para saber si la cola esta llena
    public boolean PilaLLena(){
        if (tam==tope+1) {
           return true;
        }else{
            return false;
        }
    }
    //Metodo 1 Apilar
    public void apilar(int dato) {
        if (tope == tam - 1) {
            JOptionPane.showMessageDialog(null, "No se puede apilar, No queda mas espacio en el vector");
        } else {
            tope++;
            vectorPila[tope] = dato;
            JOptionPane.showMessageDialog(null, "Se apilo un dato");
        }
    }
    //Método 2 Desapilar
    public int desapilar() {
        int datoT = 0;
        if (esVaciaPila()) {
            JOptionPane.showMessageDialog(null, "La Pila esta vacía, no se puede desapilar");
        } else {
            datoT = vectorPila[tope];//almaceno el dato antes de borralo
            tope--;//borro la pocisión
            JOptionPane.showMessageDialog(null, "Se Desapilo el dato: " + datoT);
        }//delete
        return datoT;
    }
    //3 METODO Mostrar Pila
    public void MostrarPila() {
        if (esVaciaPila()) {
            JOptionPane.showMessageDialog(null, "La Pila esta vacía");
        } else {
            String Salida = "";
            for (int i = 0; i < tope + 1; i++) {
                Salida += vectorPila[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, "Datos de la Pila\n" + Salida);
        }
    }
    //método 7 pasar de Cola a pila
    public void PasarDeColaAPila() {
        if (esVaciaCola()) {
            JOptionPane.showMessageDialog(null, "No se puede realizar operacion\n"
            + "No hay datos en la cola");   
        }else{//hay datos en la cola
           if (PilaLLena()) {
               JOptionPane.showMessageDialog(null, "No se puede realizar operación\n"
                + "La pila esta llena");
            } else {
               int dato=desencolar();
                apilar(dato);
            }
        }
    }
    //Método 8 pasar de pila a cola
    public void PasarDepilaACola() {
        if (esVaciaPila()) {
            JOptionPane.showMessageDialog(null, "No se puede realizar operacion\n"
            + "No hay datos en la Pila");
            
        }else{//hay datos en la Pila
           if (ColaLLena()) {
               JOptionPane.showMessageDialog(null, "No se puede realizar operación\n"
                + "La Cola esta llena");
            } else {
                encolar(desapilar());
            }
        }
    }
}
