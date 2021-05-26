import java.util.*;

public class prueba
{
    public static void main(String arg[])
    {
        int a[] = new int[10];

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Pablo");
        lista.add("Pedro");
        lista.add("Juan");

        for(int i=0; i < lista.size() ; i++)
        {
            String x = lista.get(i);
            System.out.println(x);

        }

        for(String item:lista)
        {
            System.out.println(item);
        }

        int x = Integer.parseInt("123");
        System.out.println(x);

        String s = Integer.toString(123);

        int z = Integer.parseInt("123",16);
        System.out.println(z);


        char mask = 0b00100001_00010001;

        HashMap<String,Integer> h = new HashMap<>();
        h.put("uno",1);
        h.put("dos",2);
        h.put("tres",3);

        Integer xx = h.get("dos");

        System.out.println(xx);

        for(Map.Entry<String,Integer> item:h.entrySet())
        {
            String k =item.getKey();
            int v = item.getValue();

            System.out.println(k);
            System.out.println(v);
        }

        Hashtable<String,Integer> ht = new Hashtable<>();
        ht.put("uno",1);
        ht.put("dos",2);
        ht.put("tres",3);

        Integer xxx = h.get("dos");

        System.out.println(xxx);

        for(Map.Entry<String,Integer> item:h.entrySet())
        {
            String k =item.getKey();
            int v = item.getValue();

            System.out.println(k);
            System.out.println(v);
        }

    }
}
