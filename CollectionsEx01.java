package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class CollectionsEx01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> minhaLista = new ArrayList<Integer>();
	
	minhaLista.add(2);//adiciona um elemento na minha ArrayList
	minhaLista.add(5);
	minhaLista.add(2);
	minhaLista.add(1);
	minhaLista.add(4);
	minhaLista.add(3);
	minhaLista.add(3);
	minhaLista.add(2);
	
	for(Integer listaElementos:minhaLista) {//visualizar os elementos do meu ArrayList
		System.out.println(listaElementos);
	}
	
	System.out.println("\nRemovendo um elemento da lista");
	System.out.println();
	minhaLista.remove(0);//remover um elemento do ArrayList
	
	for(Integer listaElementos:minhaLista) {
		System.out.println(listaElementos);
	}
	
	int primeiroElemento = minhaLista.get(0);//Pega um elemento do meu ArrayList
	System.out.println("\nO primeiro elemento é: "+primeiroElemento);
	System.out.println();
	
	for(int i=0;i<minhaLista.size();i++) {//pegando o tamanho do meu ArrayList
		System.out.println("\nElemento: "+minhaLista.get(i));
	}
	
	Collections.sort(minhaLista);//ordena o meu ArrayList em ordem crescente
	System.out.println("\nDepois de ordenado...");
	System.out.println(minhaLista);
	System.out.println();
	
	Set<Integer> meuSet = new HashSet<Integer>();//criação da estrutura Set
	
	meuSet.add(2);//adicionando elementos no HashSet
	meuSet.add(5);
	meuSet.add(1);
	meuSet.add(2);
	meuSet.add(1);
	meuSet.add(3);
	meuSet.add(5);
	
	Iterator<Integer> iMeuSet = meuSet.iterator();
	
	while(iMeuSet.hasNext()) {
		System.out.println(iMeuSet.next());
	}
	
}


	}


