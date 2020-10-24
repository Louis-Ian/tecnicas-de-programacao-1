import java.lang.Math;

public class CirculoColorido extends FiguraColorida{
    
	float posx;
	float posy;
    float raio;
	int r;
	int g;
	int b;

    public CirculoColorido(){
        this(0, 0, 0);
    }

    public CirculoColorido(float araio, float aposx, float aposy){
        this.raio = araio;
        this.posx = aposx;
        this.posy = aposy;
        this.colorir(0, 0, 0);
    }
	
    public CirculoColorido(float araio, float aposx, float aposy, int ar, int ag, int ab){
        this(araio, aposx, aposy);
        this.colorir(ar, ag, ab);
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

    public void colorir(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

	public String toString(){

		return this.getClass().getSimpleName() + "\nX: " + this.posx + "\nY: " + this.posy + "\nrgb(" + this.r + ", " + this.g + ", " + this.b + ")";
	}
}