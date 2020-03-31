class Heranca {
    public static void main (String arg[]) {
        Base base = new Base();
        Derivada derivada = new Derivada();
        Base baseDerivada = new Derivada();
        int x = base.i;
        int y = derivada.i;
        int z = baseDerivada.i;
        String xstr = base.teste();
        String ystr = derivada.teste();
        String zstr = baseDerivada.teste();
        System.out.println("Teste de Herança");
        System.out.println("Propriedades => "+x+" - "+y+" - "+z);
        System.out.println("Metodos      => "+xString+" - "+yString+" - "+zString);
    }
}