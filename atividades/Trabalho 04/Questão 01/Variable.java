class Variable implements Expression {
    private double var;

    Variable(double d){
        this.var = d;
    }

    public double calculate(){
        return this.var;
    }
}