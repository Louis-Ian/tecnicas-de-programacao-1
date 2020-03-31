class Ponto {
	float x, y;

	Ponto() {
		this(0);
		//x = 0;
		//y = 0;
	}

	Ponto (float a) {
		this(a, a);
		//x = a;
		//y = a;
	}

	Ponto (float x, float y) {
		this.x = x;
		this.y = y;
	}

	void mover(int c) {
		this.mover(c, c);
	}

	void mover(int dx, int dy) {
		x += dx;
		y += dy;
	}
}