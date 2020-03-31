public class Ponto3D extends Ponto {

	float z;

	public Ponto3D(float x, float y){
		super(x,y);
		this.z = 0;
	}

	public Ponto3D(float x, float y, float z){
		super(x,y);
		this.z = z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public void mover(float dx, float dy) {
		this.x = 0;
		this.y = 0;
	}

	public void mover(float dx, float dy, float dz) {
		super.mover(dx, dy);
		this.z += dz;
	}

	public double distancia(){
		double distancia2D = super.distancia();
		return Math.sqrt(distancia2D*distancia2D + z*z);
	}

}