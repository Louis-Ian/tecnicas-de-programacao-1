class Main{
	public static void main(String args[]){

		Conjunto universo = new Conjunto();
		for(int i = 1; i <= 50; i++){
			universo.inserir(i);
		}

		System.out.println(universo.getElementos());

		Conjunto naturais = new Conjunto();
		naturais.inserir(1);
		naturais.inserir(2);
		naturais.inserir(3);
		naturais.inserir(4);
		naturais.inserir(5);
		naturais.inserir(6);
		naturais.inserir(7);
		naturais.inserir(8);
		naturais.inserir(9);
		naturais.inserir(10);

		Conjunto pares = new Conjunto();
		pares.inserir(2);
		pares.inserir(4);
		pares.inserir(6);
		pares.inserir(8);
		pares.inserir(10);

		Conjunto impares = new Conjunto();
		impares.inserir(1);
		impares.inserir(3);
		impares.inserir(5);
		impares.inserir(7);
		impares.inserir(9);


		Conjunto primos = new Conjunto();
		primos.inserir(2);
		primos.inserir(3);
		primos.inserir(5);
		primos.inserir(7);
		primos.inserir(11);
		primos.inserir(13);
		primos.inserir(17);
		primos.inserir(19);
		primos.inserir(23);
		primos.inserir(29);

		System.out.println("a\n" + naturais.contem(naturais));

		System.out.println("\nb\n" + naturais.contem(pares));
		System.out.println(naturais.contem(impares));
		System.out.println(naturais.contem(primos));

		System.out.println("\nc\n" + naturais.contem(pares.uniao(impares)));
		System.out.println(pares.uniao(impares).getElementos());
		
		System.out.println("\nd\n" + naturais.intersecao(pares).getElementos().isEmpty());
		System.out.println(naturais.intersecao(pares).getElementos());
		
		System.out.println("\ne");
		System.out.println(naturais.diferenca(pares).getElementos());

		System.out.println("\nPares X Impares");
		System.out.println(pares.cartesiano(impares).getElementos());

		System.out.println("\nConjunto das partes dos Pares");
		System.out.println(pares.potencia().getElementos());

		Conjunto a = naturais;
		Conjunto b = pares;

		//De Morgan 1: !(A U B) = (!A) intersecao (!B)
		Conjunto esqMorgan1 = a.uniao(b).complemento(universo);
		Conjunto dirMorgan1 = (a.complemento(universo)).intersecao(b.complemento(universo));

		//De Morgan 2: !(A intersecao B) = (!A) U (!B)
		Conjunto esqMorgan2 = a.intersecao(b).complemento(universo);
		Conjunto dirMorgan2 = (a.complemento(universo)).uniao(b.complemento(universo));


		System.out.println("_____________________________________________\nPara A = naturais ate 10, e B = pares ate 10\n\nDemonstracao da Lei de Morgan 1: !(A U B) = (!A) intersecao (!B)");
		System.out.println("Os dois conjuntos abaixo são iguals");
		System.out.println(esqMorgan1.getElementos());
		System.out.println(dirMorgan1.getElementos());

		System.out.println("\nDemonstracao da Lei de Morgan 2: !(A intersecao B) = (!A) U (!B)");
		System.out.println("Os dois conjuntos abaixo são iguals");
		System.out.println(esqMorgan2.getElementos());
		System.out.println(dirMorgan2.getElementos());

	}
}