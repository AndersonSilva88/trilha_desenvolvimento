import java.util.Scanner;

public class Programa20 {
	
	//declarando o vetor
	static String frutas[];
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int qtd;
				
		System.out.println("Informe quantidade de frutas para cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine());
		
		cadastrar_dados(qtd);
		mostrar_dados(qtd);
		
	    teclado.close();
	}
	
	public static void cadastrar_dados(int quantidade) {
		//Definindo o tamanho do vetor
		frutas = new String[quantidade];
		
		for(int i=0; i < quantidade; i++) {
		    System.out.println("Informe a "+ (i + 1) + " fruta ");
			frutas[i] = teclado.nextLine();
		}
	}
	
	public static void mostrar_dados(int quantidade) {
		System.out.println("Frutas cadastradas são: ");
		for(int i = (quantidade-1); i >= 0; i--) {
			System.out.println(frutas[i]);
		}
	}

}
