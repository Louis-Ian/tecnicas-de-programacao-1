class Pessoa {
	private String nome;
	private int idade;

	public static void main(String args[]) {
		// Pessoa p1 = new Pessoa("Maria", 20);
		// Pessoa p2 = p1;
		// Pessoa p3 = new Pessoa("Maria", 20);

		String p1 = "Maria";
		String p2 = p1;
		String p3 = "Maria";

		if(p1 == p2) {
			System.out.println(p1 + " e " + p2 + " são iguais.\n");
		} else {
			System.out.println(p1 + " e " + p2 + " são diferentes.\n");
		}

		if(p1.equals(p2)) {
			System.out.println(p1 + " e " + p2 + " são equals.\n");
		} else {
			System.out.println(p1 + " e " + p2 + " não são equals.\n");
		}

		if(p1 == p3) {
			System.out.println(p1 + " e " + p3 + " são iguais.\n");
		} else {
			System.out.println(p1 + " e " + p3 + " são diferentes.\n");
		}

		if(p1.equals(p3)) {
			System.out.println(p1 + " e " + p3 + " são equals.\n");
		} else {
			System.out.println(p1 + " e " + p3 + " não são equals.\n");
		}
	}

	Pessoa() {
		this("Sem nome", 0);
	}

	Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String toString() {
		return this.nome + ", " +this.idade + "";
	}
}