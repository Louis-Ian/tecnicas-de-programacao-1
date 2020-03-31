class DemoObjetosGeometricos {
	public static void main(String[] args) {
		Circulo c1 = new Circulo(new Ponto(0, 0), 10);
		Retangulo r1 = new Retangulo(new Ponto(-2, -2), new Ponto(2, 2));
		imprimeTodosOsDados(c1);
		imprimeTodosOsDados(r1);
	}

	private static void imprimeTodosOsDados(ObjetoGeometrico og) {
		System.out.println(og);
		System.out.println("Perimetro:"+og.calculaPerimetro());
		System.out.println("Area:"+og.calculaArea());
		System.out.println();
	}
}