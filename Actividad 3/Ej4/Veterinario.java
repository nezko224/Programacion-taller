package Act3;
	import java.util.ArrayList;
	public class Veterinario {
		private String nombre;
		private ArrayList<Animal> animales;
		public Veterinario(String nombre) {
			this.nombre = nombre;
			this.animales = new ArrayList<>();
		}
		public void agregarAnimal(Animal a) {
		    int cantidad = animales.size();
		    if (cantidad < 3) {
		        animales.add(a);
		    } else {
		        System.out.println("El veterinario " + nombre + " ya tiene 3 animales.");
		    }
		}
		public void mostrarAnimales() {
			System.out.println("Veterinario: " + nombre);
			for (Animal a : animales) {
				a.mostrarInfo();
		}
	}	
}
