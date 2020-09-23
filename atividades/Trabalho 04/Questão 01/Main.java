public class Main{
    public static void main(String[] args) {
        Variable var1, var2, var3;
        var1 = new Variable(5);
        var2 = new Variable(6);
        var3 = new Variable(3);

        Expression e = new Multiplication(
                var1,
                new Division(
                    var2,
                    var3
                )
            );
        
        double result = e.calculate();

        System.out.println("Resultado: " + result);
    }
}