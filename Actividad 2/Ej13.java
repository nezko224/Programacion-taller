public class Ej13 {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Pedro", "Sofia"};
        double[] notas = {7, 4, 9, 5};

        for (int i = 0; i < nombres.length; i++) {
            if (notas[i] >= 6) {
                System.out.println(nombres[i] + " Aprobado");
            } else {
                System.out.println(nombres[i] + " Reprobado");
            }
        }
    }
}