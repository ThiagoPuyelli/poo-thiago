package Punto2.ListasDobles;

public class NodoDoble {
    private Object dato = null;
    private NodoDoble proximo = null;
    private NodoDoble anterior = null;

    public Object getDato() {
        return dato;
    }

    public NodoDoble getProximo() {
        return proximo;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setProximo(NodoDoble proximo) {
        this.proximo = proximo;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
}
