package Dobles;

import javax.swing.JOptionPane;

public class Lista {

    //Atributos de la clase 
    private Nodo cab, ult;

    public Lista() {//Constructor que inicializa los apuntadores de la Lista
        this.cab = null;
        this.ult = null;
    }

    //Metodo para validar si la lista esta vacía
    private boolean ListaVacia() {
        if (cab == null) {//Lista vacía
            return true;
        } else {
            return false;
        }
    }

    //método para saber si hay un solo dato en la lista
    private boolean HayUnNodo() {
        if (!ListaVacia() && cab.getSig() == null) {//hay un solo dato
            return true;
        } else {
            return false;
        }
    }

    //Método 1 Mostrar Lista doblemente Ligada
    public void Mostrar() {
        Nodo p = cab;//con p rrecorro toda la lista
        String salida = "";//almacenar la cadena de datos que proporciona la lista
        if (ListaVacia()) {
            JOptionPane.showMessageDialog(null, "Lista vacía");
        } else {
            while (p != null) {
                salida += p.getDato() + " , ";
                p = p.getSig();//i++, avanza una pocisión      
            }
            JOptionPane.showMessageDialog(null, "Datos de la Lista\n" + salida);
        }
    }

    public void InsertarInicio(int dato) {
        Nodo x = new Nodo(dato);//creo nodo con datos del constructor clase Nodo
        if (ListaVacia()) {//lista vacía, insertar dato al inicio
            cab = x;//x va ser el primer dato
            ult = x;//x va ser el ultimo dato 
            JOptionPane.showMessageDialog(null, "Dato Insertado");
        } else {//hay mas de un dato
            cab.setAnt(x);//a la liga anterior del primero le llevo la x
            x.setSig(cab);//a x en su campo liga siguente le llebo cab
            cab = x;
            JOptionPane.showMessageDialog(null, "Dato Insertado");
        }
    }

    public void InsertarFinal(int dato) {
        Nodo x = new Nodo(dato);//Creo nuevo Nodo
        if (ListaVacia()) {//insertar ultimo
            cab = x;
            ult = x;
            JOptionPane.showMessageDialog(null, "Dato Insertado");
        } else {
            ult.setSig(x);
            x.setAnt(ult);
            ult = x;
            JOptionPane.showMessageDialog(null, "Dato Insertado");
        }
    }

    public void EliminarUltimo() {
        if (ListaVacia()) {
            JOptionPane.showMessageDialog(null, "Lista vacía, no se puede Eliminar");
        } else {
            if (HayUnNodo()) {//eliminar ese
                cab = null;
                ult = null;
                JOptionPane.showMessageDialog(null, "Dato eliminado");
            } else {
                ult = ult.getAnt();
                ult.setSig(null);
                JOptionPane.showMessageDialog(null, "Dato eliminado");
            }
        }
    }

    //Métoso para eliminar el primero
    public void EliminarPrimero() {
        if (ListaVacia()) {//no se puede
            JOptionPane.showMessageDialog(null, "Lista vacía, No se Puede Eliminar");
        } else {
            if (HayUnNodo()) {//elimino el unico
                cab = null;
                ult = null;
                JOptionPane.showMessageDialog(null, "Dato eliminado");
            } else {
                cab = cab.getSig();
                cab.setAnt(null);
                JOptionPane.showMessageDialog(null, "Dato eliminado");
            }
        }
    }

    public void InsertarAntesRef() { 
        
        if (ListaVacia()) {//no se puede hacer nada
            JOptionPane.showMessageDialog(null, "Lista vacía, no se puede realizar operación");
        } else {//si esta llena
            int ref = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato de referencia"));
            int dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a insertar"));
            Nodo x=new Nodo(dato);//creo nodo
            if (HayUnNodo()) {//comparar e insertar antes del inicio
                if (ref == cab.getDato()) {
                    x.setSig(cab);
                    cab.setAnt(x);
                    cab = x;
                    ult = x;
                    JOptionPane.showMessageDialog(null, "Dato Insertado");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontra el dato de referencia");
                }
            } else {//hay muchos nodos
                if (cab.getDato() == ref) {//si la cabeza es el dato
                    cab.setAnt(x);
                    x.setSig(cab);
                    cab = x;
                    JOptionPane.showMessageDialog(null, "Dato insertado");
                } else if(ult.getDato()==ref){//el dato no esta en el primer nodo, ¿estara en el ultimo?
                    ult.getAnt().setSig(x);
                    x.setAnt(ult.getAnt());
                    x.setSig(ult);
                    ult.setAnt(x);
                    JOptionPane.showMessageDialog(null, "Dato insertado");
                }else if(cab.getDato()!=ref && ult.getDato()!=ref){

                    Nodo p = cab;//recorre hasta encontrar el dato;
                    boolean encontro = false;//para saber si lo encontro o no en un ciclo
                    while (p != null) {
                        if (p.getDato() == ref) {
                           encontro=true;
                        }
                        p=p.getSig();
                    }
                    p=cab;//reiniciar recorrido
                    if (encontro) {
                        while (p.getDato()!=ref) {                            
                            p=p.getSig();
                        }
                        p.getAnt().setSig(x);
                        x.setAnt(p.getAnt());
                        x.setSig(p);
                        p.setAnt(x);
                        JOptionPane.showMessageDialog(null, "Dato insertado");
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "El dato de referencia no se encontro.");
                }

            }

        }
    }

    public void InsertarDespuesRef(int dato) {
    }

}
