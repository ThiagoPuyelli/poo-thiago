package Punto3;

import Punto3.Academia.Academia;
import Punto3.Academia.Diagramacion;
import Punto3.Academia.Profesor;

import java.util.ArrayList;

public class Punto3 {
    public static void main(String[] args) {
        Profesor miqueas = new Profesor("Miqueas", "Rodriguez");
        Profesor juan = new Profesor("Juan", "Lopez");
        Profesor pablo = new Profesor("Pablo", "Dominguez");
        ArrayList<String> diasT1 = new ArrayList<String>();
        diasT1.add("Lunes 16:30");
        diasT1.add("Miercoles 15:00");
        ArrayList<String> diasT2 = new ArrayList<String>();
        diasT1.add("Martes 12:30");
        diasT1.add("Jueves 18:00");
        Academia academia = new Academia();
        academia.nuevaDiagramacion("Tango", juan, diasT1, 1);
        academia.nuevaDiagramacion("Tango", pablo, diasT2, 1);
        academia.nuevaDiagramacion("Bachata", miqueas, diasT1, 2);
        academia.nuevaDiagramacion("Bachata", miqueas, diasT2, 2);
        academia.nuevaDiagramacion("Clasico", juan, diasT1, 0);
        academia.nuevaDiagramacion("Clasico", miqueas, diasT2, 0);
        academia.nuevoAlumno("Tango", 0, "Jorge", "Rodriguez");
        academia.nuevoAlumno("Tango", 0, "Marcelo", "Rodriguez");
        academia.nuevoAlumno("Tango", 0, "Eduardo", "Diaz");
        academia.nuevoAlumno("Tango", 0, "Ramiro", "Laale");
        academia.nuevoAlumno("Tango", 0, "Mateo", "Boero");

        academia.nuevoAlumno("Tango", 1, "Jorge", "Rodriguez");
        academia.nuevoAlumno("Tango", 1, "Marcelo", "Rodriguez");
        academia.nuevoAlumno("Tango", 1, "Eduardo", "Diaz");

        academia.nuevoAlumno("Bachata", 0, "Jorge", "Rodriguez");
        academia.nuevoAlumno("Bachata", 0, "Marcelo", "Rodriguez");

        academia.nuevoAlumno("Bachata", 1, "Jorge", "Rodriguez");
        academia.nuevoAlumno("Bachata", 1, "Marcelo", "Rodriguez");
        academia.nuevoAlumno("Bachata", 1, "Eduardo", "Diaz");

        academia.nuevoAlumno("Clasico", 0, "Jorge", "Rodriguez");
        academia.nuevoAlumno("Clasico", 0, "Mateo", "Boero");

        academia.nuevoAlumno("Clasico", 1, "Jorge", "Rodriguez");
        academia.nuevoAlumno("Clasico", 1, "Marcelo", "Rodriguez");
        academia.nuevoAlumno("Clasico", 1, "Eduardo", "Diaz");

        academia.asisteAlumno("Tango", 1, academia.obtenerCredencial("Tango", 1, "Jorge", "Rodriguez"));
        academia.asisteAlumno("Tango", 1, academia.obtenerCredencial("Tango", 1, "Ramiro", "Laale"));
        academia.asisteAlumno("Tango", 1, academia.obtenerCredencial("Tango", 1, "Jorge", "Rodriguez"));
        academia.asisteAlumno("Tango", 1, academia.obtenerCredencial("Tango", 1, "Jorge", "Rodriguez"));

        academia.asisteAlumno("Bachata", 1, academia.obtenerCredencial("Bachata", 1, "Jorge", "Rodriguez"));
        academia.asisteAlumno("Bachata", 1, academia.obtenerCredencial("Bachata", 1, "Eduardo", "Diaz"));
        academia.asisteAlumno("Bachata", 1, academia.obtenerCredencial("Bachata", 1, "Eduardo", "Diaz"));
        academia.asisteAlumno("Bachata", 1, academia.obtenerCredencial("Bachata", 1, "Eduardo", "Diaz"));
        academia.asisteAlumno("Bachata", 1, academia.obtenerCredencial("Bachata", 1, "Jorge", "Rodriguez"));
        academia.asisteAlumno("Bachata", 1, academia.obtenerCredencial("Bachata", 1, "Jorge", "Rodriguez"));

        academia.asisteAlumno("Clasico", 0, academia.obtenerCredencial("Clasico", 0, "Jorge", "Rodriguez"));
        academia.asisteAlumno("Clasico", 0, academia.obtenerCredencial("Clasico", 0, "Mateo", "Boero"));
        academia.asisteAlumno("Clasico", 0, academia.obtenerCredencial("Clasico", 0, "Mateo", "Boero"));
        academia.asisteAlumno("Clasico", 0, academia.obtenerCredencial("Clasico", 0, "Mateo", "Boero"));
        academia.asisteAlumno("Clasico", 0, academia.obtenerCredencial("Clasico", 0, "Mateo", "Boero"));
        academia.asisteAlumno("Clasico", 0, academia.obtenerCredencial("Clasico", 0, "Mateo", "Boero"));
        academia.asisteAlumno("Clasico", 0, academia.obtenerCredencial("Clasico", 0, "Mateo", "Boero"));
        academia.reporte();
    }
}
