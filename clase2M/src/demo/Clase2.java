package demo;

import java.util.ArrayList;

public class Clase2
{
    public static void f(int x)
    {
        x= 10;
        System.out.println(x);

    }

    public static void g(ArrayList<Integer> list)
    {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void h(ArrayList<Integer> list)
    {
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        //list2 = list;
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list = list2;

    }

    public static void main(String[] args)
    {
        int i=4;
        f(i);
        System.out.println(i);

        ArrayList<Integer> x = new ArrayList<Integer>();
        g(x);

        for(int qq:x)
        {
            System.out.println(x);
        }


    }

}
