/*class Ponto3D extends Ponto {

	float z;

	Ponto3D(float x, float y){
		// this.x = x;
		// this.y = y;
		super(x, y);
		this.z = 0;
	}

	Ponto3D(float x, float y, float z){
		// this.x = x;
		// this.y = y;
		super(x, y);
		this.z = z;
	}

	void setZ(int z){
		this.z = z;
	}

	void mover(float dx, float dy){
		this.x = 0;
		this.y = 0;
	}

	void mover(float dx, float dy, float dz){
		// this.x += dx;
		// this.y += dy;
		super.mover(dx, dy);
		this.z += dz;
	}

	float distancia(){
		float distancia2D = super.distancia();
		return Math.sqrt(distancia2D*distancia2D + z*z);
	}
}*/