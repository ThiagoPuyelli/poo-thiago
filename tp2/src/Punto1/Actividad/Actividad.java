package Punto1.Actividad;

import Punto1.Socio.Socio;

public class Actividad {
    String nombre;
    Socio.TipoSocio clasificacion;

    public Actividad(String nombre, Socio.TipoSocio clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Socio.TipoSocio getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Socio.TipoSocio clasificacion) {
        this.clasificacion = clasificacion;
    }
}
