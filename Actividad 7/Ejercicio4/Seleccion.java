package Ejercicio4;
import java.util.ArrayList;

public class Seleccion {
    private ArrayList<Jugador> plantel = new ArrayList<>();

    public void agregarJugador(Jugador j) {
        plantel.add(j);
    }

    public void eliminarJugador(String nombre) {
        plantel.removeIf(j -> j.getNombre().equalsIgnoreCase(nombre));
        System.out.println("Jugador '" + nombre + "' eliminado.");
    }

    public void buscarPorPosicion(String posicion) {
        System.out.println("--- Jugadores en posición: " + posicion + " ---");
        for (Jugador j : plantel)
            if (j.getPosicion().equalsIgnoreCase(posicion))
                System.out.println(j);
    }

    public void mostrarConvocados() {
        System.out.println("--- Convocados ---");
        for (Jugador j : plantel)
            if (j.isConvocado()) System.out.println(j);
    }

    public void mostrarNoConvocados() {
        System.out.println("--- No convocados ---");
        for (Jugador j : plantel)
            if (!j.isConvocado()) System.out.println(j);
    }

    public void buscarPorEquipo(String club) {
        System.out.println("--- Jugadores de " + club + " ---");
        for (Jugador j : plantel)
            if (j.getClub().equalsIgnoreCase(club))
                System.out.println(j);
    }

    public boolean estaConvocado(String nombre) {
        for (Jugador j : plantel)
            if (j.getNombre().equalsIgnoreCase(nombre))
                return j.isConvocado();
        return false;
    }

    public void contarPorPosicion() {
        int arq = 0, def = 0, med = 0, del = 0;
        for (Jugador j : plantel) {
            switch (j.getPosicion().toLowerCase()) {
                case "arquero"       -> arq++;
                case "defensor"      -> def++;
                case "mediocampista" -> med++;
                case "delantero"     -> del++;
            }
        }
        System.out.println("Arqueros: " + arq + " | Defensores: " + def
            + " | Mediocampistas: " + med + " | Delanteros: " + del);
    }

    public void contarPorSeleccion() {
        int arg = 0, fra = 0;
        for (int i = 0; i < plantel.size(); i++) {
            if (i < 11) arg++; else fra++;
        }
        System.out.println("Argentina: " + arg + " jugadores | Francia: " + fra + " jugadores");
    }

    public Jugador jugadorMasJoven() {
        Jugador menor = plantel.get(0);
        for (Jugador j : plantel)
            if (j.getEdad() < menor.getEdad()) menor = j;
        return menor;
    }

    public Jugador jugadorMasVeterano() {
        Jugador mayor = plantel.get(0);
        for (Jugador j : plantel)
            if (j.getEdad() > mayor.getEdad()) mayor = j;
        return mayor;
    }

    public double promedioEdad() {
        int suma = 0;
        for (Jugador j : plantel) suma += j.getEdad();
        return (double) suma / plantel.size();
    }

    public void ordenarPorEdad() {
        for (int i = 0; i < plantel.size() - 1; i++)
            for (int k = 0; k < plantel.size() - i - 1; k++)
                if (plantel.get(k).getEdad() > plantel.get(k + 1).getEdad()) {
                    Jugador tmp = plantel.get(k);
                    plantel.set(k, plantel.get(k + 1));
                    plantel.set(k + 1, tmp);
                }
        System.out.println("--- Plantel ordenado por edad ---");
        for (Jugador j : plantel) System.out.println(j);
    }
}