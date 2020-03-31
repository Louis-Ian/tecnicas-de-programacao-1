class Circulo implements ObjetoGeometrico {
    private Ponto centro;
    private double raio;

    Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    Circulo() {
        this(new Ponto(0, 0), 0.0);
    }

    public Ponto Centro(){
        return this.centro;
    };

    public double calcularArea() {
        double area = Math.PI * raio * raio;

        return area;
    };

    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI * raio;

        return perimetro;
    }

    public String toString() {
        return "Círculo com centro " + this.centro + " e raio " + this.raio;
    }
}