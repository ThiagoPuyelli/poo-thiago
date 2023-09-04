package Punto11.Diccionario;

import java.util.ArrayList;
import java.util.List;

public class Diccionario {
    List<String> palabras = new ArrayList<>();

    public void setPalabra (String palabra) {
        palabras.add(palabra);
    }

    public boolean pertenece(String palabra) {
        for (int i = 0;i < palabras.size();i++) {
            if (palabras.get(i).equals(palabra)) {
                return true;
            }
        }
        return false;
    }
}
