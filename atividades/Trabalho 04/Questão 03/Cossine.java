public class Cossine extends ExpressionDecorator{

    Cossine(Expression exp){
        super(exp);
    }

    public double calculate(){
        return Math.cos(super.exp.calculate());
    }
}