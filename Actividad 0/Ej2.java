import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;

        while (suma <= 10) {
            System.out.print("Ingrese un numero: ");
            suma += sc.nextInt();
        }

        System.out.println("La suma es: " + suma);
    }
}