package ListaTareas;

import Colaborador.Colaborador;
import Tarea.Tarea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaTareas {
    ArrayList<Tarea> tareas = new ArrayList<Tarea>();
    ArrayList<Colaborador> colaboradores = new ArrayList<Colaborador>();

    public void agregarTarea (Tarea tarea) {
        tareas.add(tarea);
    }
    public void agregarColaborador (Colaborador colaborador) {
        colaboradores.add(colaborador);
    }

    public Colaborador buscarColaborador (String nombre) {
        if (!(colaboradores.isEmpty())) {
            for (int i = 0;i < colaboradores.size();i++) {
                if (colaboradores.get(i).getNombre().equals(nombre)) {
                    return colaboradores.get(i);
                }
            }
        }
        return null;
    }

    public Tarea buscar (String descripcion) {
        for (int i = 0;i < tareas.size();i++) {
            if (tareas.get(i).getDescripcion().equals(descripcion)) {
                return tareas.get(i);
            }
        }
        return null;
    }

    public ArrayList<Tarea> ordenarTareas () {
        ArrayList<Tarea> prioridad0 = new ArrayList<Tarea>();
        ArrayList<Tarea> prioridad1 = new ArrayList<Tarea>();
        ArrayList<Tarea> prioridad2 = new ArrayList<Tarea>();
        for (int i = 0;i < tareas.size();i++) {
            if (!tareas.get(i).vencida()) {
                int p = tareas.get(i).getPrioridad();
                if (p == 0) {
                    prioridad0.add(tareas.get(i));
                } else if (p == 1) {
                    prioridad1.add(tareas.get(i));
                } else {
                    prioridad2.add(tareas.get(i));
                }
            }
        }
        ordenarFecha(prioridad0);
        ordenarFecha(prioridad1);
        ordenarFecha(prioridad2);
        ArrayList<Tarea> tareasOrdenadas = new ArrayList<Tarea>();
        juntarTareas(tareasOrdenadas, prioridad0);
        juntarTareas(tareasOrdenadas, prioridad1);
        juntarTareas(tareasOrdenadas, prioridad2);

        return tareasOrdenadas;
    }

    private void ordenarFecha (ArrayList<Tarea> tareas) {
        if (tareas.isEmpty()) {
            return;
        }
        Collections.sort(tareas, new Comparator<Tarea>() {
            @Override
            public int compare(Tarea o1, Tarea o2) {
                return o1.getFecha().compareTo(o2.getFecha());
            }
        });
    }

    private void juntarTareas (ArrayList<Tarea> tareas1, ArrayList<Tarea> tareas2) {
        for (int i = 0;i < tareas2.size();i++) {
            tareas1.add(tareas2.get(i));
        }
    }
}
