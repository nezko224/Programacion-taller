import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        while (suma < 20) {
            System.out.print("Ingrese un numero: ");
            int num = sc.nextInt();

            suma += num;
            contador++;
        }

        double promedio = (double) suma / contador;

        System.out.println("Promedio: " + promedio);
    }
}