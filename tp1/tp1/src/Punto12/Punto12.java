package Punto12;

import ListaTareas.ListaTareas;
import Tarea.Tarea;

import java.time.LocalDate;
import java.util.ArrayList;

public class Punto12 {
    public static void main(String[] args) {
        ListaTareas lista = new ListaTareas();
        lista.agregarTarea(new Tarea("lavar la ropa", LocalDate.now().plusDays(8), 0));
        lista.agregarTarea(new Tarea("comprar la ropa", LocalDate.now().plusDays(7), 0));
        lista.agregarTarea(new Tarea("acomodar la guitarra", LocalDate.now().plusDays(2), 2));
        lista.agregarTarea(new Tarea("Lava la pala", LocalDate.now().plusDays(5), 1));
        Tarea recordatorio1 = new Tarea("Lava la guitarra", LocalDate.now().plusDays(5), 2);
        recordatorio1.setRecordatorio(LocalDate.now().minusDays(3));
        recordatorio1.completar();
        lista.agregarTarea(recordatorio1);
        lista.agregarTarea(new Tarea("comprar la pala", LocalDate.now().plusDays(7), 1));
        lista.agregarTarea(new Tarea("comprar la guitarra", LocalDate.now().plusDays(7), 2));
        Tarea recordatorio2 = new Tarea("vender la guitarra", LocalDate.now().plusDays(6), 2);
        recordatorio2.setRecordatorio(LocalDate.now().minusDays(3));
        recordatorio2.completar();
        lista.agregarTarea(recordatorio2);
        lista.agregarTarea(new Tarea("lavar la guitarra", LocalDate.now().minusDays(8), 2));
        lista.agregarTarea(new Tarea("acomodar la pala", LocalDate.now().minusDays(2), 1));
        lista.agregarTarea(new Tarea("Lava la ropa", LocalDate.now().plusDays(5), 0));
        lista.agregarTarea(new Tarea("acomodar la ropa", LocalDate.now().minusDays(2), 0));
        lista.agregarTarea(new Tarea("lavar la pala", LocalDate.now().plusDays(8), 1));
        ArrayList<Tarea> ordenadas = lista.ordenarTareas();
        for (int i = 0;i < ordenadas.size();i++) {
            System.out.println(ordenadas.get(i).getDescripcion() + ' ' + (ordenadas.get(i).getPrioridad() == 0 ? "BAJA" : ordenadas.get(i).getPrioridad() == 1 ? "MEDIA" : "ALTA") + ' ' + ordenadas.get(i).getFecha());
        }
    }
}
