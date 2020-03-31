public abstract class Figura {
	Ponto origem;

	public abstract void desenhar();

	public abstract void apagar();

	public abstract float calcularArea();

	public void mover(Ponto p) {
		origem.mover(p.x, p.y);
	}
}