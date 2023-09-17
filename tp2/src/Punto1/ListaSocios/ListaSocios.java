package Punto1.ListaSocios;

import Punto1.Actividad.Actividad;
import Punto1.Socio.Socio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class ListaSocios {
    ArrayList<Socio> socios = new ArrayList<>();
    ArrayList<Actividad> actividades = new ArrayList<>();

    private boolean existeCredencial (int nroSocio) {
        for (int i = 0;i < socios.size();i++) {
            if (socios.get(i).getNroSocio() == nroSocio) {
                return true;
            }
        }
        return false;
    }

    public void nuevaActividad (String nombre, Socio.TipoSocio clasificacion) {
        actividades.add(new Actividad(nombre, clasificacion));
    }
    public void nuevoSocio (String direccion, String email, String nombre, String apellido, Socio.TipoSocio tipo, LocalDate fecha_incripcion) {
        Random random = new Random();
        int nro;
        do {
            int min = 10000000;
            int max = 99999999;
            nro = random.nextInt(max - min + 1) + min;
        } while (existeCredencial(nro));

        Socio socio = new Socio(direccion, email, nombre, apellido, tipo, nro, fecha_incripcion);
        socios.add(socio);
    }

    public void reporteMensual () {
        LocalDate fechaActual = LocalDate.now();
        for (int i = 0;i < socios.size();i++) {
            if (socios.get(i).getFecha_inscripcion().getYear() == fechaActual.getYear() && socios.get(i).getFecha_inscripcion().getMonth() == fechaActual.getMonth()) {
                socios.get(i).mostrarSocio();
            }
        }
    }

    public void reporteActividades () {
        ArrayList<Actividad> basicas = new ArrayList<Actividad>();
        ArrayList<Actividad> intermedias = new ArrayList<Actividad>();
        ArrayList<Actividad> superiores = new ArrayList<Actividad>();

        for (int i = 0;i < actividades.size();i++) {
            if (actividades.get(i).getClasificacion() == Socio.TipoSocio.BASICA) {
                basicas.add(actividades.get(i));
            } else if (actividades.get(i).getClasificacion() == Socio.TipoSocio.INTERMEDIA) {
                intermedias.add(actividades.get(i));
            } else if (actividades.get(i).getClasificacion() == Socio.TipoSocio.SUPERIOR) {
                superiores.add(actividades.get(i));
            }
        }

        System.out.println("Lista de actividades basicas");
        mostrarActividades(basicas);
        System.out.println("Lista de actividades intermedias");
        mostrarActividades(intermedias);
        System.out.println("Lista de actividades superiores");
        mostrarActividades(superiores);
    }

    public void reporteSocio () {
        ArrayList<Socio> basicos = new ArrayList<Socio>();
        ArrayList<Socio> intermedios = new ArrayList<Socio>();
        ArrayList<Socio> superiores = new ArrayList<Socio>();

        for (int i = 0;i < socios.size();i++) {
            if (socios.get(i).getTipo() == Socio.TipoSocio.BASICA) {
                basicos.add(socios.get(i));
            } else if (socios.get(i).getTipo() == Socio.TipoSocio.INTERMEDIA) {
                intermedios.add(socios.get(i));
            } else if (socios.get(i).getTipo() == Socio.TipoSocio.SUPERIOR) {
                superiores.add(socios.get(i));
            }
        }

        System.out.println("Lista de socios basicos");
        mostrarSocios(basicos);
        System.out.println("Lista de socios intermedios");
        mostrarSocios(intermedios);
        System.out.println("Lista de socios superiores");
        mostrarSocios(superiores);
    }

    private void mostrarActividades (ArrayList<Actividad> actividades) {
        for (int i = 0;i < actividades.size();i++) {
            System.out.println(actividades.get(i).getNombre());
        }
    }
    private void mostrarSocios (ArrayList<Socio> socios) {
        for (int i = 0;i < socios.size();i++) {
            socios.get(i).mostrarSocio();
        }
    }
}
