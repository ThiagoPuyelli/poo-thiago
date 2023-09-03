package Punto9.Fecha;

import java.time.LocalDate;

public class Fecha {
    private static boolean verificarFecha (int numero, String tiempo) {
        if (tiempo.equals("dia")) {
            return numero >= 1 && numero <= 31;
        } else if (tiempo.equals("mes")) {
            return numero >= 1 && numero <= 12;
        } else if (tiempo.equals("anio")) {
            return numero >= 1000 && numero <= 2100;
        }
        return false;
    }
    public static LocalDate transformarFecha (String fecha) {
        String[] fechaSplit = fecha.split("-");

        if (fechaSplit.length == 3) {
            int dia = Integer.parseInt(fechaSplit[0]);
            int mes = Integer.parseInt(fechaSplit[1]);
            int anio = Integer.parseInt(fechaSplit[2]);
            if (fechaSplit[0].length() == 2 && verificarFecha(dia, "dia") && fechaSplit[1].length() == 2 && verificarFecha(mes, "mes") && fechaSplit[2].length() == 4 && verificarFecha(anio, "anio")) {
                LocalDate conversion = LocalDate.of(anio, mes, dia);
                return conversion;
            }
        }
        return null;
    }

    public static boolean entreFechas (LocalDate fecha1, LocalDate fecha2, LocalDate fecha3) {
        return fecha3.isAfter(fecha2) && fecha1.isAfter(fecha2) && fecha3.isAfter(fecha1);
    }

    public static boolean fechaMayor (LocalDate fecha1, LocalDate fecha2) {
        return fecha1.isAfter(fecha2);
    }

    public static boolean fechaMenor (LocalDate fecha1, LocalDate fecha2) {
        return fecha2.isAfter(fecha1);
    }
}
