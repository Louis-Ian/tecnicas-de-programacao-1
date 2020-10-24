abstract class FiguraColorida extends Figura{
	
	float posX;
	float posY;
	int r;
	int g;
	int b;

	public abstract void desenhar();

	public void mover(float dx, float dy){ };

	public abstract float calcularArea();

	public abstract void colorir(int r, int g, int b);
}