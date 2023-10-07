package Punto2.Turismo;

import java.util.ArrayList;

public class Proveedor {
    public enum Servicio {
        TRANSPORTE, HOSPEDAJE, EXCURSION
    }
    private Servicio tipo;
    private ArrayList<String> servicios = new ArrayList<>();

    public Proveedor (Servicio tipo) {
        this.tipo = tipo;
    }

    public void nuevoServicio (String servicio) {
        servicios.add(servicio);
    }

    public ArrayList<String> getServicios() {
        return servicios;
    }
}
