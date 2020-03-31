public class Quadrado extends Figura {

	int lado;

	public Quadrado(Ponto o, int l){
		super(o);
		this.lado = l;
	}

	public void desenhar(){
		System.out.println("Oi, eu sou um quadrado!");
	}

	public double calcularArea(){
		return lado * lado;
	}

}