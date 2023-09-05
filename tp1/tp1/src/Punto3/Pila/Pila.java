package Punto3.Pila;

import Nodo.Nodo;

public class Pila {
    Nodo tope = null;
    int cantidad = 0;

    public void apilar (Object dato) {
        Nodo newNodo = new Nodo();
        newNodo.setDato(dato);

        if (tope != null) {
            newNodo.setProximo(tope);
        }
        tope = newNodo;
        cantidad++;
    }

    public Object tope () {
        if (tope == null) {
            return null;
        }
        return tope.getDato();
    }

    public Object desapilar () {
        if (vacio()) {
            return null;
        }
        Object dato = tope.getDato();
        tope = tope.getProximo();
        return dato;
    }

    public boolean vacio () { return cantidad == 0; }
    public int longitud () { return cantidad; }

    public void mostrar () {
        if (tope != null) {
            Nodo nodo = tope;
            while (nodo != null) {
                System.out.println(nodo.getDato());
                nodo = nodo.getProximo();
            }
        }
    }
}
