class DemoObjetosGeometricosEPolimorfismo {
	public static void main(String[] args) {
		ObjetoGeometrico o1, o2;
		o1 = new Circulo(new Ponto(0, 0), 20);
		o2 = new Retangulo(new Ponto(-1, -1), new Ponto(1, 1));

		System.out.println("o1 e um Circulo? " + (o1 instanceof Circulo));
		System.out.println("o1 e um Retangulo? " + (o1 instanceof Retangulo));
		System.out.println("o1 e um ObjetoGeometrico? " + (o1 instanceof ObjetoGeometrico));
	}
}