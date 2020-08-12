import java.util.List;
import java.util.ArrayList;
import java.lang.Boolean;

class Conjunto{
	
	private ArrayList<Object> elementos;

	Conjunto(){
		elementos = new ArrayList();
	}

	void inserir(Object e){
		elementos.add(e);
	}

	ArrayList getElementos(){
		return (ArrayList)elementos.clone();
	}

	boolean pertence(Object e){
		for(int i = 0; i < elementos.size(); i++){
			if(elementos.get(i).equals(e)){
				return true;
			}
		}

		return false;
	}

	boolean contem(Conjunto c){
		ArrayList<Object> e = c.getElementos();

		ArrayList<Boolean> checklist = new ArrayList(e.size()); //Por quê que checklist é inicializado com tamanho 0?
		for(int i = 0; i < e.size(); i++){
			checklist.add(new Boolean(false));
		}

		for(int i = 0; i < e.size(); i++){
			for(int j = 0; j < ((ArrayList)getElementos()).size(); j++){
				if(this.getElementos().get(j).equals(e.get(i))){
					checklist.set(i, new Boolean(true));
				}
			}
		}

		for(int i = 0; i < checklist.size(); i++){
			if(checklist.get(i).equals(false)){
				return false;
			}
		}

		return true;
	}

	Conjunto uniao(Conjunto b){
		Conjunto uniao = new Conjunto();
		ArrayList<Object> conjuntoA = (ArrayList)this.getElementos().clone();
		
		for(int i = 0; i < conjuntoA.size(); i++){
			uniao.inserir(conjuntoA.get(i));
		}

		boolean elementoJaAdicionado = false;
		ArrayList<Object> elementosB = b.getElementos();
		for(int i = 0; i < b.getElementos().size(); i++){
			elementoJaAdicionado = false;
			for(int j = 0; j < uniao.getElementos().size(); j++){
				if(elementosB.get(i).equals(uniao.getElementos().get(j))){
					elementoJaAdicionado = true;
				}
			}

			if(!elementoJaAdicionado){
				uniao.inserir(elementosB.get(i));	// estou pegando uma cópia ou o original?
			}
		}

		return uniao;
	}

	Conjunto intersecao(Conjunto b){
		Conjunto intersecao = new Conjunto();

		ArrayList<Object> elementosB = b.getElementos();

		boolean elementoJaAdicionado = false;
		for(int i = 0; i < elementosB.size(); i++){
			elementoJaAdicionado = false;
			for(int j = 0; j < ((ArrayList)getElementos()).size(); j++){

				if(elementosB.get(i).equals(getElementos().get(j))){
					for(int k = 0; k < intersecao.getElementos().size(); k++){
						if(elementosB.get(i).equals(intersecao.getElementos().get(k))){
							elementoJaAdicionado = true;
						}
					}

					if(!elementoJaAdicionado){
						intersecao.inserir(elementosB.get(i));
					}
				}
			}
		}

		return intersecao;
	}

	Conjunto diferenca(Conjunto b){
		Conjunto diferenca = new Conjunto();

		boolean ehElementoDeB = false;
		for(int i = 0; i < this.getElementos().size(); i++){
			ehElementoDeB = false;
			
			for(int j = 0; j < b.getElementos().size(); j++){
				if(b.getElementos().get(j).equals(this.getElementos().get(i))){
					ehElementoDeB = true;
				}
				
			}

			if(!ehElementoDeB){
				diferenca.inserir((Object)this.getElementos().get(i));
			}
		}

		return diferenca;
	}
}