
public class Programa11 {

	public static void main(String[] args) {
		//tipos primários
		long num0 = 99;
		int num1 = 4; //Inteiro
		short num2 = 4; //Inteiro (curto/menor/baixo)
		byte num3 = 4;
		char num8 = 34;
		
		
		//tipos não primários
		Integer num4 = 98;
		Short num5 = 7;
		Byte num6 = 9;
		Long num7 = 77777777777L;
		Character num9 = 35;
		
		System.out.println("long -> Num0 = " + num0);
		System.out.println("Int -> Num1 = " + num1);
		System.out.println("short -> Num2 = " + num2);
		System.out.println("byte -> Num3 = " + num3);
		System.out.println("char -> Num8 = " + num8);
		
		System.out.println("Integer -> Num4 = " + num4);
		System.out.println("Short -> Num5 = " + num5);
		System.out.println("Byte -> Num6 = " + num6);
		System.out.println("Long -> Num7 = " + num7);
		System.out.println("Character -> Num9 = " + num9);
		
		System.out.println();
		
		System.out.println("int/Integer " + Integer.SIZE + " bits");
		System.out.println("short/Short " + Short.SIZE + " bits");
		System.out.println("byte/Byte " + Byte.SIZE + " bits");
		System.out.println("long/Long " + Long.SIZE + " bits");
		System.out.println("char/Character " + Character.SIZE + " bits");

	}

}
