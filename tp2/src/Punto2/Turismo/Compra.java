package Punto2.Turismo;

import java.time.LocalDate;

public class Compra {
    private Cliente cliente;
    private LocalDate fechaViaje;
    private Paquete paquete;
    private LocalDate fechaCompra;

    public Compra(Cliente cliente, LocalDate fechaViaje, Paquete paquete, LocalDate fechaCompra) {
        this.cliente = cliente;
        this.fechaViaje = fechaViaje;
        this.paquete = paquete;
        this.fechaCompra = fechaCompra;
        cliente.nuevoPaquete(paquete);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public Paquete getPaquete() {
        return paquete;
    }
}
