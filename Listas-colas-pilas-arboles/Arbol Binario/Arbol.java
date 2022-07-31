package BinaryTree;

import javax.swing.JOptionPane;

public class Arbol {

    NodoTree raiz;
    //inicializar inicio en null

    public Arbol() {
        this.raiz = null;
    }

    //método para obtener la raiz
    public NodoTree getRaiz() {
        return raiz;
    }

    //Método 1 insertar un nodo al arbol
    public void Insertar(int dato) {
        NodoTree p = raiz, ant = null, x;
        boolean sw = false;//para saber si hay un dato igual
        while (p != null && sw == false) {
            ant = p;
            if (dato > p.getDato()) {
                p = p.getLigaDerecha();
            } else {
                if (dato < p.getDato()) {
                    p = p.getLigaIzquierda();
                } else {
                    sw = true;
                }
            }
        }
        if (sw == true) {//el dato es igual a otro dato
            JOptionPane.showMessageDialog(null, "No se puede insertar el dato, el dato ya existe");
        } else {
            x = new NodoTree(dato);
            if (raiz == null) {//el arbol esta vacío
                raiz = x;
            } else {
                if (dato < ant.getDato()) {
                    ant.setLigaIzquierda(x);
                } else {
                    ant.setLigaDerecha(x);
                }
            }
        }
    }

    //Método 2 recorrido en preorden
    public String rec_preorden(NodoTree r, String salida) {
        if (r != null) {
            salida += r.getDato() + " , ";//raiz
            salida = rec_preorden(r.getLigaIzquierda(), salida);//nodo izquierdo
            salida = rec_preorden(r.getLigaDerecha(), salida);//nodo derecho
        }
        return salida;
    }

    //Método 3 recorrido en Inorden
    public String rec_inOrden(NodoTree r, String salida) {
        if (r != null) {
            salida = rec_inOrden(r.getLigaIzquierda(), salida);//nodo izquierdo
            salida += r.getDato() + " , ";//raiz
            salida = rec_inOrden(r.getLigaDerecha(), salida);//nodo derecho
        }
        return salida;
    }

    //Método 4 recorrido en posOrden
    public String rec_posOrden(NodoTree r, String salida) {
        if (r != null) {
            salida = rec_posOrden(r.getLigaIzquierda(), salida);//nodo izquierdo
            salida = rec_posOrden(r.getLigaDerecha(), salida);//nodo derecho
            salida += r.getDato() + " , ";//raiz
        }
        return salida;
    }

