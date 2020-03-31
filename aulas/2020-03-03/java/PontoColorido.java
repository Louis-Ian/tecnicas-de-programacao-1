class PontoColorido extends Ponto{
	
	int cor;
/*
	PontoColorido(double x, double y){
		// this.x = x;
		// this.y = y;
		super(x, y);
	}*/

	PontoColorido(double x, double y, int c){
		// this.x = x;
		// this.y = y;
		super(x, y);
		cor = c;
	}

	void setCor(int c){
		this.cor = c;
	}
}