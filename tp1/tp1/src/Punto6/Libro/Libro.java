package Punto6.Libro;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private int ejemplares;
    private int ejemplaresPrestados;

    public Libro(String titulo, String autor, int paginas, int ejemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void mostrarLibro () {
        System.out.println("El libro "+titulo+" creado por el autor "+autor+" tiene "+paginas+" páginas, quedan "+ejemplares+" disponibles y se prestaron "+ejemplaresPrestados);
    }

    public void prestar () {
        if (ejemplares > 1) {
            ejemplares--;
            ejemplaresPrestados++;
        }
    }

    public void devolverLibro () {
        ejemplares++;
        ejemplaresPrestados--;
    }
}
