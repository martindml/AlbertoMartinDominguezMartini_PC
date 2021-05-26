package demo;

public class DemoFuncionesUtilitarias
{
	public static void main(String[] args)
	{
		// convierto de cadena a int
		int x = Integer.parseInt("123");
		System.out.println(x);
		
		// convierto de int a cadena
		String s = Integer.toString(123);
		System.out.println(s);
		
		char mask = 0b00100001_00010001;
		
		
		// convierto de base
		int z = Integer.parseInt("123DAF",16);
		System.out.println(z);
	}
}
