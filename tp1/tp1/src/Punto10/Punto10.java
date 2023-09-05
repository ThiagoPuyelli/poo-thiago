package Punto10;

import Tarea.Tarea;

import java.time.LocalDate;

public class Punto10 {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        Tarea tarea1 = new Tarea("Lavar la ropa", hoy.plusDays(5), 0);
        tarea1.setRecordatorio(hoy.plusDays(3));
        Tarea tarea2 = new Tarea("planchar la ropa", hoy.plusDays(5), 0);
        tarea2.setRecordatorio(hoy.minusDays(1));
        tarea1.mostrarTarea();
        tarea2.mostrarTarea();
        System.out.println(tarea1.getPrioridad() + " " + tarea2.getPrioridad());
    }
}
