import java.util.Scanner;

//while e do while
public class Programa07 {

	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		//Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);
		
		//Sempre checa o valor antes de executar o bloco
		while (idade > 0) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();

			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt();
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem " + idade + " anos");
			

		}
		
		teclado.close();

	}

}
