package Ej5;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== PUNTO 5 ===");

        MenuVegano vegano = new MenuVegano("Lunes", 500, "Soja");
        MenuCeliaco celiaco = new MenuCeliaco("Martes", -300, true); 
        Cocinero cocinero = new Cocinero("Juan", "Saludable");

        cocinero.agregarMenu(vegano);
        cocinero.agregarMenu(celiaco);

        cocinero.mostrarMenus();
    }
}
