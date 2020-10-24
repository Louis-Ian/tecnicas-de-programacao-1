import java.lang.Math;

public class Circulo extends Figura{
    
	float posx;
	float posy;
    float raio;

    public Circulo(){
        this(0, 0, 0);
    }

    public Circulo(float araio, float aposx, float aposy){
        this.raio = araio;
        this.posx = aposx;
        this.posy = aposy;
    }
	
	public void desenhar(){
        System.out.println(this + "\nraio " + this.raio);
        System.out.println("  *** ");     // Imagem meramente ilustrativa
        System.out.println(" *   * ");
        System.out.println(" *   * ");
        System.out.println("  ***  ");
    }

	public void mover(float dx, float dy){
        this.posx = posx + dx;
        this.posy = posy + dy;
	};

	public float calcularArea(){
		return raio*raio*(float)Math.PI;
    };

	public String toString(){

		return this.getClass().getSimpleName() + "\nX: " + this.posx + "\nY: " + this.posy;
	}
}