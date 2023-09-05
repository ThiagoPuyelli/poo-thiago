package Tarea;

import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private Boolean completada = false;
    private LocalDate fecha;
    private LocalDate finalizacion;
    private LocalDate recordatorio;
    private int prioridad;

    public Tarea(String descripcion, LocalDate fecha, int prioridad) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.prioridad = prioridad;
    }

    public void mostrarTarea () {
        String mensaje = descripcion;
        if (vencida()) {
            mensaje = "(Vencida)... " + mensaje;
        } else if (porVencer()) {
            mensaje = "(por vencer) " + mensaje;
        }
        System.out.println(mensaje);
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad () {
        return prioridad;
    }

    public LocalDate getFinalizacion() {
        return finalizacion;
    }

    public String getDescripcion () { return descripcion; }

    public LocalDate getFecha () { return fecha; }

    public void setRecordatorio (LocalDate recordatorio) {
        this.recordatorio = recordatorio;
    }

    public Boolean vencida () {
        return LocalDate.now().isAfter(fecha);
    }

    public Boolean completada () {
        return completada;
    }

    public void completar () {
        completada = true;
        finalizacion = LocalDate.now();
    }

    public Boolean porVencer () {
        if (recordatorio != null && recordatorio.minusDays(1).isBefore(LocalDate.now())) {
            prioridad = 2;
            return true;
        }
        return false;
    }
}
