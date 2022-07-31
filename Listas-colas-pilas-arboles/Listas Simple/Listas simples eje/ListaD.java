package Listaejemplos;

import java.util.Random;
import javax.swing.JOptionPane;

public class ListaD {

    NodoD cab;
    NodoD ult;

    //Metodo constructor
    public ListaD() {
        cab = null;
        ult = null;
    }

    //Metodo utilizado para denotar que la lista se encuentra vacia.
    public boolean siVacio() {
        return (cab == null);
    }

    //Metodo retorna la cantidad de nodos de la lista.
    public int contar() {
        NodoD actual;
        actual = cab;
        int cont = 0;
        while (actual != null) {
            cont++;
            actual = actual.sig;
        }
        return cont;
    }

    public ListaD agregarInicio(int entrada) {
        NodoD nuevo;
        nuevo = new NodoD(entrada);
        if (cab == null) {
            cab = nuevo;
            ult = nuevo;
        } else {
            nuevo.sig = cab;
            cab.ant = nuevo;
            cab = nuevo;
        }
        return this;

    }

    //Metodo para agregar al ultal de la lista.
    public ListaD agregarFinal(int dato) {
        NodoD nuevo = new NodoD(dato);
        if (siVacio()) {
            cab = nuevo;
            ult = nuevo;
        } else {
            ult.sig = nuevo;
            nuevo.ant = ult;
            ult = nuevo;
        }
        return this;
    }

    //Metodo para crear lista con nodos aleatorios al ultal de la lista.
    public ListaD generarNodosAleatorios() {
        Random aleatorio = new Random();
        int limite = aleatorio.nextInt(12);
        JOptionPane.showMessageDialog(null, " valor limite " + limite);
        //agrego numeros aleatorios a la lista
        cab = null;
        ult = null;
        for (int i = 0; i < limite; i++) {
            agregarInicio(aleatorio.nextInt(100));
        }
        return this;
    }

    //buscar un valor y retornar el valor  anterior
    public int buscarX(int x) {
        NodoD actual;
        actual = cab;
        boolean enc = false;
        int valor = -1;
        if (!siVacio()) {
            while ((actual != null) && (enc == false)) {
                if (actual.dato == x) {
                    enc = true;
                    if (actual.ant != null) {
                        valor = actual.ant.dato;
                    }
                }
                actual = actual.sig;
            }
        }
        return valor;
    }

    //buscar un valor y retornar el valor  sig
    // buscar un valor X y retorna la primera posicion donde lo encuentra
    public int buscarX_pos(int x) {
        boolean enc = false;
        NodoD actual;
        actual = cab;
        int cont = 0;
        if (!siVacio()) {
            while ((actual != null) && (enc == false)) {
                if (actual.dato == x) {
                    enc = true;
                }
                cont++;
                actual = actual.sig;
            }
        }
        return cont;
    }

    // buscar un valor X y retorna la boolean
    public boolean buscarValor(int x) {
        boolean enc = false;
        NodoD actual;
        actual = ult;
        if (actual != null) {
            while ((actual != null) && (enc == false)) {
                if (actual.dato == x) {
                    enc = true;
                }
                actual = actual.ant;
            }
        }
        return enc;
    }

    // buscar un valor X y reemplazarlo por Y
    public ListaD buscarReemplazar(int x, int y) {

        return this;
    }

    // buscar un valor X y eliminarlo de la lista
    public ListaD elimNodoX(int x) {
        NodoD p, q;
        p = cab;
        if (!siVacio()) {
            while (p != null) {
                if (p.dato == x) {
                    if (cab == p) {
                        if (cab == ult) {
                            cab = ult = null;
                        } else {
                            cab = cab.sig;
                            cab.ant = null;
                            p = cab;
                        }
                    } else {
                        if (p == ult) {
                            ult = p.ant;
                            ult.sig = null;
                        } else {
                            q = p.ant;
                            p = p.sig;
                            q.sig = p;
                            p.ant = q;
                        }
                    }
                }
                if ((cab.dato != x) && (p != null)) {
                    p = p.sig;
                }

            }
        }
        return this;
    }

