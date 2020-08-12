class Main{
	public static void main(String args[]){
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Ana");
		p1.setIdade(26);

		Pessoa p2 = new Pessoa();
		p2.setNome("Bruno");
		p2.setIdade(22);

		Pessoa p3 = new Pessoa();

		System.out.println (p1.getInfo());
		System.out.println (p2.getInfo());
		System.out.println (p3.getInfo());
	
	}
}