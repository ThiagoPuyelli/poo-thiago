package Punto2;

import Punto2.ListasDobles.ListaDoble;
import Punto2.ListasDobles.NodoDoble;

public class Punto2 {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        lista.agregar("Nodo 1");
        lista.agregar("Nodo 2");
        lista.agregar("Nodo 4");
        lista.insertar("Nodo 3", 3);
        lista.agregar("Nodo 5");

        lista.eliminar(3);
        Object recuperar1 = lista.recuperar(4);

        lista.mostrar();
        System.out.println("Nodo recuperado " + recuperar1);
    }
}
