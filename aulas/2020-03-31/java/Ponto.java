public class Ponto{
	private double x,y;

	// public Ponto() {
	// 	this(0,0);
	// }

	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public void mover(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}

	public double distancia() {
		return Math.sqrt(x*x + y*y);
	}

	public String toString() {
		return "X: " + this.x + " | Y: " + this.y;
	}
}