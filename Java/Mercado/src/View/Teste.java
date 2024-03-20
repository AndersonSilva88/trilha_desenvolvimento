package View;

import Model.Produto;

public class Teste {

	public static void main(String[] args) {
		
		Produto ps5 = new Produto("Playstation 5",3999.99);
		Produto xbox = new Produto("Xbox Series x",4299.99);
		
		System.out.println(ps5);
		System.out.println();
		System.out.println(xbox);

	}

}
