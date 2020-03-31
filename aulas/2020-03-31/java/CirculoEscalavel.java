class CirculoEscalavel implements Escalavel, ObjetoGeometrico{
    private Ponto centro;
    private double raio;

    CirculoEscalavel(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    CirculoEscalavel() {
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

    public void amplia(double escala) {
        this.raio *= escala;
    }

    public void espelha() {
        Ponto centro = new Ponto(-this.centro.getX(), -this.centro.getY());

        this.centro = centro;
    }
}