
public class Programa13 {

	public static void main(String[] args) {
		
		//Tipos primitivos
		char letra = 'a';
		
		System.out.println("letra " + letra);
		
		//Tipos não primitivos
		Character letra2 = 'A';
		String nome = "Geek University";
		
		System.out.println("letra2 " + letra2);
		System.out.println("nome " + nome);
		System.out.println("Tamanho da String " + nome.length());
		
		
		System.out.println("char/Character " + Character.SIZE + " bits" );
		System.out.println("String " + (Character.SIZE * nome.length()) + " bits");

	}

}
