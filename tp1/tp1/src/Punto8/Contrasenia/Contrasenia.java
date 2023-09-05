package Punto8.Contrasenia;

import java.util.Random;

public class Contrasenia {
    public static String generar () {
        return generar(8);
    }

    public static String generar (int longitud) {
        String valores = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        String contrasenia = "";
        Random random = new Random();
        for (int i = 0;i < longitud;i++) {
            int numeroRandom = random.nextInt(valores.length());
            contrasenia += valores.charAt(numeroRandom);
        }
        return contrasenia;
    }

    public static String generarFuerte () { return generarFuerte(8); }

    public static String generarFuerte (int longitud) {
        boolean fuerte;
        String contrasenia;
        do {
            contrasenia = generar();
            fuerte = esFuerte(contrasenia);
        } while (!fuerte);
        return contrasenia;
    }

    public static boolean esFuerte (String contra) {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        for (int i = 0;i < contra.length(); i++) {
            if (Character.isDigit(contra.charAt(i))) {
                numeros++;
            } else if (Character.isUpperCase(contra.charAt(i))) {
                mayusculas++;
            } else if (Character.isLowerCase(contra.charAt(i))) {
                minusculas++;
            }
        }

        return mayusculas > 2 && minusculas > 1 && numeros >= 2;
    }
}
