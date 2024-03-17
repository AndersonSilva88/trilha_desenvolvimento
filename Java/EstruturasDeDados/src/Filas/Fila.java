package Filas;

import java.util.LinkedList;
import java.util.List;

public class Fila {

	private List<String> nomes = new LinkedList<String>();

	public void adiciona(String nome) {
		this.nomes.add(nome);
	}

	public String remove() {
		try {
			return nomes.remove(0);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Fila vazia");
			return "";
		}
	}

	public boolean vazia() {
		try {
			return this.nomes.size() == 0;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Fila Vazia");
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nomes.toString();
	}

}
