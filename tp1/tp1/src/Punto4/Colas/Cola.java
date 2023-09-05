package Punto4.Colas;

import Nodo.Nodo;

public class Cola {
    private Nodo fr = null;
    private Nodo fi = null;
    private int cantidad = 0;

    public void encolar (Object dato) {
        Nodo newNodo = new Nodo();
        newNodo.setDato(dato);
        if (vacio()) {
            fr = newNodo;
            fi = newNodo;
        } else {
            fi.setProximo(newNodo);
            fi = newNodo;
        }
        cantidad++;
    }

    public Object recuperar () {
        if (fr == null) {
            return null;
        }
        return fr.getDato();
    }


    public Object desencolar () {
        if (vacio()) {
            return null;
        }
        Object dato = fr.getDato();
        fr = fr.getProximo();
        if (fr == null) {
            fi = null;
        }
        return dato;
    }
    public boolean vacio () { return cantidad == 0; }
    public int longitud () { return cantidad; }

    public void mostrar () {
        if (fr != null) {
            Nodo nodo = fr;
            while (nodo != null) {
                System.out.println(nodo.getDato());
                nodo = nodo.getProximo();
            }
        }
    }
}
