package BinaryTree;

import javax.swing.JOptionPane;

/**
 *
 * @author AlejaMundo
 */
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

    //Insertar
    public void Insertar(int dato) {
        NodoTree p = raiz, ant = null, x;
        boolean sw = false;
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
        if (sw == true) {
            JOptionPane.showMessageDialog(null, "No se puede insertar el dato, el dato ya existe");
        } else {
            x = new NodoTree(dato);
            if (raiz == null) {
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

    //recorridos preorden
    public String rec_preorden(NodoTree r, String salida) {
        if (r != null) {
            salida += r.getDato() + " , ";//raiz
            salida = rec_preorden(r.getLigaIzquierda(), salida);//nodo izquierdo
            salida = rec_preorden(r.getLigaDerecha(), salida);//nodo derecho
        }
        return salida;
    }

    //recorridos inordeno
    public String rec_inOrden(NodoTree r, String salida) {
        if (r != null) {
            salida = rec_inOrden(r.getLigaIzquierda(), salida);//nodo izquierdo
            salida += r.getDato() + " , ";//raiz
            salida = rec_inOrden(r.getLigaDerecha(), salida);//nodo derecho
        }
        return salida;
    }

    //recorrido posOrden
    public String rec_posOrden(NodoTree r, String salida) {
        if (r != null) {
            salida = rec_posOrden(r.getLigaIzquierda(), salida);//nodo izquierdo
            salida = rec_posOrden(r.getLigaDerecha(), salida);//nodo derecho
            salida += r.getDato() + " , ";//raiz
        }
        return salida;
    }

    //Mostrar hijos de un dato dado
    public void MostrarHijos(NodoTree r, int dato) {
        NodoTree p = raiz, ant = null;
        boolean sw = false;
        if (p == null) {
            JOptionPane.showMessageDialog(null, "El arbo esta vacío");
        } else {
            while (p != null && sw == false) {

                if (dato == p.getDato()) {
                    sw = true;
                } else {
                    if (dato < p.getDato()) {
                        p = p.getLigaIzquierda();
                    } else {
                        p = p.getLigaDerecha();
                    }
                }
            }
            if (sw) {//el dato se encontro
                if (p.getLigaIzquierda() == null && p.getLigaDerecha() == null) {
                    JOptionPane.showMessageDialog(null, "El dato no tiene hijos");
                } else if (p.getLigaDerecha() != null && p.getLigaIzquierda() == null) {
                    JOptionPane.showMessageDialog(null, "El dato solo tiene un hijo a la derecha:"
                            + p.getLigaDerecha().getDato());
                } else if (p.getLigaDerecha() == null && p.getLigaIzquierda() != null) {
                    JOptionPane.showMessageDialog(null, "El dato solo tiene un hijo a la izquierda:"
                            + p.getLigaIzquierda().getDato());
                } else {//tiene los dos hijos
                    JOptionPane.showConfirmDialog(null, "Los hijos del dato son: "
                            + "hijo izquierdo: " + p.getLigaIzquierda().getDato()
                            + "hijo derecho: " + p.getLigaDerecha().getDato());
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el dato");
            }
        }
    }
}
