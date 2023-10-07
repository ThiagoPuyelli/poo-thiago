package Punto3.Academia;

import java.util.ArrayList;
import java.util.Random;

public class Alumno {
    private String nombre;
    private String apellido;
    private ArrayList<Diagramacion> clases = new ArrayList<>();
    private int credencial;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        Random random = new Random();
        credencial = random.nextInt(90000000) + 10000000;
    }

    public int getCredencial() {
        return credencial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList<Diagramacion> getClases() {
        return clases;
    }
}
