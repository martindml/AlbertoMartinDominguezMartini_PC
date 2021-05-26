import java.util.Scanner;

public class DemoFunciones {

    public static void main(String arg[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor enteros: " );
        int a = scanner.nextInt();

        if(esPar(a))
        {
            System.out.println(a + " Es par");
        }
        else
        {
            System.out.println(a + " No Es par");
        }
    }

    public static boolean esPar(int x)
    {
        return x%2==0;
    }


}
