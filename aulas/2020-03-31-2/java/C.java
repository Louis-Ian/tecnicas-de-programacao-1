package pacoteB;

import pacoteA.A;

class C {

    /* Teste de visibilidade */
    void testeVisibilidade() {
        A a; // A is not public in pacoteA; cannot be accessed from outside package
        a = new A();
        a.var_public = 1;
        a.var_package = 1;
        a.var_protected = 1;
        a.var_private = 1; // var_private has private access in A
    }

    public static void main(String args[]) {
        C c = new C();
        c.testeVisibilidade();
    }
}