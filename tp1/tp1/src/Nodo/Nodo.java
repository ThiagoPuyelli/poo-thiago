package Nodo;

public class Nodo {
    private Object dato = null;
    private Nodo proximo = null;

    public Object getDato() {
        return dato;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
}
