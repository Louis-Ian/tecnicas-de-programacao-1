package pacoteB;

import pacoteA.*;

class Apubsub extends Apub {

    /* Teste de visibilidade */
    void testeVisibilidade() {
        Apub a;
        a = new Apub();
        a.var_public = 1;
        a.var_package = 1; // var_package is not public in Apub; cannot be accessed from outside package
        a.var_protected = 1; // var_protected has protected access in Apub
        a.var_private = 1; // var_private has private access in Apub
    }

    public static void main(String args[]) {
        Apubsub Apubsub = new Apubsub();
        Apubsub.testeVisibilidade();
    }
}