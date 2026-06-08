package Ejercicio2;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();

    public void agregar(Libro l) {
        libros.add(l);
    }

    public void listar() {
        System.out.println("=== BIBLIOTECA ===");
        for (Libro l : libros) {
            System.out.println(l);
        }
        System.out.println("Total de libros: " + libros.size());
    }

    public Libro getLibro(int indice) {
        return libros.get(indice);
    }
}