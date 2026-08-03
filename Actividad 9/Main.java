
public class Main {
    public static void main(String[] args) {
        String[][] datosCantantes = {
            {"Taylor Swift", "Pop", "1500000", "18", "Tree Paine"},
            {"Bad Bunny", "Reggaeton", "RECHAZADO", "12", "Noah Assad"}, // error numerico
            {"Coldplay", "Rock", "1200000", "3", "Phil Harvey"},         // menos de 5 canciones
            {"Duki", "Trap", "500000", "14", null}                      // manager nulo
        };

        Festival festival = new Festival();
        festival.procesarMatriz(datosCantantes);

        // prueba manual pidida por la consigna, con throw explicito
        System.out.println("\n--- Prueba manual ---");
        try {
            Cantante prueba = new Cantante("Artista Prueba", "Indie", 100000, 2, "Manager X");
            if (prueba.getCantidadCanciones() < 5) {
                throw new EspectaculoCortoException("Prueba manual: show demasiado corto");
            }
        } catch (EspectaculoCortoException e) {
            System.out.println("Capturado: " + e.getMessage());
        } finally {
            System.out.println("Prueba finalizada.");
        }
    }
}