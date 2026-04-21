package Act3;
	public class Animal {
		private String nombre;
		private String tipo;
		public Animal(String nombre, String tipo) {
			this.nombre = nombre;
			this.tipo = tipo;
		}
		public void mostrarInfo() {
			System.out.println(tipo + ": " + nombre);
		}
}
