package Act3;
	public class Main {
		public static void main(String[] args) {
			Animal a1 = new Animal("ruli", "Perro");
			Animal a2 = new Animal("eunseok", "Gato");
			Animal a3 = new Animal("rubio", "Perro");
			Animal a4 = new Animal("chipa", "Gato");
			Veterinario vet1 = new Veterinario("sasa");
			Veterinario vet2 = new Veterinario("shotaro");
			Veterinario vet3 = new Veterinario("bruno");
			vet1.agregarAnimal(a1);
			vet1.agregarAnimal(a2);
			vet1.agregarAnimal(a3);
			vet2.agregarAnimal(a1);
			vet2.agregarAnimal(a4);
			vet3.agregarAnimal(a2);
			vet3.agregarAnimal(a3);
			vet1.mostrarAnimales();
			vet2.mostrarAnimales();
			vet3.mostrarAnimales();
		}
}
