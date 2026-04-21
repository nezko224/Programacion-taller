import java.util.Random;
import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(10);
        }

        System.out.println("Memoriza estos numeros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        Thread.sleep(3000);

        System.out.println("\n\n\n\n\n\n\n\n\n\n");

        boolean correcto = true;

        System.out.println("Ahora ingresalos en el mismo orden:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int num = sc.nextInt();

            if (num != numeros[i]) {
                correcto = false;
            }
        }

        if (correcto) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
        }
    }
}