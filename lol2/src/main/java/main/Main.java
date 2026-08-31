package main;

import Service.EstudianteService;

public class Main {
    public static void main(String[] args) {
        EstudianteService service = new EstudianteService();
        service.registrar("Leon", "Kennedy", 17635895, "6° 2°");
    }
}
