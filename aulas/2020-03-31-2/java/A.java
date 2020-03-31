package pacoteA;

class A {
    public int var_public;
    int var_package;
    protected int var_protected;
    private int var_private;

    /* Teste de visibilidade */
    void testeVisibilidade() {
        A a;
        a = new A();
        a.var_public = 1;
        a.var_package = 1;
        a.var_protected = 1;
        a.var_private = 1;

        var_public = 1;
        var_package = 1;
        var_protected = 1;
        var_private = 1;
    }

    public static void main(String args[]) {
        A a = new A();
        a.testeVisibilidade();
    }
}