package Punto8.Contraseña;

import java.util.Random;

public class Contraseña {
    public static String generar () {
        return generar(8);
    }

    public static String generar (int longitud) {
        String valores = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        String contraseña = "";
        Random random = new Random();
        for (int i = 0;i < longitud;i++) {
            int numeroRandom = random.nextInt(valores.length());
            contraseña += valores.charAt(numeroRandom);
        }
        return contraseña;
    }
}
