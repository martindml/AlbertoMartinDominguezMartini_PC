package demo;

import java.util.ArrayList;

public class DemoArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Pablo");
		a.add("Pedro");
		a.add("Juan");
		
		for(int i=0; i<a.size();i++)
		{
			String x = a.get(i);
			System.out.println(x);
		}
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(5);
		
		int p = 4;
		b.add(p);
		
		Integer q = 9;
		b.add(q);
		
		for(int x:b)
		{
			System.out.println(x);
		}
		
	}
}
