package main;

import Service.EmpleadoService;

public class Main {
    public static void main(String[] args) {
        EmpleadoService service = new EmpleadoService();
        service.Crear("Leon", "Kennedy", 17635895, "6° 2°");
    }
}
