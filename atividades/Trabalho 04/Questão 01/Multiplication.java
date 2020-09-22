class Multiplication implements Expression {
    private Expression left, right;

    public Multiplication(Expression l, Expression r){
        this.left = l;
        this.right = r;
    }

    public float calculate(){
        return this.left.calculate() * this.right.calculate();
    }
}