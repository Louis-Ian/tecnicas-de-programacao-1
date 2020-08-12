class Main{
	public static void main(String args[]){
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Ana");

		Pessoa p2 = new Pessoa();
		p2.setNome("Bruno");

		System.out.println (p1.getNome());
		System.out.println (p2.getNome());

		p1 = p2;

		System.out.println (p1.getNome());
		System.out.println (p2.getNome());
	}
}