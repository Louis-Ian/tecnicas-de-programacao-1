public class QuadradoColorido extends FiguraColorida{

    float posx;
    float posy;
    float lado;
	int r;
	int g;
	int b;

    public QuadradoColorido(){
        this(0, 0, 0);
    }

    public QuadradoColorido(float alado, float aposx, float aposy){
        this.lado = alado;
        this.posx = aposx;
        this.posy = aposy;
        this.colorir(0, 0, 0);
    }

    public QuadradoColorido(float alado, float aposx, float aposy, int ar, int ag, int ab){
        this(alado, aposx, aposy);
        this.colorir(ar, ag, ab);
    }

    public void desenhar(){
        System.out.println(this + "\nlado " + this.lado);
        System.out.println("******");     // Imagem meramente ilustrativa
        System.out.println("*    *");
        System.out.println("*    *");
        System.out.println("******");
    }

    public void mover(float dx, float dy){
        this.posx = posx + dx;
        this.posy = posy + dy;
    }

    public float calcularArea(){
        float area = lado*lado;

        return area;
    }

    public void colorir(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String toString(){

        return this.getClass().getSimpleName() + "\nX: " + this.posx + "\nY: " + this.posy + "\nrgb(" + this.r + ", " + this.g + ", " + this.b + ")";
	}
}