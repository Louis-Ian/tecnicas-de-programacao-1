class DemoObjetosGeometricos {
    public static void main(String[] argumentos) {
        Circulo c1 = new Circulo(new Ponto(0,0),100);
        Retangulo r1 = new Retangulo(new Ponto(-2,-2),
        new Ponto(2,2));
        imprimeTodosOsDados(c1);
        imprimeTodosOsDados(r1);
    }
    private static void imprimeTodosOsDados(ObjetoGeometrico og) {
        System.out.println(og);
        System.out.println("Perímetro: " + og.calcularPerimetro());
        System.out.println("Área: " + og.calcularArea());
        System.out.println();
    }
}