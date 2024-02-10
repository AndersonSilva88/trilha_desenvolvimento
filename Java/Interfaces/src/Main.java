
public class Main {

	public static void main(String[] args) {
		
		Ventilador ventilador = new Ventilador();
		
		System.out.println("A marca do ventilador é " + ventilador.MARCA);
		
		ventilador.desligar();

		ventilador.ligar();
		
		ventilador.desligar();
	}

}
