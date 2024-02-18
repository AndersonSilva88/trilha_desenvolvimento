import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número para divisão: ");
		int num1= teclado.nextInt();
		
		System.out.println("Informe o segundo número para divisão: ");
		int num2 = teclado.nextInt();
		
		try {
			System.out.println("A divisão de " + num1 + " por " + num2 + " é " + num1 / num2);
		} catch(ArithmeticException e) {
			System.out.println("Não é possivel dividir " + num1 + " por " + num2);
		}
		
		teclado.close();

	}

}
