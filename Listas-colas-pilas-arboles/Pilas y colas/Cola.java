package Taller;

import javax.swing.JOptionPane;

public class Cola {

    int tam;
    int primero;
    int ultimo;
    int vectorCola[];

    //M�todo Constructor
    public Cola(int tam) {
        this.tam = tam;
        vectorCola = new int[tam];
        primero = -1;
        ultimo = -1;
    }

    //Metodo privado para saber si esta vac�a La 
    public boolean esVaciaCola() {
        if (primero == -1) {
            return true;
        } else {
            return false;
        }
    }

    //Metodo para ordenar los datos de forma que los ceros queden de ultimo
    public void OrdenoBurbuja() {
        int temp;

        //Método de ordenamiento Burbuja en forma Ascendente fin: que los ceros(vacios)queden al final
        for (int i = 0; i < vectorCola.length; i++) {
            for (int j = 0; j < vectorCola.length - 1; j++) {//pos 0
                if (vectorCola[j] < vectorCola[j + 1]) {//pos 0> 0
                    if (vectorCola[j] == 0) {//muevo a ultimo el 0 o vacio
                        temp = vectorCola[j];//tem=primer dato
                        vectorCola[j] = vectorCola[j + 1];//primerdato va hacer el segundo
                        vectorCola[j + 1] = temp;//segundo dato va hacer el primero
                    }

                }
            }
        }//Fin Ordenamiento Burbuja

    }
    //

    //método para saber si la cola esta llena
    public boolean ColaLLena() {
        boolean llena=false;
        OrdenoBurbuja();
        if (ultimo == tam - 1) {
            if (vectorCola[ultimo]==0) {
                ultimo--;
                llena=false;
            }
            llena=true;
        } else {
            llena=false;
        }
        return llena;
    }

//M�todo 4 encolar
    public void encolar(int dato) {
        if (ultimo == tam - 1) {
            JOptionPane.showMessageDialog(null, "No se puede Encolar, No queda mas espacio en el vector");
        } else {
            ultimo++;
            vectorCola[ultimo] = dato;
            if (ultimo == 0) {
                primero = 0;
            }
            JOptionPane.showMessageDialog(null, "Se Encolo un dato");
        }
    }

    //M�todo 5 Desencolar
    public int desencolar() {
        int dato = 0;
        if (esVaciaCola()) {
            JOptionPane.showMessageDialog(null, "No se puede Desencolar, La cola esta vacía");
        } else {
            dato = vectorCola[primero];//alamaceno el dato antes de boralo
            if (primero == ultimo) {//solo hay un dato en la Cola
                vectorCola[primero] =0 ;//lo pongo vacio
                primero = -1;
                ultimo = -1;

                //se desencolo el unico dato existente
                JOptionPane.showMessageDialog(null, "Se Desencolo el dato: " + dato);

            } else {
                vectorCola[primero] = 0;//lo pongo vacio
                primero = primero + 1;
                for (int i = primero; i < ultimo + 1; i++) { //necesitas recorrer el primer campo del vector para que ordene los datos.
                    vectorCola[i - 1] = vectorCola[i];
                }

                ultimo--;
                primero = 0;
                
                
                JOptionPane.showMessageDialog(null, "Se Desencolo el dato: " + dato);

            }//Desencolo el primer dato
        }
        return (dato);
    }

    //M�todo 6 Mostrar cola
    public void mostrarCola() {
        if (esVaciaCola()) {
            JOptionPane.showMessageDialog(null, "La Cola esta vacía");
        } else {
            String salida = "";
            for (int i = primero; i < ultimo + 1; i++) {
                salida += vectorCola[i] + " , ";
            }
            JOptionPane.showMessageDialog(null, "Datos de la Cola\n" + salida);
        }
    }

}
