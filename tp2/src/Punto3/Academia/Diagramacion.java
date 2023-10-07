package Punto3.Academia;

import java.util.ArrayList;

public class Diagramacion {
    String disciplina;
    Profesor profesor;
    ArrayList<String> dias;
    int nivel;
    ArrayList<Alumno> alumnos = new ArrayList<>();
    ArrayList<Integer> asistencias = new ArrayList<>();
    int numero;
    int importe = 0;
    public Diagramacion(String disciplina, Profesor profesor, ArrayList<String> dias, int nivel, int numero) {
        this.disciplina = disciplina;
        this.profesor = profesor;
        this.dias = dias;
        this.nivel = nivel;
        this.numero = numero;
    }

    public void nuevoAlumno (String nombre, String apellido) {
        alumnos.add(new Alumno(nombre, apellido));
        asistencias.add(0);
    }

    public void alumnoAsiste (int credencial) {
        int i = 0;
        while (i < alumnos.size()) {
            if (alumnos.get(i).getCredencial() == credencial) {
                asistencias.set(i, asistencias.get(i) + 1);
                profesor.pago();
                this.importe += 10;
                break;
            }
            i++;
        }
    }

    public String getDisciplina() {
        return disciplina;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public ArrayList<String> getDias() {
        return dias;
    }

    public int getNivel() {
        return nivel;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public ArrayList<Integer> getAsistencias() {
        return asistencias;
    }

    public int getNumero() {
        return numero;
    }

    public int getImporte() {
        return importe;
    }
}
