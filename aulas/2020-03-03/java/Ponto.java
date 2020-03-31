class Ponto{
	double x,y;

	Ponto(){
		this(0,0);
	}

	Ponto(double x, double y){
		this.x = x;
		this.y = y;
	}

	void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}

	void mover(double dx, double dy){
		this.x += dx;
		this.y += dy;
	}

	public String toString() {
		return this.x + " | " + this.y;
	}
	/* double distancia(){
		return Math.sqrt(x*x + y*y);
	}*/
}