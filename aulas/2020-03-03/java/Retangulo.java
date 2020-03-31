class Retangulo implements ObjetoGeometrico {
	private Ponto primeiroCanto, segundoCanto;

	Retangulo(Ponto pc, Ponto sc) {
		primeiroCanto = pc;
		segundoCanto = sc;
	}

	public Ponto centro() {
		double coordX = (primeiroCanto.x + segundoCanto.x)/2;
		double coordY = (primeiroCanto.y + segundoCanto.y)/2;
		return new Ponto(coordX, coordY);
	}

	public double calculaArea() {
		double base = primeiroCanto.x - segundoCanto.x;
		double altura = primeiroCanto.y - segundoCanto.y;

		double area = base*altura;
		
		return area;
	}

	public double calculaPerimetro() {
		double base = primeiroCanto.x - segundoCanto.x;
		double altura = primeiroCanto.y - segundoCanto.y;

		double perimetro = 2*base + 2*altura;

		return perimetro;
	}

	public String toString() {
		return "Retangulo com cantos " + primeiroCanto + " e " + segundoCanto;
	}
}