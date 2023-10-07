package Punto3.Academia;

import java.sql.Array;
import java.util.ArrayList;

public class Academia {
    private ArrayList<Diagramacion> diagramaciones = new ArrayList<>();

    public void nuevaDiagramacion (String disciplina, Profesor profesor, ArrayList<String> dias, int nivel) {
        int contador = 0;
        boolean existe = false;
        for (Diagramacion d : diagramaciones) {
            if (d.getDisciplina().equals(disciplina)) {
                contador++;
            }
        }
        diagramaciones.add(new Diagramacion(disciplina, profesor, dias, nivel, contador));
    }

    public Diagramacion getDiagramacion (String disciplina, int numero) {
        for (Diagramacion d : diagramaciones) {
            if (d.getDisciplina().equals(disciplina) && d.getNumero() == numero) {
                return d;
            }
        }
        return null;
    }

    public void nuevoAlumno (String disciplina, int numero, String nombre, String apellido) {
        for (Diagramacion d : diagramaciones) {
            if (d.getDisciplina().equals(disciplina) && d.getNumero() == numero) {
                d.nuevoAlumno(nombre, apellido);
                break;
            }
        }
    }

    public void asisteAlumno (String disciplina, int numero, int credencial) {
        Diagramacion d = getDiagramacion(disciplina, numero);
        d.alumnoAsiste(credencial);
    }

    public int obtenerCredencial (String disciplina, int numero, String nombre, String apellido) {
        Diagramacion d = getDiagramacion(disciplina, numero);
        ArrayList<Alumno> alumnos = d.getAlumnos();
        for (Alumno a : alumnos) {
            if (a.getNombre().equals(nombre) && a.getApellido().equals(apellido)) {
                return a.getCredencial();
            }
        }
        return 0;
    }

    public void reporte () {
        System.out.println("Reporte de ingresos por Diagramacion");
        ArrayList<String> disciplinas = new ArrayList<>();
        ArrayList<Integer> importe = new ArrayList<>();
        for (Diagramacion d : diagramaciones) {
            int existe = -1;
            for (int i = 0;i < disciplinas.size();i++) {
                if (disciplinas.get(i).equals(d.getDisciplina())) {
                    existe = i;
                }
            }
            if (existe == -1) {
                disciplinas.add(d.getDisciplina());
                importe.add(d.getImporte());
            } else {
                importe.set(existe, importe.get(existe) + d.getImporte());
            }
            System.out.println(d.getDisciplina() + " " + d.getNumero() + " " + d.getImporte());
        }
        System.out.println("Reporte de ingresos por Disciplina");
        int mayor = 0;
        String disMayor = "";
        for (int i = 0;i < disciplinas.size();i++) {
            if (mayor < importe.get(i)) {
                mayor = importe.get(i);
                disMayor = disciplinas.get(i);
            }
            System.out.println(disciplinas.get(i) + " " + importe.get(i));
        }
        System.out.println("\n\n La disciplina de mayor ingreso es " + disMayor + " con importe " + mayor);
    }
}
