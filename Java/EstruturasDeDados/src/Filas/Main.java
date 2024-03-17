package Filas;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		System.out.println(fila);
		
		fila.adiciona("Hulk");
		fila.adiciona("Batman");
		fila.adiciona("Thor");
		
		System.out.println(fila);
		
		System.out.println("removendo >> " + fila.remove());
		
		System.out.println(fila);
		
		System.out.println(fila.vazia());
		
		//Queue fila em java
		Queue<String> fila1 = new LinkedList<String>();
		
		fila1.add("Aquaman");
		fila1.add("Homen de ferro");
		fila1.add("Superman");
		
		System.out.println(fila1);
		
		fila1.poll();
		
		System.out.println(fila1);

	}

}
