package main;

import Service.PouService;

public class Main {
    public static void main(String[] args) {
        PouService service = new PouService();
        service.registrar("Leon", "Kennedy", 17635895, "6° 2°");
    }
}
