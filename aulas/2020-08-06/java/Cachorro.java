class Cachorro extends Pet{
	private String som;
	private String raca;
	private double peso;
	private String alimento;

	Cachorro(){
		//super("Totó", "01/02/2018");
		this("Totó", "01/02/2018", "latir", "vira-lata", 2.0, "ração");
		//Cachorro("Totó", "01/02/2018", "latir", "vira-lata", 2.0, "ração");
	}

	Cachorro(String nome_a, String data_a, String som_a, String raca_a, double peso_a, String alimento_a){
		super(nome_a, data_a);
		//this.nome = nome_a;
		//this.dataNasc = data_a;
		this.som = som_a;
		this.raca = raca_a;
		this.peso = peso_a;
		this.alimento = alimento_a;
	}

	void setRaca(String raca_a){
		this.raca = raca_a;
	}

	String getRaca(){
		return this.raca;
	}

	void setPeso(double newPeso){
		this.peso = newPeso;
	}

	double getPeso(){
		return this.peso;
	}

	void setAlimento(String alimento_a){
		this.alimento = alimento_a;
	}

	String getAlimento(){
		return this.alimento;
	}

	void som(){
		System.out.println(this.som);
	}

	void printInfo(){
	 	System.out.println("Cachorro\nNome: " + super.getNome() + "\nData de nascimento: " + super.getDataNasc() + "\nSom: " + this.som + "\nRaça: " + this.raca + "\nPeso: " + this.peso + "\nAlimento preferido: " + this.alimento);
	}
}