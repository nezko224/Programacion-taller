package Ejercicio4;

public class Jugador {
    private String  nombre;
    private String  posicion;
    private int     edad;
    private String  clubActual;
    private boolean convocado;

    public Jugador(String nombre, String posicion, int edad, String clubActual, boolean convocado) {
        this.nombre     = nombre;
        this.posicion   = posicion;
        this.edad       = edad;
        this.clubActual = clubActual;
        this.convocado  = convocado;
    }

    public String  getNombre()   { return nombre; }
    public String  getPosicion() { return posicion; }
    public int     getEdad()     { return edad; }
    public String  getClub()     { return clubActual; }
    public boolean isConvocado() { return convocado; }
    public void    setConvocado(boolean c) { this.convocado = c; }

    @Override
    public String toString() {
        return nombre + " | " + posicion + " | Edad: " + edad
            + " | Club: " + clubActual
            + " | Convocado: " + (convocado ? "Sí" : "No");
    }
}