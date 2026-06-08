package Ejercicio1;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregar(Producto p) {
        productos.add(p);
    }

    public void listar() {
        System.out.println("=== INVENTARIO ===");
        for (Producto p : productos) {
            System.out.println(p);
        }
        System.out.println("Total de productos: " + productos.size());
    }
}