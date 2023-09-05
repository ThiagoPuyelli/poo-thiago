package Punto12;

import ListaTareas.ListaTareas;
import Tarea.Tarea;

import java.time.LocalDate;
import java.util.ArrayList;

public class Punto12 {
    public static void main(String[] args) {
        ListaTareas lista = new ListaTareas();
        lista.agregarTarea(new Tarea("falopa la ropa", LocalDate.now().plusDays(8), 0));
        lista.agregarTarea(new Tarea("mique la ropa", LocalDate.now().plusDays(7), 0));
        lista.agregarTarea(new Tarea("pepe la maraca", LocalDate.now().plusDays(2), 2));
        lista.agregarTarea(new Tarea("Lava la pala", LocalDate.now().plusDays(5), 1));
        Tarea recordatorio1 = new Tarea("Lava la maraca", LocalDate.now().plusDays(5), 2);
        recordatorio1.setRecordatorio(LocalDate.now().minusDays(3));
        recordatorio1.completar();
        lista.agregarTarea(recordatorio1);
        lista.agregarTarea(new Tarea("mique la pala", LocalDate.now().plusDays(7), 1));
        lista.agregarTarea(new Tarea("mique la maraca", LocalDate.now().plusDays(7), 2));
        Tarea recordatorio2 = new Tarea("pela la maraca", LocalDate.now().plusDays(6), 2);
        recordatorio2.setRecordatorio(LocalDate.now().minusDays(3));
        recordatorio2.completar();
        lista.agregarTarea(recordatorio2);
        lista.agregarTarea(new Tarea("falopa la maraca", LocalDate.now().minusDays(8), 2));
        lista.agregarTarea(new Tarea("pepe la pala", LocalDate.now().minusDays(2), 1));
        lista.agregarTarea(new Tarea("Lava la ropa", LocalDate.now().plusDays(5), 0));
        lista.agregarTarea(new Tarea("pepe la ropa", LocalDate.now().minusDays(2), 0));
        lista.agregarTarea(new Tarea("falopa la pala", LocalDate.now().plusDays(8), 1));
        ArrayList<Tarea> ordenadas = lista.ordenarTareas();
        for (int i = 0;i < ordenadas.size();i++) {
            System.out.println(ordenadas.get(i).getDescripcion() + ' ' + ordenadas.get(i).getPrioridad() + ' ' + ordenadas.get(i).getFecha());
        }
    }
}
