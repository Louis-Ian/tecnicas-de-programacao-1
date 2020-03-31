public class PontoColorido extends Ponto {

	int cor;

	public PontoColorido(float x, float y){
		super(x,y);
	}

	public PontoColorido(float x, float y, int c){
		super(x,y);
		this.cor = c;
	}

	public void setCor(int c) {
		this.cor = c;
	}

}