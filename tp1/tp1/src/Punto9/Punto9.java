package Punto9;


import Punto9.Fecha.Fecha;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Punto9 {
    public static void main(String[] args) {
        LocalDate fecha = Fecha.transformarFecha("02-01-2023");
        LocalDate pf = Fecha.transformarFecha("01-01-2023");
        LocalDate sf = Fecha.transformarFecha("01-08-2023");

        System.out.println(Fecha.entreFechas(fecha, pf, sf));
        System.out.println(Fecha.fechaMayor(fecha, pf));
        System.out.println(Fecha.fechaMenor(fecha, pf));
    }
}
