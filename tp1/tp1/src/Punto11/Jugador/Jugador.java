package Punto11.Jugador;

import Punto11.Diccionario.Diccionario;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    Diccionario diccionario;
    int puntos = 0;
    List<String> palabras = new ArrayList<>();

    public Jugador(Diccionario diccionario) {
        this.diccionario = diccionario;
    }

    public boolean agregarPalabra (String palabra) {
        if (!diccionario.pertenece(palabra) || usada(palabra)) {
            return false;
        }
        String caracteres = "kzxywq";

        for (int i = 0;i < palabra.length();i++) {
            if (caracteres.indexOf(palabra.charAt(i)) > -1) {
                puntos += 2;
            } else {
                puntos++;
            }
        }
        palabras.add(palabra);

        return true;
    }

    private boolean usada(String palabra) {
        for (int i = 0;i < palabras.size();i++) {
            if (palabras.get(i).equals(palabra)) {
                return true;
            }
        }
        return false;
    }

    public int getPuntos() {
        return puntos;
    }

    public List<String> getPalabras() {
        return palabras;
    }
}
