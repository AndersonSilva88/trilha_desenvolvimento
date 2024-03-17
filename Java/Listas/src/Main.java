import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Maria");
		nomes.add("Felicity");
		nomes.add("Angelina");
		nomes.add("Geek");
		nomes.add("Maria");
		
		//System.out.println(nomes.get(0));
		//System.out.println(nomes.get(3));
		
	    //System.out.println(nomes.size());
		
		//for(int i = 0; i < nomes.size(); i++) {
		//System.out.println(nomes.get(i));
		//}
		
		//for(String nome : nomes) {
		//	System.out.println(nome);
		//}
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(42);
		numeros.add(25);
		numeros.add(14);
		numeros.add(92);
		numeros.add(50);
		
		Collections.sort(numeros);
		
		for(int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}

	}

}
