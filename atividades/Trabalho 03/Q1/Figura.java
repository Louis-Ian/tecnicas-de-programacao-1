abstract class Figura{

	float posx;
	float posy;
	
	public abstract void desenhar();

	public void mover(float dx, float dy){
		
	};

	public abstract float calcularArea();

	public String toString(){

		return this.getClass().getSimpleName();
	}

}