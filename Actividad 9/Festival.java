
import java.util.ArrayList;
import java.util.List;

public class Festival {
    private List<Cantante> confirmados = new ArrayList<>();

    public void realizarSoundcheck(Cantante c) throws EspectaculoCortoException {
        if (c.getCantidadCanciones() < 5) {
            throw new EspectaculoCortoException(
                "El show de " + c.getNombre() + " es muy corto (" + c.getCantidadCanciones() + " canciones, minimo 5)"
            );
        }
        System.out.println("Soundcheck OK para " + c.getNombre());
        confirmados.add(c);
    }

    public void procesarMatriz(String[][] datosCantantes) {
        for (String[] fila : datosCantantes) {
            String nombre = fila[0];
            System.out.println("\n--- Procesando a " + nombre + " ---");

            try {
                String genero = fila[1];
                int cachet = Integer.parseInt(fila[2]);      // aca puede tirar NumberFormatException
                int canciones = Integer.parseInt(fila[3]);
                String manager = fila[4];                    // puede venir null, no rompe nada aca

                Cantante cantante = new Cantante(nombre, genero, cachet, canciones, manager);

                cantante.mostrarManager();
                realizarSoundcheck(cantante);                // puede tirar EspectaculoCortoException
                cantante.asignarEscenario("Escenario Principal");
                cantante.liquidarHonorarios(21.0);

            } catch (NumberFormatException e) {
                System.out.println("Error: el cachet o las canciones de " + nombre + " no son un numero valido.");
            } catch (EspectaculoCortoException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error de impuestos: " + e.getMessage());
            } finally {
                System.out.println("Fin del procesamiento de " + nombre);
            }
        }
    }
}