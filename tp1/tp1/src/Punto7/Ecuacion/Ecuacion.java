package Punto7.Ecuacion;

import java.util.ArrayList;
public class Ecuacion {
    private int a;
    private int b;
    private int c;

    public Ecuacion(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    private double calcularRaiz (double terminoRai, boolean positive) {
        return positive ? (-b + Math.sqrt(terminoRai))/ (2 * a) : (-b - Math.sqrt(terminoRai))/ (2 * a);
    }

    public ArrayList<Double> raices () {
        ArrayList<Double> resultados = new ArrayList<Double>();
        double terminoRaiz = Math.pow(b, 2) - (4 * a * c);
        if (terminoRaiz > 0) {
            resultados.add(this.calcularRaiz(terminoRaiz, true));
            resultados.add(this.calcularRaiz(terminoRaiz, false));
        } else if (terminoRaiz == 0) {
            resultados.add(this.calcularRaiz(terminoRaiz, true));
        }
        return resultados;
    }

    public double calcularX (double x) {
        return a * Math.pow(x, 2) + b * x + c;
    }
}
