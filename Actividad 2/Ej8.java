import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra = "java";
        char[] estado = {'_', '_', '_', '_'};

        boolean ganado = false;

        while (!ganado) {
            for (int i = 0; i < estado.length; i++) {
                System.out.print(estado[i] + " ");
            }
            System.out.println();

            System.out.print("Ingrese una letra: ");
            char letra = sc.next().charAt(0);

            boolean acierto = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    estado[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                System.out.println("Incorrecto");
            }

            ganado = true;
            for (int i = 0; i < estado.length; i++) {
                if (estado[i] == '_') {
                    ganado = false;
                }
            }
        }

        System.out.println("Ganaste! La palabra era: " + palabra);
    }
}