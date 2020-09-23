public class Main{
    public static void main(String[] args) {
        Variable var1, var2, var3;
        var1 = new Variable(5);
        var2 = new Variable(0);
        var3 = new Variable(3);

        Observer o1 = new PositiveObserver();
        Observer o2 = new NegativeObserver();

        Expression exp = new Multiplication(
                var3,
                new Division(
                    new Cossine(
                        var2
                    ),
                    var1
                )
            );

        Variable result = new Variable(exp.calculate());

        result.addObserver(o1);
        result.addObserver(o2);
        
        System.out.println("Resultado: " + result.calculate());
    }
}