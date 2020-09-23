public class Main{
    public static void main(String[] args) {
        Variable var1, var2, var3;
        var1 = new Variable(5);
        var2 = new Variable(0);
        var3 = new Variable(3);

        Expression e1 = new Multiplication(
                var3,
                new Division(
                    new Cossine(
                        var2
                    ),
                    var1
                )
            );
        
        double result = e1.calculate();

        System.out.println("Resultado: " + result);
    }
}