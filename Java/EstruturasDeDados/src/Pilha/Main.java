package Pilha;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		pilha.insere("Aquaman");
		pilha.insere("Batman");
		pilha.insere("Coringa");
		
		System.out.println(pilha);
		
		pilha.remove();
		
		System.out.println(pilha);
		
		System.out.println(pilha.vazia());
		
		System.out.println(pilha.pegaTopo());
		
		System.out.println("##########################################");
		
		//Stack pilha em java
		Stack<String> nomes = new Stack<String>();
		
		nomes.push("Homen de Ferro");
		nomes.push("Hulk");
		nomes.push("Thor");
		
		System.out.println(nomes);
		
		nomes.pop();
		
		System.out.println(nomes);
	}

}
