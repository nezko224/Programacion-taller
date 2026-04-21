import java.util.Scanner;
import java.util.Random;

public class Ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int numero = r.nextInt(100) + 1;
        int intento;

        do {
            System.out.print("Adivina el numero: ");
            intento = scanner.nextInt();

            if (intento > numero) {
                System.out.println("Muy alto");
            } else if (intento < numero) {
                System.out.println("Muy bajo");
            }

        } while (intento != numero);

        System.out.println("Ganaste!");
    }
}