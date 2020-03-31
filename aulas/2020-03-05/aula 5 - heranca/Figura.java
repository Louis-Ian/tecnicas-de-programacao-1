public abstract class Figura {
	Ponto origem;

	public Figura(Ponto o){
		this.origem = o;
	}
	
	public abstract void desenhar();

	public abstract double calcularArea();

	public void mover(int dx, int dy){
		origem.mover(dx, dy);
	}
}