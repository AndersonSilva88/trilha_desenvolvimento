
public class Main {

	public static void main(String[] args) {
		
		int numeros[] = new int[5];
		
		for(int i = 0; i< numeros.length; i++) {
			numeros[i] = i + 3 * 2;
		}
		
		for(int i = 0; i <= numeros.length; i++) {
			try {
				System.out.println(numeros[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("erro!! extouro do array");
			}
			
		}

	}

}
