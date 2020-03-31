class Circulo implements ObjetoGeometrico {
	private Ponto centro;
	private double raio;

	Circulo(Ponto centro, double raio) {
		this.centro = centro;
		this.raio = raio;
	}

	public Ponto centro() {
		return centro;
	}

	public double calculaArea() {
		return Math.PI * raio * raio;
	}

	public double calculaPerimetro(){
		return 2.0 * Math.PI * raio;
	}

	public String toString() {
		return "Circulo com centro em " + centro + " e raio " + raio;
	}
}