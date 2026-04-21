import java.util.Scanner;
import java.util.Random;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] opciones = {"piedra", "papel", "tijera"};

        System.out.println("0 = piedra | 1 = papel | 2 = tijera");
        System.out.print("Elige una opcion: ");
        int usuario = sc.nextInt();

        int pc = r.nextInt(3);

        System.out.println("Vos elegiste: " + opciones[usuario]);
        System.out.println("PC eligio: " + opciones[pc]);

        if (usuario == pc) {
            System.out.println("Empate");
        } else if (
            (usuario == 0 && pc == 2) ||
            (usuario == 1 && pc == 0) ||
            (usuario == 2 && pc == 1)
        ) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
        }
    }
}