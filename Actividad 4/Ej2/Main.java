package Ej2;

public class Main {
    public static void main(String[] args) {

        Gerente g = new Gerente(100, 3000, 500);

        System.out.println("Legajo: " + g.legajo);
        System.out.println("Sueldo base: " + g.sueldoBase);
        System.out.println("Tiene 3 atributos (legajo, sueldoBase, bono)");
    }
}

