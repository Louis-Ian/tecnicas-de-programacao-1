public class Main {
	public static void main(String[] args) {
		Ponto p1 = new Ponto(2,3);
		
		Figura f1 = new Quadrado(p1, 2);

		f1.desenhar();
		System.out.println(f1.calcularArea());
		f1.mover(1,0);
	}
}