package Punto2.Turismo;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private ArrayList<Paquete> paquetes = new ArrayList<>();
    private String destinoFavorito;

    public Cliente(String nombre, String apellido, String destinoFavorito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.destinoFavorito = destinoFavorito;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void nuevoPaquete (Paquete paquete) {
        paquetes.add(paquete);
    }

    public void mostrarCliente () {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Destino favorito: " + destinoFavorito);
    }
}
