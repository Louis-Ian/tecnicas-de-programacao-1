class Retangulo implements ObjetoGeometrico {
    private Ponto primeiroCanto, segundoCanto;

    Retangulo(Ponto primeiroCanto, Ponto segundoCanto) {
        this.primeiroCanto = primeiroCanto;
        this.segundoCanto = segundoCanto;
    }

    Retangulo() {
        this(new Ponto(0, 0), new Ponto(1, 1));
    }

	public Ponto Centro() {
        double coordX = (primeiroCanto.getX() + segundoCanto.getX()) / 2;
        double coordY = (primeiroCanto.getY() + segundoCanto.getY()) / 2;
        
        Ponto centro = new Ponto(coordX, coordY);

        return centro;
    };

	public double calcularArea() {
        double base = primeiroCanto.getX() + segundoCanto.getX();
        double altura = primeiroCanto.getY() + segundoCanto.getY();

        double area = base * altura;

        return area;
    };

	public double calcularPerimetro() {
        double base = primeiroCanto.getX() + segundoCanto.getX();
        double altura = primeiroCanto.getY() + segundoCanto.getY();

        double perimetro = 2 * base + 2 * altura;

        return perimetro;
    };

    public String toString() {
        return "Retangulo com cantos " + this.primeiroCanto + " e " + this.segundoCanto;
    }
}