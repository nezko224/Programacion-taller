package Ej6;

public class Colectivo extends Unidades {
    private int numerolinea;

    public Colectivo(String id_interno, int capacidadpasajeros, int numerolinea) {
        super(id_interno, capacidadpasajeros);
        this.numerolinea = numerolinea;
    }

    public void arrancar() {
    }

    public void frenar() {}
}

