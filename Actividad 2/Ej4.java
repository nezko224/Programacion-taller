import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        int suma = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Ingrese un numero: ");
            arr[i] = scanner.nextInt();
            suma += arr[i];
        }

        double promedio = (double) suma / arr.length;

        System.out.println("El promedio es: " + promedio);
    }
}