package Punto1.Socio;

import java.time.LocalDate;

public class Socio {
  public enum TipoSocio {
      BASICA,
      INTERMEDIA,
      SUPERIOR
  }
  private String direccion;
  private String email;
  private String nombre;
  private String apellido;
  private TipoSocio tipo;
  private LocalDate fecha_inscripcion;
  private int nroSocio;


  public Socio(String direccion, String email, String nombre, String apellido, TipoSocio tipo, int nroSocio, LocalDate fecha_inscripcion) {
      this.direccion = direccion;
      this.email = email;
      this.nombre = nombre;
      this.apellido = apellido;
      this.tipo = tipo;
      this.fecha_inscripcion = fecha_inscripcion;
      this.nroSocio = nroSocio;
  }

    public int getNroSocio() {
        return nroSocio;
    }

    public LocalDate getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public TipoSocio getTipo() {
      return tipo;
  }

  public void setTipo(TipoSocio tipo) {
      this.tipo = tipo;
  }

  public String getDireccion() {
      return direccion;
  }

  public void setDireccion(String direccion) {
      this.direccion = direccion;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public String getApellido() {
      return apellido;
  }

  public void setApellido(String apellido) {
      this.apellido = apellido;
  }

  public void mostrarSocio () {
      System.out.println(nroSocio+" "+nombre+" "+apellido+" "+direccion+" "+email+" "+tipo+" "+fecha_inscripcion);
  }

}
