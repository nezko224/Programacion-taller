import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = "hola";
        char[] estado = {'h', '_', '_', '_'};

        while (new String(estado).contains("_")) {
            System.out.println(estado);
            char letra = sc.next().charAt(0);

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    estado[i] = letra;
                }
            }
        }

        System.out.println("Ganaste: " + palabra);
    }
}