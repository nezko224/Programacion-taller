package Ejercicio2;

public class Libro {
    private String titulo;
    private String isbn;
    private int cantidadPaginas;

    public Libro(String titulo, String isbn, int cantidadPaginas) {
        this.titulo          = titulo;
        this.isbn            = isbn;
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getTitulo()        { return titulo; }
    public String getIsbn()          { return isbn; }
    public int getCantidadPaginas()  { return cantidadPaginas; }


    public String toString() {
        return "Libro: " + titulo + " | ISBN: " + isbn + " | Páginas: " + cantidadPaginas;
    }
}