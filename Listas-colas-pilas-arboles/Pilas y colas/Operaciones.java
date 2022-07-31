package ejerpilascolas;

import javax.swing.JOptionPane;

public class Operaciones {

    public static void invertirCola(Cola cInicial) {
        Cola cAuxiliar = new Cola();
        cAuxiliar.definirmagnitud(cInicial.max);//define el tamaño de pila 2
        int suma = 1, dato = 0;
        //desapilo de  inicial y apilo en la pila p2. Acumula el valor desapilado
        while (cInicial.ult > 0) {
            dato = cInicial.descolar();

            suma = suma * dato;

            cAuxiliar.encolar(dato);
        }
        while (cAuxiliar.ult > 0) {
            dato = cAuxiliar.descolar();
            cInicial.encolar(dato);
        }
        JOptionPane.showMessageDialog(null, "Se invirtio la Cola");

    }

    public static void invertirPila(Cola cInicial) {
        Cola cAuxiliar = new Cola();
        cAuxiliar.definirmagnitud(cInicial.max);//define el tamaño de pila 2
        int suma = 1, dato = 0;
        //desapilo de  inicial y apilo en la pila p2. Acumula el valor desapilado
        while (cInicial.ult > 0) {
            dato = cInicial.descolar();

            suma = suma * dato;

            cAuxiliar.encolar(dato);
        }
        while (cAuxiliar.ult > 0) {
            dato = cAuxiliar.descolar();
            cInicial.encolar(dato);
        }
        JOptionPane.showMessageDialog(null, "Se invirtio la Pila");
    }
}