    //metodo que muestra el contenido de la lista
    //por linea muestra 15 nodos
    public String mostrar() {
        String cad = "";
        NodoD actual;
        actual = cab;
        while (actual != null) {
            cad = cad + actual.dato + " , ";
            actual = actual.sig;
        }
        return cad;

    }//ult metodo mostrar

    //metodo que muestra el contenido de la lista
    //por linea muestra 15 nodos
    public boolean capicua() {
        boolean resp = true;
        NodoD p, q;
        p = cab;
        q = ult;
        while ((p != null) && resp) {
            if (p != q) {
                if (p.dato != q.dato) {
                    resp = false;
                }
                p = p.sig;
                q = q.ant;
            } else {
                break;
            }
        }
        return resp;

    }//ult metodo mostrar

    //metodo intercambiar el primero con el ultimo y realizar lo mismo cada 3 pisiciones
    public ListaD interiniult() {
        NodoD p, q;
        p = cab;
        q = ult;
        int aux;
        boolean centro = false;
        while ((p != null) && (centro == false)) {
            aux = p.dato;
            p.dato = q.dato;
            q.dato = aux;
            for (int i = 0; (i < 2 && p != null && q != null); i++) {
                if ((p != q) && (q.ant != p)) {
                    p = p.sig; //corre un nodo adelante
                    q = q.ant; //corre un nodo atras    
                } else {
                    centro = true;
                }
            }
        }
        return this;
    }//interiniult

    public void sumaExtremos(int x) {
        NodoD p, q;
        p = cab;
        q = p;
        int sizq = 0;
        int sder = 0;
        boolean enc = false;
        while ((p != null) && (enc == false)) {
            if (p.dato == x) {
                q = p;
                enc = true;
            } else {
                p = p.sig;
            }
        }

        if (enc == true) {
            p = p.sig;
            q = q.ant;
            while (p != null) {
                sder = sder + p.dato;
                p = p.sig;
            }

            while (q != null) {
                sizq = sizq + q.dato;
                q = q.ant;
            }
            JOptionPane.showMessageDialog(null, "numero " + x + " fue encontrado"
                    + "\n sumatoria derecha " + sder
                    + "\n sumatoria izq " + sizq);
        } else {
            JOptionPane.showMessageDialog(null, " numero no fue encontrado en la lista ");
        }
    }//ult metodo

    public void buscarMy_par_imp() {
        NodoD p, q = null;
        p = cab;
        int may = 0;
        int contp = 0;
        int conti = 0;
        //busco el mayor
        while ((p != null)) {
            if (p.dato > may) {
                may = p.dato;
                // guardo la posicion del mayor en q
                q = p;
            }
            p = p.sig;
        }
        //ubico a p en la posicion del mayor
        p = q;
        //corro adelante una posicion del mayor
        p = p.sig;
        // corro attras una posicion del mayor  
        q = q.ant;

        String cadi, cadp;
        cadi = cadp = " ";
        //cuento los pares a la izq del numero mayor
        while (q != null) {
            if ((q.dato % 2) == 0) {
                contp = contp + 1;
                cadp = cadp + q.dato + ",";
            }
            q = q.ant;
        }
        // cuento los impares a la der del numero mayor
        while (p != null) {
            if ((p.dato % 2) != 0) {
                conti = conti + 1;
                cadi = cadi + p.dato + ",";
            }
            p = p.sig;
        }

        JOptionPane.showMessageDialog(null, "mayor es " + may
                + "\n la cantidad de pares a la izq del mayor son " + contp + " La lista de pares son " + cadp
                + "\n  la cantidad de impares a la der del mayor son " + conti + " La lista de pares son " + cadi);

    }//ult metodo mostrar

}// Fin clase Lista


