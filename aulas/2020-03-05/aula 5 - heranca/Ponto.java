public class Ponto{
	float x,y;

	// public Ponto() {
	// 	this(0,0);
	// }

	public Ponto(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public void mover(float dx, float dy) {
		this.x += dx;
		this.y += dy;
	}

	public double distancia(){
		return Math.sqrt(x*x + y*y);
	}
}