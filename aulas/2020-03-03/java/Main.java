public class Main {
	public static void main(String args[]) {
		Ponto p1 = new Ponto();
		// PontoColorido p2 = new PontoColorido(1, 2, 1);
		// Ponto3D p3 = new Ponto3D(1, 1, 1);

		Ponto p2 = new PontoColorido(1, 2, 1);
		// Ponto p3 = new Ponto3D(1, 1, 1);

		// p2.setXY(2, 1);
		// p2.setCor(0);
		// p2.mover(3, 2);
		// p3.mover(1, 1, 1);

		System.out.println(p1.x + " " + p1.y);
		// System.out.println(p2.x + " " + p2.y + " " + p2.cor);
		System.out.println(p2.x + " " + p2.y);
		// System.out.println(p3.x + " " + p3.y + " " + p3.z);
	}
}