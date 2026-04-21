import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        int contadorPares = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Ingrese un numero: ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Cantidad de numeros pares: " + contadorPares);
    }
}