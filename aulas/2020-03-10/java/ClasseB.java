package pacoteA;
class B {
	void testVisibilidade() {
		ClasseA a;
		a = new ClasseA();
		a.var_public = 1;
		a.var_package = 1;
		a.var_protected = 1;
		a.var_private = 1;
	}
}