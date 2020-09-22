class Variable implements Expression {
    private float var;

    Variable(float f){
        this.var = f;
    }

    public float calculate(){
        return this.var;
    }
}