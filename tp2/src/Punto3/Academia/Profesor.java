package Punto3.Academia;

public class Profesor {
    String nombre;
    String apellido;
    int importe = 0;

    public Profesor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void pago () {
        importe += 10;
    }
}
