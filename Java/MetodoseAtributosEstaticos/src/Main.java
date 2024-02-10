
public class Main {

	public static void main(String[] args) {
		Conta conta1 = new Conta("João da costa");
		
		System.out.println(conta1.getNumero());
		System.out.println(conta1.getCliente());
		
		Conta conta2 = new Conta("Maria da costa");
		
		System.out.println(conta2.getNumero());
		System.out.println(conta2.getCliente());
		
		Conta conta3 = new Conta("Pedro da costa");
		
		System.out.println(conta3.getNumero());
		System.out.println(conta3.getCliente());
		
		System.out.println("A proxima conta será: " + Conta.proximaConta());

	}

}
