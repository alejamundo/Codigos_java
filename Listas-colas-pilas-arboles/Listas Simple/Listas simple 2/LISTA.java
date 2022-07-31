package listasSimples;

import javax.swing.JOptionPane;

public class LISTA {

    private Nodo cab;

    public LISTA() {
        this.cab = null;
    }

    //Método 1 Mostrar
    public void mostrar() {
        Nodo p = cab;
        String Salida = "";

        if (cab == null) {
            JOptionPane.showMessageDialog(null, "La Lista esta  vacía");
        } else {
            while (p != null) {
                Salida += p.getDato() + " , ";
                p = p.getLiga();
            }
            JOptionPane.showMessageDialog(null, "Datos de la lista: \n" + Salida);
        }
    }

    //Método 2 insertar al inicio
    public void insertarInicio(int dato) {
        Nodo x = new Nodo(dato);
        x.setLiga(cab);
        cab = x;
        JOptionPane.showMessageDialog(null, "Dato insertado al inicio");
    }

    //Método 3 insertar al Final
    public void insertarFinal(int dato) {
        Nodo p = cab, X = new Nodo(dato);
        if (cab == null) {
            cab = X;
        } else {
            while (p.getLiga() != null) {
                p = p.getLiga();
            }
            p.setLiga(X);
        }
        JOptionPane.showMessageDialog(null, "Dato insertado al final");
    }

    //Método 4 eliminar el mayor
    public void eliminarMayor() {
        Nodo p = cab, ant = null;
        int mayor = 0;
        if (cab == null || cab.getLiga() == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacía o hay un solo dato");
        } else {
            mayor = cab.getDato();
            while (p != null) {
                if (p.getDato() > mayor) {
                    mayor = p.getDato();
                }
                p = p.getLiga();
            }
            p = cab;
            while (p.getDato() != mayor) {
                ant = p;
                p = p.getLiga();
            }
            if (p == cab) {
                cab = cab.getLiga();
                JOptionPane.showMessageDialog(null, "Dato eliminado");
            } else {
                ant.setLiga(p.getLiga());
                JOptionPane.showMessageDialog(null, "Dato eliminado");
            }

        }
    }

    //Método 5 Eliminar el primer impar
    public void eliminarPrimerImpar() {
        Nodo p = cab, ant = null;
        int impar = 0;
        boolean sw = false;
        if (cab == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacía ");
        } else {
            while (p != null && sw == false) {
                if (p.getDato() % 2 != 0) {
                    impar = p.getDato();
                    sw = true;
                }
                p = p.getLiga();
            }
            if (impar == 0) {//no hay impares
                JOptionPane.showMessageDialog(null, "No se necuentran número impares");
            } else {
                p = cab;
                while (p.getDato() != impar) {
                    ant = p;
                    p = p.getLiga();
                }
                if (p == cab) {//si hay un solo dato impar se elimina
                    cab = cab.getLiga();
                    JOptionPane.showMessageDialog(null, "Dato eliminado");
                } else {
                    ant.setLiga(p.getLiga());
                    JOptionPane.showMessageDialog(null, "Dato eliminado");
                }
            }
        }
    }

    //Método 6 Insertar despues del primero
    public void insertarDespuesPrimero(int dato) {
        Nodo p = cab;
        if (cab == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacía no se puede insertar");
        } else {
            Nodo x = new Nodo(dato);
            x.setLiga(p.getLiga());
            cab.setLiga(x);
            JOptionPane.showMessageDialog(null, "Dato insertado");
        }
    }

    //Método 7 insertar antes del menor  
    public void insertarAntesMenor(int dato) {
        Nodo p = cab, ant = null;
        int menor;
        if (cab == null) {
            JOptionPane.showMessageDialog(null, "lista vacía");
        } else {
            menor = cab.getDato();
            while (p != null) {
                if (p.getDato() < menor) {
                    menor = p.getDato();
                }
                p = p.getLiga();
            }
            p = cab;
            while (p != null) {
                if (menor == p.getDato()) {
                    if (p == cab) {
                        Nodo x = new Nodo(dato);
                        cab = x;
                        x.setLiga(p);
                        ant = p;
                        p = p.getLiga();

                    } else {
                        Nodo x = new Nodo(dato);
                        ant.setLiga(x);
                        x.setLiga(p);
                        ant = p;
                        p = p.getLiga();
                    }
                } else {
                    ant = p;
                    p = p.getLiga();
                }
            }

            //cab.setLiga(x);
            JOptionPane.showMessageDialog(null, "Dato insertado");
        }
    }

