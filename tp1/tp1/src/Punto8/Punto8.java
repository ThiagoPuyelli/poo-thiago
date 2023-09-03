package Punto8;

import Punto8.Contraseña.Contraseña;

public class Punto8 {
    public static void main(String[] args) {
        String contra = Contraseña.generar(9);
        System.out.println(contra);
    }
}
