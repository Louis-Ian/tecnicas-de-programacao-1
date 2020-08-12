class Pessoa{
	String nome;
	int idade;

	void setNome(String pnome){
		nome = pnome;
	}

	String getNome(){
		return nome;
	}

	void setIdade(int pidade){
		idade = pidade;
	}

	int getIdade(){
		return idade;
	}

	Pessoa(){
		this.setNome("Anon");
		this.setIdade(0);
	}

	String getInfo(){
		String ret = ("NOME: " + this.getNome() + "\t, IDADE: " + this.getIdade());

		return ret;
	}
}