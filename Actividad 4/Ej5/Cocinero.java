package Ej5;

import java.util.ArrayList;

public class Cocinero {
    private String nombre;
    private String especialidad;
    private ArrayList<Menu> menus;

    public Cocinero(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.menus = new ArrayList<>();
    }

    public void agregarMenu(Menu m) {
        menus.add(m);
    }

    public void mostrarMenus() {
        System.out.println("Menús del cocinero " + nombre + ":");
        for (Menu m : menus) {
            System.out.println("- " + m.getDiaSemana() + " | Calorias: " + m.getCaloriasTotales());
        }
    }
}
