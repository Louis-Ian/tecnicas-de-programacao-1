import java.lang.*;
import java.util.*;

class Main{
	public static void main(String args[]){
		
		Quadrado q1 = new Quadrado(5, 2, 3);
		q1.desenhar();
		q1.mover(2, 1);
		q1.desenhar();
		System.out.println(q1.calcularArea());

		Circulo c1 = new Circulo(1, 8, 5);
		c1.desenhar();
		c1.mover(2, 3);
		c1.desenhar();
		System.out.println(c1.calcularArea());
		
		Quadrado q2 = new Quadrado(2, -2, 3);
		q2.desenhar();
		q2.mover(1, 0);
		q2.desenhar();
		System.out.println(q2.calcularArea());

		Circulo c2 = new Circulo(4, 1, 1);
		c2.desenhar();
		c2.mover(0, 0);
		c2.desenhar();
		System.out.println(c2.calcularArea());

		CirculoColorido c3 = new CirculoColorido(7, 1, 1);
		Circulo c4 = new Circulo(7, -1, -10);
		
		Quadrado q3 = new Quadrado(2, -2, 3);
		Quadrado q4 = new Quadrado(1, -10, -10);
		QuadradoColorido q5 = new QuadradoColorido(9, 20, 25);
		QuadradoColorido q6 = new QuadradoColorido(4, 100, 250);

		Figura[] listaFiguras = new Figura[10];
		listaFiguras[0] = q1;
		listaFiguras[1] = q2;
		listaFiguras[2] = q3;
		listaFiguras[3] = q4;
		listaFiguras[4] = q5;
		listaFiguras[5] = q6;
		listaFiguras[6] = c1;
		listaFiguras[7] = c2;
		listaFiguras[8] = c3;
		listaFiguras[9] = c4;

		for(int i = 0; i < 10; i++){
			if(FiguraColorida.class.isAssignableFrom(listaFiguras[i].getClass())){
				System.out.println("True para: " + i);
				listaFiguras[i].desenhar();
				System.out.println(listaFiguras[i].calcularArea());
			}
		}
		
		
	}
}