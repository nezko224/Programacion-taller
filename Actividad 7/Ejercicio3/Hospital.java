package Ejercicio3;

import java.util.ArrayList;

public class Hospital {
    private ArrayList<Paciente> pacientes = new ArrayList<>();

    public void registrar(Paciente p) {
        pacientes.add(p);
    }

    public void listar() {
        System.out.println("=== LISTADO DE PACIENTES ===");
        for (Paciente p : pacientes) {
            System.out.println(p);
        }
        System.out.println("Total de pacientes: " + pacientes.size());
    }

    public Paciente getPaciente(int indice) {
        return pacientes.get(indice);
    }
}