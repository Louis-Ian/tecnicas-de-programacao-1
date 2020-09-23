class Division implements Expression {
    private Expression left, right;

    public Division(Expression l, Expression r){
        this.left = l;
        this.right = r;
    }

    
    public double calculate(){
        return this.left.calculate() / this.right.calculate();
    }
}