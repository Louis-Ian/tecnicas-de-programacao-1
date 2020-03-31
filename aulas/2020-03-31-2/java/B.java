package pacoteA;

class B {

    /* Teste de visibilidade */
    void testeVisibilidade() {
        A a;
        a = new A();
        a.var_public = 1;
        a.var_package = 1;
        a.var_protected = 1;
        a.var_private = 1; // var_private has private access in A
    }

    public static void main(String args[]) {
        B b = new B();
        b.testeVisibilidade();
    }
}