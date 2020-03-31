package pacoteB;

import pacoteA.Apub;

class D {

    /* Teste de visibilidade */
    void testeVisibilidade() {
        Apub a;
        a = new Apub();
        a.var_public = 1;
        a.var_package = 1; // var_package is not public in Apub; cannot be accessed from outside package
        a.var_protected = 1; // var_protected has protected access in Apub
        a.var_private = 1; // var_private has private access in A
    }

    public static void main(String args[]) {
        D d = new D();
        d.testeVisibilidade();
    }
}