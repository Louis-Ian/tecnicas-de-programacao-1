public class Quadrado extends Figura{

    float posx;
    float posy;
    float lado;

    public Quadrado(){
        this(0, 0, 0);
    }

    public Quadrado(float alado, float aposx, float aposy){
        this.lado = alado;
        this.posx = aposx;
        this.posy = aposy;
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

    public String toString(){

        return this.getClass().getSimpleName() + "\nX: " + this.posx + "\nY: " + this.posy;
	}
}