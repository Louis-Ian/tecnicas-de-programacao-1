class Main{
	public static void main(String args[]){
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Ana");
		p1.setIdade(26);

		Pessoa p2 = new Pessoa();
		p2.setNome("Bruno");
		p2.setIdade(22);

		System.out.println ("Nome1:" + p1.getNome() + ", idade: " + p1.getIdade());
		System.out.println ("Nome2:" + p2.getNome() + ", idade: " + p2.getIdade());
	
	}
}