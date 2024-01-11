public class Programa17 {

	public static void main(String[] args) {
		
		int numeros[] = new int[10];
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
	    for(int i = 0; i < numeros.length; i++) {
	    	numeros[i] = i + 3;
	    }
	    
	    System.out.println(numeros[0]);
	    System.out.println(numeros[9]);
	    
	    for(int i = 0; i < numeros.length; i++) {
	    	numeros[i] = (int)Math.round(Math.random() * 10); 
	    }
	    
	    System.out.println(numeros[0]);
	    System.out.println(numeros[9]);
	    
	    System.out.println(Math.random());
	    System.out.println(Math.random() * 10);
	    System.out.println(Math.round(Math.random() * 10));
	    
	    for(int i : numeros) {
	    	System.out.print(i);
	    }
 
	}

}
