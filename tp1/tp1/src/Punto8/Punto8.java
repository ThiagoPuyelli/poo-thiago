package Punto8;

import Punto8.Contrasenia.Contrasenia;

import java.util.Scanner;

public class Punto8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de contrasenias: ");
        int cantidad = scanner.nextInt();
        System.out.print("\nIngrese la cantidad de caracteres de las contrasenias: ");
        int caracteres = scanner.nextInt();
        System.out.println("Contrasenias:");
        for (int i = 0;i < cantidad;i++) {
            String contra = Contrasenia.generar(caracteres);
            System.out.println(contra + ' ' + (Contrasenia.esFuerte(contra) ? "Fuerte" : "Debil"));
        }
    }
}
