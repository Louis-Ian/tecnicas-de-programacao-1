class DemoObjetosGeometricosEPolimorfismo {
    public static void main(String[] argumentos) {
        ObjetoGeometrico o1, o2;
        
        o1 = new Circulo(new Ponto(0,0),20);
        o2 = new Retangulo(new Ponto(-1,-1), new Ponto(1,1));
        
        System.out.println("o1 é um Círculo ? "+ (o1 instanceof Circulo));
        System.out.println("o1 é um Retângulo ? "+ (o1 instanceof Retangulo));
        System.out.println("o1 é um ObjetoGeometrico ? "+ (o1 instanceof ObjetoGeometrico));

        System.out.println("\no2 é um Círculo ? "+ (o2 instanceof Circulo));
        System.out.println("o2 é um Retângulo ? "+ (o2 instanceof Retangulo));
        System.out.println("o2 é um ObjetoGeometrico ? "+ (o2 instanceof ObjetoGeometrico));
    }
}