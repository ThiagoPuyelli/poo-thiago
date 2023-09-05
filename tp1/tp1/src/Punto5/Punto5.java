package Punto5;

import Tarea.Tarea;

import java.time.LocalDate;

public class Punto5 {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        Tarea supermercado = new Tarea("Ir al supermercado mañana", hoy.plusDays(1), 0);
        supermercado.completar();
        Tarea auto = new Tarea("Consultar repuesto del auto", hoy.minusDays(1), 0);
        Tarea marvel = new Tarea("Ir al cine a ver la nueva película de Marvel", hoy.minusDays(1), 0);

        supermercado.mostrarTarea();
        auto.mostrarTarea();
        marvel.mostrarTarea();
    }
}
