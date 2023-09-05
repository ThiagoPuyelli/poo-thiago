package Colaborador;

import Tarea.Tarea;

import java.util.ArrayList;

public class Colaborador {
    ArrayList<Tarea> tareas = new ArrayList<Tarea>();
    String nombre;

    public Colaborador (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void completarTarea (Tarea tarea) {
        tareas.add(tarea);
    }

    public ArrayList<Tarea> getTareas () {
        return tareas;
    }

    public void mostrarTareas () {
        for (int i = 0;i < tareas.size();i++) {
            tareas.get(i).mostrarTarea();
        }
    }
}
