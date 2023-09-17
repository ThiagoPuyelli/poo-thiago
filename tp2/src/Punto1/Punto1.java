package Punto1;

import Punto1.ListaSocios.ListaSocios;
import Punto1.Socio.Socio;

import java.time.LocalDate;

public class Punto1 {
    public static void main(String[] args) {
        ListaSocios lista = new ListaSocios();
        lista.nuevoSocio("falopa", "wilirrex@gmail.com", "pepe", "argento", Socio.TipoSocio.BASICA, LocalDate.now().minusMonths(1));
        lista.nuevoSocio("falopa con queso", "wilirrex@gmail.com", "pepardo", "argentino", Socio.TipoSocio.SUPERIOR, LocalDate.now().minusMonths(1));
        lista.nuevoSocio("falopa con papa", "wilirrex@gmail.com", "pepe", "argento", Socio.TipoSocio.SUPERIOR, LocalDate.now());
        lista.nuevoSocio("falopa con milanesaa", "wilirrex@gmail.com", "pepe", "argento", Socio.TipoSocio.BASICA, LocalDate.now().minusMonths(4));
        lista.nuevoSocio("falopa con mique", "wilirrex@gmail.com", "pepe", "argento", Socio.TipoSocio.BASICA, LocalDate.now());
        lista.nuevoSocio("falopa de pepe", "wilirrex@gmail.com", "pepe", "argento", Socio.TipoSocio.INTERMEDIA, LocalDate.now().minusMonths(3));

        lista.nuevaActividad("surf", Socio.TipoSocio.SUPERIOR);
        lista.nuevaActividad("futbol", Socio.TipoSocio.BASICA);
        lista.nuevaActividad("tenis", Socio.TipoSocio.INTERMEDIA);
        lista.nuevaActividad("voley", Socio.TipoSocio.BASICA);

        System.out.println("Reporte mensual");
        lista.reporteMensual();
        System.out.println("Reporte de actividades");
        lista.reporteActividades();
        System.out.println("Reporte de socios");
        lista.reporteSocio();

    }
}
