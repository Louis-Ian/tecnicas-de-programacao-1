class Subclasse extends Super {
	Subclasse() {
		System.out.println("Construtor subclasse");
	}

	void teste() {
		super.teste();
		System.out.println("Metodo Subclasse");
	}
}