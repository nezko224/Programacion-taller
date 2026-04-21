import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int suma = 0;
        int contador = 0;

        do {
            System.out.print("Ingrese un numero (0 para terminar): ");
            num = sc.nextInt();

            if (num != 0) {
                suma += num;
                contador++;
            }

        } while (num != 0);

        double promedio = (double) suma / contador;

        System.out.println("Promedio: " + promedio);
    }
}