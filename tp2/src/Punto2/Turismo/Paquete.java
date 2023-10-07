package Punto2.Turismo;

import java.util.ArrayList;

public class Paquete {
    private String destino;
    private String transporte;
    private String hospedaje;
    private ArrayList<String> escursiones;

    public Paquete(String destino, String transporte, String hospedaje, String escursion) {
        this.destino = destino;
        this.transporte = transporte;
        this.hospedaje = hospedaje;
        this.escursiones = new ArrayList<>();
        this.escursiones.add(escursion);
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(String hospedaje) {
        this.hospedaje = hospedaje;
    }

    public ArrayList<String> getEscursiones() {
        return escursiones;
    }

    public void nuevaEscursion (String escursion) {
        escursiones.add(escursion);
    }

    public void mostrarPaquete () {
        System.out.println("Destino: " + destino);
        System.out.println("Transporte: " + transporte);
        System.out.println("Hospedaje: " + hospedaje);
        System.out.print("Escursiones: ");
        for (String e : escursiones) {
            System.out.print(e + ", ");
        }
        System.out.print("\n");
    }
}
