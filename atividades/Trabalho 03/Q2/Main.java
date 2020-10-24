public class Main{
    public static void main(String args[]){
        // ### Testes ###
        // XPTOBasic c1 = new XPTOBasic(3000.00);
        // System.out.println(c1);
        // XPTOBasic c2 = new XPTOBasic(1000.00);
        // System.out.println(c2);

        // XPTOPlus c3 = new XPTOPlus(9000.00);
        // System.out.println(c3);
        // XPTOPlus c4 = new XPTOPlus(12000.00);
        // System.out.println(c4);
        
        // XPTOExtreme c5 = new XPTOExtreme(25000.00);
        // System.out.println(c5);
        // XPTOExtreme c6 = new XPTOExtreme(41000.00);
        // System.out.println(c6);

        Sistema s = new Sistema();
        s.criarContaXPTOBasic();
        s.criarContaXPTOPlus();
        s.criarContaXPTOExtreme();

        for(int i = 0; i < 3; i++) s.creditar(i, 1000);
        for(int i = 0; i < 3; i++) s.debitar(i, 10);
        
        // # Todas as igualdades devem ser verdadeiras
        // # Exemplo de coersão
        System.out.println(Double.valueOf(s.consultarSaldo(1)).equals(Double.valueOf(990)));

        // # Exemplo de coersão
        System.out.println(Double.valueOf(s.consultarSaldo(2)).equals(Double.valueOf(995)));

        // # Exemplo de coersão
        System.out.println(Double.valueOf(s.consultarSaldo(3)).equals(Double.valueOf(992.02)));
        
    }
}