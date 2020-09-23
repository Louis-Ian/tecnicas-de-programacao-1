public class ExpressionDecorator implements Expression{
    public Expression exp;

    ExpressionDecorator(Expression exp){
        this.exp = exp;
    }

    public double calculate(){
        return this.exp.calculate();
    }
}
