package Ej2;

public class Gerente extends Empleado {
    private double bonoResponsabilidad;

    public Gerente(int legajo, double sueldoBase, double bono) {
        super(legajo, sueldoBase);
        this.bonoResponsabilidad = bono;
    }
}
