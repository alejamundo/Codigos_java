
package listas;

//clase Lista
import java.util.*;
import javax.swing.*;

public class Lista {

    Nodo cab;
    Nodo fin;

    //Metodo constructor
    public Lista() {
    }

    public void agregarInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cab == null) {
            cab = nuevo;
            fin = nuevo;
        } else {
            nuevo.enlace = cab;
            cab = nuevo;
        }
    }

    public void agregarFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cab == null) {
            cab = nuevo;
            fin = nuevo;
        } else {
            fin.enlace = nuevo;
            fin = nuevo;
        }
    }

    public String mostrar() {
        String cad = "";
        Nodo actual;
        actual = cab;
        int m;
        
        if (cab!=null){
            cad="lista vacia";
        }else{
            
        }
        while (actual != null) {
            cad = cad + actual.dato + " , ";
            actual = actual.enlace;
        }
        return cad;
    }

    public int contar() {
        Nodo actual = cab;
        int contador = 0;
        while (actual != null) {
            contador = contador + 1;
            actual = actual.enlace;
        }
        return contador;
    }

    // buscar un valor x en la lista y retornar true (si lo encuentra)
    // o false en caso contrario.
    public boolean buscarValor(int x) {
        Nodo actual;
        boolean resp = false;
        if (cab != null) {
            actual = cab;
            while (actual != null) {
                if ((actual.dato == x) && (resp == false)) {
                    resp = true;
                }
                actual = actual.enlace;
            }
        }
        return resp;
    }

    //asignar valores aleatorios
    public void asignarAleatorio() {
        Random aleatorio = new Random();
        int lim = aleatorio.nextInt(15);

        for (int i = 0; i < lim; i++) {
            agregarFinal(aleatorio.nextInt(100));
        }
    }

    //intercambiar valores ubicados en los nodos cabeza y fin
    public void intercambioCabFin() {
        int aux = cab.dato;
        cab.dato = fin.dato;
        fin.dato = aux;
    }

    // contar pares de la lista
    public int contarPares() {
        Nodo actual = cab;
        int contador = 0;
        while (actual != null) {
            if (actual.dato % 2 == 0) {
                contador++;
            }
            actual = actual.enlace;
        }
        return contador;
    }

    // sumar impares
    public int sumarImpares() {
        Nodo actual = cab;
        int suma = 0;
        while (actual != null) {
            if (actual.dato % 2 != 0) {
                suma = suma + actual.dato;
            }
            actual = actual.enlace;
        }
        return suma;
    }

    // buscar un valor x en la lista y retornar true (si lo encuentra)
    // o false en caso contrario.
    public void buscarReemplazar(int x, int y) {
        Nodo actual;
        if (cab != null) {
            actual = cab;
            while (actual != null) {
                if (actual.dato == x) {
                    actual.dato = y;
                }
                actual = actual.enlace;
            }
        }
    }

    // contar pares de la lista
    public int contarParesPosImpares() {
        Nodo actual = cab;
        int contadorpar = 0;
        int pos = 0;
        while (actual != null) {
            pos = pos + 1;
            if ((actual.dato % 2 == 0) && ((pos % 2) != 0)) {
                contadorpar++;
            }
            actual = actual.enlace;
        }
        return contadorpar;
    }

    public void invertir() {
        int contnodos = contar();
        int aux = 0;
        Nodo act1, act2;
        int n = contnodos;
        if (cab != null) {
            act1 = cab;
            while (n > (contnodos / 2)) {
                act2 = cab;
                for (int i = 1; i < n; i++) {
                    act2 = act2.enlace;
                }
                aux = act1.dato;
                act1.dato = act2.dato;
                act2.dato = aux;
                act1 = act1.enlace;
                n = n - 1;
            }
        }
    }
    
    public void eliminarNodo(int y) {
        Nodo p, q;
        p = q = cab;
        JOptionPane.showMessageDialog(null, " Eliminar Nodo");
        if (cab != null) {
            while (p != null) {
                if (p.dato ==y ) {
                                   if (p == cab) {// x se encuentra en el nodo cab
                                         cab = cab.enlace;
                                         p = q = cab;
                                        } 
                                   else if (p == fin) //x se encuentra en el nodo fin
                                        {  fin = q;
                                            fin.enlace = null;
                                            break;
                                        } 
                                   else { // x se encuentra en un nodo intermedio 
                                            q.enlace = p.enlace;
                                            p = q.enlace;
                                        }
                }
                q = p;  // ubicado q en la posicion de p
                p = p.enlace;      //avanza p
            }//cierre  while 
           } 
        else {
            JOptionPane.showMessageDialog(null, " lista vacia");
        }

    }
    
   public int productopares() {
        Nodo actual = cab;
        int calcu_pro = 0;
        int pos = 0;
        while (actual != null) {
            pos = pos + 1;
            if ((actual.dato % 2 == 0) && ((pos % 2) != 0)) {
                 calcu_pro = calcu_pro * actual.dato;
            }
            actual = actual.enlace;
        }
        return calcu_pro;
    }
        
   



    
    
}// Fin clase Lista

