package Punto13;

import Colaborador.Colaborador;
import ListaTareas.ListaTareas;
import Tarea.Tarea;

import java.time.LocalDate;

public class Punto13 {
    public static void main(String[] args) {
        Colaborador cola1 = new Colaborador("miqueas");
        Colaborador cola2 = new Colaborador("juli");
        Colaborador cola3 = new Colaborador("franco");
        ListaTareas tareas = new ListaTareas();
        Tarea tarea1 = new Tarea("lava", LocalDate.now().plusDays(2), 1);
        Tarea tarea2 = new Tarea("plancha", LocalDate.now().plusDays(5), 2);
        Tarea tarea3 = new Tarea("compra", LocalDate.now().plusDays(7), 0);
        Tarea tarea4 = new Tarea("labura", LocalDate.now().plusDays(3), 1);

        tareas.agregarTarea(tarea1);
        tareas.agregarTarea(tarea2);
        tareas.agregarTarea(tarea3);
        tareas.agregarTarea(tarea4);
        tareas.agregarColaborador(cola1);
        tareas.agregarColaborador(cola2);
        tareas.agregarColaborador(cola3);

        Colaborador pepe = tareas.buscarColaborador("juli");
        tarea1.completar();
        tarea2.completar();
        tarea3.completar();
        pepe.completarTarea(tarea1);
        pepe.completarTarea(tarea2);
        pepe.completarTarea(tarea3);
        pepe.mostrarTareas();
    }
}
