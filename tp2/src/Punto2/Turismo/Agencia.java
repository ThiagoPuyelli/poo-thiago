package Punto2.Turismo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Agencia {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Proveedor> proveedores = new ArrayList<>();
    private ArrayList<Compra> compras = new ArrayList<>();
    private ArrayList<Paquete> paquetes = new ArrayList<>();

    public void nuevoCliente (Cliente cliente) {
        clientes.add(cliente);
    }
    public void nuevoProveedor (Proveedor proveedor) {
        proveedores.add(proveedor);
    }
    public void nuevaCompra (Compra compra) {
        compras.add(compra);
    }
    public void nuevoPaquete (Paquete paquete) {
        paquetes.add(paquete);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void reporteVentas () {
        ArrayList<Compra> comprasSort = new ArrayList<Compra>();
        comprasSort.addAll(compras);
        Collections.sort(comprasSort, new Comparator<Compra>() {
            @Override
            public int compare(Compra compra1, Compra compra2) {
                return  compra1.getPaquete().getDestino().compareTo(compra2.getPaquete().getDestino());
            }
        });
        System.out.println("Paquetes vendidos.");
        for (Compra c : comprasSort) {
            System.out.println("Paquete:");
            c.getPaquete().mostrarPaquete();
            System.out.println("Cliente:");
            c.getCliente().mostrarCliente();
            System.out.println();
        }
    }
}
