package Ejercicio1;

public class Producto {
    private String nombre;
    private String codigo;
    private double precio;

    public Producto(String nombre, String codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre()  { return nombre; }
    public String getCodigo()  { return codigo; }
    public double getPrecio()  { return precio; }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Código: " + codigo + " | Precio: $" + precio;
    }
}