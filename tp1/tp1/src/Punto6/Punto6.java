package Punto6;

import Punto6.Libro.Libro;

public class Punto6 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Diccionario", "Martin",  600, 10, 0);
        Libro libro2 = new Libro("Enciclopedia de dinosaurios", "Agustin",  680, 1, 0);
        System.out.println("El libro con mas paginas es: " + ((libro1.getPaginas() < libro2.getPaginas()) ? libro2.getTitulo() : libro1.getTitulo()));
        libro1.prestar();
        libro2.prestar();
        System.out.println("Ejemplares prestados del libro 1: " + libro1.getEjemplaresPrestados());
        System.out.println("Ejemplares prestados del libro 2: " + libro2.getEjemplaresPrestados());
    }
}
