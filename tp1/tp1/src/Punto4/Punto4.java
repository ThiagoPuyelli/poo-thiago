package Punto4;

import Punto4.Colas.Cola;

public class Punto4 {
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.encolar("Nodo 1");
        cola.encolar("Nodo 2");
        cola.encolar("Nodo 3");
        cola.encolar("Nodo 4");

        cola.mostrar();
        System.out.println("-------------");
        System.out.println(cola.desencolar());
        System.out.println(cola.desencolar());
        System.out.println("-------------");
        cola.mostrar();
    }
}
