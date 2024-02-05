
public class Main {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente("Joao da costa", "Rua da paz, 45");
		Cliente maria = new Cliente("Maria da costa", "Rua da paz, 45");
		
		Conta conta_joao = new Conta(1, 100.0f, 200.0f, joao );
		Conta conta_maria = new Conta(2, 300.0f, 500.0f, maria );
		
		
		System.out.println("Saldo do João: " + conta_joao.getSaldo());
		System.out.println("Saldo da maria: " + conta_maria.getSaldo());
		
		conta_joao.sacar(300);
		
		System.out.println("Saldo: " + conta_joao.getSaldo());

	}

}
