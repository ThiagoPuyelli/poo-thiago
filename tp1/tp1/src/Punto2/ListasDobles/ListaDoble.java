package Punto2.ListasDobles;

public class ListaDoble {
    NodoDoble primero = null;
    int cantidad = 0;

    public void agregar (Object dato) {
        NodoDoble newNodo = new NodoDoble();
        newNodo.setDato(dato);
        if (primero == null) {
            primero = newNodo;
        } else {
            NodoDoble nodo = primero;
            while (nodo.getProximo() != null) {
                nodo = nodo.getProximo();
            }
            nodo.setProximo(newNodo);
            newNodo.setAnterior(nodo);
        }
        cantidad++;
    }

    public void insertar (Object dato, int pos) {
        if (vacio() || pos < 1 || pos > cantidad) {
            return;
        }
        NodoDoble newNodo = new NodoDoble();
        newNodo.setDato(dato);
        NodoDoble nodo = primero;
        if (pos == 1) {
            nodo.setAnterior(newNodo);
            newNodo.setProximo(nodo);
            primero = newNodo;
        } else {
            for (int i = 1;i < pos;i++) {
                nodo = nodo.getProximo();
            }

            newNodo.setProximo(nodo);
            newNodo.setAnterior(nodo.getAnterior());
            nodo.getAnterior().setProximo(newNodo);
            nodo.setAnterior(newNodo);
        }
        cantidad++;
    }

    public void eliminar (int pos) {
        if (vacio() || pos < 1 || pos > cantidad) {
            return;
        }

        if (pos == 1) {
            primero = primero.getProximo();
            primero.setAnterior(null);
        } else {
            NodoDoble nodo = primero;
            for (int i = 1;i < pos;i++) {
                nodo = nodo.getProximo();
            }

            nodo.getAnterior().setProximo(nodo.getProximo());
            nodo.getProximo().setAnterior(nodo.getAnterior());
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
            NodoDoble nodo = primero;
            for (int i = 0;i < pos - 1;i++) {
                nodo = nodo.getProximo();
            }
            return nodo.getDato();
        }
    }

    public int longitud () {
        return cantidad;
    }


    public boolean vacio () {
        return cantidad == 0;
    }

    public void mostrar () {
        if (primero != null) {
            NodoDoble nodo = primero;
            while (nodo != null) {
                System.out.println(nodo.getDato());
                nodo = nodo.getProximo();
            }
        }
    }
}