    //Método 8 segun la condicion eliminar o insertar
    public void segunEliminarInsertar() {
        Nodo p = cab, ant = null;
        if (cab == null || cab.getLiga() == null) {
            JOptionPane.showMessageDialog(null, "lista vacia \n no se puede insertar porque solo hay un nodo");
        } else {
            Nodo s = cab.getLiga();
            if (cab.getLiga().getDato() % 2 == 0) {
                while (p.getLiga() != null) {
                    ant = p;
                    p = p.getLiga();
                }
                ant.setLiga(null);
                JOptionPane.showMessageDialog(null, "Se El ultomo Nodo");
                //delete(p) aqui se libera el Nodo
            } else {
                int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato a insertar"));
                p = new Nodo(dato);
                p.setLiga(cab);
                cab = p;
                JOptionPane.showMessageDialog(null, "Dato insertado al inicio");
            }
        }
    }

    //Método 9 insertar antes del ultimo
    public void insertarAntesUltimo(int dato) {
        Nodo p = cab, ant = null;
        Nodo X = new Nodo(dato);
        if (cab == null || cab.getLiga() == null) {
            JOptionPane.showMessageDialog(null, "lista vacia \n no se puede insertar porque solo hay un nodo");
        } else {
            while (p.getLiga() != null) {
                ant = p;
                p = p.getLiga();
            }
            ant.setLiga(X);
            X.setLiga(p);
            JOptionPane.showMessageDialog(null, "Dato insertado");
        }
    }

    //Método 10 eliminar todos los impares
    public void eliminarImpares() {         //Ojo arreglar
        Nodo p = cab, ant = null;
        int impar = 0;
        if (cab == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacía");
        } else {
            boolean existenImpares = false;
            while (p != null) {
                if (p.getDato() % 2 != 0) {
                    // cab=cab.getLiga();
                    if (p == cab) {
                        cab = p.getLiga();
                        p.setLiga(null);
                        p = cab;
                    } else {
                        ant.setLiga(p.getLiga());
                        p = ant.getLiga();
                    }
                    existenImpares = true;
                } else {
                    ant = p;
                    p = p.getLiga();
                }
            }
            if (existenImpares) {
                JOptionPane.showMessageDialog(null, "Datos eliminados");
            } else {
                JOptionPane.showMessageDialog(null, "No existen datos impares");
            }

        }
    }

    //Método 11 Eliminar todos nodos
    public void EliminarTodos() {
        Nodo p = cab;
        if (cab == null) {
            JOptionPane.showMessageDialog(null, "Lista vacía");
        } else {
            while (p != null) {
                if (p == cab) {
                    p = p.getLiga();
                    cab = cab.getLiga();
                }
            }
            JOptionPane.showMessageDialog(null, "Lista eliminada");
        }
    }

    //Método 12 insertar antes de referencia
    public void insertarAntesDeReferencia() {
        Nodo p = cab, ant = null;
        if (cab == null) {//no se puede hacer nada
            JOptionPane.showMessageDialog(null, "Lista vacía, no se puede realizar operación");
        } else {//si esta llena
            int ref = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato de referencia"));
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato a insertar"));
            Nodo x = new Nodo(dato);//creo nodo
            if (cab.getLiga() == null) {//comparar e insertar antes del inicio
                if (ref == cab.getDato()) {
                    x.setLiga(cab);
                    cab = x;
                    JOptionPane.showMessageDialog(null, "Dato Insertado");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontra el dato de referencia");
                }
            } else {//hay muchos nodos
                if (cab.getDato() == ref) {//si la cabeza es el dato
                    x.setLiga(cab);
                    cab = x;
                    JOptionPane.showMessageDialog(null, "Dato insertado");
                } else { //buscar dato en la lista ya que no es el primero
                    p = cab;//recorre hasta encontrar el dato;
                    boolean encontro = false;//para saber si lo encontro o no en un ciclo
                    while (p != null) {
                        if (p.getDato() == ref) {
                            encontro = true;
                        }
                        p = p.getLiga();
                    }
                    p = cab;//reiniciar recorrido
                    if (encontro) {
                        while (p.getDato() != ref) {
                            ant = p;
                            p = p.getLiga();
                        }
                        ant.setLiga(x);
                        x.setLiga(p);
                        JOptionPane.showMessageDialog(null, "Dato insertado");
                    } else {
                        JOptionPane.showMessageDialog(null, "El dato de referencia no se encontro.");
                    }
                }
            }
        }
    }

    //Método 13 eliminar penultimo
    public void EliminarPenultimo() {
        Nodo p = cab, ant = null, antp = null;

        if (cab == null || cab.getLiga() == null) {
            JOptionPane.showMessageDialog(null, "Lista vacía o hay un solo Nodo ");
        } else {//si esta llena
            while (p.getLiga() != null) {//se repite hasta que encontremos el ultimo nodo
                antp = ant;
                ant = p;
                p = p.getLiga();
            }
            if (antp==null) {//es por que hay solo dos Nodos se elimina el primero y cambiamos cabeza
                ant.setLiga(null);
                cab=p;
                JOptionPane.showMessageDialog(null, "Nodo eliminado ");
            }else{//hay mas de dos
                antp.setLiga(p);
                JOptionPane.showMessageDialog(null, "Nodo eliminado ");
            }    
        }
    }
}
