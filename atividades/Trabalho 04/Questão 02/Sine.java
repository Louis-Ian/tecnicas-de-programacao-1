public class Sine extends ExpressionDecorator{

    Sine(Expression exp){
        super(exp);
    }

    public double calculate(){
        return Math.sin(super.exp.calculate());
    }
}