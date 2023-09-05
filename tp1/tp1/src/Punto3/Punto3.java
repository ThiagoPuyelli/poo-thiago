package Punto3;

import Punto3.Pila.Pila;

public class Punto3 {
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.apilar("Nodo 1");
        pila.apilar("Nodo 2");
        pila.apilar("Nodo 3");
        pila.apilar("Nodo 4");
        pila.apilar("Nodo 5");
        pila.apilar("Nodo 6");

        pila.mostrar();
        System.out.println("---------------");
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println("---------------");
        pila.mostrar();
    }
}
