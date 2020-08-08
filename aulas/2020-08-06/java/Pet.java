abstract class Pet{
	private String nome;
	private String dataNasc;

	Pet(){
		this("Ze", "01/08/2019");
	}

	Pet(String nome_a, String data_a){
		this.nome = nome_a;
		this.dataNasc = data_a;
	}

	String getNome(){
		return this.nome;
	}

	void setNome(String nome_a){
		this.nome = nome_a;
	}

	String getDataNasc(){
		return this.dataNasc;
	}

	void setDataNasc(String data_a){
		this.dataNasc = data_a;
	}

	abstract void som();
}