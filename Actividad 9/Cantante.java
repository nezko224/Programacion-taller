
public class Cantante implements Contratable {
    private String nombre;
    private String generoMusical;
    private int cachet;
    private int cantidadCanciones;
    private String manager; 

    public Cantante(String nombre, String generoMusical, int cachet, int cantidadCanciones, String manager) {
        this.nombre = nombre;
        this.generoMusical = generoMusical;
        this.cachet = cachet;
        this.cantidadCanciones = cantidadCanciones;
        this.manager = manager;
    }

    public String getNombre() { return nombre; }
    public String getGeneroMusical() { return generoMusical; }
    public int getCachet() { return cachet; }
    public int getCantidadCanciones() { return cantidadCanciones; }
    public String getManager() { return manager; }

    @Override
    public void liquidarHonorarios(double impuestos) throws IllegalArgumentException {
        if (impuestos < 0 || impuestos > 100) {
            throw new IllegalArgumentException("Porcentaje de impuestos invalido: " + impuestos);
        }
        double montoFinal = cachet - (cachet * impuestos / 100);
        System.out.println("Honorarios liquidados para " + nombre + ": $" + montoFinal);
    }

    @Override
    public void asignarEscenario(String nombreEscenario) throws NullPointerException {
        if (nombreEscenario == null) {
            throw new NullPointerException("El escenario no puede ser nulo");
        }
        System.out.println(nombre + " fue asignado a: " + nombreEscenario);
    }

    public void mostrarManager() {
        try {
            System.out.println("Manager de " + nombre + ": " + manager.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println(nombre + " no tiene manager registrado.");
        }
    }
}