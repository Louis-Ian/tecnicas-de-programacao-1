public class QuadradoColorido 
	extends Quadrado
	implements Colorido {

		int cor;

		public QuadradoColorido(Ponto o, int l, int c){
			super(o, l);
			this.cor = c;
		}

		public void desenhar(){
			System.out.println("Oi, eu sou um quadrado, e sou colorido!");
		}

		public int cor(){ return cor; }

}	