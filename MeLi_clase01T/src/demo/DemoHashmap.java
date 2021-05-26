package demo;

import java.util.HashMap;
import java.util.Map;

public class DemoHashmap
{
	public static void main(String[] args)
	{
		Map<String,Integer> h = new HashMap<>();
		h.put("uno",1);
		h.put("dos",2);
		h.put("tres",3);
		h.put("cinco",5);
		
		Integer x = h.get("dos");
		System.out.println(x);

		x = h.get("dxos");
		System.out.println(x);

		for(Map.Entry<String,Integer> e:h.entrySet())
		{
			String k = e.getKey();
			int v = e.getValue();
			System.out.println(k+": "+v);
		}
		
	}
}
