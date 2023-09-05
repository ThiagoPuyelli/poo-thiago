package Punto11;

import Punto11.Diccionario.Diccionario;
import Punto11.Jugador.Jugador;

public class Punto11 {
    public static void main (String[] args) {
        Diccionario dic = new Diccionario();
        dic.setPalabra("miqueas");
        dic.setPalabra("franco");
        dic.setPalabra("julian");
        dic.setPalabra("chuni");
        dic.setPalabra("lucas");
        Jugador p1 = new Jugador(dic);
        Jugador p2 = new Jugador(dic);

        p1.agregarPalabra("miqueas");
        p1.agregarPalabra("mique");
        p1.agregarPalabra("franco");
        p1.agregarPalabra("lucas");

        p2.agregarPalabra("miqueas");
        p2.agregarPalabra("mique");
        p2.agregarPalabra("franco");

        System.out.println("Puntos p1: " + p1.getPuntos());
        System.out.println("Puntos p2: " + p2.getPuntos());
    }
}