    //Método 5 Mostrar hijos de un dato dado
    public void MostrarHijos(int dato) {
        NodoTree p = raiz;
        boolean EncontroDato = false;
        while (p != null && EncontroDato == false) {
            if (dato == p.getDato()) {
                EncontroDato = true;//encontro el dato
            } else {
                if (dato < p.getDato()) {//avanzo por la izquierda si el dato es menor
                    p = p.getLigaIzquierda();
                } else {//avanzo por la derecha si es mayor
                    p = p.getLigaDerecha();
                }
            }
        }
        if (EncontroDato) {//el dato se encontro
            if (p.getLigaIzquierda() == null && p.getLigaDerecha() == null) {
                JOptionPane.showMessageDialog(null, "El dato no tiene hijos");
            } else if (p.getLigaDerecha() != null && p.getLigaIzquierda() == null) {
                JOptionPane.showMessageDialog(null, "El dato solo tiene\nUn hijo a la derecha: "
                        + p.getLigaDerecha().getDato());
            } else if (p.getLigaDerecha() == null && p.getLigaIzquierda() != null) {
                JOptionPane.showMessageDialog(null, "El dato solo tiene\nUn hijo a la izquierda: "
                        + p.getLigaIzquierda().getDato());
            } else {//tiene los dos hijos
                JOptionPane.showMessageDialog(null, "Los hijos del dato son:\n"
                        + "hijo izquierdo: " + p.getLigaIzquierda().getDato()
                        + "\nhijo derecho: " + p.getLigaDerecha().getDato());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el dato");
        }
    }

    //Método 6 Eliminar un dato dado
    public boolean eliminar(int dato) {
        //posibles escenarios
        //nodo sin hijos, con un hijo o con dos
        NodoTree p = raiz;
        NodoTree ant = raiz;
        boolean hijoizq = true;
        
        while (p.getDato() != dato) {
            ant = p;
            if (dato < p.getDato()) {
                hijoizq = true;
                p = p.getLigaIzquierda();
            } else {
                hijoizq = false;
                p = p.getLigaDerecha();
            }
            if (p == null) {
               return false;
            }
        } 
        if (p.getLigaIzquierda() == null && p.getLigaDerecha() == null) {
            if (p == raiz) {
                raiz = null;
                //JOptionPane.showMessageDialog(null, "El dato se elimino");
            } else if (hijoizq) {
                ant.setLigaIzquierda(null);
                //JOptionPane.showMessageDialog(null, "El dato se elimino");
            } else {
                ant.setLigaDerecha(null);
                //JOptionPane.showMessageDialog(null, "El dato se elimino");
            }
        } else if (p.getLigaDerecha() == null) {
            if (p == raiz) {
                raiz = p.getLigaIzquierda();
               
            } else if (hijoizq) {
                ant.setLigaIzquierda(p.getLigaIzquierda());
                
            } else {
                ant.setLigaDerecha(p.getLigaIzquierda());
                
            }
        } else if (p.getLigaIzquierda() == null) {
            if (p == raiz) {
                raiz = p.getLigaDerecha();
                
            } else if (hijoizq) {
                ant.setLigaIzquierda(p.getLigaDerecha());
               
            } else {
                ant.setLigaDerecha(p.getLigaDerecha());
                
            }
        } else {
            NodoTree reemplazo = ObtenerReemplazo(p);
            if (p == raiz) {
                raiz = reemplazo;
                
            } else if (hijoizq) {
                ant.setLigaIzquierda(reemplazo);
                
            } else {
                ant.setLigaDerecha(reemplazo);
                
            }
            reemplazo.setLigaIzquierda(p.getLigaIzquierda());
        }
        return true;
        
    }

    //Método adicional para reemplazar los valores cuando tiene dos hijos
    private NodoTree ObtenerReemplazo(NodoTree nodor) {
        NodoTree reemplazarPadre = nodor;
        NodoTree reemplazo = nodor;
        NodoTree aux = nodor.getLigaDerecha();
        while (aux != null) {
            reemplazarPadre = reemplazo;
            reemplazo = aux;
            aux = aux.getLigaIzquierda();
        }
        if (reemplazo != nodor.getLigaDerecha()) {
            reemplazarPadre.setLigaIzquierda(reemplazo.getLigaDerecha());
            reemplazo.setLigaDerecha(nodor.getLigaDerecha());
        }
        return reemplazo;
    }
    //Método 8 mostrar la altura de un arbol
    int altura;
    public int AlturaArbol() {
        altura = 0;
        Altura(raiz, 1);
        return altura;
    }

    private void Altura(NodoTree p, int nivel) {
        if (p != null) {
            Altura(p.getLigaIzquierda(), nivel + 1);//cada que nace un hijo se aumenta en 1
            if (nivel > altura) {
                altura = nivel;
            }
            Altura(p.getLigaDerecha(), nivel + 1);
        }
    }
    //Método 9 datos de un nivel dado
    String[] niveles;
    String salida = "";

    public void datosNivel(int nl) {
        AlturaArbol();
        niveles = new String[altura + 1];
        if (nl > altura || nl <= 0) {
            JOptionPane.showMessageDialog(null, "El nivel que ingreso no existe en el arbol");
        } else {
            Nivel(raiz, 1);
            JOptionPane.showMessageDialog(null, "Los datos del nivel: " + nl + " son:\n " + niveles[nl]);
        }
    }

    private void Nivel(NodoTree p, int nivel) {
        if (p != null) {
            niveles[nivel] = p.getDato() + ", " + ((niveles[nivel] != null) ? niveles[nivel] : "");//almaceno los datos del mismo nivel
            Nivel(p.getLigaDerecha(), nivel + 1);//el arreglo con los datos aumenta una pocision
            Nivel(p.getLigaIzquierda(), nivel + 1);
        }
    }

//Método 10 conocer el padre de un dato dado
    public void padredato(int dato) {
        NodoTree p = raiz, ant = null;
        boolean EncontroDato = false;
        while (p != null && EncontroDato == false) {
            //ant=p;//anterior sera el padre
            if (dato == p.getDato()) {
                EncontroDato = true;//encontro el dato
            } else {
                if (dato < p.getDato()) {//avanzo por la izquierda si el dato es menor
                    ant = p;
                    p = p.getLigaIzquierda();
                } else {//avanzo por la derecha si es mayor
                    ant = p;
                    p = p.getLigaDerecha();
                }
            }
        }
        if (EncontroDato) {//el dato se encontro
            JOptionPane.showMessageDialog(null, "El padre del dato dado es: " + ant.getDato());//no me almacena el anterior
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el dato");
        }
    }

    //Método 11 conocer el hermano de un dato dado
    public void HermanoDato(int dato) {
        NodoTree p = raiz, ant = null;
        boolean EncontroDato = false;
        boolean tieneHermano = true;

        while (p != null && EncontroDato == false) {
            //ant=p;//anterior sera el padre
            if (dato == p.getDato()) {
                EncontroDato = true;//encontro el dato
            } else {
                if (dato < p.getDato()) {//avanzo por la izquierda si el dato es menor
                    ant = p;
                    p = p.getLigaIzquierda();
                } else {//avanzo por la derecha si es mayor
                    ant = p;
                    p = p.getLigaDerecha();
                }
            }
        }
        if (EncontroDato) {//el dato se encontro
            //valido si el padre tiene dos hijos
            if (raiz.getDato() == dato) {
                tieneHermano = false;
            } else {
                if (ant.getLigaDerecha() == null) {
                    tieneHermano = false;
                } else if (ant.getLigaIzquierda() == null) {
                    tieneHermano = false;
                } else {
                    tieneHermano = true;
                }
            }

            //muestro el hermano del dato 
            if (tieneHermano) {
                if (p.getDato() < ant.getDato()) {//el dato esta al lado izquierdo
                    JOptionPane.showMessageDialog(null, "El hermano del dato es el: " + ant.getLigaDerecha().getDato());
                } else {//el dato esta al lado derecho
                    JOptionPane.showMessageDialog(null, "El hermano del dato es el: " + ant.getLigaIzquierda().getDato());
                }
            } else {
                JOptionPane.showMessageDialog(null, "El dato no tiene hermano");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el dato");
        }
    }
}
