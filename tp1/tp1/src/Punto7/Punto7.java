package Punto7;

import Punto7.Ecuacion.Ecuacion;

public class Punto7 {

    public static void main(String[] args) {
        Ecuacion ecuacion = new Ecuacion(1, 2, 1);
        System.out.println(ecuacion.getA());
        System.out.println(ecuacion.getB());
        System.out.println(ecuacion.getC());
        System.out.println(ecuacion.raices());
        System.out.println(ecuacion.calcularX(2));
        Ecuacion ecuacion2 = new Ecuacion(1, 2, 5);
        System.out.println(ecuacion2.raices());
        Ecuacion ecuacion3 = new Ecuacion(1, 3, 2);
        System.out.println(ecuacion3.raices());
    }
}
