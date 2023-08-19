package Listas;

import Nodo.Nodo;

public class Lista {
    private Nodo primero = null;
    private int cantidad = 0;

    public static Lista crear () {
        return new Lista();
    }

    public boolean vacio () {
        return cantidad == 0;
    }

    public int longitud () {
        return cantidad;
    }

    public void agregar (Object dato) {
        Nodo newNodo = new Nodo();
        newNodo.setDato(dato);
        if (cantidad == 0) {
            primero = newNodo;
        } else {
            Nodo nodo = primero;
            while (nodo.getProximo() != null) {
                nodo = nodo.getProximo();
            }
            nodo.setProximo(newNodo);
        }
        cantidad++;
    }

    public void insertar (Object dato, int pos) {
        if (cantidad == 0 || pos < 1 || pos > cantidad) {
            return;
        }
        Nodo newNodo = new Nodo();
        newNodo.setDato(dato);
        if (pos == 1) {
            newNodo.setProximo(primero);
            primero = newNodo;
        } else {
            Nodo nodo = primero;
            for (int i = 0;i < pos - 2;i++) {
                nodo = nodo.getProximo();
            }
            newNodo.setProximo(nodo.getProximo());
            nodo.setProximo(newNodo);
        }
        cantidad++;
    }

    public void eliminar (int pos) {
        if (cantidad == 0 || pos < 1 || pos > cantidad) {
            return;
        }
        if (pos == 1) {
            primero = primero.getProximo();
        } else {
            Nodo nodo = primero;
            for (int i = 0;i < pos - 2;i++) {
                nodo = nodo.getProximo();
            }
            Nodo eliminado = nodo.getProximo();
            nodo.setProximo(eliminado.getProximo());
        }
        cantidad--;
    }

    public Object recuperar (int pos) {
        if (cantidad == 0 || pos < 1 || pos > cantidad) {
            return null;
        }
        if (pos == 1) {
            return primero.getDato();
        } else {
            Nodo nodo = primero;
            for (int i = 0;i < pos - 1;i++) {
                nodo = nodo.getProximo();
            }
            return nodo.getDato();
        }
    }

    public void mostrar () {
        if (primero != null) {
            Nodo nodo = primero;
            while (nodo != null) {
                System.out.println(nodo.getDato());
                nodo = nodo.getProximo();
            }
        }
    }
}
