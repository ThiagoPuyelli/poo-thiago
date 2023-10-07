package Punto2;

import Punto2.Turismo.*;

import java.time.LocalDate;

public class Punto2 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("pepe", "argento", "Bariloche");
        Cliente cliente2 = new Cliente("alfredo", "diaz", "San telmo");
        Proveedor proveedor1 = new Proveedor(Proveedor.Servicio.TRANSPORTE);
        proveedor1.nuevoServicio("Auto");
        proveedor1.nuevoServicio("Colectivo");
        proveedor1.nuevoServicio("Tren");

        Proveedor proveedor2 = new Proveedor(Proveedor.Servicio.HOSPEDAJE);
        proveedor2.nuevoServicio("Hotel");
        proveedor2.nuevoServicio("Hostel");
        proveedor2.nuevoServicio("Telo");

        Proveedor proveedor3 = new Proveedor(Proveedor.Servicio.EXCURSION);
        proveedor3.nuevoServicio("Caminata");
        proveedor3.nuevoServicio("Rafting");
        proveedor3.nuevoServicio("Escalar");

        Paquete paquete1 = new Paquete("Bariloche", proveedor1.getServicios().get(0), proveedor2.getServicios().get(0), proveedor3.getServicios().get(2));
        Paquete paquete2 = new Paquete("San telmo", proveedor1.getServicios().get(1), proveedor2.getServicios().get(1), proveedor3.getServicios().get(0));
        Paquete paquete3 = new Paquete("Lujan", proveedor1.getServicios().get(2), proveedor2.getServicios().get(2), proveedor3.getServicios().get(1));
        paquete1.nuevaEscursion(proveedor3.getServicios().get(0));

        Agencia agencia = new Agencia();
        agencia.nuevoCliente(cliente1);
        agencia.nuevoCliente(cliente2);

        agencia.nuevoProveedor(proveedor1);
        agencia.nuevoProveedor(proveedor2);
        agencia.nuevoProveedor(proveedor3);

        agencia.nuevoPaquete(paquete1);
        agencia.nuevoPaquete(paquete2);
        agencia.nuevoPaquete(paquete3);

        Compra compra1 = new Compra(cliente1, LocalDate.now().plusMonths(2), paquete1, LocalDate.now());
        Compra compra2 = new Compra(cliente2, LocalDate.now().plusMonths(2), paquete2, LocalDate.now().minusMonths(2));
        Compra compra3 = new Compra(cliente2, LocalDate.now().plusMonths(2), paquete3, LocalDate.now().minusDays(2));
        agencia.nuevaCompra(compra1);
        agencia.nuevaCompra(compra2);
        agencia.nuevaCompra(compra3);

        agencia.reporteVentas();
    }
}
